package org.example;

public class PersonagemEstadoDefendendo extends PersonagemEstado {
    private static PersonagemEstadoDefendendo instance = new PersonagemEstadoDefendendo();

    private PersonagemEstadoDefendendo() {}

    public static PersonagemEstadoDefendendo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Defendendo";
    }

    public boolean descansar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoDescansado.getInstance());
        return true;
    }

    public boolean desmaiar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoDesmaiado.getInstance());
        return true;
    }
}
