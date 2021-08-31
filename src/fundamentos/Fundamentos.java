package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		
		
		String nome;
		int idade = 62;
		char sexo = 'M';
		double temperatura = 26.7;
		boolean arCondicionado = false;
		nome = "Marcelo Canno";
		System.out.println("Uso de variáveis na linguagem Java");
		System.out.println("Exemplos");
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("sexo: " + sexo);
		System.out.println("temperatura: " + temperatura);
		System.out.println("Ar condicionado:  " + arCondicionado);
		System.out.println("___________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores Aritiméticos e Atribuições");
		System.out.println("Exemplos");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5       | i = " + (i += 5));
		System.out.println("i -= 5       | i = " + (i -= 5));
		System.out.println("i *= 5       | i = " + (i *= 5));
		System.out.println("i /= 5       | i = " + (i /= 5));
		i++;
		System.out.println("i++           | i = " + i);
		i--;
		System.out.println("i--           | i = " + i);
		System.out.println("___________________________");
		System.out.println("");
		System.out.println("Estruturas de controle");
		System.out.println("");
		System.out.println("Estruturas de controle condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - uso do 'if'");
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatório");		
	}
		System.out.println("");
		System.out.println("Exemplo 2 - uso do 'if - else'");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
	    }
		System.out.println("");
		System.out.println("Exemplo 3 - uso do 'else - if'");
		if (idade <16) {
			System.out.println("Proíbido votar");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("Voto obrigatório");
		} else if (idade == 16 || idade == 17 || idade >70) {
			System.out.println("Voto facultativo");	
		}
		System.out.println("");
		System.out.println("Exemplo 4 - uso do 'switch case'");
		System.out.println("1 Cadastro de clientes");
		System.out.println("2 Cadastro de usuários");
		System.out.println("3 Relatorios");
		int opcao = 1;
		switch (opcao) {
		case 1 :
			System.out.println("Clientes");
			break;
		case 2 :
			System.out.println("usuário");
		case 3 :
			System.out.println("Relatórios");
		default:
			System.out.println("Opção inválida");
			break;
		}
		System.out.println("");
		System.out.println("Estruturas de repetições");
		System.out.println("");
		System.out.println("Exemplo 5 - uso do 'for'");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println("");
		System.out.println("Exemplo 6 - Tabuada");
		for (int tabuada = 0; tabuada <=10; tabuada ++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor ++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor)); 
			}
		}
		System.out.println("");
		System.out.println("Exemplo 7 - Uso da estrutura while");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("Exemplo 8 - Uso da estrutura do while");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente(s/n)?");
			novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("Game over");
	}
	

		
		

	}


