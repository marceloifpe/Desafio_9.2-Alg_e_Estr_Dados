package main;

public class OphidianDB {
    private ListaLigadaOphidian _lista;

    public OphidianDB() {
        _lista = new ListaLigadaOphidian();
    }

    public void inserirCliente(ClienteOphidian cliente) {
        _lista.insereFim(cliente);
    }

    public void processarfila(){
        System.out.println("Começando a processar a fila \n");
        while (!_lista.isEmpty()) {
            ClienteOphidian cliente = _lista.removeInicio();
            if (!cliente.getPapeladaPronta()){
                _lista.insereFim(cliente);
            }
        }
        System.out.println("\n \nA fila foi totalmente processada");
        
    }
    
}