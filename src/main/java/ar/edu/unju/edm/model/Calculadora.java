package ar.edu.unju.edm.model;

public class Calculadora {
	private float a;
	private float b;
	
	public Calculadora() {   //metodo constructor
		
	}
	
	public float sumar() {
		float suma;
		suma=a+b;
		return suma;
	}
	
	public float dividir() {
		float division=0;
		if (b==0) {
			System.out.println("El segundo numero no puede ser 0");
		}
		else {
			division=a/b;
		}
		return division;
	}
	
	public float multiplicar() {
		float multiplicacion;
		multiplicacion=a*b;
		return multiplicacion;
	}
	
	public float restar() {
		float resta;
		resta=a-b;
		return resta;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(a);
		result = prime * result + Float.floatToIntBits(b);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (Float.floatToIntBits(a) != Float.floatToIntBits(other.a))
			return false;
		if (Float.floatToIntBits(b) != Float.floatToIntBits(other.b))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + "]";
	}

	

	
}
