package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Client> clients = new ArrayList<>();

		File f = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		FileReader fr = null;
		BufferedReader br = null;

		File fc = null;
		FileWriter fwc = null;
		PrintWriter pwc = null;
		FileReader frc = null;
		BufferedReader brc = null;

		String line;
		String line2;

		f = new File("clientes.txt");
		fc = new File("clientesDeudor.txt");
		try {
			fw = new FileWriter(f, true);
			pw = new PrintWriter(fw);

			fwc = new FileWriter(fc, true);
			pwc = new PrintWriter(fwc);

			System.out.println("¿Cuántos clientes quieres añadir?");
			int count = s.nextInt();
			s.nextLine();
			for (int i = 0; i < count; i++) {

				Client c = new Client();

				System.out.println("Nombre:");
				c.setName(s.nextLine());
				System.out.println("Dirección:");
				c.setAddress(s.nextLine());
				System.out.println("Número de Cliente:");
				c.setcNumber(s.nextInt());
				s.nextLine();
				System.out.println("Saldo:");
				c.setBallance(s.nextInt());
				s.nextLine();
				System.out.println("Tipo de Cuenta:");
				c.setAccount(s.nextLine());

				String atday = "al dia";
				String delayed = "atrasada";
				String debt = "deudor";

				while (!c.getAccount().equals(atday) && !c.getAccount().equals(delayed)
						&& !c.getAccount().equals(debt)) {
					System.out.println("Tipo de cuenta incorrecto, introduzca: al dia, atrasada o deudor");
					c.setAccount(s.nextLine());
				}

				clients.add(c);

				for (Client x : clients) {

					pw.write(x.toString());
					if (x.getAccount().equals("deudor")) {
						pwc.write(x.toString());
					}
				}

			}

			fr = new FileReader(f);
			br = new BufferedReader(fr);
			System.out.println("Lista de clientes:");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			frc = new FileReader(fc);
			brc = new BufferedReader(frc);
			System.out.println("Lista de deudores:");
			while ((line2 = brc.readLine()) != null) {
				System.out.println(line2);
			}

			brc.close();
			pwc.close();
			fwc.close();
			frc.close();
			br.close();
			pw.close();
			fw.close();
			fr.close();
			s.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
