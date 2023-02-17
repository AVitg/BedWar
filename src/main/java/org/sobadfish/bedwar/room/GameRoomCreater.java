package org.sobadfish.bedwar.room;

import cn.nukkit.math.BlockFace;
import org.sobadfish.bedwar.item.config.ItemInfoConfig;
import org.sobadfish.bedwar.player.PlayerInfo;
import org.sobadfish.bedwar.player.team.config.TeamInfoConfig;
import org.sobadfish.bedwar.room.config.GameRoomConfig;
import org.sobadfish.bedwar.world.config.WorldInfoConfig;

import java.util.ArrayList;
import java.util.LinkedHashMap;

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

    /**
     * 队伍出生点
     * */
    private final LinkedHashMap<String, String> team = new LinkedHashMap<>();
    /**
     * 队伍床
     * */
    private final LinkedHashMap<String, String> teamBed = new LinkedHashMap<>();
    /**
     * 队伍床
     * */
    private final LinkedHashMap<String, BlockFace> teamBedFace = new LinkedHashMap<>();

    private final LinkedHashMap<String, String> teamShop = new LinkedHashMap<>();

    private final LinkedHashMap<String, String> teamShop2 = new LinkedHashMap<>();

    /**
     * 物品刷新点
     * */
    private final LinkedHashMap<String, ArrayList<String>> itemPosition = new LinkedHashMap<>();

    public GameRoomCreater(PlayerInfo player){
        this.creater = player;
    }



    public void onCreatePreset(String value){
        if(flag !=  1){
            creater.sendForceMessage("&cSie führen einen Standardaufbau durch und können keine Voreinstellung verwenden");
            return;
        }
        switch (setFlag){
            case 1:
                creater.sendForceMessage("&2Raumvorlagen &r"+value+" &rerstellt");
                creater.sendForceMessage("&eErstellung wird fortgesetzt mit &r/bd set &a[Mindestanzahl an Spielern]&e Weiter");
                roomName = value;
                setFlag++;
                break;
            case 2:
                creater.sendForceMessage("&2Mindestanzahl von Spielern "+value);
                creater.sendForceMessage("&eErstellung wird fortgesetzt mit &r/bd set &2[Maximale Anzahl von Spielern]&e Weiter");
                min = Integer.parseInt(value);
                setFlag++;
                break;
            case 3:
                int max = Integer.parseInt(value);
                roomConfig = GameRoomConfig.createGameRoom(roomName,min, max);
                ArrayList<String> itemName = roomConfig.moneyItem.getNames();
                creater.sendForceMessage("&2Maximalzahl von Spielern:&b "+value);
                creater.sendForceMessage("&akann Voreinstellung beenden");
                creater.sendForceMessage("&eErstellung wird fortgesetzt mit &r/bd set &2[Menge] &eExecute settings: &r"+itemName.get(inflag)+" &e generate point amount operation//TODO");
                isRoomCreate = true;
                setFlag++;
                break;
            case 4:
                itemName = roomConfig.moneyItem.getNames();
                creater.sendForceMessage("&2Einstellungen &r"+itemName.get(inflag)+"&2Anzahl Spawnpunkte:&b "+value);
                moneyItemSize.put(itemName.get(inflag),Integer.parseInt(value));
                inflag++;
                if(inflag == itemName.size()){
                    creater.sendForceMessage("&aeine Voreinstellung abgeschlossen/ein Template");
                    setFlag = 1;
                    return;
                }
                creater.sendForceMessage("&eErstellung wird fortgesetzt mit &r/bd set &2[Menge] &eExecute settings: &r"+itemName.get(inflag)+" &e generate point amount operation");


                break;
            default: break;
        }

    }

    public void stopInit(){
        if(setFlag >= 4) {
            setFlag = 1;
            creater.sendForceMessage("&cVoreinstellung beenden");
        }else{
            creater.sendForceMessage("&ckann die Voreinstellung nicht beenden");
        }
    }

    public boolean onCreateNext(){
        if(setFlag != 1){
            creater.sendForceMessage("&cBitte vervollständigen Sie zuerst die Voreinstellung");
            return true;
        }
        //Testraum
        switch (flag) {
            case 1:
                if(roomConfig == null) {
                    roomConfig = GameRoomConfig.createGameRoom("Testraum", 4, 16);
                    isRoomCreate = true;
                    creater.sendForceMessage("&2 erfolgreich erstellt a Der Name wurde als festgelegt &r“Testraum”&2Die Spielraumvorlage für hat eine Mindestspielerzahl von festgelegt &b4&2 maximale Anzahl Spieler ist: &b16&r");
                    creater.sendForceMessage("weiter ausführen /bd Fahren Sie mit dem nächsten Schritt fort [Spielkarteneinstellungen eingeben]");
                }else{
                    creater.sendForceMessage("&2erfolgreich voreingestellte Raumeinstellungen");
                    creater.sendForceMessage("&Die Ausführung wird fortgesetzt &r/bd &rFahren Sie mit dem nächsten Schritt fort &b[Spielkarteneinstellungen eingeben]");
                }
                flag++;
                break;
            case 2:
                worldInfoConfig = WorldInfoConfig.createWorldConfig(creater.getLevel().getFolderName());
                creater.sendForceMessage("&2Stellen Sie die Spielkarte erfolgreich ein");
                creater.sendForceMessage("&Die Ausführung wird fortgesetzt &r/bd &eWeiter zum nächsten Schritt &b[Wartehalle einstellen]");
                flag++;
                break;
            case 3:
                worldInfoConfig.setWaitPosition(creater.getPosition());
                creater.sendForceMessage("&2Wartehalle erfolgreich eingerichtet");
                creater.sendForceMessage("&eDie Ausführung wird fortgesetzt &r/bd &gehen zum nächsten Schritt &r[&baufstellen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(team.size()))+"Geschäft/Shop &21&b /&d "+roomConfig.teamCfg.size()+"&r]");
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
                creater.sendForceMessage("&2Einstellungen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(index))+"Spawnpunkt &r[&2"+team.size()+"&b/&d"+roomConfig.getTeamCfg().size()+"&r]");
                if(team.size() == roomConfig.getTeamCfg().size()){

                    creater.sendForceMessage("&2Die Einstellung des Team-Spawnpunktes ist abgeschlossen");
                    creater.sendForceMessage("&eweiter mit &r/bd &eFahren Sie mit dem nächsten Schritt fort &r[&baufstellen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(0))+"Betten&2 1&b /&d "+roomConfig.teamCfg.size()+"&r]");
                    flag++;
                    break;
                }
                creater.sendForceMessage("&eWeiter mit &r/bd &Fahren Sie mit dem nächsten Schritt fort &r[&bEinstellungen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(team.size()))+"Spawnpunkt &r[&2"+(team.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
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
     * Erstellen Sie die Koordinaten von Geschäft 1
     * */
    private void createShopPos(){
        teamShop.put(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop.size()),WorldInfoConfig.locationToString(creater.getLocation()));

        creater.sendForceMessage("&2aufstellen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop.size() - 1))+"Shop &r[&a"+teamShop.size()+"&b/&d"+roomConfig.getTeamCfg().size()+"&r]");
        if(teamShop.size() == roomConfig.getTeamCfg().size()){
            creater.sendForceMessage("&eWeiter mit &r/bd &enächstem Schritt &r[&aufstellen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(0))+"Team Shop &r[&2"+(team.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
            flag++;
            return;
        }
        creater.sendForceMessage("&eWeiter mit &r/bd &enächstem Schritt &r[&aufstellen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop.size()))+"Shop &r[&2"+(teamShop.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
    }
    /**
     * Erstellen Sie die Koordinaten von Geschäft 2
     * */
    private void createShop2Pos(){
        teamShop2.put(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop2.size()),WorldInfoConfig.locationToString(creater.getLocation()));
        creater.sendForceMessage("&2Einstellungen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop2.size() - 1))+"Team Shop &r[&2"+teamShop2.size()+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
        if(teamShop2.size() == roomConfig.getTeamCfg().size()){
            creater.sendForceMessage("&eWeiter mit &r/bd &enächstem Schritt &r[&aufstellen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(0))+"Shop &r[&2"+(team.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
            flag++;
            return;

        }
        creater.sendForceMessage("&eWeiter mit &r/bd &enächstem Schritt &r[&aufstellen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamShop2.size() ))+"Team Shop &r[&2"+(teamShop2.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");

    }

    /**
     * 创建床坐标
     * */
    private void createBedPos(){
        teamBed.put(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamBed.size()),WorldInfoConfig.positionToString(creater.getPosition()));
        teamBedFace.put(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamBedFace.size()),creater.getHorizontalFacing());
        creater.sendForceMessage("&2Einstellungen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamBed.size() - 1))+"Bettkoordinaten &r[&2"+teamBed.size()+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
        if(teamBed.size() == roomConfig.getTeamCfg().size()){

            creater.sendForceMessage("&2Einrichtung des Teambetts abgeschlossen");
            creater.sendForceMessage("&eWeiter mit &r/bd &enächstem Schritt &r[&aufstellen &r"+roomConfig.moneyItem.getNames().get(0)+" &2Respawnpunkt &r"+" [&21 &b/&d "+moneyItemSize.getOrDefault(roomConfig.moneyItem.getNames().get(0),4)+"&r]");
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
        creater.sendForceMessage("&eWeiter mit &r/bd &enächstem Schritt &r[&aufstellen"+(new ArrayList<>(roomConfig.teamCfg.keySet()).get(teamBed.size()))+"Bett&r [&2"+(teamBed.size() + 1)+" &b/&d "+roomConfig.getTeamCfg().size()+"&r]");
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
            creater.sendForceMessage("&2Einstellungen&r "+name+" &2Punktkoordinaten erzeugen&r [&2"+positions.size()+" &b/&d "+moneyItemSize.getOrDefault(name,4)+"&r]");
            if(positions.size() != moneyItemSize.getOrDefault(name,4)) {
                creater.sendForceMessage("&eWeiter mit &r/bd &enächstem Schritt &r[&2aufstellen Artikelaktualisierungspunkt&r " + name + " [&2" + (positions.size() + 1) + " &b/&d "+moneyItemSize.getOrDefault(name,4)+"&r]");
            }else{

                if(itemName.size() > itemFlag+1){
                    creater.sendForceMessage("&2Einstellungen &r" + name + " &2 Punktkoordinaten generieren abgeschlossen");
                    creater.sendForceMessage("&eWeiter mit &r/bd &enächstem Schritt &r[&2aufstellen &r"+ itemName.get(itemFlag + 1) + " &2Refresh-Punkte&r [&21 &b/&d "+moneyItemSize.getOrDefault(itemName.get(itemFlag + 1),4)+"&r]");
                }
                itemFlag++;
                if (itemFlag >= roomConfig.moneyItem.getNames().size()) {
                    creater.sendForceMessage("&2Stellen Sie alle generierten Punktkoordinaten auf Fertig");
                    ArrayList<ItemInfoConfig> itemInfoConfigs = new ArrayList<>();
                    for (String s1 : itemPosition.keySet()) {
                        itemInfoConfigs.add(new ItemInfoConfig(roomConfig.moneyItem.get(s1), itemPosition.get(s1), 20));
                    }
                    worldInfoConfig.setItemInfos(itemInfoConfigs);
                    roomConfig.setWorldInfo(worldInfoConfig);
                    flag = 1;
                    isCreate = true;
                    creater.sendForceMessage("&aDer Raum wird erstellt &c(Starten Sie die Konfiguration neu, damit sie wirksam wird)");

                    return false;
                }

            }
        }
        return true;
    }

    public boolean createRoom(){
        if(isCreate) {
            roomConfig.save();
            creater.sendForceMessage("&Raum erstellt");
            return true;
        }else{
            creater.sendForceMessage("&Raum nicht erstellt");
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
