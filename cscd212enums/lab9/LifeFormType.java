package cscd212enums.lab9;

public enum LifeFormType {
	HUMAN("Hugh Mann", 100), MARTIAN("Martin", 120), PLAIN_BELLY_SNEETCH("Paul", 70), STAR_BELLY_SNEETCH("Starry", 80);
	
	private java.lang.String name;
	private int currentLifePoints;
	
	private LifeFormType(final java.lang.String name, final int currentLifePoints) {
		if (name == null || name.isEmpty() || currentLifePoints <= 0) throw new IllegalArgumentException("Bad Params in LifeFormType Constructor");
		
		this.name = name;
		this.currentLifePoints = currentLifePoints;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	
	public int getCurrentLifePoints() {
		return this.currentLifePoints;
	}
}
