package org.teammemecode.CarFender.graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JPanel;

import org.teammemecode.CarFender.logic.Thing;

public class GameDisplay extends JPanel {
	private static ArrayList<Thing> things = new ArrayList<Thing>();

	
	public GameDisplay() {
		
	    this.repaint();
	}
	
	public void updateThingsArraylist(ArrayList<Thing> newThing) {
		things = newThing;
	}
	
	public void paintComponent(Graphics g)
	{
		for(int i = 0; i < things.size(); i++) {
			Thing thing = things.get(i);
			Image a = thing.getImage(50);
		    g.drawImage(a, thing.x, thing.y, null);
		}
		
	}

}
