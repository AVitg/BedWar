package org.sobadfish.bedwar.command;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.utils.TextFormat;
import org.sobadfish.bedwar.BedWarMain;
import org.sobadfish.bedwar.manager.ThreadManager;
import org.sobadfish.bedwar.player.PlayerData;
import org.sobadfish.bedwar.player.PlayerInfo;
import org.sobadfish.bedwar.room.GameRoom;
import org.sobadfish.bedwar.room.GameRoomCreater;
import org.sobadfish.bedwar.room.config.GameRoomConfig;
import org.sobadfish.bedwar.room.floattext.FloatTextInfoConfig;
import org.sobadfish.bedwar.top.TopItem;
import org.sobadfish.bedwar.world.config.WorldInfoConfig;

import java.util.LinkedHashMap;

/**
 * @author SoBadFish
 * 2022/1/3
 * Super simple experiment instructions
 */
public class BedWarAdminCommand extends Command {

    public BedWarAdminCommand(String name) {
        super(name);
        this.usageMessage = "/bd help (View command help)";
        this.setPermission("op");
    }

    private final LinkedHashMap<String, GameRoomCreater> create = new LinkedHashMap<>();

    private boolean createSetRoom(CommandSender commandSender,String value){
        GameRoomCreater creater;
        if (create.containsKey(commandSender.getName())) {
            creater = create.get(commandSender.getName());
        } else {
            creater = new GameRoomCreater(new PlayerInfo((Player) commandSender));
            create.put(commandSender.getName(), creater);
        }
        creater.onCreatePreset(value);
        return true;
    }

