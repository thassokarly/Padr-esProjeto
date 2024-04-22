package CompositeV2;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements Componente{
    private String nome;
    private List<Componente> salas;

    public Departamento(String nome) {
        this.nome = nome;
        this.salas = new ArrayList<>();
    }

   public void add(Componente sala){
        salas.add(sala);
   }
    @Override
    public void mostrar() {
        System.out.println("B");
        for (Componente sala : salas){
            sala.mostrar();
        }
    }
}
