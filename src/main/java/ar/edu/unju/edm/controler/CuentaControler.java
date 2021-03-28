package ar.edu.unju.edm.controler;

import ar.edu.unju.edm.model.Cuenta;

public class CuentaControler {
	public void operarConCuenta() {
		//una instancia de la clase cuenta
		Cuenta nuevaCuenta = new Cuenta();
		
		int numCuenta=1;
		int dni=43211876;
		int saldo=0;
		
		//una instancia de la clase cuenta con valores asignados a sus atributos
		Cuenta otraCuenta = new Cuenta(numCuenta, dni, saldo);
		
		System.out.println("el valor saldo de nuevaCuenta: " + nuevaCuenta.getSaldo());
		
		System.out.println("el valor de saldo de otraCuenta: " + otraCuenta.getSaldo());
		
		System.out.println("elvalor del saldo: " + otraCuenta.getSaldo());
		
		otraCuenta.depositar(1000);
		otraCuenta.depositar(1000);
		
		System.out.println("valor del saldo: " + otraCuenta.getSaldo());
		
		otraCuenta.extraer(9000);
		
		if(otraCuenta.getSaldo() < 0) {
			
		}
		
		System.out.println("valor Saldo: " + otraCuenta.getSaldo());
		
		
	}

}
