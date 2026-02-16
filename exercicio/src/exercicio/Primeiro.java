package exercicio;

import java.util.Scanner;

import entidade.Retangulo;

public class Primeiro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("digite a largura do quadrado: ");
		
		retangulo.largura = sc.nextDouble();
		
		System.out.println("digite o comprimento do quadrado: ");
		
		retangulo.comprimento = sc.nextDouble();
		
		double area = retangulo.area();
		double perimetro = retangulo.perimetro();
		double diametro = retangulo.diametro();
		
		System.out.printf("a area do retangulo e:%.2f%n " , area);
		
		System.out.printf("o perimetro do retangulo e:%.2f%n " , perimetro);
		
		System.out.printf("o diametro do retangulo e:%.2f%n " , diametro);
		sc.close();

	}

}
