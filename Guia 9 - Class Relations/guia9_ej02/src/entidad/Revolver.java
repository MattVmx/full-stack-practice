
package entidad;


public class Revolver {
    
    private Integer posicionActual;
    private Integer posicionAgua;

    public Revolver() {
    }

    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){
    
        int aleatorio = (int)(Math.random()*((6-1)+1))+1;
        int aleatorio2 = (int)(Math.random()*((6-1)+1))+1;
        
        setPosicionActual(aleatorio);
        setPosicionAgua(aleatorio2);
        
    }
    
    
    public boolean mojar(){
        
        boolean mojar = false;
        
        if (posicionAgua.equals(posicionActual)) {
            mojar = true;
        }
                        
        return mojar;
    }
    
    
    
    public void siguienteChorro(){
        
        if (posicionActual == 6) {
            setPosicionActual(1);
        } else {
             setPosicionActual(posicionActual+1);
        }
        
        
    }
    
    
    
    public void mostrar(){
    
        System.out.println("Posicion actual: " + posicionActual);
        System.out.println("Posicion del agua: " + posicionAgua);
    }
    
}
