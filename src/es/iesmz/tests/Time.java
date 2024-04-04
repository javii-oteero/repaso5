package es.iesmz.tests;

public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public Time(int h, int m, int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    public Time nextSecond(){
        this.segundo++;
        if(this.segundo == 60){
            this.segundo = 0;
            this.minuto++;
            if(this.minuto == 60){
                this.minuto = 0;
                this.hora++;
                if(this.hora == 24){
                    this.hora = 0;
                }
            }
        }
        return this;
    }
}
