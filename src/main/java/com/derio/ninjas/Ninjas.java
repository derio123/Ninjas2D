package com.derio.ninjas;

/**
 * @author derio123
 */
/**
 * Golpe: Probabilidade Fogo 40% Vento 25% Raio 17% Terra 13% Água 5%
 *
 * 1 = Terra 2 = Vento 3 = Água 4 = Fogo 5 = Raio
 */
public class Ninjas {

    public static void main(String[] args) {
        String nome = "";

        NinjaAgua agua = new NinjaAgua(nome);
        NinjaFogo fogo = new NinjaFogo(nome);
        NinjaRaio raio = new NinjaRaio(nome);
        NinjaTerra terra = new NinjaTerra(nome);
        NinjaVento vento = new NinjaVento(nome);

        Luta lute = new Luta();

        System.out.println("Luta 1");
        lute.iniciarLuta(agua, vento);

        System.out.println("Luta 2");
        lute.iniciarLuta(fogo, vento);

        System.out.println("Luta 3");
        lute.iniciarLuta(terra, vento);

        System.out.println("Luta 4");
        lute.iniciarLuta(raio, vento);

        System.out.println("1º - " + terra + " Pontos: " + terra.getPontos());
        System.out.println("2º - " + fogo + " Pontos: " + fogo.getPontos());
        System.out.println("3º - " + agua + " Pontos: " + agua.getPontos());

    }

}
