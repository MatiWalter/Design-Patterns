public class SistemaOperativo {

    private IComando copiar;
    private IComando pegar;
    private IComando crearCarpeta;

    public SistemaOperativo(IComando copiar, IComando pegar, IComando crearCarpeta){
        this.copiar = copiar;
        this.pegar = pegar;
        this.crearCarpeta = crearCarpeta;
    }

    public void ejecutarComandoCopiar(){
        copiar.ejecutar();
    }

    public void deshacerComandoCopiar(){
        copiar.deshacer();
    }

    public void ejecutarComandoPegar(){
        pegar.ejecutar();
    }

    public void deshacerComandoPegar(){
        pegar.deshacer();
    }

    public void ejecutarComandoCrearCarpeta(){
        crearCarpeta.ejecutar();
    }

    public void deshacerComandoCrearCarpeta(){
        crearCarpeta.deshacer();
    }
}
