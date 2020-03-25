package ejercicios;

import api.PilaTDA;
import impl.Pila;
import metod.MetodPila;
public class ejercicioEclipse {

	public static void main(String[] args) {
		PilaTDA p1=new Pila();
		p1.inicializarPila();
		PilaTDA p2=new Pila();
		p2.inicializarPila();
		
		p1.apilar(1);
		p1.apilar(2);
		p1.apilar(3);
		MetodPila.PasarPilaAPila(p1, p2);
		
	

	}
	
}
