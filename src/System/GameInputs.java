package System;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.*;
import javax.swing.text.Element;
import System.Commands;
import Room.Room;
import Room.Items;
import Inventory.InventoryClass;

public class GameInputs {



    private JTextArea textarea;
    
    private JList list;

    private DefaultListModel model;
    

    
    
    
    
 public GameInputs()
 {
     
 }
 
 
 public JTextField createTextField()
 {
        final JTextField textfield = new JTextField();
        textfield.setText(">");
        
        textfield.setPreferredSize( new Dimension( 770, 34 ) );


        textfield.addKeyListener(new KeyAdapter()
        {
        public void keyPressed(KeyEvent e)
        {
        if (e.getKeyCode() == KeyEvent.VK_ENTER)
        {
           final  String command = textfield.getText();
           final String[] parts = command.split("\\s+");
           final String command2 = parts[0];
           final String action = parts[1];
           
           //JOptionPane.showMessageDialog(null, command2 + command3);
           
           
          
            switch(command2.toLowerCase()) {
                case Commands.NORTH:
                textarea.append("\n" + Commands.NORTH.toString());
                break;
                case Commands.SOUTH:
                textarea.append("\n" +Commands.SOUTH.toString());
                break;
                case Commands.EAST:
                textarea.append("\n" +Commands.EAST.toString());
                break;
                case Commands.WEST:
                textarea.append("\n" +Commands.WEST.toString());
                break;
                case Commands.USE:
                textarea.append("\n" +Commands.USE.toString());
                break;
                case Commands.PICKUP:
                if (action.equals("apple"))
                {
                    updateInventory(new Items("apple",1,"test"));
                    
                }
                else if (action.equals("key"))
                {
                    updateInventory(new Items("key",1,"key åbn dør"));
                    
                }
                else {
                    textarea.append("\n" + "Command doesnt exist. Use help function in the menu");
                }
                
                break;
                case Commands.EXIT:
                System.exit(0);
                break;
                case Commands.SAVE:
                //saveGame();
                break;
                case Commands.LOAD:
                //loadGame();
                break;
                default:
                textarea.append("\n" + "Command doesnt exist. Use help function in the menu");
                break;
            }
          
          //textarea.append(input + "\n");
          
            
          
          
         
          
          textarea.setCaretPosition(textarea.getDocument().getLength());


        }

        
        }
    });
        
              InputStream is = getClass().getResourceAsStream("content.txt");
        try {
            textarea.read(new InputStreamReader(is), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        
        return textfield;     
 }
 
 public JTextArea createTextArea() {


     textarea = new JTextArea(41, 64);

     textarea.setLineWrap(true);

     textarea.setText("Once upon a timere there lived a big asss girl named Cindarella!");

     textarea.setEditable(false);

     return textarea;

 }

    //--------------------------------------------------------------------------------
    /*
    *  Jeg har sørget for at JList er added til til panelen med Inventory.
    *
    * */

    public JList createInventoryList() { // Dani WU
        

        
        model = new DefaultListModel();
        list = new JList(model);
        list.setFixedCellHeight(20);
        list.setFixedCellWidth(40);
        list.setBackground(Color.WHITE);

        return list; // Danni WU
 }
    
    public void updateInventory(Items newItem)
    {
        
        
        final InventoryClass inv = new InventoryClass();
        inv.addItems(newItem);
        
        model.addElement(newItem.getName());
        //JOptionPane.showMessageDialog(null, inv.getItems());
        
        
        
    }

    //----------------------------------------------------------------------------------------



 public void walkNorth()
 {
     createTextArea().append("walk north");
 }


 
 
 
 
 
 
 
 
 
 
 
}
