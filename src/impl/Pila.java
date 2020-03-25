package impl;

import api.PilaTDA;

public class Pila implements PilaTDA {
    int []a;
    int indice;
	
	public void inicializarPila() {
		a=new int[100];
		indice=0;

	}

	public void apilar(int x) {
		a[indice]=x;
		indice++;
	}

	public void desapilar() {
		indice--;
	}

	public int tope() {
		
		return a[indice-1];
	}

	public boolean pilaVacia() {
		return(indice==0);
	}

}
