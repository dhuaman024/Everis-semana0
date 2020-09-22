package com.empleado;

public abstract class Empleado {

	protected int cantidad;

	public Empleado(int cantidad) {
//		super();
		this.cantidad = cantidad;
	}
	
	public abstract int calcularSueldo();

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
