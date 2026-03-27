package edu.teamrocket;


public class Dni {

    private final String dni;
    private final TablaAsignacion tabla;

    public Dni(String dni) {
        this.dni = dni;
        this.tabla = new TablaAsignacion();
    }

    public int extraerParteNumericaDni() {
        return Integer.parseInt(dni.substring(0, 8));
    }


    public char extraerParteAlfabeticaDni() {
        return dni.charAt(8);
    }
    public boolean isDniNumero(int numero) {
        return numero >= 0 && numero <= 99999999;
    }

    public boolean checkNumeroDni() {
        try {
            int numero = extraerParteNumericaDni();
            return isDniNumero(numero);
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public char obtenerLetra() {
        int numero = extraerParteNumericaDni();
        int posicion = numero % tabla.getTabla().length;
        return tabla.getLetra(posicion);
    }


    public boolean checkLetra() {
        return extraerParteAlfabeticaDni() == obtenerLetra();
    }


    public boolean checkDni() {
        return checkNumeroDni() && checkLetra();
    }
}


