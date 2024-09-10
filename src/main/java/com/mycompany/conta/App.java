package com.mycompany.conta;

import java.util.Scanner;
import newpackage.Conta;
import newpackage1.ContaEspecial;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        Conta conta = null;
        int codigo;

        do {

            System.out.println("TELA INICIAL");
            System.out.println("1 - Criar Conta Corrente");
            System.out.println("2 - Criar Conta Especial");
            System.out.println("3 - Encerrar programa");

            System.out.println("Digite a opção dejesada: ");
            codigo = sc.nextInt();

            switch (codigo) {

                case 1:

                    conta.menu(conta);

                    break;

                case 2:

                    

                    break;

                case 3:

                    break;

                default:

                    System.out.println("Opção inválida!");

                    break;

            }

        } while (codigo != 3);
        
    

   

    sc.close ();

    }
}
