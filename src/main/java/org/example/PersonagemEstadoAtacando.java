package org.example;

public class PersonagemEstadoAtacando extends PersonagemEstado {
    private static PersonagemEstadoAtacando instance = new PersonagemEstadoAtacando();

    private PersonagemEstadoAtacando() {}

    public static PersonagemEstadoAtacando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Atacando";
    }

    public boolean defender(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoDefendendo.getInstance());
        return true;
    }

    public boolean descansar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoDescansado.getInstance());
        return true;
    }
}
