package cscd212classes.lab9.factories;

import cscd212classes.lab5.lifeform.*;
import cscd212classes.lab5.lifeform.LifeForm;
import cscd212enums.lab9.LifeFormType;

public class LifeFormFactory {
	public static LifeForm getLifeForm(final LifeFormType lifeFormType, final java.lang.String name, final int currentLifePoints) {
		if (lifeFormType.toString().equals("HUMAN")) {
			return new Human(name, currentLifePoints);
		}
		else if (lifeFormType.toString().equals("MARTIAN")) {
			return new Martian(name, currentLifePoints);
		}
		else if (lifeFormType.toString().equals("PLAIN_BELLY_SNEETCH")) {
			return new PlainBellySneetch(name, currentLifePoints);
		}
		else if (lifeFormType.toString().equals("STAR_BELLY_SNEETCH")) {
			return new StarBellySneetch(name, currentLifePoints);
		}
		else return null;
	}
	
	public static LifeForm getLifeForm(final LifeFormType lifeFormType) {
		if (lifeFormType.toString().equals("HUMAN")) {
			return new Human(lifeFormType.getName(), lifeFormType.getCurrentLifePoints());
		}
		else if (lifeFormType.toString().equals("MARTIAN")) {
			return new Martian(lifeFormType.getName(), lifeFormType.getCurrentLifePoints());
		}
		
		else if (lifeFormType.toString().equals("PLAIN_BELLY_SNEETCH")) {
			return new PlainBellySneetch(lifeFormType.getName(), lifeFormType.getCurrentLifePoints());
		}
		
		else if(lifeFormType.toString().equals("STAR_BELLY_SNEETCH")) {
			return new StarBellySneetch(lifeFormType.getName(), lifeFormType.getCurrentLifePoints());
		}
		else return null;
	}
}
