package main;

import ClasseMarcelo.ClassFila;
import ClasseMarcelo.ClassPilha;

public class ContadorBinario {

    private ClassPilha pilhaConv;

    public ContadorBinario(int valor) {
        pilhaConv = new ClassPilha();
        for (int i = valor; i > 0; i--) {
            pilhaConv.push(i);
        }
    }

    public void print() {
        while (!pilhaConv.isEmpty()) {
            System.out.println(converDecBin(pilhaConv.pop()));
        }
    }

    private String converDecBin(int decimal) {
        String bin = "";
        ClassFila conv = new ClassFila();

        for (; decimal > 0; decimal /= 2) {
            conv.enqueue(decimal % 2);
        }

        for (; !conv.isEmpty(); bin = conv.dequeue() + bin);

        return bin;
    }
}
