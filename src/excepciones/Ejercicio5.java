package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num;
		int den;
		int result;
		
		try {
			
			num = leerNum(s);
			den = leerDen(s);
			
			result = num/den;
			System.out.println(result);
			
		}catch(InputMismatchException ime) {
			
			System.out.println("Introduce solo números");
			
		}catch(ArithmeticException ae) {
		
			System.out.println("Has dividido por 0");
			
		}catch (ExcepcionIntervalo e) {
			
			e.getMessage();
			e.printStackTrace();
		
		}catch (Exception e) {
			
			e.printStackTrace();
		
		}
		
		s.close();
	}
	public static int leerNum(Scanner s) throws ExcepcionIntervalo {
		
		
		int num;
		num = s.nextInt();
		s.nextLine();
		
		if(num>100) {
			throw new ExcepcionIntervalo("El numerador es mayor que 100");
		}
		
		return num;
		
	}
	public static int leerDen(Scanner s) throws ExcepcionIntervalo {
		
		int den;
		den = s.nextInt();
		s.nextLine();
		
		if(den<-5) {
			throw new ExcepcionIntervalo("El denominador es menor que -5");
		}
		
		return den;
		
	}
}
