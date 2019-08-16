package core;

import java.util.logging.Logger;


public class Map {

	private Field[][] fields;
	private static final Logger log = Logger.getLogger(Map.class.getName());
	
	public Map(int pXFields, int pYFields) {
		generateMap(pXFields, pYFields);
	}
	
	public void generateMap(int pXFields, int pYFields) {
		fields = new Field[pXFields][pYFields];
		initializeMap();
		log.info("generated map: ["+pXFields+"]["+pYFields+"]");
		
	}
	
	public void initializeMap() {
		for (int i = 0; i < fields.length; i++) {
			for (int j = 0; j < fields[0].length; j++) {
				fields[i][j] = new Field(1);
			}
		}
	}
	
	public void setFieldType(int pXField, int pYField, int pFieldType) {
		fields[pXField][pYField].setFieldType(pFieldType);
	}

	public Field[][] getFields() {
		return fields;
	}
	
}
