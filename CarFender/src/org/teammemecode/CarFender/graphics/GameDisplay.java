package org.teammemecode.CarFender.graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JPanel;

import org.teammemecode.CarFender.logic.Thing;

public class GameDisplay extends JPanel {
	ArrayList<Thing> things = new ArrayList<Thing>();
	
	
	public GameDisplay() {
		
	    this.repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		
		Thing abc = new Thing("Car.png");
	    // POSITION OF THE PICTURE
	    int x = 0;
	    int y = 0;
	    Image a = abc.getImage(500);
	    g.drawImage(a, x, y, null);
	}

}
