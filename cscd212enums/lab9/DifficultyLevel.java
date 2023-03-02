package cscd212enums.lab9;

public enum DifficultyLevel {
	EASY(0.7), NORMAL(1), HARD(1.5), INSANE(2);
	
	private double difficultyModifier;
	
	private DifficultyLevel(final double difficultyModifier) {
		if (difficultyModifier <= 0) throw new IllegalArgumentException("Bad Params in Difficulty Level Constructor");
		
		this.difficultyModifier = difficultyModifier;
	}
	
	public double getModifier() {
		return this.difficultyModifier;
	}
	
	@Override
	public java.lang.String toString() {
		return "Difficulty Level: " + this + "(modifier of " + this.difficultyModifier + ")";
		//return "";
	}
}
