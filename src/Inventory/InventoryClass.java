/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;
import Room.Items;
import java.util.ArrayList;

/**
 *
 * @author Steffen
 */
public class InventoryClass {

    
    //private ArrayList<Items> itemList;
    
    public ArrayList<Items> myItems()    {
    ArrayList<Items> itemList = new ArrayList<Items>();

    return(itemList);
}
    
    //constuctor
    public InventoryClass()
    {
        
    }
    
    public boolean addItems(Items newItem) {
        myItems().add(newItem);
        return true;
    }
    
    public String getItems()
{
    String allItems = myItems().toString();
    return allItems.substring(1, allItems.length() - 1);
}
    
    
    
    
    
   
    
    
    
    
        
    

    
}
