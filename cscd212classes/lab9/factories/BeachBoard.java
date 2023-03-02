package cscd212classes.lab9.factories;

import cscd212enums.lab9.DifficultyLevel;
import cscd212enums.lab9.LifeFormType;

public class BeachBoard extends GameBoard {
	public BeachBoard(final DifficultyLevel difficultyLevel) {
		super(difficultyLevel);
	}
	
	public void createLifeForms() {
		this.player = LifeFormFactory.getLifeForm(LifeFormType.STAR_BELLY_SNEETCH);
		
		this.enemyLifeForms.add(LifeFormFactory.getLifeForm(LifeFormType.PLAIN_BELLY_SNEETCH));
		this.enemyLifeForms.add(LifeFormFactory.getLifeForm(LifeFormType.PLAIN_BELLY_SNEETCH, "Pete", 80));
		this.enemyLifeForms.add(LifeFormFactory.getLifeForm(LifeFormType.HUMAN, "Dave", 110));
	}
}
