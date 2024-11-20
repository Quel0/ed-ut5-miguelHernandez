package practica4;

public class SintonizadorFMApp {
    public static void main(String[] args) {
        // Crear Objetos
        SintonizadorFM radio1 = new SintonizadorFM();
        SintonizadorFM radio2 = new SintonizadorFM(107);
        SintonizadorFM radio3 = new SintonizadorFM(200);

        //Baja 1 MHz
        radio1.Down();
        radio1.Down();

        //Sube 2 Mhz
        radio2.Up();
        radio2.Up();
        radio2.Up();
        radio2.Up();
        // Mostrar Frecuencia
        radio1.Display(); //107.5
        radio2.Display(); //80.5
        radio3.Display(); //108.0
    }
}
