package trasns;

import java.util.Scanner;

public class Main
{
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslación 
		// Aplique el vector de traslación anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
		
		System.out.println("Ingrese un vector de translacion");
		System.out.println("x: ");
		int x = entrada.nextInt();
		System.out.println("y: ");
		int y = entrada.nextInt();
	}
}

class Coord {
    private int x, y;
    
    public void setX(int x) {
    	this.x = x;
    }
    
    public void setY(int y) {
    	this.y = y;
    }
    
    public int getX() {
    	return x;
    }   
    
    public int getY() {
    	return y;
    }

class Cuadrado {
    private Coord c;
    private int lado;
    public Cuadrado(Coord c, int lado) {
        this.c = c;
        this.lado = lado;
    }
    public void Traslacion(Coord t) {  // Complete los parámetros requeridos
     
    	c.setX(t.getX()+c.getX());
    	c.setY(t.getY()+c.getY());
    	
    }
    public void Escalado(int s) {  // Complete los parámetros requeridos
        
    	lado = (int)(lado*(1+s/100.0f));
    }
    public void Rotacion() {  // Complete los parámetros requeridos
        
	 private AffineteTransform at; 
    	 private double grados;
    	
    	public Cuadrado(int x, int y) {
    		at = new AffineTransform();
    		
    		this.x = x;
    		this.y = y;
    	}
    	
    	public AffineTransform getTransform() {
    		return at;
    	}   
    }
}

class Circunferencia {
    private Coord c;
	    private float radio;
	    // Implementar los métodos Traslacion, Escalado y Rotacion para ésta clase
	    
	    public Coord getC() {
	    	return c;
	    }
	    
	    public void setC(Coord c) {
	    	this.c = c;
	    }
	    
	    public float getRadio() {
	    	return radio;
	    }
		
	    public void setRadio(float radio) {
	    	this.radio = radio;
	    }
	    public Circunferencia(Coord c, float radio) {
	        this.c = c;
	        this.radio = radio;
	    
	   }
	    public void Traslacion(Coord t) { 
	        
	    	c.setX(t.getX()+c.getX());
	    	c.setY(t.getY()+c.getY());
	    	
	    }
	    
	     public void Escalado(int s) { 
	        
	    	radio = (int)(radio*(1+s/100.0f));
	    }     
   }

}
