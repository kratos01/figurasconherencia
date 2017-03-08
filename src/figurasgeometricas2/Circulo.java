/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;




public class Circulo {
  /**
 *crea la clase circulo con sus respectivos calculos 
 * @author julian arias
 */
    /**
     * guarda las coordenadas para x1 y1 
     */
    private Punto punto1;
 /**
     * guarda las coordenadas para x2 y2 
     */
    private Punto punto2;
 /**
  *crea la variable para guardar el resultado del metodo radio 
  */
    private double radioC;
    /**
     * crea el contructor para la clase circulo
     * @param punto1
     * @param punto2 
     */
public Circulo(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
 /**
  * metodo que da los resultados 
  */
 public void darResultados(){
     System.out.println("imprime area "+darArea());
     System.out.println("imprime radio "+darRadio());
 }
 /**
  * metodo que retorna el valor del radio
  * @return 
  */
public double darRadio(){
       double distancia = Math.pow(punto1.getY() - punto2.getY() + punto1.getX() - punto2.getX(), 2 );
        this.radioC = Math.sqrt(distancia);
      
        return this.radioC;
}
/**
 * metodo que retorna el area 
 * @return 
 */
public double darArea(){
    double area = 2*Math.PI *darRadio()*darRadio();
     return area;
}
/**
 *metodo que retorna el punto1 
 * @return 
 */
    public Punto getPunto1() {
        return punto1;
    }
/**
 * metodo que modifica el punto1 
 * @param punto1 
 */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;   
    }
    /**
     * metod que retorna el punto 2
     * @return 
     */
    public Punto getPunto2() {
        return punto2;
    }
/**
 * metodo que modifica el punto2 
 * @param punto2 
 */
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
}

