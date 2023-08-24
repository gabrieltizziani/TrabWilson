package TrabWilson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======Bem Vindo a G&P Sports=======");
        System.out.println("1. Cadastrar produtos");
        System.out.println("2. Registrar entrada de produtos");
        System.out.println("3. Registrar saída de produtos");
        System.out.println("4. Verificar saldo de produtos");
        System.out.println("5. Sair");
        System.out.println("====================================");
        System.out.print("Escolha qual função:");
        int funcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.print("Digite o código do produto: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o nome do produto: ");
                String nome = scanner.nextLine();

                System.out.print("Digite a quantidade inicial no estoque: ");
                int quantidade = scanner.nextInt();

                Produto cadastrar = new Produto(codigo, nome, quantidade);
                System.out.println("Produto cadastrado com sucesso!\n");
                break;
            case 2:
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.\n");

            case 4:
                System.out.print("Digite o código do produto:");
                int codigoVerificar = scanner.nextInt();


        }

        }

}
