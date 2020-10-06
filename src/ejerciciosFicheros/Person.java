package ejerciciosFicheros;

public class Person implements Comparable<Person>{

	private String name;
	private String surname1;
	private String surname2;
	private int age;
	private String city;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname1() {
		return surname1;
	}
	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}
	public String getSurname2() {
		return surname2;
	}
	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public int compareTo(Person arg0) {
		
		return (int) (arg0.age-this.age);

	}
	
	@Override
	public String toString() {
		return "\nNombre: " + name + "\nApellido1: " + surname1 + "\nApellido2: " + surname2 + "\nEdad: " + age
				+ "\nCiudad: " + city;
	}
	
	
	
}
