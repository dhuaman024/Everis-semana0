package Modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*
 * 
 * En donde le pida ingresar por consola Los datos  de un alumno, ( nombres , apellidos, edad, dirección, universidad,  sexo ,etc)

Y el resultado debe imprimir el resumen de su información e indicar si es mayor o menor de edad.
 * 
 * */


public class Alumno {

	 private String nombres;
     private String apellidos;
     private int edad;
     private char sexo;
     private String direccion;
     private String universidad;
     private LocalDate fechaNacimiento;
	
     
     public Alumno() {
 		
 	 } 
	public Alumno(String nombres, String apellidos, int edad, char sexo, String direccion, String universidad,
			LocalDate fechaNacimiento) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.direccion = direccion;
		this.universidad = universidad;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void verificarEdad(LocalDate nac) {

		Period periodo = Period.between(nac, LocalDate.now());
		System.out.println((periodo.getYears() < 18) ? "-> Es menor de edad" : "-> Es mayor de edad");
		
		//formateo de la fecha
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNacimiento=nac;

	}


	
	public String toString (){
		
		 String mensaje="1.- nombres y apellidos: "+this.nombres+" "+this.apellidos+"\n2.- edad : "
	+this.edad +"\n3.- sexo : "+this.sexo+"\n4.- direccion : "+this.direccion+"\n5.- universidad : "+this.universidad+"\n6.- fecha Nacimiento : "+this.fechaNacimiento;
		 
		 return mensaje;
    }

	
	
}
