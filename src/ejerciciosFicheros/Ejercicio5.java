package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		int letter;
		int count = 0;
		int maxcount = 0;
		char aux;
		char maxvowel=' ';
		ArrayList<Character> vowels = new ArrayList<>();

		System.out.println("Introduzca la ruta del fichero:");

		f = new File(s.nextLine());

		try {

			fr = new FileReader(f);
			br = new BufferedReader(fr);
			letter = br.read();

			while (letter != -1) {

				if ((char) letter == 'a' || (char) letter == 'e' || (char) letter == 'i' || (char) letter == 'o'
						|| (char) letter == 'u' || (char) letter == 'A' || (char) letter == 'E' || (char) letter == 'I'
						|| (char) letter == 'O' || (char) letter == 'U') {

					vowels.add((char) letter);
					letter = br.read();
				}else {
					letter = br.read();
				}
				
			}

			
			Collections.sort(vowels);
			
			aux = vowels.get(0);
			
			for (char x : vowels) {
				System.out.println(x);
				if (aux == x) {

					count++;
					
					if (count > maxcount) {
						
						maxcount = count;
						
						maxvowel = x;
					
					}

				} else {
					
					aux = x;
					
					count = 1;
				
				}

			}

			System.out.println("La letra que más se repite es '"+ maxvowel+"' con "+maxcount+" veces");
			
			br.close();
			fr.close();
			s.close();
		} catch (IOException err) {

			err.printStackTrace();
		}

	}
	
}
