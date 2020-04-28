import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numero 1: ");
		int n1 = sc.nextInt();
		System.out.println("Ingrese numero 2: ");
		int n2 = sc.nextInt();
		
		if(n1 == n2) {
			System.out.println("Los numeros son iguales");
		}
		else {
			if(n1 > n2) {
				System.out.println("El segundo numero es el menor");
			}
			else {
				System.out.println("El primer numero es el menor");
			}
		}

	}

}
