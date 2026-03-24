package edu.teamrocket;


class TablaAsignacion {

	private final char []  tabla;

    public TablaAsignacion() {
        this.tabla = new char[] {'T','R','W','A','G','M','Y','F','P','D','X','B',
                'N','J','Z','S','Q','V','H','L','C','K','E' };
    }

    public char[] getTabla() {
        return this.tabla;
    }
    public char getLetra(int clave){
        try {
            return this.tabla[clave];
        }
        catch ( ArrayIndexOutOfBoundsException errorLetra) {
            System.out.println("Letra no Valida");
            return '\0' /* es el caracter nulo, esto se hace para que java agarre el error de de que no se encuentra la letra*/;
        }}
    public  boolean isLetraPermitida(char letra) {
    for (char c : tabla) { if (c == letra) return  true;}
        return  false;
    }

}

