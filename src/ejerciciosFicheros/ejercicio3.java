package ejerciciosFicheros;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class ejercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<>();
	
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			f = new File("personas.txt");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String line;
			
			while((line = br.readLine())!=null) {
				
				Person p = new Person();
				
				p.setName(line);
				line = br.readLine();
				p.setSurname1(line);
				line = br.readLine();
				p.setSurname2(line);
				line = br.readLine();
				p.setAge(Integer.parseInt(line));
				line = br.readLine();
				p.setCity(line);
				line = br.readLine();
				
				people.add(p);
				
			}
			
			Collections.sort(people);
			
			System.out.println("Estos son los datos de la persona de mayor edad:");
			System.out.println(people.get(0));
			br.close();
			fr.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
