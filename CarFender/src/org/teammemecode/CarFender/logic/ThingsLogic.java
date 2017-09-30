package org.teammemecode.CarFender.logic;

import java.util.ArrayList;

public class ThingsLogic {
	

	public ThingsLogic() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void tick(ArrayList<Thing> thingsToTick) {
		for(int i = 0; i < thingsToTick.size(); i++) {
			Thing thingToTick = thingsToTick.get(i);
			thingToTick.setPos(thingToTick.x + 20, thingToTick.y + 20);
		}
	}

}
