import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float ht,th,t, importe, bono, descuento, alcanzado,tardanza_en_horas;
		String nombre;
		
		System.out.println("Ingrese nombre del empleado: ");
		nombre = sc.nextLine();
		
		System.out.println("Ingrese las horas trabajadas: ");
		ht = sc.nextInt();
		
		System.out.println("Ingrese la tarifa por hora: ");
		th = sc.nextInt();
		
		System.out.println("Ingrese los minutos de tardanza: ");
		t = sc.nextInt();
		
		tardanza_en_horas = (t/60);
		importe = th* ht;
		alcanzado = (float)((ht-tardanza_en_horas)/70)*100;
		
		if(ht>=60) {
			bono = (float)(importe*0.13);
		}
		else {
			bono=(float)(importe*0.04);
		}
		
		if(t>=15) {
			descuento = (float)(importe*0.03);
		}
		else {
			descuento = 0;
		}
		
		System.out.println("---Resultados---");
		System.out.println("Trabajador: "+nombre);
		System.out.println("Horas trabajadas: "+ht);
		System.out.println("Tarifa por horas: "+th);
		System.out.println("Importe: "+importe);
		System.out.println("Bono: "+bono);
		System.out.println("Descuento: "+descuento);
		System.out.println("Meta alcanzada: "+alcanzado+"%");
		
		
		

	}

}
