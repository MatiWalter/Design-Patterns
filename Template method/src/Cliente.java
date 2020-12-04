public class Cliente {
    public static void main(String[] args) throws Exception {
        Protocolo p = new EvacuacionRascacielos();
        p.comenzarProtocolo();
        p = new ProtocoloConcreto();
        p.comenzarProtocolo();
    }
}
