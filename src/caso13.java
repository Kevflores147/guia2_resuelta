import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float n1,n2,op;
		int numerodia;
		
		System.out.println("Ingrese el primer numero: ");
		n1 = sc.nextFloat();
		
		System.out.println("Ingrese el segundo numero: ");
		n2 = sc.nextFloat();
		
		System.out.println("Ingrese un numero para operar del 1 al 6: ");
		numerodia = sc.nextInt();
		
		switch (numerodia) {
		case 1:
			op= (float)(n1 + n2);
			break;


	}
	}

}
