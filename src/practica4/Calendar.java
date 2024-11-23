package practica4;

public class Calendar {
    private int anyo, mes, dia, diaM; //variables privadas

    public Calendar(int anyo, int mes, int dia, int diaM) { //constuctor
        this.anyo = anyo;
        this.mes = mes;
        this.dia = dia;
        this.diaM = diaM;
    }

    public void incrementarDia(){ //metodo para incrementar los dias y sentencias para el cambio de mes y dia 1
        dia += 1;
        if(dia > diaM){
            dia = 1;
            mes += 1;
        }
    }
    public void incrementarMes(){ //metodo para incrementar los meses y sentencias para el cambio de mes, dia y año
        mes += 1;
        if(mes > 12){
            mes = 1;
            anyo += 1;
        }
    }
    public void incrementarAno(){ //metodo para incrementar los años y no permitir que sea 0
        anyo += 1;
        if(anyo == 0){
            System.out.print("El año no puede ser 0");
        }
    }
    public void mostrar(){   // metodo para mostrar la fecha.
        System.out.print(anyo + "/" + mes + "/" + dia + "/" + diaM);
    }

    public boolean fechasIguales(){

    }

}
