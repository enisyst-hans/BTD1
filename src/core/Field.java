package core;

public class Field {

	private static final int EMPTY = 1;
	private static final int WAY = 2;
	private static final int BLOCKED = 3;
	private static final int TOWER = 4;
	
	private int fieldType = 0;
	
	public Field(int pFieldType) {
		pFieldType = fieldType;
	}
}
