package CompositeV2;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Componente {
    private String nome;
    private List<Componente> itens;

    public Sala(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }


    @Override
    public void mostrar() {
        System.out.println("C");
        for (Componente item : itens){
            item.mostrar();
        }

    }
}
