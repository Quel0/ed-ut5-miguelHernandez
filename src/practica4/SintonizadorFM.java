package practica4;



public class SintonizadorFM {
    private float frecuencia;

    public SintonizadorFM() {
        this.frecuencia = 80.0F;
    }

    public SintonizadorFM(float frecuencia) {
        if (frecuencia < 80) {
            this.frecuencia = 80.0F;
        } else if (frecuencia > 108) {
            this.frecuencia = 108.0F;
        } else
            this.frecuencia = frecuencia;
    }
    public void Display() {
        System.out.println("Frecuencia sintonizada: " + frecuencia + " MHz");
    }
    public void Down(){
        frecuencia -= 0.5F;
        comprobarRango();
    }
    public void Up(){
        frecuencia += 0.5F;
        comprobarRango();
    }
    public void comprobarRango(){
        if(frecuencia < 80){
            frecuencia = 108.0F;
        }else if(frecuencia > 108){
            frecuencia = 80.0F;
        }
    }
}
