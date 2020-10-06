package ejerciciosFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		Random r = new Random();
		
		FileWriter fw = null;
		PrintWriter pw = null;
		
		
		String name;
		String path;
		
		
		
		System.out.println("Introduzca el nombre del fichero:");
		name = s.nextLine();
		System.out.println("Introduzca la ruta del fichero:");
		path = s.nextLine();
		
		for (int i=0;i<r.nextInt(10)+1;i++) {
			
			try {
				fw = new FileWriter(path+"/"+name,true);
				pw = new PrintWriter(fw);
				
				System.out.println("Nombre:");
				pw.print("Nombre: "+s.nextLine()+"\n");
				
				System.out.println("Apellidos:");
				pw.print("Apellidos: "+s.nextLine()+"\n");
				
				System.out.println("Edad:");
				pw.print("Edad: "+s.nextInt()+"\n");
				s.nextLine();
				
				System.out.println("Ciudad de residencia:");
				pw.print("Ciudad de residencia: "+s.nextLine()+"\n");
				
				pw.close();
				fw.close();
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
