package org.teammemecode.CarFender.logic;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Thing {
	private Image img;
	private Image scaledImage;
	
	public Thing(String filePath) {
		File input = new File("src/org/teammemecode/CarFender/resources/" + filePath);
	    try {
			img = ImageIO.read(input);
		} catch (IOException e) {
			System.out.println("Problem getting image: " + filePath);
			e.printStackTrace();
		}
	}
	
	public Image getImage(int width) {
		//if(scaledImage.getWidth(null) == width) {
		//	return scaledImage;
		//}
		
		System.out.println(img.getHeight(null));
		System.out.println(img.getWidth(null));
		
		double initH = img.getHeight(null);
		double initW = img.getWidth(null);
		
		double height = width * (initH / initW);
		
		System.out.println(width + " " + height);
		
		scaledImage = img.getScaledInstance(width, (int) height, Image.SCALE_FAST);
		return scaledImage;
	}

}
