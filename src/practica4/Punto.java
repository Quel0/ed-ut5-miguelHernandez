package practica4;

public class Punto {
    private double x,y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx){
         x += dx;
    }
    public void desplazaY(double dy){
        y += dy;
    }
    public void desplaza(double dx, double dy){
        x += dx;
        y += dy;
    }
    public double distanciaEuclidea(Punto Otro){
        return Math.hypot((x-Otro.x), (y-Otro.y));
    }

    public void mostrar(){
        System.out.println("\tx: " + x + " \ty: " + y);

    }

}
