package poo;

import java.util.Random;

public class Carro {

		int ano;
		String cor;
		
		public Carro() { 
			Random gerador = new Random();
			int chassi = gerador.nextInt(1000);
			System.out.println("Chassi: " + chassi);
		}
		
		public Carro(int ano, String cor) {
			this.ano = ano;
			this.cor = cor;
			System.out.println("           __________");
			System.out.println("          /     /    \\");
			System.out.println("         /     /      \\");
			System.out.println("________ ______ _________|");
			System.out.println("[0[***[0[ _____| -  _____|");
			System.out.println("\\_____|/,  \\|_____ |/,  \\/");
			System.out.println("  \\\\_  \\\\__/     \\\\__/");
			System.out.println("____________________________");
		}
		
		void ligar() {
			System.out.println("engine ON ..");
		}
		void desligar() {
			System.out.println("engeni OF ..");
		}
		void acelerar() {
			System.out.println("vrummmmmmm  .");
		}
	}

	
	
	
	


