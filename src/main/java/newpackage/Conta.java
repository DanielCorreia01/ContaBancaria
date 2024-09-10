package newpackage;

import java.util.Scanner;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;

    Scanner sc = new Scanner(System.in);

    public Conta(int numero, String titular, double depInicial) {

        this.numero = numero;
        this.titular = titular;

        deposito(depInicial);

    }

    public Conta(int numero, String titular) {

        this.numero = numero;
        this.titular = titular;

    }

    public void saque(double quantia) {
        saldo -= quantia + 5.0f;
        System.out.println("Saque realizado com sucesso!");
    }

    public void deposito(double quantia) {
        saldo += quantia;
        System.out.println("Depósito realizado com sucesso!");

    }

    public void menu(Conta conta) {

        int codigo;

        do {

            System.out.println("MENU");
            System.out.println("1 - Realizar Saque");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Exibir Dados da Conta");
            System.out.println("4 - Sair da Conta");

            System.out.println("Digite a opção dejesada: ");
            codigo = sc.nextInt();

            switch (codigo) {

                case 1:

                    System.out.print("Informe o valor do saque: R$ ");
                    double valorSaque = sc.nextDouble();

                    conta.saque(valorSaque);

                    System.out.println(conta);

                    break;

                case 2:

                    System.out.print("Informe o valor do depósito: R$ ");
                    double valorDeposito = sc.nextDouble();

                    conta.deposito(valorDeposito);

                    System.out.println(conta);

                    break;

                case 3:
                    
                    System.out.println(conta);
                    
                    break;

                default:

                    System.out.println("Opção inválida!");

                    break;

            }

        } while (codigo != 4);

    }

    public String toString() {
        return "Conta: " + numero + "\n"
                + "Titular: " + titular + "\n"
                + "Saldo: R$ " + String.format("%.2f", saldo);
    }

    //Getters e Setters
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo += novoSaldo;
    }

}
