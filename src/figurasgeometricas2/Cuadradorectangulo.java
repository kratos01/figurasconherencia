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
public class Cuadradorectangulo {
/**
 * atributo de la coordenada x1 y1 
 */
private Punto punto1;
/**
 * atributo de la coordenada x2 y2 
 */
private Punto punto2;
/**
 * atributo de la coordenada x3 y3
 */
private Punto punto3;
/**
 * atributo de la coordenada x4 y4 
 */
private Punto punto4;

private double perimetro;
/**
 * contruye el contructor del metodo cuadrdo
 * @param punto1
 * @param punto2
 * @param punto3
 * @param punto4 
 */
    public Cuadradorectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
    /**
     * metodo para imprimir los resultados 
     */
    public void darResultados(){
    System.out.println("lado1 "+darLado1());
    System.out.println(" lado2 "+darLado2());
    System.out.println(" lado3 "+darLado3());
    System.out.println(" lado4 "+darLado4());
        System.out.println("el perimetro es: "+darPerimetro());
        System.out.println("el area es: "+darArea());
    }
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
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
        double auxiliarX = Math.pow(punto1.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto4.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
/**
 * metodo que retorna el valor del perimetro
 * @return 
 */
    private double darPerimetro(){
         this.perimetro = darLado1() + darLado2() + darLado3() +darLado4();
         return this.perimetro;    
    }
    /**
     * metod que retorna el valor del area  
     * @return 
     */
    private double darArea(){
        double areaCuad = darLado1() * darLado1();
        return areaCuad;
        
    }
    /**
     * metodo que retorna la coordenada x1 y1 
     * @return 
     */
    public Punto getPunto1() {
        return punto1;
    }
/**
 * metodo que modifica la coordenada x1 y1
 * @param punto1 
 */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
    /**
     * metodo que retorna la coordenada x2 y2 
     * @return 
     */
    public Punto getPunto2() {
        return punto2;
    }
/**
 * metodo que modifica la coordenada x1 y1
 * @param punto2 
 */
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
     /**
     * metodo que retorna la coordenada x3 y3 
     * @return 
     */
    public Punto getPunto3() {
        return punto3;
    }
/**
 * metodo que modifica la coordenada x1 y1
 * @param punto3 
 */
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
     /**
     * metodo que retorna la coordenada x4 y4 
     * @return 
     */
    public Punto getPunto4() {
        return punto4;
    }
/**
 * metodo que modifica la coordenada x1 y1
 * @param punto4 
 */
    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }



        }
