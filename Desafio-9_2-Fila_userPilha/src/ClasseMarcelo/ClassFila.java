package ClasseMarcelo;

import array.ListaArray;
import list.Fila;

public class ClassFila implements Fila {

    ListaArray lista;

    public ClassFila() {
        lista = new ListaArray();
    }

    @Override
    public void enqueue(int item) {
        lista.insereFim(item);
    }

    @Override
    public int dequeue() {
        int v = lista.buscaIndice(0);
        lista.removeInicio();
        return v;
    }

    @Override
    public boolean isEmpty() {
        return lista.buscaIndice(0) == -1;
    }

    @Override
    public int size() {
        return lista.size();
    }

}