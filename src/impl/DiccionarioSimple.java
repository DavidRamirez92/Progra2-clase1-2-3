package impl;

import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;

public class DiccionarioSimple implements DiccionarioSimpleTDA {
  
	class Elemento{
		int valor;
		int clave;
	}
	Elemento[]elementos;
	int cant;
	
	private int posClave(int clave) {//devuelve la posicion de una clave ingresada si es que existe, si devuelve la misma cantidad de elementos que "cant" significa que la clave no existe
		int i=0;
		while(i<cant&&elementos[i].clave!=clave) 
			i++;
	    return i;
	}
	public void inicializarDiccionario() {
		elementos=new Elemento[100];
		cant=0;
	}

	public void agregar(int c, int v) {
		int pos=posClave(c);
		if(pos==cant) {
			elementos[cant].clave=c;
			elementos[cant].valor=v;
			cant++;
		}else {
			elementos[pos].valor=v;
		}

	}

	public void eliminar(int clave) {
		int pos=posClave(clave);
		if(pos!=cant) {
			if(pos+1!=cant)
				elementos[pos]=elementos[cant-1];
			cant--;
		}
	}

	public int recuperar(int clave) {
		int pos=posClave(clave);
		return elementos[pos].valor;
	}

	public ConjuntoTDA Claves() {
	ConjuntoTDA aux=new Conjunto();
	aux.inicializarConjunto();
		for(int i=0;i<cant;i++) {
			aux.agregar(elementos[i].clave);
		}
		return aux;
	}

}
