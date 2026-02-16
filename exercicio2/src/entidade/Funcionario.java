package entidade;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public String toString() {
		return nome + ", r$ "
				+ String.format("%.2f",salarioLiquido());
		
	}
	
	public void percentualAumentoSalarial(double percentual) {
		salarioBruto += (salarioBruto/percentual);
	}
		

}
