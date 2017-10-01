package org.teammemecode.CarFender.logic;

import java.util.ArrayList;
import java.util.Random;

public class ThingsLogic {
	Random rand = new Random();

	

	public ThingsLogic() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void tick(ArrayList<Thing> thingsToTick) {
		for(int i = 0; i < thingsToTick.size(); i++) {
			Thing thingToTick = thingsToTick.get(i);
			int max = 5, min = -max;
			thingToTick.setPos(thingToTick.x + rand.nextInt((max - min) + 1) + min, thingToTick.y + rand.nextInt((max - min) + 1) + min);
			if(thingToTick.x < 0) {
				thingToTick.setPos(0 + rand.nextInt((max - min) + 1) + min, thingToTick.y);
			}else if(thingToTick.y < 0) {
				thingToTick.setPos(thingToTick.x, 0 + rand.nextInt((max - min) + 1) + min);
			}
		}
	}

}
