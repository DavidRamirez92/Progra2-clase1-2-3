package impl;

import api.ColaPrioridadTDA;

public class ColaPrioridadArr implements ColaPrioridadTDA {

	int a[];
	int prioridad[];
	int indice;

	public void inicializarColaPrioridad() {
		a=new int[100];
		prioridad=new int[100];
		indice=0;
	}

	public void acolarPrioridad(int x, int p) {
		if(indice!=0) {
			int i;
			for(i=indice-1;prioridad[i]>p;i--) {
				a[i+1]=a[i];
				prioridad[i+1]=prioridad[i];
			}
			a[i+1]=x;
			prioridad[i+1]=p;

		}else {
			a[0]=x;
			prioridad[0]=p;
		}
		indice++;
	}

	public void desacolar() {
		indice--;

	}


	public int primero() {
		return a[indice-1];
	}


	public int prioridad() {

		return prioridad[indice-1];
	}


	public boolean colaVacia() {
		return (indice==0);
	}

}
