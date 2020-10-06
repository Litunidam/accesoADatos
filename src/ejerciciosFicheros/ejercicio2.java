package ejerciciosFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ejercicio2 {


	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		ArrayList<Vehicle> vehicles = new ArrayList<> ();
		
		for (int i = 0; i<r.nextInt()+1;i++) {
			
			Vehicle car = new Vehicle();
			
			System.out.println("Introduzca la matr�cula del veh�culo");
			car.setPlate(s.nextLine());
			System.out.println("Introduzca la marca del veh�culo");
			car.setBrand(s.nextLine());
			System.out.println("Introduzca el tama�o del dep�sito");
			car.setDeposit(s.nextDouble());
			s.nextLine();
			System.out.println("Introduzca el modelo del veh�culo");
			car.setType(s.nextLine());
			
			vehicles.add(car);
	
		}
		
		Collections.sort(vehicles);
		
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter("ejercicio2.txt",true);
			pw = new PrintWriter(fw);
			
			for(Vehicle x: vehicles) {
				pw.print(x);
			}
			pw.close();
			fw.close();
			s.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
}
