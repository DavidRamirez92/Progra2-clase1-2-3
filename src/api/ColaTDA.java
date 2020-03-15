package api;

public interface ColaTDA {
 void incializarCola();//inicializa la Cola 
 void acolar(int x);//agrega un elemento a la cola, la misma debe estar inicializada
 void desacolar();//elimina un elemento de la cola, la misma debe estar inicializada
 int tope();//devuelve el primer elemento de la cola, la misma no debe estar vacia
 boolean colaVacia();//informa si la cola esta vacia
}
