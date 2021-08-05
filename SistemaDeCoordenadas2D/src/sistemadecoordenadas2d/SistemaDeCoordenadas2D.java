package sistemadecoordenadas2d;
/* Bajo el sistema de coordenadas cartesianas referir un punto
con sus respectivas propiedades y valores.
dichos valores deben asignarse como una entrada por teclado
de parte del usuario.
*/
public class SistemaDeCoordenadas2D 
{
    
    public static void main(String[] args) 
    {
        Polar punto2 = new Polar();
        Cartesiana2D punto = new Cartesiana2D();
        Cartesiana2D punto3= new Cartesiana2D();
        /* Agregar las instrucciones necesarias para que se presente 
        en pantalla la solicitud de los datos y posteriormente el
        usuario los ingrese desde el teclado*/
        punto.setX(4);
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
