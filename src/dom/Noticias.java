package dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Noticias {

	public static void main(String[] args) {
		DocumentBuilder db;
		Document doc;
		
		try {
			
			db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			doc = db.parse(new File("noticias.xml"));
			Element root = doc.getDocumentElement();
			NodeList notices = root.getElementsByTagName("noticia");
			
			NodeList titles = root.getElementsByTagName("titulo");
			NodeList date = root.getElementsByTagName("fecha");
			NodeList content = root.getElementsByTagName("contenido");
			for(int i = 0; i<notices.getLength();i++) {
				
				System.out.println("\nNoticia "+(i+1)+":");
				System.out.println("Tipo de noticia: "+((Element) (notices.item(i))).getAttribute("tipo"));
				System.out.println("URL: "+((Element)(titles.item(i))).getAttribute("url"));
				System.out.println("TITULO: "+titles.item(i).getTextContent());
				System.out.println("FECHA: "+date.item(i).getTextContent());
				System.out.println("CONTENIDO: "+content.item(i).getTextContent());
				
				Node notice = notices.item(i);
				Element position = doc.createElement("posicion");
				position.setTextContent(String.valueOf(i+1));
				notice.appendChild(position);
				
			}
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			Result output = new StreamResult(new File("noticias.xml"));
			Source input = new DOMSource(doc);
			transformer.transform(input, output);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
