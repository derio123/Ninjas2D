package com.derio.ninjas;

public abstract class Ninja {

    private final String nome;

    private int pontos;

    public Ninja(String nome) {

        this.nome = nome;

        this.pontos = 0;

    }

    public String getNome() {
        return this.nome;
    }

    public int getPontos() {
        return this.pontos;

    }

    public void addPontosVitoria() {
        this.pontos += 3;
    }

    public void addPontosEmpate() {
        this.pontos += 1;
    }

    public void addPontosDerrota() {
        this.pontos -= 3;
    }

    public abstract byte atacar();
}
