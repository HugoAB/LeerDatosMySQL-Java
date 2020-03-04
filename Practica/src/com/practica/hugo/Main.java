package com.practica.hugo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
	}
	
	public static void showMenu() {
		int exit = 1;
		
		do {
			System.out.println("-----BIENVENIDO-----");
			System.out.println();
			System.out.println("1. Lista de Empleados");
			System.out.println();
			System.out.println("0. Salir");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.next());
			
			
			
			switch(response) {
				case 0:
					exit = 0;
					break;
				case 1:
					showEployees();
					break;
				default:
					System.out.println();
					System.out.println("Ingresa una opción!!!");
					System.out.println();
					break;
			}
			
		}while(exit != 0);
	}
	
	static ArrayList<Empleado> empleados = new ArrayList();
	public static void showEployees() {
		int exit = 1;
		empleados = Empleado.makeEmployeesList();
		
		do {
			System.out.println("--------------------");
			
			for (int i = 0; i < empleados.size() ; i++) {
				System.out.println(i+1 + ". Nombre: " + empleados.get(i).getNombre() + 
									"\nSalario: " + empleados.get(i).getSalario());
				System.out.println();
			}
			
			System.out.println("Presiona 0 para Salir.");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.next());
			
			if(response == 0) {
				exit = 0;
				break;
			}
			
			/*
			if(response > 0) {
				
			}*/
			
		}while(exit != 0);
	}

}
