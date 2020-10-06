package ejerciciosFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ejercicio0 {
	
	public static void main(String [] args) {
		
		File files = new File("ejercicio0.txt");
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(files);
			pw = new PrintWriter(fw);			
			pw.println("Hola mundo");
			
			pw.close();
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
