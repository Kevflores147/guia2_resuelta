import java.util.Scanner;

public class caso15 {
	//creado por kevin flores
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String producto, producto2, fdp, cliente,mdp="",A="";
		int cantidad;
		float importe, descuento = 0, aumento, monto,total = 0,B = 0;
		System.out.println("Ingrese datos del cliente: ");
		cliente=sc.next();
		
		System.out.println("Ingrese producto(TB/LT/MN/IM): ");
		producto= sc.next();
		
		switch(producto) {
		case "TB":
			producto2 = "Tablet";
			monto = 350;
			break;
		case "LT":
			producto2 = "Lapto";
			monto = 2300;
			break;
		case "MN":
			producto2 = "Monitor";
			monto = 850;
			break;
		case "IM":
			producto2 = "Impresora";
			monto = 680;
			break;
		default:
			producto2 = "Error";
			monto = 0;
			break;			

			}
		System.out.println("Ingrese la Cantidad a comprar: ");
		cantidad = sc.nextInt();
		
		importe = cantidad * monto;
		
		System.out.println("Ingrese metodo de pago(C1/C2): ");
		fdp = sc.next();
		
		switch(fdp) {
		
		case "C1":
			mdp = "Contado";
			A = "Descuento";
			B = (float)(importe*0.05);
			total = (float)(importe-B);
			break;
		case "C2":
			mdp = "Credito";
			A = "Aumento";
			B = (float)(importe*0.12);
			total = (float)(importe+B);
			break;
		}
		
		System.out.println("Nombre del cliente: "+cliente);
		System.out.println("Producto seleccionado: "+producto2);
		System.out.println("Precio del producto: "+monto);
		System.out.println("Cantidad a comprar: "+cantidad);
		System.out.println("Forma de pago: "+mdp);
		System.out.println(A + " : " + B );
		System.out.println("Total a pagar: "+total);
		
		

		}
	
	}
