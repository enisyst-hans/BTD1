package core;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import frontend.GUI;

public class Start {

	private static final Logger log = Logger.getLogger(Start.class.getName());

	public static void main(String[] args) {
		log.info("starting BTD1");
		Map theMap = null;
		//GUI theGui = new GUI();
		//theGui.setSize(800, 600);
		//theGui.setVisible(true);	
		Wallet theWallet = Wallet.getTheWallet();
		log.info("Wallet: " + theWallet.getCoins() + " coins");
		
		
		Parser myParser = new Parser();
		File mapName = new File("maps\\map1.xml");
		myParser.loadMap(theMap, mapName);
		log.info("BTD1 started");
	}
}