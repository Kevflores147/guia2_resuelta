import java.util.Scanner;
//creado por kevin flores

public class caso14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String carrera ="" , turno = "", carrera2 = "",nombre= "",turno2="";
		float monto, descuento,total,total2;
		
		System.out.println("Ingrese nombre del alumno: ");
		nombre=sc.next()
				; 
		System.out.println("Ingrese su carrera: ");
		carrera=sc.next();
		
		System.out.println("Ingrese turno: ");
		turno=sc.next();
		
		switch(carrera) {
		case "DS":
			carrera2 = "Desarollo de software";
			monto = 1500;
			break;
		case "RC":
			carrera2 = "Redes y conectividad";
			monto = 1400;
			break;
		case "DG":
			carrera2 = "Diseño grafico";
			monto = 1300;
			break;
		default:
			carrera2 = "Error";
			monto = 0;
			break;			
		}
		
		switch(turno) {
		case "M":
			turno2 = "Mañana";
			descuento =(float)(monto*0.1);
			break;
		case "T":
			turno2 = "Tarde";
			descuento =(float)(monto*0.2);
		case "N":
			turno2 = "Noche";
			descuento = (float)(monto*0.15);
		default:
			descuento = 0;
			break;
		}
		
		total = (float)(monto - descuento);
		total2 =(float)((monto-descuento)/3.33);
		
		System.out.println("Resultados");
		System.out.println("Nombre del alumno: "+nombre);
		System.out.println("Carrera: "+carrera2);
		System.out.println("Monto de carrera: "+monto);
		System.out.println("Turno: "+turno2);
		System.out.println("Total a pagar en soles: "+total );
		System.out.println("Total a pagar en dolares: "+total2);
		

	}

}
