package ejerciciosFicheros2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		Person p1 = new Person("Adrián","Zamarra","1000",false);
		Person p2 = new Person("Daniel","Navarro","2000",true);
		Person p3 = new Person("Sergio","Garcia","3000",true);
		
		f = new File("ruta.txt");
		
		try {
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			fos = new FileOutputStream(br.readLine());
			
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
			oos.flush();
			oos.close();
			fos.close();
			br.close();
			fr.close();			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
