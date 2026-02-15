package entidade;

public class Triangulo {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a+b+c)/2;
		double resultado = Math.sqrt(p * (p-a)*(p-b)*(p-c));
		// outa opcao seria usar direto return Math.sqrt()
		return resultado;
		
	}
		
}
