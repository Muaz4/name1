package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
Main(){
    setSize(300,400);
    setVisible(true);
}
    public static void main(String[] args) {
	new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
