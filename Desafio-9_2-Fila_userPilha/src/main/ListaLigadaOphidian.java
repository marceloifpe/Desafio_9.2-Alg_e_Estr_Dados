package main;

public class ListaLigadaOphidian {

    private NoOphidian head;
    private NoOphidian tail;

    public ListaLigadaOphidian() {
        head = null;
        tail = null;
    }

    public void insereFim(ClienteOphidian cliente) {
        NoOphidian temp_No = new NoOphidian(cliente);
        if (head == null) {
            head = temp_No;
            tail = temp_No;
        } else {
            tail.set_proximo(temp_No);
            tail = temp_No;
        }
    }   

    public ClienteOphidian removeInicio() {
        if (head == null) {
            return null;
        } else {
            ClienteOphidian cliente_recebe = head.get_cliente();
            head = head.get_proximo();
            return cliente_recebe;
        }
    }

    public Boolean isEmpty() {
        return head == null;
    }
    
}
