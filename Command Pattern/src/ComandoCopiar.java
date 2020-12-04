public class ComandoCopiar implements IComando{

    private Terminal terminal;

    public ComandoCopiar(Terminal terminal){
        this.terminal = terminal;
    }

    @Override
    public void ejecutar() {
        this.terminal.copiar();
    }

    @Override
    public void deshacer() {
        this.terminal.deshacerCopiar();
    }
    
}
