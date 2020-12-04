public class ProtocoloConcreto extends Protocolo {

    @Override
    public void activarAlarmaTemprana() {
        System.out.println("Alarma temprana protocolo concreto");
    }

    @Override
    public void activarModoEmergencia() {
        System.out.println("Modo emergencia protocolo concreto");
    }

    @Override
    public void activarAlarmaPrincipal() {
        System.out.println("Alarma principal protocolo concreto");
    }

    @Override
    public void activarControlDaños() {
        System.out.println("Control daños protocolo concreto");
    }
    
}
