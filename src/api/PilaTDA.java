package api;

public interface PilaTDA {
 void inicializarPila();//inicializa la pila
 void apilar(int x);//apila un elemento en la pila, la misma debe estar inicializada
 void desapilar();//elimina un elemento de la pila, la misma debe estar inicializada
 int tope();//devuelve el primer elemento de la pila, la misma no debe estar vacia
 boolean pilaVacia();//indica si la pila esta vacia
}
