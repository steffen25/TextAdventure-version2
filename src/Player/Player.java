/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;
import System.GameEntities;
import java.util.Random;

/**
 *
 * @author Steffen
 */


public class Player extends GameEntities {
    
    
    private boolean isDead; // add get method
    
    
    public Player(String name, int HP, boolean isDead, int mindamage, int maxdamage)
    {
        this.setName(name);
        this.setHP(HP);
        this.isDead = isDead;
        this.setDamage(randDamage(mindamage,maxdamage));
    }
    
    public static int randDamage(int min, int max) {

    
    Random rand = new Random();

    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
    
    public boolean getisDead()
    {
        return isDead;
    }
    
}
