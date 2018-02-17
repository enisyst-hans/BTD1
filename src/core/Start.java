package core;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Start {

	private static final Logger log = Logger.getLogger(Start.class.getName());

	public static void main(String[] args) {
		log.info("starting BTD1");
		Map theMap = new Map(20, 20);
		log.info("BTD1 started");
	}
}