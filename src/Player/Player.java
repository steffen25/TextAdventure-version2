/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;
import System.GameEntities;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */

//test
//dasdas

// sword increase maximum damage
public class Player extends GameEntities {
    
    
    private boolean isDead; // add get method
    
    
    public Player(String name, int HP, boolean isDead, int mindamage, int maxdamage)
    {
        String name2;
        name2 = JOptionPane.showInputDialog(null, "What's your name?");
        this.setName(name2);
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
