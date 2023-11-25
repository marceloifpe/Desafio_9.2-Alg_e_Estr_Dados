package main;

public class ClienteOphidian {
    private String nome_Cliente;
    private Boolean gera_Papel;

    public ClienteOphidian(String nome) {
        nome_Cliente = nome;
        gera_Papel = papelAlea();
    }

    private Boolean papelAlea(){
        int random = (int) (Math.random() * 100);
        return random >= 25;
    }

    public String getNome() {
        return nome_Cliente;
    }

    public Boolean getPapelFeito() {
        if (gera_Papel) {
            System.out.println("Cliente " + nome_Cliente + " tem a papelada pronta");
            return gera_Papel;
        } else {
            System.out.println("Cliente " + nome_Cliente + 
            " não tem a papelada pronta e retorna ao final da fila");
            gera_Papel = papelAlea();
            return false;
        }
    }
    
}