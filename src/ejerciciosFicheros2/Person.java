package ejerciciosFicheros2;

import java.io.Serializable;

public class Person implements Serializable{

	protected String name;
	protected String surname;
	protected String id;
	
	private boolean sons;

	public Person(String name, String surname, String id, boolean sons) {
		
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.sons = sons;
		
	}
	
	public Person(String name, String surname, String id) {
		
		this.name = name;
		this.surname = surname;
		this.id = id;
		
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isSons() {
		return sons;
	}

	public void setSons(boolean sons) {
		this.sons = sons;
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + name + "\nApellido: " + surname + "\nDNI: " + id + "\nHijos: " + sons;
	}
	
	
}
