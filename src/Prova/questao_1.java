package Prova;

import java.util.Scanner;

public class questao_1 {
		public static void main(String[] args) {
			String[] jogadores = new String[10];
			int[] gols = new int[10];
			String[] selecao = new String[10];
			
			

			ColetarOsDados(jogadores, gols, selecao);
			
			System.out.println(selecao[0]);
			System.out.println(gols[0]);
			System.out.println(selecao[1]);
			System.out.println(gols[1]);
			

			
		}
		
		public static void ColetarOsDados (String[] jogadores,int[] gols, String[] selecao) {
			Scanner input = new Scanner(System.in);
			
			for (int i = 0; i < 2; i++) {								
				System.out.println("Digite o nome do jogador:");
				jogadores[i] = input.nextLine();
				
				System.out.println("Digite a quantidade de gols marcados:");
				gols[i] = input.nextInt();
				input.nextLine();
				
				System.out.println("Digite a qual seleção ele joga:");
				selecao[i] = input.nextLine();									
			}
			
		}
		
		public static void CalcularOsGols (String[] selecao, int[] gols) {
				
		}
	
		
}
