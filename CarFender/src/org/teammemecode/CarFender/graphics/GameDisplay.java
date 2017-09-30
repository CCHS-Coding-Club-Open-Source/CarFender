package org.teammemecode.CarFender.graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GameDisplay extends JPanel {
	public GameDisplay() {
		
	    this.repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		
		Image img = null;
		File input = new File("src/org/teammemecode/CarFender/resources/vision.png");
	    try {
			img = ImageIO.read(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // POSITION OF THE PICTURE
	    int x = 60;
	    int y = 60;
	    g.drawImage(img, x, y, null);
	}

}
