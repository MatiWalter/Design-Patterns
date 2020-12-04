/*  Esta clase deberia cambiar y agregar todos los componentes que posee un reclamo
    Yo identifico con un string al departamento por el cual puede ser atendido un reclamo
    Ya que no tengo datos de como hace un departamento para verificar que si puede atender un reclamo
*/

public class Reclamo {
    private String reclamo;

    public Reclamo(String reclamo){
        this.reclamo = reclamo;
    }

    public String getReclamo(){
        return reclamo;
    }
}
