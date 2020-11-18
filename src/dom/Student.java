package dom;

public class Student {

	private String name;
	private String surname;
	private String tlph;
	private double avg;
	
	public Student(String name, String surname, String tlph, double avg) {
		this.name = name;
		this.surname = surname;
		this.tlph = tlph;
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTlph() {
		return tlph;
	}
	public void setTlph(String tlph) {
		this.tlph = tlph;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "\nNombre: "+name+"\nApellidos: "+surname+"\nTeléfono: "+tlph+"\nMedia de calificaciones: "+avg;
	}
	
	
}
