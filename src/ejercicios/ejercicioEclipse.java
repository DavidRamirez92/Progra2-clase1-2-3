package ejercicios;

import api.PilaTDA;
import impl.PilaArr;
import metod.MetodPila;
public class ejercicioEclipse {

	public static void main(String[] args) {
		PilaTDA p1=new PilaArr();
		p1.inicializarPila();
		PilaTDA p2=new PilaArr();
		p2.inicializarPila();
		
		p1.apilar(1);
		p1.apilar(2);
		p1.apilar(3);
		MetodPila.PasarPilaAPila(p1, p1);
		
	

	}
	
}
