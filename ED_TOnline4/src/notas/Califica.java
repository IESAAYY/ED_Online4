package notas;

/**
 * Clase donde contiene método para devolver una calificación según la nota introducida por el usuario
 */
public class Califica {

	/**
	 * @param num_nota Entero que representa la nota
	 * @return calificacion Calificación obtenida según el parámetro
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
