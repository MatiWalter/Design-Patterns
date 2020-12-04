public class ComandoCrearCarpeta implements IComando{

    private Terminal terminal;

    public ComandoCrearCarpeta(Terminal terminal){
        this.terminal = terminal;
    }

    @Override
    public void ejecutar() {
        this.terminal.crearCarpeta();

    }

    @Override
    public void deshacer() {
        this.terminal.deshacerCrearCarpeta();

    }
    
}
