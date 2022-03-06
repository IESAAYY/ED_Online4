package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int n = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		n = reader.nextInt();

		calificacion = califica(n);

		System.out.println(calificacion);
		reader.close();
	}

	/**
	 * @param n
	 * @return
	 * @deprecated Use {@link #califica(int)} instead
	 */
	public static String cali(int n) {
		return califica(n);
	}

	/**
	 * @param num_nota
	 * @return
	 */
	public static String califica(int num_nota) {
		String calificacion;
		if (num_nota >= 0 && num_nota < 5) {
			calificacion = "Suspenso";
		}
		else if (num_nota >= 5 && num_nota < 7)
			calificacion = "Aprobado";
		else if (num_nota >= 7 && num_nota < 9)
			calificacion = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";
		return calificacion;
	}
}