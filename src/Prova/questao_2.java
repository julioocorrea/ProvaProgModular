package Prova;

import java.util.Scanner;

public class questao_2 {
		public static void main(String[] args) {
			int numero = ColetarNumero();
			System.out.println(SomarNumeros(numero));
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
		
		public static long SomarNumeros(int numero) {
			if (numero == 1) {
				return numero;
			}
			
			return numero + SomarNumeros(numero - 1);
			
		}
		
		
		
}
