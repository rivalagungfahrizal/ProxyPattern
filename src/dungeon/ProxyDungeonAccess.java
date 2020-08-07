/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Rival-PC
 */
public class ProxyDungeonAccess implements DungeonInterface{
    private String playerName;
    private DungeonAccess dungeonAccess;

    public ProxyDungeonAccess(String playerName){
        this.playerName = playerName;
    }
    @Override
    public void grantDungeonAccess() {
        if(getLevel(playerName)>=10)
        {
            dungeonAccess = new DungeonAccess(playerName);
            dungeonAccess.grantDungeonAccess();
        }
        else
        {
            System.out.println("You cannot enter the dungeon, level 10 or more is required for this dungeon");
        }
    }
    
    public int getLevel(String plyerName){
        return 2;
    }

}
