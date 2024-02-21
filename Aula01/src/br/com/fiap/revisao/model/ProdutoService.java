package br.com.fiap.revisao.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoService  extends  Produto{
    private List<Produto> listadeProdutos;

    public ProdutoService() {
        listadeProdutos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    Scanner scanner = new Scanner(System.in);
    public double cadastrarProduto(){

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = Double.parseDouble(scanner.nextLine());

        System.out.println("Gostaria de adicionar desconto nesse produto ? (sim/não)");
        String opcao = scanner.nextLine();


        // equalsIgnoreCase() para comparar ignorando maiúsculas/minúsculas
        if (opcao.equalsIgnoreCase("Sim")){
            System.out.println("Digite o nome do cupom fornecido:");
            String cupom = scanner.nextLine();

            if (cupom.equalsIgnoreCase("FIAP40")){
                preco *= 0.6;

            }
        }

        Produto novoProduto = new Produto(nome, preco);

        if (opcao.equals("sim")) {
            System.out.println("PRODUTO CADASTRADO COM SUCESSO!!");
            System.out.println("Nome do produto: " + novoProduto.getNome() + " || " + "Valor do produto com desconto: " + novoProduto.getPreco() + " R$");
        } else {
            System.out.println("PRODUTO CADASTRADO COM SUCESSO!!");
            System.out.println("Nome do produto: " + novoProduto.getNome() + " || " + "Valor do produto sem desconto: " + novoProduto.getPreco() + " R$");
        }

        listadeProdutos.add(novoProduto);

        return preco;
    }


    public void Listarprodutos(){
        if (listadeProdutos == null){
            System.out.println("A lista de produtos estpa vazia");
        }else{
            System.out.println("***Lista de produtos atualizada!!!***");
            for (Produto item : listadeProdutos){
                System.out.println("-Nome produto:" + item.getNome() +"||"+ "Valor: " + item.getPreco()+"R$");
            }
        }

    }
}
