package org.sobadfish.bedwar;


import cn.nukkit.Player;
import cn.nukkit.block.Block;
import cn.nukkit.entity.Entity;
import cn.nukkit.level.Position;
import cn.nukkit.plugin.Plugin;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import org.sobadfish.bedwar.command.BedWarAdminCommand;
import org.sobadfish.bedwar.command.BedWarCommand;
import org.sobadfish.bedwar.command.BedWarSpeakCommand;
import org.sobadfish.bedwar.entity.EntityBlueWitherSkull;
import org.sobadfish.bedwar.entity.EntityFireBall;
import org.sobadfish.bedwar.entity.IronGolem;
import org.sobadfish.bedwar.manager.*;
import org.sobadfish.bedwar.manager.data.PlayerDataManager;
import org.sobadfish.bedwar.manager.data.PlayerTopManager;
import org.sobadfish.bedwar.panel.lib.AbstractFakeInventory;
import org.sobadfish.bedwar.room.config.GameRoomConfig;
import org.sobadfish.bedwar.room.event.*;
import org.sobadfish.bedwar.tools.Utils;
import org.sobadfish.bedwar.variable.BedWarVariable;
import org.sobadfish.bedwar.variable.TipVariable;

import java.io.File;
import java.util.LinkedHashMap;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *   ____           ___          __
 *  |  _ \         | \ \        / /
 *  | |_) | ___  __| |\ \  /\  / /_ _ _ __
 *  |  _ < / _ \/ _` | \ \/  \/ / _` | '__|
 *  | |_) |  __/ (_| |  \  /\  / (_| | |
 *  |____/ \___|\__,_|   \/  \/ \__,_|_|
 * @author SoBadFish
 */
public class BedWarMain extends PluginBase {

    private static BedWarMain bedWarMain;

    private static RoomManager roomManager;

    private static MenuRoomManager menuRoomManager;

    private static PlayerDataManager dataManager;

    private static PlayerTopManager topManager;

    public static UiType uiType;

    public static int upExp;

    @Override
    public void onEnable() {
        bedWarMain = this;
        //  TODO initialization file

        checkServer();
	//Locale locale = new Locale("en");
	ResourceBundle messages = ResourceBundle.getBundle("i18n/ConsoleBundle", new Locale("en"));
        this.getLogger().info(TextFormat.colorize('&',"&b" + messages.getString("greeting")));
        this.getLogger().info(TextFormat.colorize('&',"&b   ____           ___          __"));
        this.getLogger().info(TextFormat.colorize('&',"&b  |  _ \\         | \\ \\        / /"));
        this.getLogger().info(TextFormat.colorize('&',"&b  | |_) | ___  __| |\\ \\  /\\  / /_ _ _ __"));
        this.getLogger().info(TextFormat.colorize('&',"&b  |  _ < / _ \\/ _` | \\ \\/  \\/ / _` | '__|"));
        this.getLogger().info(TextFormat.colorize('&',"&b  | |_) |  __/ (_| |  \\  /\\  / (_| | |"));
        this.getLogger().info(TextFormat.colorize('&',"&b  |____/ \\___|\\__,_|   \\/  \\/ \\__,_|_|"));
        this.getLogger().info(TextFormat.colorize('&',"&b"));
        this.getLogger().info(TextFormat.colorize('&',"&eLoading Plugin BedWar - Version&av"+this.getDescription().getVersion()));
        this.getLogger().info(TextFormat.colorize('&',"&cPlugin created by:&b sobadfish(某吃瓜咸鱼) &aQQ：&e1586235767"));
        this.getLogger().info(TextFormat.colorize('&',"&cThis plug-in is an original plug-in, and the source of some source codes has been marked with the original author"));
        this.getLogger().info(TextFormat.colorize('&',"&cTranslated by "));
        sendMessageToConsole("&aChecking for corresponding dependencies");
        for(String s : this.getDescription().getSoftDepend()){
            Plugin plugin = getServer().getPluginManager().getPlugin(s);
            if(plugin == null){
                sendMessageToConsole("&c"+s+"The plugin is not loaded, some functions may not be available");
                continue;
            }
            try{
                Class.forName("updata.AutoData");
                updata.AutoData.defaultUpData(this, this.getFile(), "Sobadfish", "BedWar");

            }catch (Exception ignore){}

            try{
                Class.forName("com.smallaswater.npc.variable.BaseVariableV2");
                BedWarVariable.init();
            }catch (Exception ignore){}
            try{
                Class.forName("tip.utils.variables.BaseVariable");
                TipVariable.init();
            }catch (Exception ignore){}


        }
        Entity.registerEntity("FireBall", EntityFireBall.class);
        Entity.registerEntity(EntityBlueWitherSkull.class.getSimpleName(), EntityBlueWitherSkull.class);
        Entity.registerEntity(IronGolem.class.getSimpleName(), IronGolem.class);
        loadBedWarConfig();
        //TODO registration order
        this.getServer().getCommandMap().register("badwar",new BedWarAdminCommand("bd"));
        this.getServer().getCommandMap().register("badwar",new BedWarCommand("bw"));
        this.getServer().getCommandMap().register("badwar",new BedWarSpeakCommand("bws"));


        RoomEventManager.register("time", TimeEvent.class);
        RoomEventManager.register("break", BreakEvent.class);
        RoomEventManager.register("custom", CustomEvent.class);
        RoomEventManager.register("effect", EffectEvent.class);
        RoomEventManager.register("command", CommandEvent.class);
        RoomEventManager.register("chicken",ChickBeautifulEvent.class);
        RoomEventManager.register("light",LightEvent.class);
        RoomEventManager.register("die", DiwBowEvent.class);

        sendMessageToConsole("&cCurrently built-in &a"+RoomEventManager.EVENT.size()+" &eevents");



        ThreadManager.init();
        this.getLogger().info(TextFormat.colorize('&',"&aThe Bed Wars plug-in is successfully loaded, Enjoy!"));

    }

    /**
     * load configuration file
    */
    public void loadBedWarConfig(){
        saveDefaultConfig();
        reloadConfig();
        uiType = Utils.loadUiTypeByName(getConfig().getString("shop-ui","auto"));
        upExp = getConfig().getInt("up-exp",500);
        NbtItemManager.init();
        dataManager = PlayerDataManager.asFile(new File(this.getDataFolder()+File.separator+"player.json"));
        File mainFileDir = new File(this.getDataFolder()+File.separator+"rooms");
        if(!mainFileDir.exists()){
            if(!mainFileDir.mkdirs()){
                sendMessageToConsole("&cFailed to create folder rooms");
            }
        }

        roomManager = RoomManager.initGameRoomConfig(mainFileDir);
        sendMessageToConsole("&aAll room data is loaded");
        this.getServer().getPluginManager().registerEvents(roomManager,this);
        if(getConfig().getAll().size() == 0) {
            this.saveResource("config.yml", true);
            reloadConfig();
        }
        menuRoomManager = new MenuRoomManager(getConfig());



        //Initialize leaderboard
        topManager = PlayerTopManager.asFile(new File(this.getDataFolder()+File.separator+"top.json"));
        if(topManager != null){
            topManager.init();
        }


    }

    public static int getUpExp(){
        return upExp;
    }

    public static PlayerTopManager getTopManager() {
        return topManager;
    }

    public static BedWarMain getBedWarMain() {
        return bedWarMain;
    }

    public static MenuRoomManager getMenuRoomManager() {
        return menuRoomManager;
    }

    public static PlayerDataManager getDataManager() {
        return dataManager;
    }

    public static void sendMessageToConsole(String msg){
        sendMessageToObject(msg,null);
    }

    public static String getTitle(){
        return TextFormat.colorize('&',bedWarMain.getConfig().getString("title"));
    }

    public static String getScoreBoardTitle(){
        return TextFormat.colorize('&',bedWarMain.getConfig().getString("scoreboard-title","&f[&aBed Wars&f]"));
    }

    public static void sendTipMessageToObject(String msg,Object o){
        String message = TextFormat.colorize('&',msg);
        if(o != null){
            if(o instanceof Player){
                if(((Player) o).isOnline()) {
                    ((Player) o).sendMessage(message);
                    return;
                }
            }
        }
        bedWarMain.getLogger().info(message);

    }


    public static void sendMessageToObject(String msg,Object o){
        String message = TextFormat.colorize('&',getTitle()+" &b>>&r "+msg);
        sendTipMessageToObject(message,o);
    }

    public static void sendSubTitle(String msg,Player o){
        String message = TextFormat.colorize('&',msg);
        if(o != null){
            if(o.isOnline()) {
                o.setSubtitle(message);
            }
        }else{
            bedWarMain.getLogger().info(message);
        }
    }

    public static void sendTitle(String msg,int time,Player o){
        String message = TextFormat.colorize('&',msg);
        if(o != null){
            if(o.isOnline()) {
                o.sendTitle(message,null,0,time,0);
            }
        }else{
            bedWarMain.getLogger().info(message);
        }
    }

    public static void sendTip(String msg,Player o){
        String message = TextFormat.colorize('&',msg);
        if(o != null){
            if(o.isOnline()) {
                o.sendTip(message);
            }
        }else{
            bedWarMain.getLogger().info(message);
        }
    }


    public static RoomManager getRoomManager() {
        return roomManager;
    }

    public static LinkedHashMap<Position,Block> spawnBlockByPosAndSize(Position position,int size,Block block){
        LinkedHashMap<Position,Block> blocks = new LinkedHashMap<>();
        int startX = position.getFloorX() - (size / 2);
        int endX = position.getFloorX() + (size / 2);
        int startZ = position.getFloorZ() - (size / 2);
        int endZ = position.getFloorZ() + (size / 2);
        for(int x = startX;x <= endX;x++){
            for(int z = startZ;z <= endZ;z++) {
                Position position1 = new Position(x,position.getFloorY(),z,position.getLevel());
                if(position1.getLevelBlock().getId() != 0){
                    continue;
                }
                blocks.put(position1, block);
            }
        }
        return blocks;
    }

    private void checkServer(){
        boolean ver = false;
        //Dual core compatible
        try {
            Class<?> c = Class.forName("cn.nukkit.Nukkit");
            c.getField("NUKKIT_PM1E");
            ver = true;

        } catch (ClassNotFoundException | NoSuchFieldException ignore) { }
        try {
            Class<?> c = Class.forName("cn.nukkit.Nukkit");
            c.getField("NUKKIT").get(c).toString().equalsIgnoreCase("Nukkit PetteriM1 Edition");
            ver = true;
        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException ignore) {
        }

        AbstractFakeInventory.IS_PM1E = ver;
        if(ver){
            sendMessageToConsole("&eRunning on Nukkit PM1E");
        }else{
            sendMessageToConsole("&eRunning on Nukkit");
        }
    }

    public enum UiType{
        /**
         * auto: automatic
         *
         * packet: Graphical User Interface (GUI)
         *
         * ui: chest interface
         * */
        AUTO,PACKET,UI
    }

    @Override
    public void onDisable() {
        if(topManager != null){
            topManager.save();
        }
        if(dataManager != null){
            dataManager.save();
        }
        if(roomManager != null){
            for (GameRoomConfig roomConfig: roomManager.getRoomConfigs()){
                roomConfig.save();
            }
        }
    }
}
