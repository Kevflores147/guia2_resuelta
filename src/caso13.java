import java.util.Scanner;
//creado por kevin flores

public class caso13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float n1,n2,op = 0;
		int numerodia= 0;
		String operacion = "";
		
		System.out.println("Ingrese el primer numero: ");
		n1 = sc.nextFloat();
		
		System.out.println("Ingrese el segundo numero: ");
		n2 = sc.nextFloat();
		
		System.out.println("Ingrese un numero para operar del 1 al 6: ");
		numerodia = sc.nextInt();
		
		switch (numerodia) {
		case 1:
			operacion = "Suma";
			op= (float)(n1 + n2);
			break;
		case 2:
			operacion = "Resta";
			op= (float)(n1 - n2);
			break;
		case 3:
			operacion = "Multiplicacion";
			op= (float)(n1*n2);
			break;
		case 4:
			
			if(n2>=1) {
				operacion = "Division";
				op= (float)(n1/n2);
				}
				else {
				operacion = "No es posible dividir";		
				}
				break;
		case 5:
			
			if(n2>=1) {
				operacion = "Resto entero";
				op= (float)(n1%n2);
				}
				else {
				operacion = "No es posible hallar el resto entero";
				}
				break;
		case 6:
			operacion = "Promedio";
			op=(float)(n1+n2)/2;
			break;
			
		default:
				System.out.println("Coloque un numero en el rango");
				op = 0;
			
			}
		System.out.println("---Resultados---");
		System.out.println("Numero 1: "+n1);
		System.out.println("Numero 2: "+n2);
		System.out.println("Operacion: "+operacion);
		System.out.println("Resultado: "+op);
		
		
		
	}

}
