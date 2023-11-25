package main;

public class Main {
    public static void main(String[] args) throws Exception {
        // Teste Banco Ophidian
        System.out.println("Teste do Banco de Ophidian");
        System.out.println("--------------------------");
        OphidianDB db = new OphidianDB();
        db.inserirCliente(new ClienteOphidian("Alex"));
        db.inserirCliente(new ClienteOphidian("Balotelli"));
        db.inserirCliente(new ClienteOphidian("Draxler"));
        db.inserirCliente(new ClienteOphidian("Everton"));
        db.inserirCliente(new ClienteOphidian("Fagner"));
        db.inserirCliente(new ClienteOphidian("Gilberto"));
        db.inserirCliente(new ClienteOphidian("Hugo"));
        db.inserirCliente(new ClienteOphidian("Igor"));
        db.inserirCliente(new ClienteOphidian("Jorge"));

        db.processarfila();
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("------------------");
        // Testando Contador
        System.out.println("Teste de Contagem Binária");
        System.out.println("");
        ContadorBinario Recebe_BD = new ContadorBinario(8);
        Recebe_BD.print();
        System.out.println("------------------");
        System.out.println("Fim da Contagem.");
    }
}