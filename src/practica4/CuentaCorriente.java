package practica4;

public class CuentaCorriente {
    //Atributos privados
    private String DNI, nombre;
    private float saldo;

    //Contructor parametrizado
    public CuentaCorriente(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = 0;
    }

    public void ingresarDinero(float cantidad) {
        saldo += cantidad;
    }

    public boolean sacarDinero(float cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return true; // saca dinero
        } else
            return false;  //falla sacar dinero

    }
    // Muestra información
    public void mostrarInformacion() {
        System.out.println("Titular: " + nombre);
        System.out.println("DNI: " + DNI);
        System.out.println("Saldo en cuenta: " + saldo + " €");


    }

}

