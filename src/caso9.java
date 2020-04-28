import java.util.Scanner;
public class caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String alumno;
		int n1,n2;
		float promedio,asistencia,a;
		
		System.out.println("Ingrese nombre del alumno: ");
		alumno = sc.nextLine();
		
		System.out.println("Ingrese primera nota: ");
		n1 = sc.nextInt();
		
		System.out.println("Ingrese segunda nota: ");
		n2 = sc.nextInt();
		
		System.out.println("Ingrese asistencia del alumno: ");
		a = sc.nextInt();
		
		promedio = (float)(n1*0.3 + n2*0.7);
		asistencia = (float)((a/12)*100);
		
		if(promedio>=13 && asistencia>=70) {
			System.out.println("---Resultados---");
			System.out.println("Alumno: "+alumno);
			System.out.println("Promedio: "+promedio);
			System.out.println("asistencia: "+asistencia+"%");
			System.out.println("Estado: aprobado");
			
		}
		
		else {
			System.out.println("---Resultados---");
			System.out.println("Alumno: "+alumno);
			System.out.println("Promedio: "+promedio);
			System.out.println("asistencia: "+asistencia+"%");
			System.out.println("Estado: desaprobado");
		}
		

	}

}
