import java.util.Scanner;
public class caso12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String empleado = "";
		double sueldo,nsueldo;
		int nivel;
		
		
		System.out.println("Nombre del empleado: ");
		empleado = sc.nextLine();
		
		System.out.println("Nivel 1-4: ");
		nivel = sc.nextInt();
		
		System.out.println("Sueldo: ");
		sueldo = sc.nextFloat();
		
		float inc= 0;
		
		switch(nivel) {
		case 1:
			inc = 0.045f;
			break;
		case 2:
			inc = 0.06f;
			break;
		case 3:
			inc = 0.085f;
			break;
		case 4:
			inc = 0.011f;
			break;
			default:
				inc = 0;
		}
		
		nsueldo = sueldo + sueldo*inc;
		
		System.out.println("Incremento: "+(inc*100)+"%");
		System.out.println("Nuevo sueldo: "+nsueldo);

	}

}
