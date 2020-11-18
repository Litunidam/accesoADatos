package ejerciciosFicherosAleatorios;

import java.io.Serializable;

public class House implements Serializable{

	private int people;
	private double rent;
	private int cp;
	
	public House(int people, double rent, int cp) {
		this.people = people;
		this.rent = rent;
		this.cp = cp;
	}
	
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	
	@Override
	public String toString() {
		return "Habitantes: "+this.people+"\nPrecio de Alquiler: "+this.rent+"\nCódigo Postal: "+this.cp+"\n";
	}
	
	
}
