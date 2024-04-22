package Composite;

public class ArquivoSimples implements Arquivo {

    private String nome;

    public ArquivoSimples(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrar() {
        System.out.println("Arquivo simples" + nome);
    }
}
