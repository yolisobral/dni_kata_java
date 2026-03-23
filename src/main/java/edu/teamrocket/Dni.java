package edu.teamrocket;

public class Dni {

    private final int numero;
    private final char letra;

    public Dni(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    public int getNumero() {
        return numero;
    }

    public int setNumero() {
        return this.numero;
    }

    public char getLetra() {
        return letra;
    }

    public char setLetra() {
        return this.letra;
    }

    private char calcularLetra(int numero) {
        char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 
                     	 'Y', 'F', 'P', 'D', 'X', 'B', 
                         'N', 'J', 'Z', 'S', 'Q', 'V', 
                         'H', 'L', 'C', 'K', 'E'};
        return tabla[numero % 23];
    }

    

}
