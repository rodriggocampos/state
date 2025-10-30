package org.example;

public class PersonagemEstadoDesmaiado extends PersonagemEstado {
    private static PersonagemEstadoDesmaiado instance = new PersonagemEstadoDesmaiado();

    private PersonagemEstadoDesmaiado() {}

    public static PersonagemEstadoDesmaiado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Desmaiado";
    }

    public boolean descansar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoDescansado.getInstance());
        return true;
    }
}
