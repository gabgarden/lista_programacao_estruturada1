package lista_PP;
import java.util.Scanner;


public class ex5 {
	
	  public static int potencia(int a, int b) {
	        if (b == 0) {
	            return 1;
	        } else {
	            return a * potencia(a, b - 1);
	        }
	    }	
	
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        int result = potencia(a, b);

        System.out.println(a + "^" + b + " = " + result);	

	}

}
