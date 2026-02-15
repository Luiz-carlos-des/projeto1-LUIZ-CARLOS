package aplicacao;

import java.util.Scanner;

import entidade.Triangulo;
//importaçao da nova classe triangulo 
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		// substituicao das tres variaveis independentes pela classe triangulo
		
		x = new Triangulo();
		y = new Triangulo();
		//instanciando 
		
		System.out.println("digite as medidas do triangulo x: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("digite as medidas do triangulo y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c)/2;
		//parte da formula da area
		// p=(a+b+c)/2
		
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		//area= raiz quadrada de p(p-a)(p-b)(p-c)
		
		       p = (y.a + y.b + y.c)/2;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("area do triangulo x:%.4f%n ", areaX);
		//mostrar resultado com 4 casa após a virgula
		
		System.out.printf("area do triangulo y:%.4f%n ", areaY);
		
		if (areaX > areaY) {
			System.out.println("maior area é do triangulo x");
		}
		else {
			System.out.println("maior area e do trianagulo y");
		}
		sc.close();
				

	}

}
