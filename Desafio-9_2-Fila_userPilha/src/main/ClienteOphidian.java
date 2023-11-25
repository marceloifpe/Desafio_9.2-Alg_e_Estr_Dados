package main;

public class ClienteOphidian {
    private String _nome;
    private Boolean _papeladaPronta;

    public ClienteOphidian(String nome) {
        _nome = nome;
        _papeladaPronta = papeladaRandom();
    }

    private Boolean papeladaRandom(){
        int random = (int) (Math.random() * 100);
        return random >= 25;
    }

    public String getNome() {
        return _nome;
    }

    public Boolean getPapeladaPronta() {
        if (_papeladaPronta) {
            System.out.println("Cliente " + _nome + " tem a papelada pronta");
            return _papeladaPronta;
        } else {
            System.out.println("Cliente " + _nome + " não tem a papelada pronta e volto ao final da fila");
            _papeladaPronta = papeladaRandom();
            return false;
        }
    }
    
}