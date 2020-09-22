package Principal;

import java.time.LocalDate;
import java.util.Scanner;

import Modelo.Alumno;

//Agrego un comentario en tarea1
public class principal {

	public static void main(String[] args) {
		
		
		 Alumno alumno=new Alumno();
		 int anio,mes, dia;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Ingresar los datos del Alumno ");
		 System.out.println("Ingrese nombres: ");
		 alumno.setNombres(entrada.nextLine());
		 System.out.println("Ingrese apellidos: ");
		 alumno.setApellidos(entrada.nextLine());
		 System.out.println("Ingrese edad: ");
		 alumno.setEdad(entrada.nextInt());
		 System.out.println("Ingrese sexo  M o F: ");
		 alumno.setSexo(entrada.next().charAt(0));
		 
		 System.out.println("-> fecha de nacimiento   : ");
		 System.out.println("Introduce el dia (dd): ");
		    dia = entrada.nextInt();
	     System.out.println("Introduce el mes (MM): ");
		    mes = entrada.nextInt();
	     System.out.println("Introduce el a�o (yyyy) : ");
		    anio = entrada.nextInt();
		 alumno.setFechaNacimiento(LocalDate.of(anio, mes, dia));
		 entrada.nextLine();
		 
		 System.out.println("Ingrese direccion: ");
		 alumno.setDireccion(entrada.nextLine());
		 System.out.println("Ingrese Universidad: ");
		 alumno.setUniversidad(entrada.nextLine());
		 
		 System.out.println( " ");
		 System.out.println( " -------- DATOS DEL ALUMNO ---------");
		 System.out.println( alumno.toString() );
		 alumno.verificarEdad(alumno.getFechaNacimiento());
		 
		 entrada.close();
		
	}

}
