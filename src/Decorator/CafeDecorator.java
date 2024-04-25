package Decorator;

public  abstract class CafeDecorator implements  Cafe{
    private final Cafe cafeDecorator;

    public CafeDecorator(Cafe cafe) {
        this.cafeDecorator = cafe;
    }

    @Override
    public double informarValor() {
        return cafeDecorator.informarValor();
    }

    @Override
    public String informarIngredientes() {
        return cafeDecorator.informarIngredientes();
    }

    public Cafe getCafeDecorator() {
        return cafeDecorator;
    }
}
