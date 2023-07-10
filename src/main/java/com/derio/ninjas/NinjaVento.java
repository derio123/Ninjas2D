package com.derio.ninjas;

import java.util.Random;

public class NinjaVento extends Ninja {

    public NinjaVento(String nome) {
        super(nome);
    }

    @Override
    public byte atacar() {

        Random gera = new Random();

        byte[] lista = new byte[20];

        byte random = (byte) gera.nextInt(lista.length);

        for (byte i = 0; i < lista.length; i++) {

            if (i < 8) {

                lista[i] = 1;

            } else if (i <= 13) {

                lista[i] = 3;

            } else if (i <= 16) {

                lista[i] = 4;

            } else if (i <= 18) {

                lista[i] = 2;

            } else if (i == 19) {

                lista[i] = 5;

            }
        }

        byte golpe = lista[random];

        return golpe;
    }
}
