package ejercicio1;

import java.util.Scanner;

public class ejercicio {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Vehiculo vehicles[][] = new Vehiculo[3][3]; 
		String delete;
		
		Vehiculo vehicle = new Vehiculo();
		
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				vehicles[i][j] = new Vehiculo();
				System.out.println("Introduzca el nombre del vehículo: ");
				vehicles[i][j].setName(s.nextLine());
			}
		}
		
		System.out.println("Introduzca el nombre que desea borrar: ");
		
		delete=s.nextLine();
		
		
		if(deleteElement(vehicles,delete)) {
			System.out.println("Se ha borrado el nombre: "+delete);
		}else {
			System.out.println("No se ha encontrado el nombre");
		}
		
		show(vehicles);
		
		
	}
	
	public static boolean deleteElement(Vehiculo vehicles[][],String name) {
		
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				
				if(vehicles[i][j].getName().equals(name)){
					
					vehicles[i][j].setName(null);
				}
			}
		}
		
		return true;
	}
	
	public static void show(Vehiculo vehicles[][]) {
	
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				
				System.out.println("Nombre del vehículo: "+vehicles[i][j].getName()+".");
				
			}
		}
		

	}
	
	
}
