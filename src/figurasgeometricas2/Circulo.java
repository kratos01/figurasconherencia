/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 * hereda los parametros de la super clase 
 * @author julian arias
 */


public class Circulo extends figuras {
  /**
 *crea la clase circulo con sus respectivos calculos 
 * @author julian arias
 */
   
 /**
  *crea la variable para guardar el resultado del metodo radio 
  */
    private double radioC;
    /**
     * crea el contructor para la clase circulo
     * @param radioC      
     * @param Punto1      
     * @param Punto2      
     * @param area      
     * @param perimetro      
     */
    public Circulo(double radioC, Punto Punto1, Punto Punto2, double area, double perimetro) { 
        super(Punto1, Punto2, area, perimetro);
        this.radioC = radioC;
    }
    /**
     * metodo que da los resultados
     */
    public void darResultados() {
         super.darDatos();
        System.out.println("imprime radio "+darRadio());
        
    }
 /**
  * metodo que retorna el valor del radio
  * @return 
  */
public double darRadio(){
       double distancia = Math.pow(Punto1.getY() - Punto2.getY() + Punto1.getX() - Punto2.getY(), 2 );
        this.radioC = Math.sqrt(distancia);
      
        return this.radioC;
}
/**
 * metodo que retorna el area 
 * @return 
 */
public double darArea(){
     area = 2 * Math.PI *darRadio()*darRadio();
     return area;
}
public double darPerimetro(){
     perimetro = 2 * Math.PI * darRadio();
     return perimetro;
}

}

