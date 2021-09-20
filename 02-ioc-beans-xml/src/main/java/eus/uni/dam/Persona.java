package eus.uni.dam;

public class Persona {

    String izena = "Lulú";

    Persona(String izena){
        this.izena = izena;
    }
    
    public void setIzena(String izenBerria) {
        izena = izenBerria;
    }
    
    public void aurkeztu() {
        System.out.println("Kaixo, ni " + izena + " naiz. Urte askotarako.");
    }
}