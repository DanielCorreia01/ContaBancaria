package newpackage1;

import newpackage.Conta;

public class ContaEspecial extends Conta {

    private double limiteEmprestimo;

    public ContaEspecial(int numero, String titular, double depInicial, double limiteEmprestimo) {
        super(numero, titular, depInicial);
    }

    public ContaEspecial(int numero, String titular, double limiteEmprestimo) {
        super(numero, titular);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double quantia) {

        setSaldo(quantia - 10.0f);

    }

}
