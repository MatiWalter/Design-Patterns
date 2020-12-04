public class ComandoPegar implements IComando{

    private Terminal terminal;

    public ComandoPegar(Terminal terminal){
        this.terminal = terminal;
    }

    @Override
    public void ejecutar() {
        this.terminal.pegar();
    }

    @Override
    public void deshacer() {
        this.terminal.deshacerPegar();
    }
    
}
