package Strategy;

public class Arco implements AtaqueStrategy{

    @Override
    public void ataque() {
        System.out.println("Ataque com arco");
    }
}
