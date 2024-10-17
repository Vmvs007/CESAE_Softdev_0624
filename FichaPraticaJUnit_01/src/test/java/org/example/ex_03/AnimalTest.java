package org.example.ex_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal elefante;
    private Animal leao;

    @BeforeEach
    void setUp() {
        elefante = new Animal("Dumbo", Alimento.FRUTAS);
        leao = new Animal("Simba", Alimento.CARNE);
    }

    @Test
    public void comerAlimentoValido() {

        assertTrue(elefante.estaComFome());
        elefante.comer(Alimento.FRUTAS);
        assertFalse(elefante.estaComFome());

        assertTrue(leao.estaComFome());
        leao.comer(Alimento.CARNE);
        assertFalse(leao.estaComFome());
    }

    @Test
    public void comerAlimentoInvalido() {
        assertTrue(elefante.estaComFome());
        elefante.comer(Alimento.CARNE);
        assertTrue(elefante.estaComFome());

        assertTrue(leao.estaComFome());
        leao.comer(Alimento.VEGETAIS);
        assertTrue(leao.estaComFome());
    }


}