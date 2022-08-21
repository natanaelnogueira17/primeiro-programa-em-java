package src;
import java.util.*;
public class numeroPar{
	public static void main(String[] args) {
		Scanner Valor = new Scanner(System.in);
		System.out.println("informe um numero inteiro: ");
		int numero = Valor.nextInt();
		
		if(numero%2==0) {
			System.out.println("O numero é par!");
		}
		else{
			System.out.println("O numero é impar!");
		}
		System.exit(0);
	}
}