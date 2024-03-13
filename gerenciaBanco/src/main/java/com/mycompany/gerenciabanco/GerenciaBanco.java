/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

/**
 *
 * @author umberto alves
 */

import java.util.Scanner;

public class GerenciaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        
        String nome, sobrenome, cpf;
        double valor;

        System.out.println("Bem-vindo ao Gerenciamento Bancario!");

        System.out.println("Por favor, informe seus dados:");
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.print("CPF: ");
        cpf = scanner.nextLine();

        conta.setNome(nome);
        conta.setSobrenome(sobrenome);
        conta.setCpf(cpf);

        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nSaldo atual: R$ " + conta.consultarSaldo());
                    break;
                case 2:
                    System.out.print("\nInforme o valor do deposito: R$ ");
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                    System.out.println("\nDeposito realizado com sucesso!");
                    break;
                case 3:
                    System.out.print("\nInforme o valor do saque: R$ ");
                    valor = scanner.nextDouble();
                    if (conta.sacar(valor)) {
                        System.out.println("\nSaque realizado com sucesso!");
                    } else {
                        System.out.println("\nSaldo insuficiente para realizar o saque.");
                    }
                    break;
                case 4:
                    System.out.println("\nEncerrando aplicacao...\n");
                    System.out.println("Obrigado por usar nossos serviços!");
                    break;
                default:
                    System.out.println("\nOpcao invalida. Por favor, escolha uma opcao valida.");
            }
        } while (opcao != 4);
        scanner.close();
    }
    public static void exibirMenu() {
        System.out.println("\n----- MENU -----");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Realizar deposito");
        System.out.println("3. Realizar saque");
        System.out.println("4. Encerrar");
    }
}

class ContaBancaria {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}