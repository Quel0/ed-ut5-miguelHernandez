package practica4;

public class Calendario {
    private int anyo, mes, dia;

    public Calendario(int anyo, int mes, int dia) {
        this.anyo = anyo;
        this.mes = mes;
        this.dia = dia;

        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12:
                dia = 31;
                break;
            case 4, 6, 9, 11:
                dia = 30;
                break;
            case 2:
                dia = 28;
                break;

        }
   }

    public void incrementoDia (int dia) {
        this.dia += dia;
   }


}
