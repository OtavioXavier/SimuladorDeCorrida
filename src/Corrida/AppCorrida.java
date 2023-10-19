package Corrida;

public class AppCorrida {

	public static void main(String[] args) {

		Carro car1 = new Carro();
		Carro car2 = new Carro();
		String pista[][] = new String[2][20];
		int contVoltas = 0;
        
		LimparPista(pista);
				
		while(pista[0][19] != "1°$" && pista[1][19] != "2°$") {
			contVoltas++;

			LimparPista(pista);

			car1.Correr();
			pista[0][car1.getDistancia()] = "1°$";
			
			car2.Correr();
			pista[1][car2.getDistancia()] = "2°$";
			
			mostrarPista(pista);
			mostrarParcial(car1,car2,contVoltas);
		}
				
		System.out.println("===========RESULTADO==========");
		
		System.out.println("\nDistancia carro 1: " + car1.getDistancia());
		System.out.println("Distancia carro 2: " + car2.getDistancia());
		System.out.println("=====================");
		
		if(car1.getDistancia() > car2.getDistancia()) {
			System.out.println("Carro 1 vencedor");
		}else if(car1.distancia == car2.distancia) {
			System.out.println("Empate");
		}else {
			System.out.println("Carro 2 vencedor");
		}

	}
	
	public static void mostrarParcial(Carro car1, Carro car2, int cont) {
		System.out.println("===========VOLTA " + cont + "==========");
		System.out.println("Distancia carro 1: " + car1.distancia);
		System.out.println("Distancia carro 2: " + car2.distancia);
	}
	
	public static void mostrarPista(String pista[][]) {
		System.out.println("-----------------------");
		for (int j = 0; j < pista[0].length; j++) {
			System.out.print(pista[0][j]);
		}
		System.out.println("\n===  ===  ===  ===  ===");
		for (int j = 0; j < pista[1].length; j++) {
			System.out.print(pista[1][j]);
		}
		System.out.println("\n-----------------------");
	}
	
	public static void LimparPista(String pista[][]) {
		for (int i = 0; i < pista.length; i++) {
			for (int j = 0; j < pista[i].length; j++) {
				pista[0][j] = " ";
			}
		}
		
		for (int i = 0; i < pista.length; i++) {
			for (int j = 0; j < pista[i].length; j++)  {
				pista[1][j] = " ";
			}
		}
	}

}
