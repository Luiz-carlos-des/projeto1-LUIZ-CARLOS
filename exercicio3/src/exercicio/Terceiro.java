package exercicio;

import java.util.Scanner;

import entidade.Aluno;

public class Terceiro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		
		aluno.nome = sc.nextLine();
		
		System.out.println("Digite a nota do primeiro trimestre: ");
		
		aluno.primeiroTri = sc.nextDouble();
		
        System.out.println("Digite a nota do segundo trimestre: ");
		
		aluno.segundoTri = sc.nextDouble();
		
        System.out.println("Digite a nota do terceiro trimestre: ");
		
		aluno.terceiroTri = sc.nextDouble();
		
		double notaFinal = aluno.notaFinal();
		
		System.out.printf("A nota final foi: %.2f%n " , notaFinal );
		
		System.out.println();
		
		double pontosQueFaltaram;
		
		if (notaFinal > 60) {
			
			System.out.println("O aluno foi aprovado" );
		}
		else {
			System.out.println("O aluno foi reprovado" );
			
			System.out.println();
			
			System.out.println(aluno);
		}
		
		
		sc.close();

	}

}
