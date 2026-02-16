package exercicio;

import java.util.Scanner;

import entidade.Funcionario;

public class Segundo {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o nome do funcionario: ");
		
		funcionario.nome = sc.nextLine();
		
		double percentual;
		
		System.out.println("Digite o salario bruto do funcionario: ");
		
		funcionario.salarioBruto = sc.nextDouble();
		
        System.out.println("Digite taxa de desconto: ");
		
		funcionario.taxa = sc.nextDouble();
		
		double salarioLiquido = funcionario.salarioLiquido();
				
		System.out.println();
		
		System.out.println("Dados do funcionario: " + funcionario);
		
		System.out.println();
		
		System.out.println("Digite o percentual para aumento do salario: ");
		
		percentual = sc.nextDouble();
		
		funcionario.percentualAumentoSalarial(percentual);
		
		System.out.println("Salario atualizado: " + funcionario);
		
		sc.close();

	}

}
