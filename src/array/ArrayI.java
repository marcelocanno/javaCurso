package array;

public class ArrayI {

	public static void main(String[] args) {
		
		String[] carros = {"Ferrari","Fusca","Camaro","Uno","Porche"};
		// indice array       0         1       2       3       4
	
	System.out.println("tamanho do array : " + carros.length);
	// lista tamanho array
	
	System.out.println("Carro : " + carros[1]);
		// imprimi uma posição no array
	System.out.println("Carro : " + carros[2]);
	
	carros[4] = "Porche";
	
	carros[2] = "BMW";
	// modifica a valor da array determinada
	
	System.out.println("Carro : " + carros[4]);
	System.out.println("Carro : " + carros[2]);
	
	System.out.println("--------------------------------------------------");
	System.out.println("Carro :" );
	
	System.out.println("--------------------------------------------------");
	
	for(int i = 0; i < carros.length; i++) {
		System.out.println(carros[i]);
		// corre e lista a arrays
		
	System.out.println("--------------------------------------------------");		
	}
	
	
	}

}
