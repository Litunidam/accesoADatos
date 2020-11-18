package ejerciciosFicheros2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class EjercicioCoche {

	public static void main(String[] args) {
		
		ArrayList<Car> cars = new ArrayList<>();
		Car car1 = new Car("111111",10,"verde");
		Car car2 = new Car("222222",20,"azul");
		Car car3 = new Car("333333",30,"rojo");
		
		cars.add(car1);
		cars.add(car1);
		cars.add(car3);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
		
			fos = new FileOutputStream("coches.dat");
			oos = new ObjectOutputStream(fos);
			
			for(Car x:cars) {
				
				oos.writeObject(x);
			
			}
			
			
			fis = new FileInputStream("coches.dat");
			ois = new ObjectInputStream(fis);
			
			Car car;
			while((car = (Car) ois.readObject()) != null) {
				
				System.out.println(car);
				
			}
			
			
			
			oos.flush();
			oos.close();
			fos.close();
			
			ois.close();
			fis.close();
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		
		}
		
		
		
		
		
	}
	
	
}
	
class Car implements Serializable{
	
	protected String plate;
	protected int wheels;
	protected Window window;
	
	public Car(String plate, int wheels, String color) {
		
		this.plate = plate;
		this.wheels = wheels;
		window = new Window(color);
		
	}
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public Window getWindow() {
		return window;
	}
	public void setWindow(Window window) {
		this.window = window;
	}
	
	@Override
	public String toString() {
		
		return "\nMatrícula: "+plate+"\nRuedas: "+wheels+window;
	}
	
	
}

class Window implements Serializable{
	
	private String color;

	public Window(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "\nColor de ventana: "+color;
		}
	

}
