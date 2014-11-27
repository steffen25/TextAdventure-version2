/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Room;

/**
 *
 * @author Steffen
 */
public class Items {
    
    private String name;
    
    private int ID;
    
    private String description;

   
   public Items(String name, int ID, String description)
   {
      this.name = name;
      this.ID = ID;
      this.description = description;
   }
   
   public String getName()
   {
      return name;
   }
   public int getID()
   {
      return ID;
   }
   
   public String getDescription()
   {
      return description;
   }
    
}
