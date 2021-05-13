package desafio8exer1;

import java.text.DecimalFormat;

/**
 *
 * @author Jeferson
 */
public class Desafio8Exer1 {

    /*  Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé 
    tem 1,10 metro e cresce 3 centímetros por ano. Construa um algoritmo 
    que calcule e imprima quantos anos serão necessários para que Zé 
    seja maior que Chico.*/
    public static void main(String[] args) {
        double contChico, contZe, anos;
        contChico = 1.50;
        contZe = 1.10;
        anos = 0;
        DecimalFormat f = new DecimalFormat("0.00");
        while (contChico >= contZe) {
            System.out.println("Zé terminou em " + f.format(contZe));
            System.out.println("Chico terminou em " + f.format(contChico));
            contChico = contChico + 0.02;
            contZe = contZe + 0.03;
            anos++;

        }//fim do loop
        System.out.println("zé levou " + anos + " anos para ser"
                + " maior que Chico");

        System.out.println("Zé terminou em " + f.format(contZe));
        System.out.println("Chico terminou em " + f.format(contChico));
    }

}
