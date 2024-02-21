package View;

import br.com.fiap.revisao.model.Produto;
import br.com.fiap.revisao.model.ProdutoService;

import java.util.Scanner;

public class TesteMiniMenu {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ProdutoService produtoService = new ProdutoService();

        System.out.println("Boas vindas");
        try {
            int opcao = 0;
            while (opcao != 5){
                exibirMenu();
                String textoDigitado = new Scanner(System.in).nextLine();
                opcao = Integer.parseInt(textoDigitado);
                switch(opcao){
                    case 1 -> produtoService.cadastrarProduto();
                    case 2 -> produtoService.Listarprodutos();
                    case 3 ->  System.exit(0);

                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    private static void exibirMenu() {
        System.out.println("\nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:");
        System.out.println("1 -> Cadastrar Produto");
        System.out.println("2 -> Listar produtos");
        System.out.println("3 -> sair do programa");
    }



}
