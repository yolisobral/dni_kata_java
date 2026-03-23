package edu.teamrocket;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.BeforeClass;

public class TablaAsignacionTest {

    private static TablaAsignacion tabla;
    private static final char[] letrasNoPermitidas = {'I', 'Ñ', 'O', 'U'};

    @BeforeClass
    public static void crearTabla() {
        tabla = new TablaAsignacion();
    }

    @Test 
    public void getLetraTablaAsignacion() {
		assertEquals('T', tabla.getLetra(0));
		assertEquals('E' , tabla.getLetra(22));
    }
}