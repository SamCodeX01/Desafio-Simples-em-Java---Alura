import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha um Exercício: ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                /*
                Crie um programa que solicite ao usuário digitar um número. Se o número for positivo,
                exiba "Número positivo", caso contrário, exiba "Número negativo".
                */
                System.out.print("Digite um número: ");
                int numero = sc.nextInt();

                int resto = numero % 2;

                if (resto == 0){
                 System.out.println(numero + " é Par");
                }else{
                  System.out.println(numero + " é Ímpar");
                }
            break;

            case 2:
                /*
                Peça ao usuário para inserir dois números inteiros.
                Compare os números e imprima uma mensagem indicando se são iguais,
                diferentes, o primeiro é maior ou o segundo é maior.
            */
                System.out.print("Digite um número: ");
                int n1 = sc.nextInt();
                System.out.print("Digite um número: ");
                int n2 = sc.nextInt();

                if(n1 == n2){
                    System.out.println("Números iguais");
                }
                else if(n1 > n2){
                    System.out.println("Primeiro número é maior que o segundo");
                    System.out.println("Números diferentes");
                }else if(n1 < n2){
                    System.out.println("Primeiro número é menor que o segundo");
                    System.out.println("Números diferentes");
                }else if(n2 > n1){
                    System.out.println("Segundo número é maior que o Primeiro");
                    System.out.println("Números diferentes");
                }else if(n2 < n1){
                    System.out.println("Segundo número é menor que o Primeiro");
                    System.out.println("Números diferentes");
                }
            break;

            case 3:
                /*
                Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
            */
            break;
            case 4:
                /*
                Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
            */
            break;
            case 5:
                /*
                Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
            */
            break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
/*
    Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
    Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
    Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
    Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
    Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
    Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
*/