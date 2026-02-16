package entidade;

public class Retangulo {
	
	
	public double comprimento;
	public double largura;
	
	
	public double area() {
		double resultado = largura * comprimento;
		return resultado;
	}

	public double perimetro() {
		double resultado = (2 * largura) + (2 * comprimento);
		return resultado;
	}
	
	public double diametro() {
		double resultado = Math.sqrt((largura * largura) + (comprimento * comprimento));
		return resultado;
	}
}
