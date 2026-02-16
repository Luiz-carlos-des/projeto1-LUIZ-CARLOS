package aplicacao;

import java.util.Scanner;

import entidade.Produto;


public class Estoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("informe o nome do produto");
		
		produto.nome = sc.nextLine();
		
		System.out.println("informe o preco do produto");
		
		produto.preco = sc.nextDouble();
		
		System.out.println("informe a quantidade em estoque");
				
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		
		
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		
		System.out.println("Informe a quantidade a ser incluida no estoque: ");
		int quantidade = sc.nextInt();
		produto.incluirEmEstoque(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.println("Informe a quantidade a ser excluida do estoque: ");
		quantidade = sc.nextInt();
		produto.excluirDoEstoque(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		
		
		
		sc.close();

	}

}
