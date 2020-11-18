package ejerciciosFicherosAleatorios;

import java.io.Serializable;

public class Car implements Serializable{

	private String model;
	private String brand;
	private String color;
	private int cylinder;
	
	public Car(String model, String brand, String color, int cylinder) {
	
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.cylinder = cylinder;
		
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCylinder() {
		return cylinder;
	}
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	
	@Override
	public String toString() {
		return"\nMarca: "+this.brand+"\nModelo: "+this.model+"\nColor: "+this.color+"\nCilindrada: "+this.cylinder;
	}
	
	
	
}
