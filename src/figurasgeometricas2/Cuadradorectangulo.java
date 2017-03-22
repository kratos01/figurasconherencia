/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *clase que representa un cuadrado con sus operaciones 
 * @author julian arias
 */
public class Cuadradorectangulo extends figuras{

/**
 * atributo de la coordenada x3 y3
 */
private Punto punto3;
/**
 * atributo de la coordenada x4 y4 
 */
private Punto punto4;
/**
 * contruye el contructor del metodo cuadrdo
     * @param perimetro 
     * @param Punto1 
     * @param punto3 
     * @param punto4 
     * @param Punto2 
     * @param area 
 */
      public Cuadradorectangulo(Punto punto3, Punto punto4, Punto Punto1, Punto Punto2, double area, double perimetro) {
        super(Punto1, Punto2, area, perimetro);
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
    /**
     * metodo para imprimir los resultados 
     */
      
    public void darResultados() {
         super.darDatos();
        if(cuadrado()){      
        System.out.println("lado1 "+darLado1());
        System.out.println(" lado2 "+darLado2());
        System.out.println(" lado3 "+darLado3());
        System.out.println(" lado4 "+darLado4());
        System.out.println("el area es: "+darArea());
        System.out.println("el perimetro es: "+darPerimetro());
        }else
        System.out.println("el perimetro de rectangulo es: "+darPerimetroRectangulo());
    }
    
    public boolean cuadrado(){
        if((darLado1() != darLado2())&& (darLado1() == darLado3()) && (darLado2() == darLado4())){
            System.out.println("es rectangulo..");
        }else{
            System.out.println("es cuadrado..");
        }
        return true; 
    }

    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(Punto2.getX() - Punto1.getX(), 2);
        double auxiliarY = Math.pow(Punto2.getY() - Punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - Punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - Punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto4.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto4.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * retorna longitud del lado DA
     * @return 
     */
private double darLado4(){
        double auxiliarX = Math.pow(Punto1.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(Punto1.getY() - punto4.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
/**
 * retorna el area 
 * @return 
 */
private double darArea(){
     area=darLado1()*darLado2();
    return area;
}
/**
 * retorna el perimetro de cuadrado
 * @return 
 */
private double darPerimetro(){
     perimetro = darLado1() + darLado2() + darLado3() + darLado4(); 
    return perimetro;
}
/**
 * retorna el perimetro del rectangulo
 * @return 
 */
private double darPerimetroRectangulo(){
    area = 2 * darLado1() + 2 * darLado2();
return area;
}
/**
 * metodo que retorna la varible del punto
 * @return 
 */
    public Punto getPunto3() {
        return punto3;
    }
/**
 * metodo que modifica el punto
 * @param punto3 
 */
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
/**
 * metodo que retorna la varible del punto
 * @return 
 */
    public Punto getPunto4() {
        return punto4;
    }
/**
 * metodo que modifica el punto
 * @param punto4 
 */
    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }

        }
