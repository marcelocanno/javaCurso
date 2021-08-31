package array;

public class Array2 {

	public static void main(String[] args) {
		String[][] agenda = {{"Marcelo","99409.1885","lui@hotmail.com",},{"Luiz","99777.1999","ltacci@hotmail.com"},{"Roberto","99999.6666","tatata@hotmail.com"}};
		
		System.out.println("--------------------------------------------------------" );

		
		 // percorrem todos os laços
		
		
		for (int i = 0; i < agenda.length; i++) {
			
		System.out.println("--------------------------------------------------------" );

			for (int j = 0; j < agenda.length; j++) {
				System.out.println(agenda[i][j]);
			}
		}
		
		System.out.println("--------------------------------------------------------" );

		
		// recupera telefone seleciona linha [] e coluna []
		
		System.out.println(agenda[0][1] );

		System.out.println(agenda[1][1] );
		
		System.out.println(agenda[2][1] );


		
		System.out.println("--------------------------------------------------------" );

		
		
		
		
		
		
		
		
		System.out.println("--------------------------------------------------------" );

		
		
		
		
		
		System.out.println("--------------------------------------------------------" );

		
		
	}

}
