package main;
public class Main {
    public static void main(String[] args) throws Exception {
       //Teste do Banco de Ophidian
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
        System.out.println("--------------------------");
        //Teste da BinaryCounter
        System.out.println("Teste do BinaryCounter");
        System.out.println("--------------------------");
        ContadorBinario bc = new ContadorBinario(8);
        bc.print();
    }
}