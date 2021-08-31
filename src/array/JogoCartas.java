package array;

public class JogoCartas {

	public static void main(String[] args) {
	
			// como sortear a carta
	
		String[] nipes = {"Ouros", "Copas" , "Espadas" , "Paus" };
		String[] faces = {"As" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Valet" , "Dama" , "Rei" };
		
		
		String nipe = nipes[(int) (Math.random() * 4) ];
		System.out.println("\n");
		
		String face = faces[(int) (Math.random() * faces.length)];
		
			//carta sorteada
		 System.out.println("Sorteado :  " + face + " de " + nipe);
	};

}
