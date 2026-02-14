package aplicacao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("digite as medidas do triangulo x: ");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("digite as medidas do triangulo y: ");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC)/2;
		//parte da formula da area
		// p=(a+b+c)/2
		
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		//area= raiz quadrada de p(p-a)(p-b)(p-c)
		
		       p = (yA + yB + yC)/2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
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
