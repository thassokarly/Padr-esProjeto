package Strategy;

public class Espada implements AtaqueStrategy{
    @Override
    public void ataque() {
        System.out.println("Ataque com espada");
    }
}
