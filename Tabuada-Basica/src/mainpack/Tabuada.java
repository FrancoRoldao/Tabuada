package mainpack;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		
		
		System.out.println("Digite o número referente a  tabuada que você quer visualizar: ");
		Scanner teclado = new Scanner(System.in);
		
		int escolha = teclado.nextInt();
		
		
		for(int i = 1; i<=10; i++) {
			
			System.out.println(i + "X" + escolha + "=" + i*escolha);
			
		}

}
}