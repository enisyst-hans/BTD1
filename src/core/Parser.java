package core;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parser {
	
	private static final Logger log = Logger.getLogger(Start.class.getName());

	public Parser() {

		log.info("starting parser");

	}

	public void loadMap(Map theMap, File mapName) {

		log.info("loding map: " + mapName.toString());
		
		try {
			//loading map xml
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(mapName);
			doc.getDocumentElement().normalize();
			log.info("Root element :" + doc.getDocumentElement().getNodeName());
			
			
			//loading amount of xFields
			NodeList nList = doc.getElementsByTagName("xFields");
			Node nNode = nList.item(0);
			Element eElement = (Element) nNode;
			int xFields = Integer.parseInt(eElement.getTextContent());
			log.info("xFields:" + xFields);

			
			//loading amount of yFields
			nList = doc.getElementsByTagName("yFields");
			nNode = nList.item(0);
			eElement = (Element) nNode;
			int yFields = Integer.parseInt(eElement.getTextContent());
			log.info("yFields:" + yFields);
			
			
			//generating map with [X][Y] fields
			theMap = new Map(xFields, yFields);
			
			
			//storing field type from xml data in list
			nList = doc.getElementsByTagName("field");
			List<Integer> fieldList = new ArrayList<Integer>();
			for (int temp = 0; temp < nList.getLength(); temp++) {
				nNode = nList.item(temp);
				//System.out.println("\nCurrent Element:" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					eElement = (Element) nNode;
					//System.out.println("Field ID: " + eElement.getAttribute("fieldId"));
					//System.out.println("Field Type: " + eElement.getElementsByTagName("fieldType").item(0).getTextContent());
					fieldList.add(Integer.parseInt(eElement.getElementsByTagName("fieldType").item(0).getTextContent()));
				}
			}
			log.info("fieldList: " + fieldList);
			
			
			//initialize map with data from fieldList
			ListIterator<Integer> theListIterator = fieldList.listIterator();
			for (int i = 0; i < theMap.getFields().length; i++) {
				for (int j = 0; j < theMap.getFields()[0].length; j++) {
					theMap.setFieldType(i, j, theListIterator.next());
				}
			}
			log.info("map with fields from xml data initialized");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
