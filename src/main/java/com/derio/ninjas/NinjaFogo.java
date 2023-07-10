package com.derio.ninjas;

import java.util.Random;

public class NinjaFogo extends Ninja {

    public NinjaFogo(String nome) {
        super(nome);
    }

    @Override
    public byte atacar() {
        Random gera = new Random();

        byte[] lista = new byte[20];
        byte random = (byte) gera.nextInt(lista.length);
        // {1, 1, 1, 1, 1, 1, 1, 1, 2 , 2, 2, 2,2 , 3, 3 ,3, 2, 2, 1 }
        for (byte i = 0; i < lista.length; i++) {
            if (i < 8) {
                lista[i] = 4;
            } else if (i <= 13) {
                lista[i] = 2;
            } else if (i <= 16) {
                lista[i] = 5;
            } else if (i <= 18) {
                lista[i] = 1;
            } else if (i == 19) {
                lista[i] = 3;
            }
        }
        byte golpe = lista[random];
        return golpe;
    }
    /*
	 * public static void main(String[] arg){
	 * 
	 * }
	 * // Gera um número aletória da lista
	 * System.out.println("Lista with random: " + lista[max] + " The end");
	 * 
	 * 
	 * for(int i=0; i<lista.length; i++){
	 * System.out.println(lista[i]);
	 * }
	 * }
     */
}
