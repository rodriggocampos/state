package org.example;

public class PersonagemEstadoDescansado extends PersonagemEstado {
    private static PersonagemEstadoDescansado instance = new PersonagemEstadoDescansado();

    private PersonagemEstadoDescansado() {}

    public static PersonagemEstadoDescansado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Descansando";
    }

    public boolean atacar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoAtacando.getInstance());
        return true;
    }

    public boolean desmaiar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoDesmaiado.getInstance());
        return true;
    }
}
