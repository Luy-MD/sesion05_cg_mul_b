package trasns;

import java.util.Scanner;

public class Main
{
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslaci�n 
		// Aplique el vector de traslaci�n anterior a cada uno de los objetos referidos
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
    public void Traslacion(Coord t) {  // Complete los par�metros requeridos
     
    	c.setX(t.getX()+c.getX());
    	c.setY(t.getY()+c.getY());
    	
    }
    public void Escalado(int s) {  // Complete los par�metros requeridos
        
    	lado = (int)(lado*(1+s/100.0f));
    }
    public void Rotacion() {  // Complete los par�metros requeridos
        
    }
}

class Circunferencia {
    Coord c;
    float radio;
    // Implementar los m�todos Traslacion, Escalado y Rotacion para �sta clase
}

}