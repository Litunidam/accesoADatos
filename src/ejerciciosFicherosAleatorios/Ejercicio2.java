package ejerciciosFicherosAleatorios;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		try {
			RandomAccessFile raf = new RandomAccessFile("aleatorio2.dat","rw");
			
			fillFile(raf);
			
			readFile(raf);
			
			System.out.println("");
			
			replaceFile(raf);
			
			readFile(raf);
		
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		
	}

	private static void replaceFile(RandomAccessFile raf) throws IOException {

		for (int i = 0; i < (int) (raf.length() / 4); i++) {
			raf.seek(i * 4);
			if (raf.readInt() == 2) {
				raf.seek(i * 4);
				raf.writeInt(3);
			}

		}
	}

	private static void fillFile(RandomAccessFile raf) throws IOException {
		
		for(int i = 0;i<9;i++) {
			if(i<3) {
				raf.writeInt(1);
			}else {
				raf.writeInt(2);
			}
		}
	}

	private static void readFile(RandomAccessFile raf) throws IOException {
		
		for(int i = 0; i<(int)(raf.length()/4);i++) {
			raf.seek(i*4);
			System.out.println(raf.readInt());	
		}
	}
	
}
