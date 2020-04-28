import java.util.Scanner;
public class caso7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        float sueldo, impuesto, neto;
		
		System.out.println("Ingrese sueldo del trabajador: ");
		sueldo= sc.nextFloat();
		
		if (sueldo >= 3000) {
			impuesto = (float)(sueldo * 0.12);
			neto = (float)(sueldo - impuesto );
			System.out.println("Sueldo pagado: "+ sueldo);
			System.out.println("Impuesto calculado: "+impuesto);
			System.out.println("Neto a cobrar: "+neto);
		}
		else {
			if(sueldo < 3000 && sueldo >=1500) {
				impuesto = (float)(sueldo * 0.08);
				neto = (float)(sueldo - impuesto );
				System.out.println("Sueldo pagado: "+ sueldo);
				System.out.println("Impuesto calculado: "+impuesto);
				System.out.println("Neto a cobrar: "+neto);
					
			}
			
			else  {
				impuesto = (float)(sueldo * 0.03);
				neto = (float)(sueldo - impuesto );
				System.out.println("Sueldo pagado: "+ sueldo);
				System.out.println("Impuesto calculado: "+impuesto);
				System.out.println("Neto a cobrar: "+neto);
			}
				}
		
		if(sueldo<=0)
		{
			System.out.println("Error, Ingrese nuevamente el sueldo");
		}

	}
}

