package core;

public class Field {

	public static final int EMPTY = 100;
	public static final int WAY = 200;
	public static final int BLOCKED = 300;
	public static final int TOWER = 400;
	public static final int ENTRANCE = 500;
	public static final int EXIT = 600;
	
	private int fieldType = 0;
	
	public int getFieldType() {
		return fieldType;
	}

	public Field(int pFieldType) {
		fieldType = pFieldType;
	}
	
	public void setFieldType(int pFieldType) {
		fieldType = pFieldType;
	}
}
