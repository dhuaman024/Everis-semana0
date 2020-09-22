package com.empleado;

import java.util.Scanner;
/*
 * Autor: Daniel Anthony Huam�n Ricse
 * ejercicio N� 02
 * 
 * Enunciado  : un empleado �Contratado� gana $10 por d�a trabajado y el empleado �Estable� gana $50 por d�a trabajado,
 * pero si trabaja mas de 30 d�as ganara siempre $2000. Realizar su respectivo programa en consola.
 * 
 * */

public class principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("---- C�lculo de sueldos -- ");
		 
		System.out.println("-- Ingrese cantidad de dias laborados: ");
		int cantidadDias=entrada.nextInt();
		
		Contratado empleadoContratado= new Contratado(cantidadDias);
		Estable empleadoEstable= new Estable(cantidadDias);

        System.out.println("-> El empleado contratado ganaria $ "+empleadoContratado.calcularSueldo() + " por " +cantidadDias +" dias");
        System.out.println("-> El empleado estable ganaria $ "+empleadoEstable.calcularSueldo() + " por " +cantidadDias +" dias" );

	}

}
