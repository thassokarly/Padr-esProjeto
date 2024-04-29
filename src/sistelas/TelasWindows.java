package sistelas;

public class  TelasWindows  implements TelaFactory{

    public static void main(String[] args) {
        TelasWindows telasWindows = new TelasWindows();

    }

    public void construirTelas(TelaFactory factory) {
        Janela janela = factory.criarJanela();
        Botao botao = factory.criarBotao();
        Campo campo = factory.criarCampo();
    }

    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }

    @Override
    public Campo criarCampo() {
        return new CampoWindows();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaWindows();
    }
}
