package com.company;

import javax.swing.*;

public class SimpleFrame extends JFrame {
    public SimpleFrame(){
        super("PacMan");
        setLookAndFeel();
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception exc){
            //Ignore
        }
    }

}
