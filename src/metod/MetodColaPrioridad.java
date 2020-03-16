package metod;
import impl.ColaPrioridadArr;
import api.ColaPrioridadTDA;

public class MetodColaPrioridad {
	public static void PasarColaPrioridad(ColaPrioridadTDA origen,ColaPrioridadTDA destino) {//pasa una cola con prioridad a otra
		while(!origen.colaVacia()) {
			destino.acolarPrioridad(origen.primero(),origen.prioridad());
		}
	}
	public static void CopiarColaPrioridad(ColaPrioridadTDA origen,ColaPrioridadTDA destino) {//copia el contenido de una cola con prioridad en la otra
		ColaPrioridadTDA aux=new ColaPrioridadArr();
		aux.inicializarColaPrioridad();
		while(!origen.colaVacia()) {
			aux.acolarPrioridad(origen.primero(),origen.prioridad());
			destino.acolarPrioridad(origen.primero(),origen.prioridad());
			origen.desacolar();
		}
		while(!aux.colaVacia()) {
			origen.acolarPrioridad(aux.primero(),aux.prioridad());
			aux.desacolar();
		}
	}


}
