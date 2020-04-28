import java.util.Scanner;

public class caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float calificacion;

		System.out.println("Ingrese calificacion del alumno: ");
		calificacion= sc.nextFloat();
		
		if(calificacion >= 0.0 && calificacion <= 7.9) {
			System.out.println("Estado obtenido: "+ "sin palabras");
	
		}
		
		if(calificacion >= 8.0 && calificacion <= 10.9) {
			System.out.println("Estado obtenido: "+ "Malo");
	
		}
		
		if(calificacion >= 11.0 && calificacion <= 14.9) {
			System.out.println("Estado obtenido: "+ "Regular");
	
		}
		
		if(calificacion >= 15.0 && calificacion <= 17.9) {
			System.out.println("Estado obtenido: "+ "Notable");
	
		}
		if(calificacion >= 18.0 && calificacion <= 20) {
			System.out.println("Estado obtenido: "+ "Excelente");
	
		}

	}

}
