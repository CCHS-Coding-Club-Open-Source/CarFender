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


	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		Thing abc = new Thing("Car.png");
		things.add(abc);
		
		displayFrame = new JFrame();	
		displayFrame.setLayout(new BorderLayout());
		
		
		
		gamePanel = new GameDisplay();
		
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

		timer.schedule(myTask, 0, 200);
		
		
		
		displayFrame.pack();
		displayFrame.setVisible(true);
		
		
		
		
		
	}
	
}
