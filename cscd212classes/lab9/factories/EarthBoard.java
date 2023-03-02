package cscd212classes.lab9.factories;

import cscd212enums.lab9.DifficultyLevel;
import cscd212enums.lab9.LifeFormType;

public class EarthBoard extends GameBoard {
	public EarthBoard(final DifficultyLevel difficultyLevel) {
		super(difficultyLevel);
	}
	
	public void createLifeForms() {
		this.player = LifeFormFactory.getLifeForm(LifeFormType.MARTIAN);
		
		this.enemyLifeForms.add(LifeFormFactory.getLifeForm(LifeFormType.HUMAN, "Dave", 110));
		this.enemyLifeForms.add(LifeFormFactory.getLifeForm(LifeFormType.HUMAN));
	}
}
