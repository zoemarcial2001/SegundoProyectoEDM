package ar.edu.unju.edm.controler;

import java.util.Scanner;

import ar.edu.unju.edm.model.Calculadora;

public class CalculadoraControler {
	
	public void resolverOperaciones() {
		
		Scanner teclado = new Scanner(System.in);
	    float num1;
	    float num2;
	    int opc=0;
	    
	    System.out.print("Ingrese un numero: ");
	    num1=teclado.nextFloat();
	    
	    System.out.print("Ingrese otro numero: ");
	    num2=teclado.nextFloat();
	   
	    Calculadora nuevaCalculadora = new Calculadora();
	
	    nuevaCalculadora.setA(num1);
	    nuevaCalculadora.setB(num2);
	    
	    System.out.println("¿Que operacion desea realizar?");
	    System.out.println("1- Sumar");
	    System.out.println("2- Restar");
	    System.out.println("3- Dividir");
	    System.out.println("4- Multiplicar");
	    
	    opc=teclado.nextInt();
	    
	    switch(opc){
	    
	    case 1: System.out.println(" El resultado de la suma es: " + nuevaCalculadora.sumar());
	        break;
	    case 2: System.out.println("El resultado de la resta es: " + nuevaCalculadora.restar());
	        break;
	    case 3: System.out.println("El resultado de la division es: " + nuevaCalculadora.dividir());
	    	break;
	    case 4: System.out.println("El resultado de la multiplicacion es: " + nuevaCalculadora.multiplicar());
	    	break;
	    }
	}
}
