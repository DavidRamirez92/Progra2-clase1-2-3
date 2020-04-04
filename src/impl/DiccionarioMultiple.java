package impl;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;

public class DiccionarioMultiple implements DiccionarioMultipleTDA {
 class Elemento{
	 int clave;
	 int[]valores;
	 int cantValores;
	 
 }
 Elemento[]elementos; 
 int cantClaves;
	public void inicializarDiccionario() {
		elementos=new Elemento[100];
		cantClaves=0;
	}
	
	private int posClave(int clave) {//devuelve la posicion de una clave ingresada si es que existe, si devuelve la misma cantidad de elementos que "cant" significa que la clave no existe
		int i=0;
		while(i<cantClaves&&elementos[i].clave!=clave) 
			i++;
	    return i;
	}
	
	public void agregar(int clave, int valor) {
		if(posClave(clave)==cantClaves) {
			
		}

	}

	@Override
	public void eliminar(int clave) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarValor(int clave, int valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public ConjuntoTDA recuperarValores(int clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConjuntoTDA claves() {
		// TODO Auto-generated method stub
		return null;
	}

}
