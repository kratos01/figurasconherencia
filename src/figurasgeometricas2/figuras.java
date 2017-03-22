/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *super clase 
 * @author julian arias
 */

public class figuras {
/**
 * variable que garda el dato punto de la clse padre  
 */
public  Punto Punto1;
/**
 * variable que garda el dato punto de la clse padre 
*/
public Punto Punto2;
/**
 * variable que garda el dato area de la clse padre 
*/
double area;
/**
 * variable que garda el dato perimetro de la clse padre 
*/
double perimetro;
/**
 * contructor que retorna los parametros puntos,area y perimetro 
 * @param Punto1
 * @param Punto2
 * @param area
 * @param perimetro 
 */
    
    public figuras(Punto Punto1, Punto Punto2, double area, double perimetro){
        this.Punto1 = Punto1;
        this.Punto2 = Punto2;
        this.area = area;
        this.perimetro = perimetro;
    }
    public void darDatos(){
        System.out.println(""+Punto1);
        System.out.println(""+Punto2);
        System.out.println(""+area);
        System.out.println(""+perimetro);
    }
/**
 * metodo que retorna la variable punto1
 * @return 
 */
    public Punto getPunto1() {
        return Punto1;
    }
/**
 * metodo que modifica la variable punto1
 * @param Punto1 
 */
    public void setPunto1(Punto Punto1) {
        this.Punto1 = Punto1;
    }
/**
 * metodo que retorna la variable punto2
 * @return 
 */
    public Punto getPunto2() {
        return Punto2;
    }
/**
 * metodo que modifica la variable punto2
 * @param Punto2 
 */
    public void setPunto2(Punto Punto2) {
        this.Punto2 = Punto2;
    }
/**
 * metodo que retorna la variable area 
 * @return 
 */
    public double getArea() {
        return area;
    }
/**
 * metodo que modifica la variable area
 * @param area 
 */
    public void setArea(double area) {
        this.area = area;
    }
/**
 * metodo que retorna la variable perimetro
 * @return 
 */
    public double getPerimetro() {
        return perimetro;
    }
/**
 * metodo que modifica la variable perimetro
 * @param perimetro 
 */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
