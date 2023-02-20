package org.sobadfish.bedwar.room;

import cn.nukkit.math.BlockFace;
import org.sobadfish.bedwar.item.config.ItemInfoConfig;
import org.sobadfish.bedwar.player.PlayerInfo;
import org.sobadfish.bedwar.player.team.config.TeamInfoConfig;
import org.sobadfish.bedwar.room.config.GameRoomConfig;
import org.sobadfish.bedwar.world.config.WorldInfoConfig;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author SoBadFish
 * 2022/1/13
 */
public class GameRoomCreater {

    private final PlayerInfo creater;

    private boolean isCreate;

    private boolean isRoomCreate;

    private int flag = 1;

    private int setFlag = 1;

    private String roomName = null;

    private int inflag = 0;

    private int min;

    private int itemFlag = 0;

    private GameRoomConfig roomConfig;

    private WorldInfoConfig worldInfoConfig;

    private final LinkedHashMap<String,Integer> moneyItemSize = new LinkedHashMap<>();

    public static ResourceBundle messages = ResourceBundle.getBundle("i18n/ConsoleBundle", new Locale("en"));

    /**
     * 队伍出生点
     * team spawn point
     * */
    private final LinkedHashMap<String, String> team = new LinkedHashMap<>();
    /**
     * 队伍床
     * team bed
     * */
    private final LinkedHashMap<String, String> teamBed = new LinkedHashMap<>();
    /**
     * 队伍床
     * team bed
     * */
    private final LinkedHashMap<String, BlockFace> teamBedFace = new LinkedHashMap<>();

    private final LinkedHashMap<String, String> teamShop = new LinkedHashMap<>();

    private final LinkedHashMap<String, String> teamShop2 = new LinkedHashMap<>();

    /**
     * 物品刷新点
     * item refresh point
     * */
    private final LinkedHashMap<String, ArrayList<String>> itemPosition = new LinkedHashMap<>();

    public GameRoomCreater(PlayerInfo player){
        this.creater = player;
    }


public void onCreatePreset(String value){
        if(flag !=  1){
            creater.sendForceMessage("&c" + messages.getString("defaultsWarning"));
            return;
        }
        switch (setFlag){
            case 1:
                creater.sendForceMessage("&2" + messages.getString("created") +  "&r"+value+" &2" + messages.getString("roomTemplate"));
                creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd set &a["+ messages.getString("minPlayers") + "]&e"+ messages.getString("nextStep"));
                roomName = value;
                setFlag++;
                break;
            case 2:
                creater.sendForceMessage("&2"+ messages.getString("minPlayersSet")+ "&b: " +value);
                creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd set &2[" + messages.getString("maxPlayers") + "]&e"+ messages.getString("nextStep"));
                min = Integer.parseInt(value);
                setFlag++;
                break;
            case 3:
                int max = Integer.parseInt(value);
                roomConfig = GameRoomConfig.createGameRoom(roomName,min, max);
                ArrayList<String> itemName = roomConfig.moneyItem.getNames();
                creater.sendForceMessage("&2" + messages.getString("maxPlayersSet") + ":&b "+value);
                creater.sendForceMessage("&a" + messages.getString("termToDefaults"));
                creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd set &2[" + messages.getString("amount") +"] &e"+ messages.getString("unclear1") +": &r"+itemName.get(inflag)+" &e" + messages.getString("unclear2") );
                isRoomCreate = true;
                setFlag++;
                break;
            case 4:
                itemName = roomConfig.moneyItem.getNames();
                creater.sendForceMessage("&2"+ messages.getString("setUp") +" &r"+itemName.get(inflag)+"&2"+ messages.getString("numSpawn") +":&b "+value);
                moneyItemSize.put(itemName.get(inflag),Integer.parseInt(value));
                inflag++;
                if(inflag == itemName.size()){
                    creater.sendForceMessage("&a" +messages.getString("settingsComplete"));
                    setFlag = 1;
                    return;
                }
                creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd set &2["+ messages.getString("amount") +"] &e" + messages.getString("unclear1") + ": &r"+itemName.get(inflag)+" &e" + messages.getString("unclear2"));


                break;
            default: break;
        }

    }

    public void stopInit(){
        if(setFlag >= 4) {
            setFlag = 1;
            creater.sendForceMessage("&c" + messages.getString("termDefault"));
        }else{
            creater.sendForceMessage("&c" + messages.getString("unableTerm"));
        }
    }

