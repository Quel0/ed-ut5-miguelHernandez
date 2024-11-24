package practica4;


// Clase Calendario
public class Calendario {
    // Variables para almacenar el año, mes y día
    private int anyo;
    private int mes;
    private int dia;

    // Constructor
    public Calendario(int anyo, int mes, int dia) {
        // Comprobar que la fecha sea válida
        if (anyo != 0 && mes >= 1 && mes <= 12 && dia >= 1) {
            // Comprobar los días según el mes
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                this.anyo = anyo;
                this.mes = mes;
                this.dia = dia;
            } else if (mes == 2 && dia <= 28) {
                this.anyo = anyo;
                this.mes = mes;
                this.dia = dia;
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
                    mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                this.anyo = anyo;
                this.mes = mes;
                this.dia = dia;
            } else {
                System.out.println("Error: Día no válido para este mes");
            }
        } else {
            System.out.println("Error: Fecha no válida");
        }
    }

    // Método para incrementar un día
    public void incrementarDia() {
        int maxDias;

        // Determinar cuántos días tiene el mes actual
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            maxDias = 30;
        } else if (mes == 2) {
            maxDias = 28;
        } else {
            maxDias = 31;
        }

        // Incrementar el día
        dia = dia + 1;

        // Si pasamos al siguiente mes
        if (dia > maxDias) {
            dia = 1;
            mes = mes + 1;
            // Si pasamos al siguiente año
            if (mes > 12) {
                mes = 1;
                anyo = anyo + 1;
                if (anyo == 0) {
                    anyo = 1;
                }
            }
        }
    }

    // Método para incrementar un mes
    public void incrementarMes() {
        mes = mes + 1;
        if (mes > 12) {
            mes = 1;
            anyo = anyo + 1;
            if (anyo == 0) {
                anyo = 1;
            }
        }

        // Ajustar el día si es necesario
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            dia = 30;
        } else if (mes == 2 && dia > 28) {
            dia = 28;
        }
    }

    // Método para incrementar años
    public void incrementarAnyo(int cantidad) {
        anyo = anyo + cantidad;
        if (anyo == 0) {
            anyo = 1;
        }
    }

    // Método para mostrar la fecha
    public void mostrar() {
        System.out.println(dia + "/" + mes + "/" + anyo);
    }

    // Método para comparar fechas
    public boolean iguales(Calendario otraFecha) {
        if (this.dia == otraFecha.dia &&
                this.mes == otraFecha.mes &&
                this.anyo == otraFecha.anyo) {
            return true;
        } else {
            return false;
        }
    }
}


