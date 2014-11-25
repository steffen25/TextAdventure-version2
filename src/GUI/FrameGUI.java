package GUI;


import System.GameInputs;
import Player.Player;
import Enemy.Enemy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

import static java.awt.BorderLayout.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

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
    //tet
    private GameInputs gameinputs = new GameInputs();
    //(String name, int HP, boolean isDead, int mindamage, int maxdamage)
    private final Player player1 = new Player("Hans",80,false,8,12);
    //(String name, String description, int mindamage, int maxdamage, boolean isDead)
    private final Enemy enemy1 = new Enemy("Monster","Sort monster",90,8,12,false);
    
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
     
        System.out.println(player1.getName() + player1.getHP() + player1.getDamage() + player1.getisDead());
        System.out.println(enemy1.getName() + enemy1.getDescription() + enemy1.getHP() + enemy1.getDamage() + enemy1.getisDead());
        
        
    
}
    
    
            
    
    private JMenuBar mainMenu()
    {
        
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");
        
        help.addMenuListener(new MenuListener() {

            @Override
            public void menuSelected(MenuEvent e) {
            JOptionPane.showMessageDialog(null, "COMMANDLIST (TYPE FOLLOWING):" 
                    +"\nTo walk north = walk_north" 
                    +"\nTo walk south = walk_south"
                    + "\nTo walk west = walk_west"
                    + "\nTo walk east = walk_east"
                    + "\nTo Search a room = go_search"
                    + "\nTo pick up aa item = go_pickup"
                    + "\nTo use an item = whatever.."
                    + "\n"
                    + "\n"
                    + "", "", JOptionPane.WARNING_MESSAGE);           
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                help.setSelected(false);
            }

            @Override
            public void menuCanceled(MenuEvent e) {
                throw new UnsupportedOperationException("menuCanceled"); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        
        
        file.setMnemonic(KeyEvent.VK_A);
        file.getAccessibleContext().setAccessibleDescription(
        "The only menu in this program that has menu items");
        
        help.setMnemonic(KeyEvent.VK_B);
        help.getAccessibleContext().setAccessibleDescription(
        "The only menu in this program that has menu items");
        
        
        
        menubar.add(file);
        menubar.add(help);
        
        
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
        inventory.setHorizontalAlignment(SwingConstants.CENTER);


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

