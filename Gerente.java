public class Gerente extends Empleado {
    private int presupuesto;
	
	public void setPresupuesto(String presupuesto){
	    this.presupuesto = presupuesto;
    }
	
	public String getPresupuesto(){
	    return this.presupuesto;
	}
		
	void asignarPresupuesto(int p){
        presupuesto = p;
	}

}
