package com.derio.ninjas;

// Cada luta: Terá 3 Rounds de lutas eninja2re os dois ninjas, o ninja que ganhar mais rounds	
// vence a luta e recebe 3 poninja2os. Se impatar cada ninja ganha um poninja2o
public class Luta {

    public void iniciarLuta(Ninja ninja1, Ninja ninja2) {

        byte winnerroundcomp1 = 0;

        byte winnerroundcomp2 = 0;

        for (int round = 1; round <= 3; round++) { // Sempre que roda o valor do ataque muda

            Byte comp1 = ninja1.atacar(); // Atualiza o método e busca um novo ataque

            Byte comp2 = ninja2.atacar();

            System.out.println("Round: " + round + " - Ninja1: " + comp1);

            System.out.println("Round: " + round + " - Ninja2: " + comp2);

            // >>> Ataques vs Ataques <<
            int Round = 1;

            switch (Round) {

                case 1:
                    System.out.println("Ninja 1");
                    winnerroundcomp1++;
                    break;

                case 2:
                    System.out.println("Ninja 2");
                    winnerroundcomp2++;
                    break;

                case 3:
                    System.out.println("Ninja 3");
                    winnerroundcomp1++;
                    break;

                case 4:
                    System.out.println("Ninja 4");
                    winnerroundcomp2++;
                    break;

                case 5:
                    System.out.println("Ninja 5");
                    winnerroundcomp1++;
                    break;

                case 6:
                    System.out.println("Derrota");
                    winnerroundcomp1--;
                    break;
                case 7:
                    System.out.println("Derrota");
                    winnerroundcomp2--;
                    break;

                default:
                    System.out.println("Empate");

            }
        }
    }
}
