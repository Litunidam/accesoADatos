package ejerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		File f = null;

		int count = 0;
		@SuppressWarnings("unused")
		String line;
		System.out.println("Introduzca la ruta del fichero:");
		
		f = new File(s.nextLine());
		s.close();
		
		
		try {
			Scanner scanner = new Scanner(f);			
			
			while(scanner.hasNextLine()) {
				line = scanner.nextLine();
				count++;
			}
			
			if (count==0) {
				System.out.println("No hay linea que leer.");
			}else {
				System.out.println("El fichero tiene "+count+" lineas.");
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}
	
}
