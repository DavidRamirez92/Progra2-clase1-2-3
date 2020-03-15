package metod;
import api.ColaTDA;
import impl.ColaArr;
import impl.PilaArr;
public class MetodCola {

	public static void PasarCola(ColaTDA origen,ColaTDA destino) {//pasa el contenido de una cola a la otra, invirtiendo el orden
	   PilaArr aux=new PilaArr();
	   aux.inicializarPila();
	   while(!origen.colaVacia()) {
		   aux.apilar(origen.tope());
		   origen.desacolar();
	   }
	   while(!aux.pilaVacia()) {
		   destino.acolar(aux.tope());
		   destino.desacolar();
	   }
	}
	public static void CopiarCola(ColaTDA origen,ColaTDA destino) {//Copa la cola enviada como origen, en la cola destino conservando los elementos
		ColaTDA aux=new ColaArr();
		aux.incializarCola();
		while(!origen.colaVacia()) {
			aux.acolar(origen.tope());
			destino.acolar(origen.tope());
			origen.desacolar();
		}
		while(!aux.colaVacia()) {
			origen.acolar(aux.tope());
			aux.desacolar();
		}
	}
	public static void InvertirCola(ColaTDA cola) {//inivierte los contenidos de una Cola
		ColaTDA aux=new ColaArr();
		aux.incializarCola();
		while(!cola.colaVacia()) {
			aux.acolar(cola.tope());
			cola.desacolar();
	}
		while(!aux.colaVacia()) {
			cola.acolar(aux.tope());
			aux.desacolar();
		}
		
}
	public static boolean ColasIguales(ColaTDA c1,ColaTDA c2) {//compara 2 colas y determina si son iguales, destruyendo los elementos de ambas
		while(!c1.colaVacia()&&!c2.colaVacia()&&c1.tope()==c2.tope()) {
			c1.desacolar();
			c2.desacolar();
		}
		if(!c1.colaVacia()||!c2.colaVacia()) {
		return false;
		
	}else {
		return true;
	}
}
}
