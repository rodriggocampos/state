package org.example;

public abstract class PersonagemEstado {
    public abstract String getEstado();

    public boolean atacar(Personagem personagem) {
        return false;
    }

    public boolean defender(Personagem personagem) {
        return false;
    }

    public boolean descansar(Personagem personagem) {
        return false;
    }

    public boolean desmaiar(Personagem personagem) {
        return false;
    }
}
