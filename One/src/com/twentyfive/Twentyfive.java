package com.twentyfive;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Twentyfive {
	
	
	public static void main(String args[]){
		
		
		
		
		Dog pippa = new Dog();
		
		
		Dog fred = new Dog(12, "fred", 12.5);
		
		
	    final JFrame parent = new JFrame();
        JButton button = new JButton();

        button.setText("Click me to show dialog!");
        parent.add(button);
        parent.pack();
        parent.setVisible(true);

        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String name2 = JOptionPane.showInputDialog(parent,
                        "What is your name?", null);
            }
        });
        
    	Dog fred2 = new Dog(12, "test2",  12.7565654);
		
		
	}

}
