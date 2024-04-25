package Decorator;

public class CaféComLeite extends CafeDecorator{

    public CaféComLeite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double informarValor() {
        return super.informarValor() + 0.5;
    }

    @Override
    public String informarIngredientes() {
        return super.informarIngredientes() + ", Leite";
    }
}
