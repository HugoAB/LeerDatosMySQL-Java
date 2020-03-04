package com.practica.hugo;

import java.util.ArrayList;

public class Empleado implements EmployeeDAO{
	private int id;
	private String nombre;
	private double salario;

	public Empleado() {
		
	}
	
	public Empleado(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNombre: " + getNombre() +
				"\nSalario: " + getSalario();
	}
	
	public static ArrayList<Empleado> makeEmployeesList() {
		Empleado empleado = new Empleado();
		return empleado.read();
	}

}
