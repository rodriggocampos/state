package org.example;

public class Personagem {
    private String nome;
    private PersonagemEstado estado;

    public Personagem() {
        this.estado = PersonagemEstadoDescansado.getInstance();
    }

    public void setEstado(PersonagemEstado estado) {
        this.estado = estado;
    }

    public boolean atacar() {
        return estado.atacar(this);
    }

    public boolean defender() {
        return estado.defender(this);
    }

    public boolean descansar() {
        return estado.descansar(this);
    }

    public boolean desmaiar() {
        return estado.desmaiar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PersonagemEstado getEstado(){
        return estado;
    }
}