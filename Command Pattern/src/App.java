public class App {
    public static void main(String[] args) throws Exception {
        SistemaOperativo so = new SistemaOperativo(new ComandoCopiar(new Terminal()),new ComandoPegar(new Terminal()),new ComandoCrearCarpeta(new Terminal()));
        so.ejecutarComandoCopiar();
        so.ejecutarComandoPegar();
        so.ejecutarComandoCrearCarpeta();
        so.deshacerComandoCopiar();
        so.deshacerComandoCrearCarpeta();
        so.deshacerComandoPegar();
    }
}