    public boolean onCreateNext(){
        if(setFlag != 1){
            creater.sendForceMessage("&c" + messages.getString("setupIncomplete"));
            return true;
        }
        //Setup Test/Default Room
        switch (flag) {
            case 1:
                if(roomConfig == null) {
                    roomConfig = GameRoomConfig.createGameRoom(messages.getString("testRoom"), 4, 16);
                    isRoomCreate = true;
                    creater.sendForceMessage(messages.getString("testRoomCreated"));
                    creater.sendForceMessage("&e" + messages.getString("continueExecute") +"/bd  " + messages.getString("proceed") + " ["+messages.getString("enterMapSettings") +"]");
                }else{
                    creater.sendForceMessage("&2"+messages.getString("presetSuccess"));
                    creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &r " + messages.getString("proceed") + " &b["+ messages.getString("enterMapSettings")+"]");
                }
                flag++;
                break;
            case 2:
                worldInfoConfig = WorldInfoConfig.createWorldConfig(creater.getLevel().getFolderName());
                creater.sendForceMessage("&2" messages.getString("gameMapSet"));
                creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &b["+messages.getString("setupWaitingHall")  +"]");
                flag++;
                break;
				
            case 3:
                worldInfoConfig.setWaitPosition(creater.getPosition());
                creater.sendForceMessage("&2"+ messages.getString("cmpletedWaitingHall"));
                creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &r[&b"+messages.getString("setUp")+ +(new ArrayList<>(roomConfig.teamCfg.keySet()).get(team.size()))+ messages.getString("shop") +" &21&b /&d "+roomConfig.teamCfg.size()+"&r]");
                flag++;
                break;
            case 4:
                createShopPos();
                break;
            case 5:
                createShop2Pos();
                break;
            case 6:
                team.put(new ArrayList<>(roomConfig.teamCfg.keySet()).get(team.size()),WorldInfoConfig.positionToString(creater.getPosition()));
                int index = 0;
                if(team.size() > 0){
                    index = team.size() - 1;
                }
                creater.sendForceMessage("&2" + messages.getString("setUp")+ " "+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(index))+ messages.getString("spawnPoint") +" &r[&2"+team.size()+"&b/&d"+roomConfig.getTeamCfg().size()+"&r]");
                if(team.size() == roomConfig.getTeamCfg().size()){

                    creater.sendForceMessage("&2" +messages.getString("setupSpawnPointCompleted"));
                    creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &r[&"+messages.getString("setUp") +(new ArrayList<>(roomConfig.teamCfg.keySet()).get(0))+ messages.getString("bedPosition") +"&2 1&b /&d "+roomConfig.teamCfg.size()+"&r]");
                    flag++;
                    break;
                }
                creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &r[&b"  +messages.getString("setUp") +(new ArrayList<>(roomConfig.teamCfg.keySet()).get(team.size()))+ messages.getString("spawnPoint")+" &r[&2"+(team.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
                break;
            case 7:
               createBedPos();
                break;
            case 8:
               return createItemPos();

            default:
                break;
        }

        return true;

    }
    /**
     * 创建商店1坐标
	 * Create Shop1 coordinates
     * */
    private void createShopPos(){
        teamShop.put(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop.size()),WorldInfoConfig.locationToString(creater.getLocation()));

        creater.sendForceMessage("&2"+messages.getString("setUp")+ " "+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop.size() - 1))+messages.getString("shop") + " &r[&a"+teamShop.size()+"&b/&d"+roomConfig.getTeamCfg().size()+"&r]");
        if(teamShop.size() == roomConfig.getTeamCfg().size()){
            creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &r[&b" +messages.getString("setUp")+ " "+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(0))+ messages.getString("teamShop")+" &r[&2"+(team.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
            flag++;
            return;
        }
        creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &r[&b"+messages.getString("setUp")+" "+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop.size()))+ messages.getString("shop")+" &r[&2"+(teamShop.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
    }
    /**
     * 创建商店2坐标
     * */
    private void createShop2Pos(){
        teamShop2.put(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop2.size()),WorldInfoConfig.locationToString(creater.getLocation()));
        creater.sendForceMessage("&2"+ messages.getString("setUp") +"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop2.size() - 1))+ messages.getString("teamShop") +" &r[&2"+teamShop2.size()+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
        if(teamShop2.size() == roomConfig.getTeamCfg().size()){
            creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &r[&b" +messages.getString("setUp")+" " +(new ArrayList<>(roomConfig.teamCfg.keySet()).get(0))+ messages.getString("spawnPoint") +" &r[&2"+(team.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
            flag++;
            return;

        }
        creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &r[&b设置"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop2.size() ))+ messages.getString("teamShop")+ " &r[&2"+(teamShop2.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");

    }

    /**
     * 创建床坐标
     * */
    private void createBedPos(){
        teamBed.put(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamBed.size()),WorldInfoConfig.positionToString(creater.getPosition()));
        teamBedFace.put(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamBedFace.size()),creater.getHorizontalFacing());
        creater.sendForceMessage("&2" + messages.getString("setUp")  +(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamBed.size() - 1))+"床坐标 &r[&2"+teamBed.size()+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
        if(teamBed.size() == roomConfig.getTeamCfg().size()){

            creater.sendForceMessage("&2队伍床设置完成");
            creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &r[&b设置 &r"+roomConfig.moneyItem.getNames().get(0)+" &2刷新点 &r"+" [&21 &b/&d "+moneyItemSize.getOrDefault(roomConfig.moneyItem.getNames().get(0),4)+"&r]");
            ArrayList<TeamInfoConfig> teamInfoConfigs = new ArrayList<>();
            for(String teamName : team.keySet()){
                TeamInfoConfig teamInfoConfig = new TeamInfoConfig(roomConfig.teamCfg.get(teamName),teamBed.get(teamName),teamBedFace.get(teamName),team.get(teamName));
                teamInfoConfig.setVillage(new LinkedHashMap<String, String>(){
                    {
                        put("defaultShop",teamShop.get(teamName));
                        put("teamShop",teamShop2.get(teamName));
                    }
                });
                teamInfoConfigs.add(teamInfoConfig);
            }
            roomConfig.setTeamConfigs(teamInfoConfigs);
            flag++;
            return;

        }
        creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &r[&b设置"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamBed.size()))+"床&r [&2"+(teamBed.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
    }
    /**
     * 创建生成点坐标
     * */
    private boolean createItemPos(){
        ArrayList<String> itemName = roomConfig.moneyItem.getNames();

        String name = itemName.get(itemFlag);
        if(!itemPosition.containsKey(name)){
            itemPosition.put(name,new ArrayList<>());
        }
        ArrayList<String> positions = itemPosition.get(name);
        if(positions.size() < moneyItemSize.getOrDefault(name,4)){
            positions.add(WorldInfoConfig.positionToString(creater.getPosition()));
            creater.sendForceMessage("&2"+messages.getString("setUp") + "&r "+name+" &2生成点坐标&r [&2"+positions.size()+" &b/&d "+moneyItemSize.getOrDefault(name,4)+"&r]");
            if(positions.size() != moneyItemSize.getOrDefault(name,4)) {
                creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &r[&b设置物品刷新点&r " + name + " [&2" + (positions.size() + 1) + " &b/&d "+moneyItemSize.getOrDefault(name,4)+"&r]");
            }else{

                if(itemName.size() > itemFlag+1){
                    creater.sendForceMessage("&2"+messages.getString("setUp")+" &r" + name + " &2生成点坐标完成");
                    creater.sendForceMessage("&e" + messages.getString("continueExecute") +" &r/bd &e " + messages.getString("proceed") + " &r[&b"+ messages.getString("setUp")+ " &r"+ itemName.get(itemFlag + 1) + " &2刷新点 &r [&21 &b/&d "+moneyItemSize.getOrDefault(itemName.get(itemFlag + 1),4)+"&r]");
                }
                itemFlag++;
                if (itemFlag >= roomConfig.moneyItem.getNames().size()) {
                    creater.sendForceMessage("&2设置所有生成点坐标完成");
                    ArrayList<ItemInfoConfig> itemInfoConfigs = new ArrayList<>();
                    for (String s1 : itemPosition.keySet()) {
                        itemInfoConfigs.add(new ItemInfoConfig(roomConfig.moneyItem.get(s1), itemPosition.get(s1), 20));
                    }
                    worldInfoConfig.setItemInfos(itemInfoConfigs);
                    roomConfig.setWorldInfo(worldInfoConfig);
                    flag = 1;
                    isCreate = true;
                    creater.sendForceMessage("&a游戏房间创建完成 &c(重启生效配置)");

                    return false;
                }

            }
        }
        return true;
    }

    public boolean createRoom(){
        if(isCreate) {
            roomConfig.save();
            creater.sendForceMessage("&a游戏已创建");
            return true;
        }else{
            creater.sendForceMessage("&c游戏未创建");
        }
        return false;
    }

    public GameRoomConfig getRoomConfig(){
        if(isRoomCreate) {
            return roomConfig;
        }
        return null;
    }

    public PlayerInfo getCreater() {
        return creater;
    }
}