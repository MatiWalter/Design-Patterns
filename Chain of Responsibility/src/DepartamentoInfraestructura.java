public class DepartamentoInfraestructura extends Departamento {

    @Override
    public void procesar(Reclamo reclamo) {
        if (reclamo.getReclamo().equals("infraestructura")){                   // El reclamo lo puede atender infraestructura
            System.out.println("Reclamo atendido por Infraestructura");
        } else if(siguiente == null) {
            System.out.println("Reclamo atendido por Infraestructura");
        } else {
            siguiente.procesar(reclamo);                                 // No puede atender, deriva responsabilidad
        } 
    }
    
}
