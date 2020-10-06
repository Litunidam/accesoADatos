package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		String line;
		
		System.out.println("Introduzca la ruta del fichero:");
	
		f = new File(s.nextLine());
		
		try {
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
			fr.close();
			s.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
