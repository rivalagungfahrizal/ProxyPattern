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
public class DungeonAccess implements DungeonInterface{
    private String playerName;  
    
    public DungeonAccess(String plyerName) {  
        this.playerName = plyerName;  
    }
    
    @Override
    public void grantDungeonAccess() {
        System.out.println("Dungeon Access granted for player : "+ playerName+" you may enter now");
    }
    
    
}
