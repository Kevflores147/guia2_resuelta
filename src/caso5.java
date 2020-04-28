import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        float precio , cantidad, total, descuento, neto;
		
		System.out.println("Ingrese precio del producto: ");
		precio = sc.nextFloat();
		
		System.out.println("Ingrese cantidad a comprar: ");
		cantidad = sc.nextFloat();
		
		total = precio * cantidad;
		
		
		if (cantidad >= 8) {
			descuento = (float)(total * 0.1);
			neto = (float)(total - descuento);
			System.out.println("Total: "+total);
			System.out.println("Descuento: "+ descuento);
			System.out.println("Neto a pagar: "+neto);
		}
		else{
			if(cantidad < 7 && cantidad >=1) {
				descuento = 0;
				neto = (float)(total - descuento);
				System.out.println("Total: "+total);
				System.out.println("Descuento: "+ descuento);
				System.out.println("Neto a pagar: "+neto);
					
			}
			
			else {
				System.out.println("Cantidad erronea. intentelo otra vez");
			}
			
		}

	}

}
