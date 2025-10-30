package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonagemTest {
    Personagem personagem;

    @BeforeEach
    public void setUp() {
        personagem = new Personagem();
    }

    @Test
    public void naoDeveDescansarPersonagemDescansando() {
        personagem.setEstado(PersonagemEstadoDescansado.getInstance());
        assertFalse(personagem.descansar());
    }

    @Test
    public void deveAtacarPersonagemDescansando() {
        personagem.setEstado(PersonagemEstadoDescansado.getInstance());
        assertTrue(personagem.atacar());
        assertEquals(PersonagemEstadoAtacando.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveDesmaiarPersonagemDescansando() {
        personagem.setEstado(PersonagemEstadoDescansado.getInstance());
        assertTrue(personagem.desmaiar());
        assertEquals(PersonagemEstadoDesmaiado.getInstance(), personagem.getEstado());
    }

    @Test
    public void naoDeveDefenderPersonagemDescansando() {
        personagem.setEstado(PersonagemEstadoDescansado.getInstance());
        assertFalse(personagem.defender());
    }


    @Test
    public void naoDeveAtacarPersonagemAtacando() {
        personagem.setEstado(PersonagemEstadoAtacando.getInstance());
        assertFalse(personagem.atacar());
    }

    @Test
    public void deveDefenderPersonagemAtacando() {
        personagem.setEstado(PersonagemEstadoAtacando.getInstance());
        assertTrue(personagem.defender());
        assertEquals(PersonagemEstadoDefendendo.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveDescansarPersonagemAtacando() {
        personagem.setEstado(PersonagemEstadoAtacando.getInstance());
        assertTrue(personagem.descansar());
        assertEquals(PersonagemEstadoDescansado.getInstance(), personagem.getEstado());
    }

    @Test
    public void naoDeveDesmaiarPersonagemAtacando() {
        personagem.setEstado(PersonagemEstadoAtacando.getInstance());
        assertFalse(personagem.desmaiar());
    }


    @Test
    public void naoDeveAtacarPersonagemDefendendo() {
        personagem.setEstado(PersonagemEstadoDefendendo.getInstance());
        assertFalse(personagem.atacar());
    }

    @Test
    public void naoDeveDefenderPersonagemDefendendo() {
        personagem.setEstado(PersonagemEstadoDefendendo.getInstance());
        assertFalse(personagem.defender());
    }

    @Test
    public void deveDescansarPersonagemDefendendo() {
        personagem.setEstado(PersonagemEstadoDefendendo.getInstance());
        assertTrue(personagem.descansar());
        assertEquals(PersonagemEstadoDescansado.getInstance(), personagem.getEstado());
    }

    @Test
    public void deveDesmaiarPersonagemDefendendo() {
        personagem.setEstado(PersonagemEstadoDefendendo.getInstance());
        assertTrue(personagem.desmaiar());
        assertEquals(PersonagemEstadoDesmaiado.getInstance(), personagem.getEstado());
    }

    @Test
    public void naoDeveAtacarPersonagemDesmaiado() {
        personagem.setEstado(PersonagemEstadoDesmaiado.getInstance());
        assertFalse(personagem.atacar());
    }

    @Test
    public void naoDeveDefenderPersonagemDesmaiado() {
        personagem.setEstado(PersonagemEstadoDesmaiado.getInstance());
        assertFalse(personagem.defender());
    }

    @Test
    public void deveDescansarPersonagemDesmaiado() {
        personagem.setEstado(PersonagemEstadoDesmaiado.getInstance());
        assertTrue(personagem.descansar());
        assertEquals(PersonagemEstadoDescansado.getInstance(), personagem.getEstado());
    }

    @Test
    public void naoDeveDesmaiarPersonagemDesmaiado() {
        personagem.setEstado(PersonagemEstadoDesmaiado.getInstance());
        assertFalse(personagem.desmaiar());
    }
}