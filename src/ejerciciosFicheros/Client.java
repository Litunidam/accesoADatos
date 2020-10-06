package ejerciciosFicheros;

public class Client {

	private String name;
	private String address;
	private int cNumber;
	private int ballance;
	private String account;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getcNumber() {
		return cNumber;
	}



	public void setcNumber(int cNumber) {
		this.cNumber = cNumber;
	}



	public int getBallance() {
		return ballance;
	}



	public void setBallance(int ballance) {
		this.ballance = ballance;
	}



	public String getAccount() {
		return account;
	}



	public void setAccount(String account) {
		this.account = account;
	}



	@Override
	public String toString() {
		return "Nombre: "+name+"\nDirección: "+address+"\nNúmero Cliente: "+cNumber+"\nSaldo: "+ballance+"\nCuenta: "+account;
	}
	
}
