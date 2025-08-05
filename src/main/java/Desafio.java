import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("\n1. NÚMERO POSITIVO ou NEGATIVO");
            System.out.println("2. COMPARAÇÃO: NÚMEROS IGUAIS, DIFERENTES,MAIOR e MENOR");
            System.out.println("3. CÁLCULO DE ÁREA");
            System.out.println("4. PAR ou ÍMPAR");
            System.out.println("5. CÁLCULO FATORIAL");
            System.out.print("\nEscolha um Exercício ou digite 0 para Sair: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo do da aplicação...");
                    System.exit(0);

                case 1:
                    System.out.println("*****NÚMERO POSITIVO ou NEGATIVO****");
                /*
                Crie um programa que solicite ao usuário digitar um número. Se o número for positivo,
                exiba "Número positivo", caso contrário, exiba "Número negativo".
                */
                    System.out.print("Digite um número: ");
                    int numero = sc.nextInt();

                    if (numero > 0) {
                        System.out.println(numero + " é POSITIVO");
                    } else if (numero < 0) {
                        System.out.println(numero + " é NEGATIVO");
                    }
                    break;

                case 2:
                    System.out.println("*****COMPARAÇÃO: NÚMEROS IGUAIS, DIFERENTES,MAIOR e MENOR****");
                /*
                Peça ao usuário para inserir dois números inteiros.
                Compare os números e imprima uma mensagem indicando se são iguais,
                diferentes, o primeiro é maior ou o segundo é maior.
                 */
                    System.out.print("Digite um número: ");
                    int n1 = sc.nextInt();
                    System.out.print("Digite um número: ");
                    int n2 = sc.nextInt();

                    if (n1 == n2) {
                        System.out.println("Números iguais");
                    } else if (n1 > n2) {
                        System.out.println("Primeiro número é maior que o segundo");
                        System.out.println("São Números diferentes");
                    } else if (n1 < n2) {
                        System.out.println("Primeiro número é menor que o segundo");
                        System.out.println("São Números diferentes");
                    } else if (n2 > n1) {
                        System.out.println("Segundo número é maior que o Primeiro");
                        System.out.println("São Números diferentes");
                    } else if (n2 < n1) {
                        System.out.println("Segundo número é menor que o Primeiro");
                        System.out.println("São Números diferentes");
                    }
                    break;

                case 3:
                /*
                Crie um menu que oferece duas opções ao usuário:
                "1. Calcular área do quadrado" e "2. Calcular área do círculo".
                Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
                 */
                    System.out.println(" \"1. Calcular área do quadrado.\" ");
                    System.out.println(" \"2. Calcular área do círculo.\" ");
                    System.out.print("Escolha uma opção: ");
                    int op = sc.nextInt();

                    if(op == 1){
                        System.out.println(" \"*****Calcular área do quadrado*****\" ");
                        System.out.print("Digite o lado 1 do quadrado: ");
                        float lado1 = sc.nextFloat();
                        System.out.print("Digite o lado 2 do quadrado: ");
                        float lado2 = sc.nextFloat();
                        float areaQuadrado = lado1*lado2;
                        System.out.println("A área do quadrado é: " + areaQuadrado);
                    } else if (op == 2) {
                        System.out.println(" \"**Você escolheu: Calcular área do Circulo**\" ");
                        System.out.print(" \"Digite o raio do circulo:\" ");
                        float raio = sc.nextFloat();

                        double perimetro = 2 * Math.PI * raio;

                        System.out.println("O perímetro do círculo é: " + perimetro);
                    }
                    else{
                        System.out.println("Escolha a opção 1 ou 2!");
                    }
                    break;

                case 4:
                /*
                Crie um programa que solicite ao usuário a entrada de um número inteiro.
                Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
                */
                    System.out.print("Digite um número: ");
                    int n = sc.nextInt();

                    int resto = n % 2;

                    if (resto == 0) {
                        System.out.println(n + " é Par");
                    } else {
                        System.out.println(n + " é Ímpar");
                    }
                    break;

                case 5:
                /*
                Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
                */
                    System.out.print("Digite um número a ser calculado o fatorial: ");
                    int numFatorial = sc.nextInt();

                    for(int i = 0; i < numFatorial; i++){
                        int x = numFatorial*i;
                        System.out.println(x);
                    }

                break;

                default:
                    System.out.println("Opção inválida");
            }
        }
            while(true);
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