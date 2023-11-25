package main;

public class ListaLigadaOphidian {

    private NoOphidian _cabeca;
    private NoOphidian _cauda;

    public ListaLigadaOphidian() {
        _cabeca = null;
        _cauda = null;
    }

    public void insereFim(ClienteOphidian cliente) {
        NoOphidian novo = new NoOphidian(cliente);
        if (_cabeca == null) {
            _cabeca = novo;
            _cauda = novo;
        } else {
            _cauda.set_proximo(novo);
            _cauda = novo;
        }
    }   

    public ClienteOphidian removeInicio() {
        if (_cabeca == null) {
            return null;
        } else {
            ClienteOphidian cliente = _cabeca.get_cliente();
            _cabeca = _cabeca.get_proximo();
            return cliente;
        }
    }

    public Boolean isEmpty() {
        return _cabeca == null;
    }
    
}
