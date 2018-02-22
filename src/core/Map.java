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
		log.info("generated map: ["+pXFields+"]["+pXFields+"]");
	}
}
