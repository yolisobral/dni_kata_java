package edu.teamrocket;

public class Dni {

    private final String dni;

    private TablaAsignacion tabla = new TablaAsignacion();

    public Dni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return this.dni;
    }

    String extraerParteNumericaDni() {
        return (String) dni.substring(0, dni.length() - 1);
    }

    Boolean isDniNumero(String Cadena ){

        return  true;
    };
}
