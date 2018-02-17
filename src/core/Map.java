package core;

public class Map {

	private Field[][] fields;
	
	public Map(int pXFields, int pYFields) {
		fields = new Field[pXFields][pYFields];
	}
}
