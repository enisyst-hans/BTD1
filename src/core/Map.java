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
				fields[i][j] = new Field(Field.BLOCKED);
			}
		}
	}
	
	public void setFieldType(int pXField, int pYField, int pFieldType) {
		fields[pXField][pYField].setFieldType(pFieldType);
	}

	public Field[][] getFields() {
		return fields;
	}
	
	public String printField() {
		String returnString = "";
		returnString += "Map size: [" + fields.length + "][" + fields[0].length + "]";
		for (int i = 0; i < fields.length; i++) {
			returnString += "\n";
			for (int j = 0; j < fields[0].length; j++) {

				if (fields[i][j].getFieldType() == 100) {
					returnString += "[ ]";
				} else if (fields[i][j].getFieldType() == 300) {
					returnString += "[X]";
				} else if (fields[i][j].getFieldType() == 500) {
					returnString += "[S]";
				} else if (fields[i][j].getFieldType() == 600) {
					returnString += "[E]";
				}
			}
		}
		return returnString;
	}	
}
