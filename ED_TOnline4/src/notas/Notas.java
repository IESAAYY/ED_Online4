package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int n = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		n = reader.nextInt();

		calificacion = cali(n);

		System.out.println(calificacion);
		reader.close();
	}

	/**
	 * @param n
	 * @return
	 */
	public static String cali(int n) {
		String calificacion;
		if (n >= 0 && n < 5) {
			calificacion = "Suspenso";
		}
		else if (n >= 5 && n < 7)
			calificacion = "Aprobado";
		else if (n >= 7 && n < 9)
			calificacion = "Notable";
		else if (n >= 9 && n <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";
		return calificacion;
	}
}