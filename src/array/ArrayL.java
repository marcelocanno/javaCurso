package array;

import java.util.*;

public class ArrayL {

	public static void main(String[] args) {
		
		
		ArrayList<String> contatos = new ArrayList<>();
		
		contatos.add("marcelo Canno");
		contatos.add("99409.1885");
		contatos.add("lat@hotmail.com");
		
		
		contatos.add("Luiz Matos");
		contatos.add("98765.7890");
		contatos.add("latan@hotmail.com");
		
		contatos.add("Roberto Sarapo");
		contatos.add("98765.1234");
		contatos.add("latindo@hotmail.com");
		
		contatos.add("Walter Pessoa");
		contatos.add("99409.5657");
		contatos.add("laclaia@hotmail.com");
		
		System.out.println("--------------------------------------------------------" );
		
		System.out.println("Tamanho Array : " + contatos.size() );
		
		System.out.println( contatos );
		
		
		System.out.println("--------------------------------------------------------" );
		
			// busca um contato na arrays - indece 3
		System.out.println( "E-mail Luiz Matos (Indice[3])" + contatos.get(3) );
		
		System.out.println( contatos.get(9) );
		
		System.out.println( contatos.get(6) );
		
		System.out.println("--------------------------------------------------------" );
		
		for (int i = 0; i < contatos.size(); i++) {
			
			System.out.println("--------------------------------------------------------" );

			System.out.println(contatos.get(i));
		}
		
		System.out.println("--------------------------------------------------------" );
				
	}

}
