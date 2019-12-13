import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//String x;
		//x = sc.next();
		//System.out.println("Você digitou " + x);
		
		//int y;
		//y = sc.nextInt();
		//System.out.println("Você digitou " + y);
		
		
		//Double z;
		//z = sc.nextDouble();
		//System.out.println("Você digitou " + z);
		
		
		//char a;
		//a = sc.next().charAt(0);
		//System.out.println("você digitou: " + a);
		
		//String a;
		//int b;
		//Double c;
		
		//a = sc.next();
		//b = sc.nextInt();
		//c = sc.nextDouble();
		
		//System.out.println("A sequancia e: ");
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		sc.close();
		

	}

}
