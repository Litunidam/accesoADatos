package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		int charact;
		
		System.out.println("Introduzca la ruta del fichero:");
	
		f = new File(s.nextLine());
		
		try {
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			charact = br.read();
			
			while(charact!=-1) {
				
				System.out.print((char)charact);
				charact=br.read();
			}
			
			br.close();
			fr.close();
			s.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
}
