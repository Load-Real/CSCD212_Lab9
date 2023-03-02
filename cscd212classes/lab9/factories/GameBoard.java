package cscd212classes.lab9.factories;

import cscd212classes.lab5.lifeform.LifeForm;
import cscd212enums.lab9.*;

public abstract class GameBoard {
	protected LifeForm player;
	protected java.util.ArrayList<LifeForm> enemyLifeForms;
	
	public GameBoard() {
		this(DifficultyLevel.NORMAL);
	}
	
	/*Constructs a GameBoard of the Difficulty Level specified. 
	 * Initializes the array list of enemies and then calls createLifeForms() to 
	 * initialize the player and enemies and then adjustForDifficulty to set enemy health.
	 */
	public GameBoard(final DifficultyLevel difficultyLevel) {
		//Initialize ArrayList enemyLifeForms with which enemyLifeForms?
		enemyLifeForms = new java.util.ArrayList<LifeForm>();
		createLifeForms();
		adjustForDifficulty(difficultyLevel);
	}
	
	public java.util.ArrayList<LifeForm> getEnemyLifeForms() {
		return this.enemyLifeForms;
	}
	
	public LifeForm getPlayer() {
		return this.player;
	}
	
	protected abstract void createLifeForms();
	
	protected void adjustForDifficulty(final DifficultyLevel difficultyLevel) {
		for (LifeForm enemy : this.enemyLifeForms) {
			int currentLifePoints = enemy.getCurrentLifePoints();
			currentLifePoints *= difficultyLevel.getModifier();
			enemy.setCurrentLifePoints(currentLifePoints);
		}
	}
}