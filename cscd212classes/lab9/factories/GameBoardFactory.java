package cscd212classes.lab9.factories;

import cscd212enums.lab9.BoardTheme;
import cscd212enums.lab9.DifficultyLevel;

public class GameBoardFactory {
	//Returns a new GameBoard of the type indicated by the passed BoardTheme with enemy health adjusted based on the passed DifficultyLevel.
	public static GameBoard getGameBoard(final BoardTheme levelTheme, final DifficultyLevel difficultyLevel) {
		//Can't create a GameBoard object because it is abstract. Cannot instantiate abstract types.
		//How to access enum values?
		if (levelTheme.toString().equals("BEACH")) {
			return new BeachBoard(difficultyLevel);
		}
		
		else if (levelTheme.toString().equals("EARTH")) {
			return new EarthBoard(difficultyLevel);
		}
		
		else if (levelTheme.toString().equals("MARS")) {
			return new MarsBoard(difficultyLevel);
		}
		else return null;
	}
}
