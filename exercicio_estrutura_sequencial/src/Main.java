import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Exercicio1
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		System.out.println();
		
		
		
		int c, d, soma1;
		
		c = sc.nextInt();
		d = sc.nextInt();
		soma1 = c + d;
		
		System.out.println("SOMA = " + soma1);
		System.out.println();
		
		int e, f, soma2;
		
		e = sc.nextInt();
		f = sc.nextInt();
		soma2 = e + f;
		
		System.out.println("SOMA = " + soma2);
		
		
		sc.close();

	}

}
