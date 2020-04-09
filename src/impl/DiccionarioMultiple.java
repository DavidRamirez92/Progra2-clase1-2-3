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
	private int posValor(int posClave,int valor) {
		int pos=0;
		while(pos<elementos[posClave].cantValores&&elementos[posClave].valores[pos]!=valor)
			pos++;
		return pos;
	}
	
	private int cantValores(int posClave) {
		return elementos[posClave].cantValores;
	}
	
	public void agregar(int clave, int valor) {
		int posClave=posClave(clave);
		int posValor;
		if(posClave==cantClaves) {//si entra es por que la clave no existe
			elementos[posClave].clave=clave;
			elementos[posClave].cantValores=0;
			elementos[posClave].valores=new int[100];
			elementos[posClave].valores[0]=valor;
			elementos[posClave].cantValores++;
			cantClaves++;
		}else{
			posValor=posValor(posClave,valor);//
			if(posValor==elementos[posClave].cantValores) {//si entra es por que el elemento no existe en la clave
				elementos[posClave].valores[posValor]=valor;
				elementos[posClave].cantValores++;
			    
		}
			}
	
	}

	public void eliminar(int clave) {
		int pos=posClave(clave);
		if(pos!=cantClaves) {
			if(pos+1!=cantClaves)
				elementos[pos]=elementos[cantClaves-1];
			cantClaves--;
		}

	}


	public void eliminarValor(int clave, int valor) {
		int posClave=posClave(clave);
		int posValor;
		int cantValores;
		if(posClave!=cantClaves) {//Encontro la clave
			posValor=posValor(clave,valor);
			cantValores=cantValores(posClave);
			if(posValor!=elementos[posClave].cantValores) {//Encontro el elemento en la clave
				if(posValor+1!=cantValores) {
					elementos[posClave].valores[posValor]=elementos[posClave].valores[cantValores-1];
					elementos[posClave].cantValores--;
				}else {
					eliminar(clave);
				}
					
			}
		}

	}

	public ConjuntoTDA recuperarValores(int clave) {
		ConjuntoTDA aux=new Conjunto();
		int posClave=posClave(clave);
		if(posClave!=cantClaves) {
			for(int i=0;i<elementos[posClave].cantValores;i++) {
				aux.agregar(elementos[posClave].valores[i]);
			}
		}
		return aux;
		
	}

	public ConjuntoTDA claves() {
		ConjuntoTDA aux=new Conjunto();
		aux.inicializarConjunto();
		for(int i=0;i<cantClaves;i++) {
			aux.agregar(elementos[i].clave);
		}
		return aux;
	}

}
