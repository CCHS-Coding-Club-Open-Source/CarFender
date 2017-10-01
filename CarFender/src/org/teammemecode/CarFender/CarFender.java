package org.teammemecode.CarFender;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import org.teammemecode.CarFender.graphics.GameDisplay;
import org.teammemecode.CarFender.logic.Thing;
import org.teammemecode.CarFender.logic.ThingsLogic;

public class CarFender {
	public static JFrame displayFrame;
	public static GameDisplay gamePanel;
	static ArrayList<Thing> things = new ArrayList<Thing>();
	static Thing car;


	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		
		
		things.add(new Thing("heart.png"));
		
		for(int i = 0; i < 12; i++) things.add(new Thing("healthBar/frame-" + i + ".png"));
		for(int i = 0; i < 1; i++) things.add(new Thing("wheel/frame-" + i + ".png"));
		
		
		
		car = new Thing("car.png");
		
		displayFrame = new JFrame();	
		displayFrame.setLayout(new BorderLayout());
		
		
		gamePanel = new GameDisplay(car);	
		
		displayFrame.add(gamePanel);
		
		ThingsLogic logic = new ThingsLogic();
		
		Timer timer = new Timer();
		TimerTask myTask = new TimerTask() {
		    @Override
		    public void run() {
		    	logic.tick(things);
				gamePanel.updateThingsArraylist(things);
				gamePanel.repaint();
		    }
		};

		timer.schedule(myTask, 0, 10);
		
		
		
		displayFrame.pack();
		displayFrame.setVisible(true);
		
		
		
		
		
	}
	
}
