package ejerciciosFicherosAleatorios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("vehiculos.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("vehiculos.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			RandomAccessFile raf = new RandomAccessFile("vehiculos.txt","rw");
			
			ArrayList<Car> cars = new ArrayList<>();
			
			Car car1 = new Car("Civic","Honda","Azul",250);
			Car car2 = new Car("Yaris","Toyota","Gris",350);
			Car car3 = new Car("CX3","Mazda","Negro",550);
			Car car4 = new Car("Evoquee","Rover","Verde",900);
			
			cars.add(car1);
			cars.add(car2);
			cars.add(car3);
			cars.add(car4);
			
			serializar(oos,cars);
			
			cars = deserializar(ois);
			
			for(Car car:cars) {
				System.out.println(car);
			}
			
			saveInRandom(raf,cars);
			
			ois.close();
			fis.close();
			oos.close();
			fos.close();
			raf.close();
			
		} catch (IOException | ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	private static void serializar(ObjectOutputStream oos,ArrayList<Car> cars) throws IOException {
			oos.writeObject(cars);

	}
	
	private static ArrayList<Car> deserializar(ObjectInputStream ois) throws IOException, ClassNotFoundException{
		ArrayList<Car> cars = (ArrayList<Car>) ois.readObject();	
		return cars;
	}
	
	private static void saveInRandom(RandomAccessFile raf, ArrayList<Car> cars) throws IOException {
			for (Car car : cars) {
				raf.writeUTF(car.getBrand());
				raf.writeUTF(car.getModel());
				raf.writeUTF(car.getColor());
				raf.writeInt(car.getCylinder());	
			}
	}
	
}
