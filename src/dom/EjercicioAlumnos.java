package dom;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class EjercicioAlumnos {

	public static void main(String[] args) {

		Document doc;
		DocumentBuilder db;
		List<Student> students = new ArrayList();
		int avg=0;
		try {
			db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			doc = db.parse(new File("alumnos.xml"));
			Element root = doc.getDocumentElement();
			
			NodeList nNames = root.getElementsByTagName("nombre");
			NodeList nSurnames = root.getElementsByTagName("apellidos");
			NodeList nTeleph = root.getElementsByTagName("telefono");
			NodeList nGrades = root.getElementsByTagName("notas");
			
			
			System.out.println(nGrades.item(0).getTextContent());
			
//			for (int i = 0; i<nNames.getLength();i++) {
//				
//				for(int j = 0; i<nGrades.item(i).getTextContent().length();j++) {
//					
//					avg = avg+(int) nGrades.item(i).getTextContent().charAt(j);
//					
//				}
//				
//				avg = avg/4;
//				Student student = new Student(nNames.item(i).getTextContent(),nSurnames.item(i).getTextContent(),nTeleph.item(i).getTextContent(),avg);
//				System.out.println(student);
//				students.add(student);
//				avg = 0;
//			}
			
			
			
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
