package com.empleado;

public class Estable  extends Empleado {

	public Estable(int cantidad) {
		super(cantidad);
		
	}

	@Override
	public int calcularSueldo() {
		
		return (cantidad<=30)?cantidad*50 : 2000;
	}

	
	
}
