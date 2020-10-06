package ejerciciosFicheros;

public class Vehicle implements Comparable<Vehicle> {

	private String plate;
	private String brand;
	private double deposit;
	private String type;
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int compareTo(Vehicle arg0) {
		
		return (int) (arg0.deposit-this.deposit);

	}
	
	@Override
	public String toString() {
		
		return "Matrícula: "+plate+"\nMarca: "+brand+"\nTamaño del depósito: "+deposit+"\nModelo: "+type+"\n";
	}
	
}
