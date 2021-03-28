package ar.edu.unju.edm.model;

public class Cuenta {
	
	private int numeroDeCuenta;
	private int dni;
	private double saldo;
	
	//constructor sin parametros permite crear una instancia de la clase
	public Cuenta() {
		
	}
	
	
	//constructor con parametros permite 
	public Cuenta(int numeroDeCuenta, int dni, double saldo) {
		super();
		this.numeroDeCuenta = numeroDeCuenta;
		this.dni = dni;
		this.saldo = saldo;
	}
	
	//metrodos 
    public void extraer(double monto) {
		
	}
    public void depositar(double monto) {
		
	}




	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
