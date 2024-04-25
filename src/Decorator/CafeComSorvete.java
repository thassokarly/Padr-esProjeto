package Decorator;

public class CafeComSorvete extends CafeDecorator{
    public CafeComSorvete(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double informarValor() {
        return super.informarValor() + 3.0;
    }

    @Override
    public String informarIngredientes() {
        return super.informarIngredientes() + ", Com sorvete de Creme";
    }
}
