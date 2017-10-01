package org.teammemecode.CarFender.graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import org.teammemecode.CarFender.logic.Thing;

public class GameDisplay extends JPanel implements KeyListener {
	private static ArrayList<Thing> things = new ArrayList<Thing>();
	private Thing car;
	
	public GameDisplay(Thing car) {
		this.car = car;
		
	    this.repaint();
	    addKeyListener(this);
	    this.setFocusable(true);
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
		
		Image imgCar = car.getImage(50);
		g.drawImage(imgCar, car.x, car.y, null);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();
		System.out.println(c);
		switch(c){
			case 'w':
				car.y -= 10;
				break;
			case 'a':
				car.x -= 10;
				break;
			case 's':
				car.y += 10;
				break;
			case 'd':
				car.x += 10;
				break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
