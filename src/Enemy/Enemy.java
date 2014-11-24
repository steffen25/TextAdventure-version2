/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemy;
import System.GameEntities;
import java.util.Random;

/**
 *
 * @author
 */
public class Enemy extends GameEntities {
    
    private String description;
    
    private boolean isDead;
    
    
    public Enemy(String name, String description, int HP, int mindamage, int maxdamage, boolean isDead)
    {
        this.setName(name);
        this.description = description;
        this.setHP(HP);
        this.setDamage(randDamage(mindamage,maxdamage));
        this.isDead = isDead;
    }
    
    
    //get method
    
    public String getDescription()
    {
        return description;
    }
    
    public boolean getisDead()
    {
        return isDead;
    }
    
    //setmethod
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public static int randDamage(int min, int max) {

    
    Random rand = new Random();

    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
}
