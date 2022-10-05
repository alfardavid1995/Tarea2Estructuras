/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilastarea;

/**
 *
 * @author David Alfaro
 */
public class Traste {
    private String tipotraste = "";
    private int cantidadCubiertos=0;

    public Traste() {
    }
    
    public Traste(String tipotraste, int cantidadCubiertos){
        this.tipotraste=tipotraste;
        this.cantidadCubiertos=cantidadCubiertos;
    }

    public String getTipotraste() {
        return tipotraste;
    }

    public void setTipotraste(String tipotraste) {
        this.tipotraste = tipotraste;
    }

    public int getCantidadCubiertos() {
        return cantidadCubiertos;
    }

    public void setCantidadCubiertos(int cantidadCubiertos) {
        this.cantidadCubiertos = cantidadCubiertos;
    }

    @Override
    public String toString() {
        return "Traste{" + "tipotraste=" + tipotraste + ", cantidadCubiertos=" + cantidadCubiertos + '}';
    }
    
    
    
}
