package ejerciciosFicherosAleatorios;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		try {
			
			int number=0;
			RandomAccessFile raf = new RandomAccessFile("aleatorio1.data", "rw");
			double numbers;
			while (number!=5) {
				int length;
				length = (int) raf.length();
				
				switch ((number = menu())) {
					case 1:
						addAtFirstPosition(s, raf);
						break;
					case 2:					
						addAtLastPosition(s, raf);
						break;
					case 3:
						readFile(raf);					
						break;
					case 4:
						replaceNumbers(s, raf);
						break;
				}
			}
			s.close();
			raf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void replaceNumbers(Scanner s, RandomAccessFile raf) throws IOException {
		
		double numbers;
		int length;
		double aux;
		length = (int)(raf.length());
		
		System.out.println("Introduzca el n�mero que quieres cambiar");
		numbers = s.nextDouble();
		s.hasNextLine();
		System.out.println("Introduzca el n�mero nuevo:");
		aux = s.nextDouble();
		s.nextLine();
		
		for (int i = 0;i<length;i=i+8) {
			
			raf.seek(i);
			
			if(numbers ==raf.readDouble()) {
				
				raf.seek(i);
				raf.writeDouble(aux);
				
			}
			
		}
	}

	private static void readFile(RandomAccessFile raf) throws IOException {
		int reg = (int)(raf.length()/8);
		
		for (int i = 0; i < reg; i++) {
			raf.seek(i*8);
			System.out.println(raf.readDouble());
		
		}
	}

	private static void addAtLastPosition(Scanner s, RandomAccessFile raf) throws IOException {
		double numbers;
		System.out.println("Introduzca el n�mero a a�adir");
		raf.seek(raf.length());
		
		numbers = s.nextDouble();
		s.nextLine();
		
		raf.writeDouble(numbers);
	}

	private static void addAtFirstPosition(Scanner s, RandomAccessFile raf) throws IOException {
		double numbers;
		System.out.println("Introduzca el n�mero a a�adir");
		numbers = s.nextDouble();
		s.nextLine();
		
		raf.seek(0);
		
		raf.writeDouble(numbers);
	}
	
	public static int menu() {
		
		int number;
		Scanner s = new Scanner(System.in);
		
		System.out.println("1.-A�adir n�meros de tipo double al principio del fichero");
		System.out.println("2.-A�adir n�meros de tipo double al final del fichero");
		System.out.println("3.-Mostrar el fichero.");
		System.out.println("4.-Sustituir un n�mero por otro.");
		System.out.println("5.-Terminar programa");
		number = s.nextInt();
		s.nextLine();
		
		return number;
	}
}
