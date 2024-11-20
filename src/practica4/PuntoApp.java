package practica4;

public class PuntoApp {
    public static void main(String[] args) {
        Punto punto1 = new Punto(3, 4);
        Punto Otro = new Punto(6, 8);
        //Primera muestra
        punto1.mostrar();
        Otro.mostrar();

        punto1.distanciaEuclidea(Otro);
        System.out.println("La distancia es: " + punto1.distanciaEuclidea(Otro)); // Muestra el resultado

        System.out.println();
        //Segunda Muestra prueba metodos
        punto1.desplazaX(2);
        punto1.desplazaY(5);
        punto1.desplaza(2, 6);
        punto1.mostrar();
        Otro.mostrar();
        punto1.distanciaEuclidea(Otro);
        System.out.println("La distancia es: " + punto1.distanciaEuclidea(Otro));

    }
}
