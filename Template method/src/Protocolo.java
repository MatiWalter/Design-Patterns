public abstract class Protocolo {
    
    public final void comenzarProtocolo(){
        activarAlarmaTemprana();
        activarModoEmergencia();
        activarAlarmaPrincipal();
        activarControlDaños();
    }

    public abstract void activarAlarmaTemprana();
    public abstract void activarModoEmergencia();
    public abstract void activarAlarmaPrincipal();
    public abstract void activarControlDaños();
}
