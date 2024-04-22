package Strategy;

public class Personagem {
    private AtaqueStrategy ataqueStrategy;

    public Personagem(AtaqueStrategy ataqueStrategy) {
        this.ataqueStrategy = ataqueStrategy;
    }

    public void setAtaqueStrategy(AtaqueStrategy ataqueStrategy) {
        this.ataqueStrategy = ataqueStrategy;
    }

    public AtaqueStrategy getAtaqueStrategy() {
        return ataqueStrategy;
    }
    public void attack(){
        ataqueStrategy.ataque();
    }
}
