package ejerciciosFicheros2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		Employee e1 = new Employee("Adrián","Zamarra","1000",2000);
		Employee e2 = new Employee("Daniel","Navarro","2000",3000);
		Employee e3 = new Employee("Sergio","Garcia","3000",4000);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		FileOutputStream fos = null;
		
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream("fichero2.dat");
			oos = new ObjectOutputStream(fos);
			
			for (Employee x: employees) {
				
				oos.writeObject(x);
				
			}
			
			
			
		}catch(Exception e) {			
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
