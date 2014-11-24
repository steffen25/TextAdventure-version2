/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

/**
 *
 * @author Steffen
 */
public class GameEntities {
    
    private String name;
    
    private int HP;
    
    private int damage;
    
    
    //get methods
    public int getHP()
    {
        return HP;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public String getName()
    {
        return name;
    }
    
    
    //set methods
    
    public void setHP(int HP)
    {
        this.HP = HP;
    }
    
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}
