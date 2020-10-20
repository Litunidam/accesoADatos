package ejerciciosFicheros2;


public class Employee extends Person {

	private double salary;
	
	public Employee(String name, String surname, String id,double salary) {
		super(name, surname, id);
	}
	
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {

		return "\nNombre: " + this.name + "\nApellido: " + surname + "\nDNI: " + id + "\nSalario: " + salary;
	}
	

}
