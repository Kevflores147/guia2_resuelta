import java.util.Scanner;
public class caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int n = sc.nextInt();
		
		String rpta= "Numero impar";
		
		if(n%2 == 0)
			rpta = "Número par";
		
		System.out.println("Respuesta: "+ rpta);

	}

}
