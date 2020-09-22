package com.empleado;

public class Contratado extends Empleado{

	public Contratado(int cantidad) {
		super(cantidad);
		
	}

	@Override
	public int calcularSueldo() {
		
		return cantidad*10;
	}

}
