package entidade;

public class Aluno {

	public String nome;
	public double primeiroTri;
	public double segundoTri;
	public double terceiroTri;
	
	public double notaFinal() {
		return primeiroTri + segundoTri + terceiroTri;
	}
	
	public double pontosQueFaltaram() {
		return 60 - notaFinal();
	}
	
	public String toString() {
		return "faltaram "
				+ String.format("%.2f",pontosQueFaltaram())
				+" pontos";
	}
	
}