    private boolean createRoom(CommandSender commandSender){
        GameRoomCreater creater;
        if(create.containsKey(commandSender.getName())){
            creater = create.get(commandSender.getName());
        }else{
            creater = new GameRoomCreater(new PlayerInfo((Player) commandSender));
            create.put(commandSender.getName(),creater);
        }
        if(!creater.onCreateNext()){
            if(!creater.createRoom()){
                commandSender.sendMessage("Raum konnte nicht erstellt werden");
            }
        }
        return true;
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        if(!commandSender.isOp()){
            BedWarMain.sendMessageToObject("&Sie sind nicht berechtigt, diesen Befehl zu verwenden, Sie benötigen OP-Rechte",commandSender);
            return true;
        }
        if (strings.length > 0 && "help".equalsIgnoreCase(strings[0])) {
            commandSender.sendMessage("Geben Sie einfach /bd ein");
            commandSender.sendMessage("Einführung in andere Befehle:");
            commandSender.sendMessage("/bd reload - Konfiguration neu laden");
            commandSender.sendMessage("/bd set [Name] - Erstellen Sie eine benutzerdefinierte Raumvorlage");
            commandSender.sendMessage("/bd tsl - Lesen Sie Vorlagenteamdaten und speichern Sie Artikeldaten");
            commandSender.sendMessage("/bd see - Alle geladenen Räume anzeigen");
            commandSender.sendMessage("/bd close [Name] - schließt den Raum");
            commandSender.sendMessage("/bd exp [Spieler] [Betrag] <Ursprung/Origin> - Erhöhen Sie die Spielererfahrung");
            commandSender.sendMessage("/bd status - Thread-Status anzeigen");
            commandSender.sendMessage("/bd end - Vorlagenvoreinstellungen beenden");
            commandSender.sendMessage("/bd float add/remove [Raumname] [Name] [Text] - Fließzeichen(Banner) setzen/Fließzeichen am Fuß löschen");
            commandSender.sendMessage("/bd cancel - Raumerstellung beenden/abbrechen");
            commandSender.sendMessage("/bd top add/remove [Name] [Typ] [Raum (optional)] - Bestenliste erstellen/löschen");
            StringBuilder v = new StringBuilder("Typ: ");
            for(PlayerData.DataType type: PlayerData.DataType.values()){
                v.append(type.getName()).append(" , ");
            }
            commandSender.sendMessage(v.toString());
            return true;
        }
        if (strings.length == 0) {
            if(!commandSender.isPlayer()){
                commandSender.sendMessage("Bitte nicht in der Konsole ausführen/ Don't run in console");
                return false;
            }
            return createRoom(commandSender);
        }
        switch (strings[0]){
            case "set":
                if(strings.length > 1) {
                    if (commandSender instanceof Player) {
                        return createSetRoom(commandSender, strings[1]);
                    } else {
                        commandSender.sendMessage("Bitte nicht in der Konsole ausführen/ Don't run in console");
                        return false;
                    }
                }else{
                    commandSender.sendMessage(TextFormat.colorize('&',"/bd set [Name] - wurde zuerst als Raumname erstellt"));
                    return false;
                }
            case "end":
                if(commandSender instanceof Player) {
                    if (create.containsKey(commandSender.getName())) {
                        create.get(commandSender.getName()).stopInit();
                    }
                }else{
                    commandSender.sendMessage("Bitte nicht in der Konsole ausführen/ Don't run in console");
                    return false;
                }
                break;
            case "float":
                if(strings.length < 4){

                    commandSender.sendMessage("Befehlsparameterfehler Führen Sie /bw help aus, um die Hilfe anzuzeigen");
                    return false;
                }
                if(commandSender instanceof Player) {
                   GameRoomConfig roomConfig = BedWarMain.getRoomManager().getRoomConfig(strings[2]);
                   if(roomConfig == null){
                       commandSender.sendMessage("Raum "+strings[2]+" ist nicht vorhanden");
                       return false;
                   }
                   if("remove".equalsIgnoreCase(strings[1])){
                       if(roomConfig.notHasFloatText(strings[3])){
                           commandSender.sendMessage("Schweben/Text "+strings[3]+" ist nicht vorhanden");
                           return false;
                       }
                       roomConfig.removeFloatText(strings[3]);
                       commandSender.sendMessage("Das schwebende Wort wurde erfolgreich gelöscht");

                   }else{
                       if(strings.length < 5){
                           commandSender.sendMessage("Befehlsparameterfehler Führen Sie /bw help aus, um die Hilfe anzuzeigen");
                           return false;
                       }
                       if(roomConfig.notHasFloatText(strings[3])){
                           roomConfig.floatTextInfoConfigs.add(new FloatTextInfoConfig(strings[3], WorldInfoConfig.positionToString(((Player) commandSender).getPosition()),strings[4]));
                           commandSender.sendMessage("Schwebende Wörter erfolgreich hinzugefügt");
                       }else{
                           commandSender.sendMessage("Raum existiert "+strings[3]+" schweben");
                       }
                   }

                }else{
                    commandSender.sendMessage("请不要在控制台执行");
                    return false;
                }

                break;
            case "status":
                BedWarMain.sendMessageToObject("&6zeitgesteuerte Aufgaben: &a"+ ThreadManager.getScheduledSize(),commandSender);
                BedWarMain.sendMessageToObject("&66zeitgesteuerte Aufgaben werden ausgeführt: &a"+ ThreadManager.getScheduledActiveCount(),commandSender);
                BedWarMain.sendMessageToObject("&6Threaddetails: &r\n"+ThreadManager.info(),commandSender);
                BedWarMain.sendMessageToObject("&6Raumstatus: &a",commandSender);
                for(GameRoomConfig config: BedWarMain.getRoomManager().getRoomConfigs()){
                    GameRoom room = BedWarMain.getRoomManager().getRoom(config.name);
                    if(room != null){

                        BedWarMain.sendMessageToObject("&a"+config.getName()+" (aktiviert) "+room.getType()+" : &2"+room.getPlayerInfos().size(),commandSender);
                    }else{
                        BedWarMain.sendMessageToObject("&c"+config.getName()+" (nicht aktiviert (weil raum nicht exitiert??/TODO)",commandSender);
                    }
                }
                break;
            case "exp":
                if(strings.length < 3){
                    commandSender.sendMessage("Befehlsparameterfehler Führen Sie /bw help aus, um die Hilfe anzuzeigen");
                    return false;
                }
                String playerName = strings[1];
                Player player = Server.getInstance().getPlayer(playerName);
                if(player != null){
                    playerName = player.getName();
                }
                String expString = strings[2];
                int exp = 0;
                try {
                    exp = Integer.parseInt(expString);
                }catch (Exception ignore){}
                String cause = "指令给予";
                if(strings.length > 3){
                    cause = strings[3];
                }
                if(exp > 0){
                    PlayerData playerData = BedWarMain.getDataManager().getData(playerName);
                    playerData.addExp(exp,cause);
                    commandSender.sendMessage("erfolgreich an den Spieler übergeben "+playerName+" "+exp+" Anzahl-Erfahrung");
                }else{
                    commandSender.sendMessage("Erfahrung muss größer als 0 sein");
                    return false;
                }
                break;
            case "tsl":
                teamShopLoad(commandSender);
                break;
            case "top":
                if(commandSender instanceof Player) {
                    if (strings.length < 3) {
                        commandSender.sendMessage("Befehlsparameterfehler Führen Sie /bw help aus, um die Hilfe anzuzeigen");
                        return false;
                    }
                    String name = strings[2];


                    if ("add".equalsIgnoreCase(strings[1])) {
                        if(strings.length < 4){
                            commandSender.sendMessage("Befehlsparameterfehler Führen Sie /bw help aus, um die Hilfe anzuzeigen");
                            return false;
                        }
                        PlayerData.DataType type = PlayerData.DataType.byName(strings[3]);
                        if (type == null) {
                            commandSender.sendMessage("unbekannter Typ/Spieler/Raum/TODO");
                            return true;
                        }
                        String room = null;
                        if (strings.length > 4) {
                            room = strings[4];
                        }
                        TopItem item = new TopItem(name,type,((Player) commandSender).getPosition(),"");
                        item.room = room;
                        if(BedWarMain.getTopManager().hasTop(name)){
                            commandSender.sendMessage("existiert mit dem Namen "+name+" 's Bestenliste //TODO");
                            return true;
                        }
                        item.setTitle(TextFormat.colorize('&',BedWarMain.getTitle()+" &a"+type.getName()+" &r-Bestenliste//TODO"));
                        BedWarMain.getTopManager().addTopItem(item);
                        commandSender.sendMessage("Bestenliste erfolgreich erstellt");
                    } else {
                        if(!BedWarMain.getTopManager().hasTop(name)){
                            commandSender.sendMessage("existiert nicht mit dem Namen "+name+" Bestenliste//TODO");
                            return true;
                        }
                        TopItem topItem = BedWarMain.getTopManager().getTop(name);
                        if(topItem == null){
                            commandSender.sendMessage("existiert nicht mit dem Namen "+name+" Bestenliste//TODO");
                            return true;
                        }
                        BedWarMain.getTopManager().removeTopItem(topItem);
                        commandSender.sendMessage("Bestenliste erfolgreich gelöscht");

                    }
                }else{
                    commandSender.sendMessage("Bitte nicht in der Konsole ausführen/ Don't run in console");
                    return false;
                }
                break;
            case "see":
                BedWarMain.sendMessageToObject(BedWarMain.getRoomManager().getRooms().keySet().toString(),commandSender);
                break;
            case "reload":
                BedWarMain.sendMessageToObject("Konfigurationsdatei lesen",commandSender);
                BedWarMain.getBedWarMain().loadBedWarConfig();
                BedWarMain.sendMessageToObject("Lesen der Konfigurationsdatei abgeschlossen",commandSender);
                break;
            case "close":
                if(strings.length > 1) {
                    String name = strings[1];
                    if(BedWarMain.getRoomManager().hasGameRoom(name)){
                        BedWarMain.getRoomManager().disEnableRoom(name);
                        commandSender.sendMessage("Der Raum wurde erfolgreich geschlossen: "+name);
                    }else{
                        commandSender.sendMessage("Der Raum ist nicht geöffnet/vorhanden");
                    }
                }else{
                    commandSender.sendMessage("Bitte geben Sie den Raumnamen ein");
                }
                break;
            case "cancel":
                create.remove(commandSender.getName());
                BedWarMain.sendMessageToObject("Die Erstellung des Raums wurde abgebrochen,die restlichen Dateien werden nach einem Neustart des Servers automatisch gelöscht", commandSender);
                // commandSender.sendMessage(TextFormat.colorize('&', "&d"));

                break;

            default:break;

        }
        return true;
    }

    private void teamShopLoad(CommandSender commandSender){
        if(!create.containsKey(commandSender.getName())){
            commandSender.sendMessage("Bitte erstellen Sie zuerst eine Raumvorlage");
            return;
        }
        GameRoomCreater creater = create.get(commandSender.getName());
        GameRoomConfig roomConfig = creater.getRoomConfig();
        if(roomConfig != null) {
            GameRoomConfig.loadTeamShopConfig(roomConfig);
            commandSender.sendMessage("Vorlageninformationen erfolgreich erneut gelesen");
        }else{
            commandSender.sendMessage("Keine Vorlageninformationen");
        }
    }
}
