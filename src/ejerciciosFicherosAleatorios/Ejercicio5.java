package ejerciciosFicherosAleatorios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ejercicio5 {

	public static void main(String[] args) {

		try {
			File f = new File("houses.txt");
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			ArrayList<House> houses = new ArrayList<>();
			
			FileOutputStream fos = new FileOutputStream("casas.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("casas.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			while ((line = br.readLine()) != null) {
				House house = new House(Integer.parseInt(line), Double.parseDouble(line = br.readLine()),
						Integer.parseInt(line = br.readLine()));
				houses.add(house);
			}

			serializar(oos, houses);
			houses = deserializar(ois);
			
			for(House house: houses) {
				System.out.println(house);
			}

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

	private static void serializar(ObjectOutputStream oos, ArrayList<House> houses) throws IOException {
		oos.writeObject(houses);

	}

	private static ArrayList<House> deserializar(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		ArrayList<House> houses = (ArrayList<House>) ois.readObject();
		return houses;
	}

}
