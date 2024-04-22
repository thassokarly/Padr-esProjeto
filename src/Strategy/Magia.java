package Strategy;

public class Magia implements AtaqueStrategy{
    @Override
    public void ataque() {
        System.out.println("Ataque com magia");
    }
}
