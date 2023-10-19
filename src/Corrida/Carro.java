package Corrida;

import java.util.Random;

public class Carro {
	Random rand = new Random();

	
	int velocidade = 0, distancia = 0;
	
	public void Correr() {
		velocidade = rand.nextInt(1, 4);
		this.distancia += this.velocidade;
		if(distancia > 19) {
			distancia = 19;
		}
	}
	
	public void mostrarDistancia(String carro) {
	   System.out.println("Distancia carro " + carro + ": " + distancia);
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
}
