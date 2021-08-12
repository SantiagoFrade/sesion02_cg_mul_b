package sistemadecoordenadas2d;
import java.util.HashSet;
import java.util.Scanner;
/* Bajo el sistema de coordenadas cartesianas referir un punto
con sus respectivas propiedades y valores.
dichos valores deben asignarse como una entrada por teclado
de parte del usuario.
*/
public class SistemaDeCoordenadas2D 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Bienvenido\n Este porgrama le permite escribir puntos dentro de un sistema de coordenadas ");
        Polar punto2 = new Polar();
        Cartesiana2D punto = new Cartesiana2D();
        Cartesiana2D punto3= new Cartesiana2D();
        Scanner lectura = new Scanner(System.in); //Escritura de los datos que ongresa el usuario
        System.out.println("Ingrese la coordenada x del punto: ");
        int x = lectura.nextInt();
        punto.setX(x);
        System.out.println("Ingrese la coordenada y del punto: ");
        int y = lectura.nextInt();
        punto.setY(y);
        System.out.println("Punto x: " + punto.getX());
        System.out.println("Punto y: "+ punto.getY());
        /* Agregar las instrucciones necesarias para que se presente 
        en pantalla la solicitud de los datos y posteriormente el
        usuario los ingrese desde el teclado*/
    }
    
}
 class Cartesiana2D
{
     private int x,y;
     
     public void setX (int x)
     {
         this.x=x;
     }
     public void setY (int y)
     {
         this.y=y;
     }

    public int getX() 
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
     
     
}
class Polar
{
    private float r, ang;

    public void setR(float r) 
    {
        this.r = r;
    }

    public void setAng(float ang) 
    {
        this.ang = ang;
    }
    
    
}
