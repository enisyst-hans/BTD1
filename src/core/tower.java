package core;

public abstract class tower {
	
	private int level = 0;
	private int range = 0;
	private int power = 0;
	private int speed = 0;
	
	abstract void incLevel();
	abstract void decLevel();
}
