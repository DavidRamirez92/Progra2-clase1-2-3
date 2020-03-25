package metod;

import api.PilaTDA;
import api.ColaTDA;
import impl.Cola;
import impl.Pila;

public class MetodPila {
	
	public static void PasarPilaAPila(PilaTDA origen,PilaTDA destino) {//pasa una pila a otra invirtiendo el orden
		while(!origen.pilaVacia()) {
			destino.apilar(origen.tope());
			origen.desapilar();
		}
	}
	
	public static void CopiarPila(PilaTDA origen,PilaTDA destino) {//pasa una pila a otra, manteniendo el orden
		PilaTDA aux=new Pila();
		aux.inicializarPila();
		while(!origen.pilaVacia()) {
			aux.apilar(origen.tope());
			origen.desapilar();

		}
		while(!aux.pilaVacia()) {
			destino.apilar(aux.tope());
			aux.desapilar();
		}
	}
	
	public static void InvertirPila(PilaTDA pila) {//invierte el contenido de una pila en la misma pila
		ColaTDA aux=new Cola();
		aux.incializarCola();
		while(!pila.pilaVacia()) {
			aux.acolar(pila.tope());
			pila.desapilar();
		}
		while(!aux.colaVacia()) {
			pila.apilar(aux.tope());
			aux.desacolar();
		}
		
	}
	
	public static boolean PilasIguales(PilaTDA p1,PilaTDA p2) {//compara dos pilas y corrobora si son iguales o no, el contenido se destruye
		while(!p1.pilaVacia()&&!p2.pilaVacia()&&p1.tope()==p2.tope()) {
			p1.desapilar();
			p2.desapilar();
		}
		if(!p1.pilaVacia()||!p2.pilaVacia()) {
			return false;
		}else {
			return true;
		}
	}
	
}
