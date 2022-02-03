/**
 * Questa classe riceve due double 
 * 
 * @author Michele Zaffanello
 * @version 1.0
 * 
 */
public class FiguraGeometrica{
    private double base, altezza;
    public FiguraGeometrica(){
        base = 0.0;
        altezza = 0.0;
    }
    public FiguraGeometrica(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }
    public FiguraGeometrica(double base){
        this.base = base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltezza(double altezza){
        this.altezza = altezza;
    }
    public double getBase(){
        return this.base;
    }
    public double getAltezza(){
        return this.altezza;
    }
    public String toString(){
        if(base == 0.0){
            return "Lato: " + this.altezza;
        }
        else if(altezza == 0.0){
            return "Lato: " + this.base;
        }
        else{
            return "Base: " + this.base + " Altezza: " + this.altezza;
        }
    }
    public void calcoloArea(){

    }
    public void calcoloPerimetro(){

    }
}