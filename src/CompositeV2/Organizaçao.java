package CompositeV2;

import java.util.ArrayList;
import java.util.List;

public class Organizaçao implements Componente{

    private List<Componente> departamentos;
    private String nome;

    public Organizaçao(String nome) {
        this.departamentos = new ArrayList<>();
        this.nome = nome;
    }

    public void add(Componente departamento){
        departamentos.add(departamento);
    }

    @Override
    public void mostrar() {
        System.out.println("A");
        for (Componente departamentos : departamentos){
            departamentos.mostrar();
        }
    }
}
