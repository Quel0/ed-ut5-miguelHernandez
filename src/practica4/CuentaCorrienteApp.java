package practica4;

public class CuentaCorrienteApp {
    public static void main(String[] args) {
        //creacion objeto1 y objeto2
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678n", "Juan Perez");
        CuentaCorriente cuenta2 = new CuentaCorriente("12345679n", "Jose Perez");


        System.out.println("***Información del las cuentas***\n");

        //Realizar Ingreso
        cuenta1.ingresarDinero(100);
        cuenta2.ingresarDinero(3000);

        //Sacar dinero y mostrar informacion

        if (cuenta1.sacarDinero(101)) {
            System.out.println("Extracción correcta");

        } else {
            System.out.println("Saldo insuficiente");
        }
        cuenta1.mostrarInformacion();
        System.out.println();


        if (cuenta2.sacarDinero(500)) {
            System.out.println("Extraccion correcta");
        } else {
            System.out.println("Saldo insuficiente");
        }
        cuenta2.mostrarInformacion();


    }
}


