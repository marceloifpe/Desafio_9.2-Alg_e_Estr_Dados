package main;

public class OphidianDB {
    private ListaLigadaOphidian recebeLista;

    public OphidianDB() {
        recebeLista = new ListaLigadaOphidian();
    }

    public void inserirCliente(ClienteOphidian cliente) {
        recebeLista.insereFim(cliente);
    }

    public void processarfila() {
        System.out.println("Inicio do processamento da fila \n");
        while (!recebeLista.isEmpty()) {
            ClienteOphidian cliente = recebeLista.removeInicio();
            if (!cliente.getPapelFeito()) {
                recebeLista.insereFim(cliente);
            }
        }
        System.out.println("\n \nA fila foi Finalizada");

    }

}