package org.teammemecode.CarFender;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import org.teammemecode.CarFender.graphics.GameDisplay;

public class CarFender {
	public static JFrame displayFrame;
	public static GameDisplay gamePanel;

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		
		displayFrame = new JFrame();	
		displayFrame.setLayout(new BorderLayout());
		
		
		
		gamePanel = new GameDisplay();
		
		displayFrame.add(gamePanel);
		displayFrame.pack();
		displayFrame.setVisible(true);
	}
	
}
