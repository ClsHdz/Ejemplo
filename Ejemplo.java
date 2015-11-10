import acm.program.*;
import acm.graphics.*;

public class Ejemplo extends GraphicsProgram{
	final static int ANCHO_LADRILLO = 30;
	final static int ALTURA_LADRILLO = 12;
	final static int ANCHO_PANTALLA = 600;
	GRect ladrillo;
	int numLadrillos = 14;
	int columnas = 5;
	int filas = 5;
	int i = 0;
	int j = 0;
	int basePiramide = numLadrillos * ANCHO_LADRILLO;
	public void run(){
		while(i < numLadrillos){
			while(j < numLadrillos - i){
				ladrillo = new GRect(ANCHO_LADRILLO,ALTURA_LADRILLO);
				add(ladrillo,(getWidth()/2 - basePiramide/2 + ANCHO_LADRILLO * i/2 + ANCHO_LADRILLO * j),(getHeight()- ALTURA_LADRILLO - ALTURA_LADRILLO * i));
				j++;
				}
			i++;
			j = 0;
			}
		if(j == 1){
			i = 5;
		}
	}
}

