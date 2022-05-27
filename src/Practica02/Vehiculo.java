package Practica02;

public class Vehiculo {
    private String marca;
    private short modelo;

    public Vehiculo(String marca, short modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca) {
        this.marca = marca;
    }

    public short getmodelo(){
        return modelo;
    }
    public void setmodelo(short modelo){

    }
    public Void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                '}';
    }
}
