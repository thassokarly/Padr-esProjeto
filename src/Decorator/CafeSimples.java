package Decorator;

public class CafeSimples implements Cafe {

    @Override
    public double informarValor() {
        return 1;
    }

    @Override
    public String informarIngredientes() {
        return "Café";
    }
}
