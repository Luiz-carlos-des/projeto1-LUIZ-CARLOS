package entidade;

public class Produto {

	
	public double preco;
	public int quantidade;
	public String nome;
	
	public double totalEmEstoque() {
		return preco * quantidade;
	}
	
	public void incluirEmEstoque(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void excluirDoEstoque(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", r$ "
				+ String.format("%.2f",preco) +
				" , " + quantidade +" unidades, total: r$ " +
				String.format("%.2f",totalEmEstoque());
	}
	
}
