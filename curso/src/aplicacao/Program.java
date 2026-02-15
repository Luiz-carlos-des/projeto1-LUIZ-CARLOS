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
		
		
		//parte da formula da area
		// p=(a+b+c)/2
		
		double areaX = x.area();
		//area= raiz quadrada de p(p-a)(p-b)(p-c)
		
		     
		double areaY = y.area();
		
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
