package edu.nvcc.csc201.gui;

import javax.swing.*;

public class UserInterface extends JFrame {
	JButton abutton = new JButton("CLICK me!");
	public UserInterface() {
		
		add(abutton);
		setVisible(true);
		setSize(100,100);
	}
}
