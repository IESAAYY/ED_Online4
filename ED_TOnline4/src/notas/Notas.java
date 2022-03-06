package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int n = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		n = reader.nextInt();

		calificacion = Califica.califica(n);

		System.out.println(calificacion);
		reader.close();
	}

	/**
	 * @param n
	 * @return
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static String cali(int n) {
		return Califica.califica(n);
	}

	/**
	 * @param num_nota
	 * @return
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static String califica(int num_nota) {
		return Califica.califica(num_nota);
	}
}