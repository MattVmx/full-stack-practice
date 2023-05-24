
package Entidad;


public class Ahorcado {
    
    private String[] palabra = {"p", "e", "r", "f", "e", "c", "t", "o"};
    private int letrasE;
    private int jugadas = 5;

    public Ahorcado() {
    }

    public Ahorcado(int letrasE, int jugadas) {
        this.letrasE = letrasE;
        this.jugadas = jugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasE() {
        return letrasE;
    }

    public void setLetrasE(int letrasE) {
        this.letrasE = letrasE;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
    
    
}
