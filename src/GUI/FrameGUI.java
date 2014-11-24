package GUI;


import System.GameInputs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

import static java.awt.BorderLayout.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Steffen
 */
public class FrameGUI extends JFrame {
    
    private GameInputs gameinputs = new GameInputs();
    
    private JScrollPane jp;

    
    public FrameGUI() {
               
        setTitle("Mass Effect 3");
        
        setSize(new Dimension(1024, 768));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        
        // add panels
        
        add(leftPanel(), WEST);
        add(rightPanel(), EAST);
        
        // menu
        setJMenuBar(mainMenu());
     
        
        
        
    
}
    
    
            
    
    private JMenuBar mainMenu()
    {
        
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        
        file.setMnemonic(KeyEvent.VK_A);
        file.getAccessibleContext().setAccessibleDescription(
        "The only menu in this program that has menu items");
        
        
        
        menubar.add(file);
        
        
        //save
        JMenuItem save = new JMenuItem("Save", KeyEvent.VK_T);
        
        save.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_2, ActionEvent.ALT_MASK));
        
        save.getAccessibleContext().setAccessibleDescription(
        "This doesn't really do anything");
        
        //load
        JMenuItem load = new JMenuItem("Load", KeyEvent.VK_ALT);
        
        load.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_3, ActionEvent.ALT_MASK));
        
        load.getAccessibleContext().setAccessibleDescription(
        "This doesn't really do anything");
        
        //newgame
        JMenuItem newgame = new JMenuItem("New Game", KeyEvent.VK_9);
        
        newgame.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_1, ActionEvent.ALT_MASK));
        
        newgame.getAccessibleContext().setAccessibleDescription(
        "This doesn't really do anything");
        
        file.add(newgame);
        file.add(save);
        file.add(load);
        
        
        return menubar;
    }
    
    
    private JPanel leftPanel() {
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(leftTopPanel(), NORTH);
        panel.add(leftCenterPanel(), CENTER);
        panel.add(leftBottomPanel(), SOUTH);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        return panel;    
    }
    
    private JPanel rightPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(rightTopPanel(), NORTH);
        panel.add(rightBottomPanel(), SOUTH);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        return panel;
    }
    
    private JPanel leftTopPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        
        JLabel hitpoints = new JLabel();
        hitpoints.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        hitpoints.setText("100/100");
        
        JLabel name = new JLabel();
        name.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        
        name.setText("Name");
        
        JLabel image = new JLabel();
        image.setIcon(new ImageIcon("src/user.png"));
        
        
        GridBagConstraints c = new GridBagConstraints();
c.fill = GridBagConstraints.HORIZONTAL;
c.ipady = 0;       //reset to default
c.weighty = 0;   //request any extra vertical space
c.anchor = GridBagConstraints.FIRST_LINE_START; //bottom of space
c.insets = new Insets(0,0,0,0);  //top padding
c.gridx = 1;       //aligned with button 2
c.gridwidth = 0;   //2 columns wide
c.gridy = 0;       //third row

GridBagConstraints d = new GridBagConstraints();
d.fill = GridBagConstraints.HORIZONTAL;
d.ipady = 0;       //reset to default
d.weighty = 0;   //request any extra vertical space
d.anchor = GridBagConstraints.LINE_END; //bottom of space
d.insets = new Insets(0,-70,0,0);  //top padding
d.gridx = 2;       //aligned with button 2
d.gridwidth = 0;   //2 columns wide
d.gridy = 0;       //third row

GridBagConstraints e = new GridBagConstraints();
e.fill = GridBagConstraints.HORIZONTAL;
e.ipady = 0;       //reset to default
e.weighty = 0;   //request any extra vertical space
e.anchor = GridBagConstraints.CENTER; //bottom of space
e.insets = new Insets(0,50,0,0);  //top padding
e.gridx = 0;       //aligned with button 2
e.gridwidth = 2;   //2 columns wide
e.gridy = 2;       //third row


        panel.add(image, c);
        panel.add(name, d);
        panel.add(hitpoints, e);
        hitpoints.setBorder(BorderFactory.createLineBorder(Color.black));
        hitpoints.setOpaque(true);
        hitpoints.setBackground(Color.GREEN);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));

        
        return panel;
    }

    //---------------------------------------------

    private JPanel leftCenterPanel()
    {


        JPanel panel = new JPanel();
        BorderLayout layout = new BorderLayout(); // Danni WU
        panel.setLayout(layout); // Danni Wu

        JLabel inventory = new JLabel();
        inventory.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        inventory.setText("Inventory");


        panel.add(inventory,BorderLayout.NORTH); // Danni WU
        panel.add(new JScrollPane(gameinputs.createInventoryList()),BorderLayout.CENTER); // Danni Wu

        return panel;
    }

    //-----------------------------------------------------------------------
    
    private JPanel leftBottomPanel()
    {
        JPanel panel = new JPanel();
        JLabel map = new JLabel();
        map.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        map.setText("Map");
        
        map.setBorder(BorderFactory.createEmptyBorder(0, 0, 150, 0));
        
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.add(map);

        return panel;
    }
    
    private JPanel rightTopPanel()
    {
        JPanel panel = new JPanel();
       
        jp = new JScrollPane(gameinputs.createTextArea());
     
        panel.add(jp); 

        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        return panel;
    }
    
    
    private JPanel rightBottomPanel()
    {
        JPanel panel = new JPanel();
                
        panel.add(gameinputs.createTextField());
        
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        return panel;
    }
   
    
    
    
}
