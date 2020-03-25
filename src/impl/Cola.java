package impl;

import api.ColaTDA;

public class ColaArr implements ColaTDA {
	int []a;
	int indice;

	public void incializarCola() {
		a=new int[100];
		indice=0;
	}

	public void acolar(int x) {
		for(int i=indice-1;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=x;
		indice++;
	}


	public void desacolar() {
		indice--;

	}


	public int tope() {
		// TODO Auto-generated method stub
		return indice-1;
	}


	public boolean colaVacia() {
		return (indice==0);

	}

}
