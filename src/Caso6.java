import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        float sueldo, impuesto, neto;
		
		System.out.println("Ingrese sueldo del trabajador: ");
		sueldo= sc.nextFloat();
		
		if (sueldo >= 2800) {
			impuesto = (float)(sueldo * 0.05);
			neto = (float)(sueldo - impuesto );
			System.out.println("Sueldo pagado: "+ sueldo);
			System.out.println("Impuesto calculado: "+impuesto);
			System.out.println("Neto a cobrar: "+neto);
		}
		else{
			if(sueldo < 2800 && sueldo >=1) {
				impuesto = (float)(sueldo * 0.02);
				neto = (float)(sueldo - impuesto );
				System.out.println("Sueldo pagado: "+ sueldo);
				System.out.println("Impuesto calculado: "+impuesto);
				System.out.println("Neto a cobrar: "+neto);
					
			}
			
			else {
				System.out.println("Error. intentelo otra vez");
			}
			
		}
	

	}

}
