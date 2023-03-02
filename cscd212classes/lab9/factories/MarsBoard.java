package cscd212classes.lab9.factories;

import cscd212enums.lab9.DifficultyLevel;
import cscd212enums.lab9.LifeFormType;

public class MarsBoard extends GameBoard {
	public MarsBoard(final DifficultyLevel difficultyLevel) {
		super(difficultyLevel);
	}
	
	public void createLifeForms() {
		this.player = LifeFormFactory.getLifeForm(LifeFormType.HUMAN);
		
		this.enemyLifeForms.add(LifeFormFactory.getLifeForm(LifeFormType.MARTIAN));
		this.enemyLifeForms.add(LifeFormFactory.getLifeForm(LifeFormType.MARTIAN, "Steve", 50));
		this.enemyLifeForms.add(LifeFormFactory.getLifeForm(LifeFormType.HUMAN, "Evil Carl", 110));
		this.enemyLifeForms.add(LifeFormFactory.getLifeForm(LifeFormType.HUMAN, "Regular Carl", 100));
	}
}
