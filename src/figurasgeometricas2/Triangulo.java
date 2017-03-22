/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 * Clase que representa un triangulo con sus operaciones
 * @author julian arias 
 */
public class Triangulo extends figuras {   
    /**
     * Atributo que contiene la cordenada x3 y3
     */        
    private Punto punto3;
  
    /**
     * Constuctor de la clase que inicializa las variables
     * @param punto3 
     * @param Punto1 
     * @param Punto2 
     * @param perimetro
     * @param area
     */
    
    public Triangulo(Punto punto3, Punto Punto1, Punto Punto2, double area, double perimetro) {   
        super(Punto1, Punto2, area, perimetro);
        this.punto3 = punto3;
    }

    /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        super.darDatos();
        if(isTriangulo()) {    
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("area: "+ darArea());
            System.out.println("perimetro: "+ darPerimetro());
            System.out.println("Tipo Triangulo: " + darTipoTriangulo());
        } else {
            System.out.println("No es un triangulo...");
        }    
    }
    
    /**
     * Retorna verdadero cuando  es triangulo
     * @return 
     */
    private boolean isTriangulo() {
       if((Punto1 == Punto2) && (Punto1 == punto3) && (Punto2 == punto3) ){
           System.out.println("no es triangulo...");
       }else 
            System.out.println("es triangulo...");
        if(Punto1.getX() == Punto2.getX() && Punto1.getX() == punto3.getX() && Punto2.getX() == punto3.getX()) {
           System.out.println("no es un triangulo....");
       }else{
            System.out.println("es triangulo..");
        }
            if((Punto1.getY() == Punto2.getY()) && (Punto1.getY() == punto3.getY()) && (Punto2.getY() == punto3.getY())){
                System.out.println("no es triangulo..");
            } else   {
                System.out.println(" es triangulo....");
            }
           return true;
        
    }
    
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private  double darLado1(){
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
        double auxiliarY = Math.pow(this.punto3.getY() - Punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(Punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(Punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    private double darPerimetro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    private double darArea() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
    
    /**
     * Metodo que retorna el tipo de triangulo
     * @return Tipo de triangulo
     */
    public String darTipoTriangulo() {
        if((darLado1() == darLado3()) && (darLado1() == darLado2()) && (darLado2() == darLado3())){
            System.out.println("el trangulo es equilatero");
        }else if((darLado1() == darLado2()) && (darLado1() != darLado3()) && (darLado2() != darLado3())){
            System.out.println("el triangulo es isoseles");
        }else if((darLado1() != darLado3()) && (darLado1() != darLado2()) && (darLado2() != darLado3())){
            System.out.println("el triangulo es escaleno");
    }
            return " ";
        }
    /**
     * Retorna la cordenada x3 y3
     * @return 
     */    
    public Punto getPunto3() {
        return punto3;
    }

    /**
     * Modifica la cordenada x3 y3
     * @param punto3 
     */    
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    
    
        
    
}
