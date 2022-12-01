package Prova;

import java.util.Scanner;

public class questao_3 {
		public static void main(String[] args) {
			int numero = ColetarNumero();
			
			ImprimirParOuImpar(numero, 2, 1);
			
		}
		
		public static int ColetarNumero() {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Digite um numero entre 50 e 100");
			int N = input.nextInt();
			
			if(N >= 50 && N <= 100) {
				return N;
			}
			else {
				System.out.print("Número inválido. ");
				return ColetarNumero();
			}	
		}
		
		public static void ImprimirParOuImpar (int numero, int N, int J) {			
			if (numero % 2 == 0) {
				System.out.println(N);
				N += 2;
				
				if (N <= numero) {
					ImprimirParOuImpar(numero, N, J);
				}				
			}
			else if (numero % 2 != 0) {
				System.out.println(J);
				J += 2;
				
				if (J <= numero) {
					ImprimirParOuImpar(numero, N, J);
				}
			}
		}
		
}
