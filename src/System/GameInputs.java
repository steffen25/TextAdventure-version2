package System;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Steffen
 */

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.text.Element;

public class GameInputs {



    private JTextArea textarea;


    
    
    
    
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
           final  String input = textfield.getText();
          
          
          textarea.append(input + "\n");
          
          textarea.setCaretPosition(textarea.getDocument().getLength());


        }
        
        }
    });
        
        
        
        
        
        return textfield;     
 }
 
 public JTextArea createTextArea() {


     textarea = new JTextArea(41, 64);

     textarea.setLineWrap(true);


     //textarea.setText("Test");

     //textarea.setEditable(false);

     return textarea;

 }

    //--------------------------------------------------------------------------------
    /*
    *  Jeg har sørget for at JList er added til til panelen med Inventory.
    *
    * */

    public JList createInventoryList() { // Dani WU


        String	listInventory[] = // Danni WU
                {
                        "Key",
                        "Gun",
                        "Kondom",
                        "Stripper",
                        "Mujjaffa",
                        
                };

        JList inventoryList = new JList(listInventory); // Danni Wu

        inventoryList.setBackground(Color.ORANGE);
        inventoryList.setFixedCellHeight(20); // Danni WU
        inventoryList.setFixedCellWidth(40); // Danni Wu





     return inventoryList; // Danni WU
 }

    //----------------------------------------------------------------------------------------



 public void walkNorth()
 {
     createTextArea().append("walk north");
 }


 
 
 
 
 
 
 
 
 
 
 
}
