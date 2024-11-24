package practica4;

// Clase para probar el Calendario
public class CalendarioApp {
    public static void main(String[] args) {
        // Crear calendario
        Calendario cal1 = new Calendario(2024, 3, 15);
        Calendario cal2 = new Calendario(2024, 3, 15);

        // Mostrar fechas iniciales
        System.out.println("Fecha inicial cal1:");
        cal1.mostrar();
        System.out.println("Fecha inicial cal2:");
        cal2.mostrar();

        // Probar si son iguales
        System.out.println("\n¿Son iguales las fechas?");
        if (cal1.iguales(cal2)) {
            System.out.println("Sí, son iguales");
        } else {
            System.out.println("No, son diferentes");
        }

        // Probar incrementar día
        System.out.println("\nProbando incrementarDia:");
        cal1.incrementarDia();
        System.out.println("Después de incrementar un día:");
        cal1.mostrar();

        // Probar incrementar mes
        System.out.println("\nProbando incrementarMes:");
        cal1.incrementarMes();
        System.out.println("Después de incrementar un mes:");
        cal1.mostrar();

        // Probar incrementar año
        System.out.println("\nProbando incrementarAño:");
        cal1.incrementarAnyo(1);
        System.out.println("Después de incrementar un año:");
        cal1.mostrar();

        // Probar un caso especial: final de mes
        System.out.println("\nProbando caso especial:");
        Calendario cal3 = new Calendario(2024, 3, 31);
        System.out.println("Fecha con día 31:");
        cal3.mostrar();
        cal3.incrementarMes();
        System.out.println("Después de incrementar al mes siguiente (abril):");
        cal3.mostrar();
    }
}
