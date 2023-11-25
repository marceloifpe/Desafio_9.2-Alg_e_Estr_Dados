package main;

public class NoOphidian {
    private ClienteOphidian _cliente;
    public ClienteOphidian get_cliente() {
        return _cliente;
    }

    private NoOphidian _proximo;
    
    public NoOphidian get_proximo() {
        return _proximo;
    }

    public void set_proximo(NoOphidian _proximo) {
        this._proximo = _proximo;
    }

    public NoOphidian(ClienteOphidian cliente) {
        _cliente = cliente;
        _proximo = null;
    }
}