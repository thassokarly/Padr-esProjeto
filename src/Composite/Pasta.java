package Composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Arquivo {

    private String nome;
    private List<Arquivo> arquivos;

    public Pasta(String nome) {
        this.nome = nome;
        this.arquivos = new ArrayList<>();
    }

    public void add(Arquivo arquivo){
        arquivos.add(arquivo);
    }

    public void remover(Arquivo arquivo){
        arquivos.remove(arquivo);
    }

    @Override
    public void mostrar() {
        System.out.println("Pasta: " + nome);
        for (Arquivo arquivo : arquivos){
            arquivo.mostrar();
        }
    }
}
