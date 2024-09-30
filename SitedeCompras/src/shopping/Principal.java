package shopping;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner auxiliar = new Scanner(System.in);

        System.out.println("Digite o limite do seu cartão: ");
        double limite = auxiliar.nextDouble();

        Cartao cartao = new Cartao(limite);

    //While para realizar o looping da compra de produtos
        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite o nome do produto: ");
            String nome = auxiliar.next();

            System.out.println("Digite o valor do produto:");
            double valor = auxiliar.nextDouble();

            Produto produto = new Produto(nome, valor);
            boolean comprarealizada = cartao.lancaCompra(produto);

            if (comprarealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = auxiliar.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }
        //Painel final

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS; \n");

        for (Produto c : cartao.getCompras()) {
            System.out.println(c.getNome() + " - " + c.getValor());
        }
        System.out.println("\n***********************");

        //Limite
        System.out.println("\nSaldo do cartão: " + cartao.getLimite());
    }
}
