package View;

import br.com.fiap.revisao.model.Calcado;
import br.com.fiap.revisao.model.Produto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Produto produto = new Produto(1L,150.99,"Fone");

        //System.out.println("Seu produto ficou em : "+  produto.calcularDescontoS(produto.getPreco(),20) +" "+ "Reais");

        //

        Calcado calcado = new Calcado(5L,500.20,"NIKE PRO",40);

        System.out.println("seu produto: "+ calcado.getNome()+" "+ "foi de"+ " "+ calcado.calcularDesconto("calcado40")+" "+ "Reais");



        Calcado calcado2 = new Calcado(8L,500.00,"Nike evolution",40);

        System.out.println("seu produto: "+ calcado2.getNome()+" "+ "foi de"+ " "+ calcado2.calcularDesconto("calcado40")+" "+ "Reais");


        // operador ternário
        // condicao? se verdadeiro : se for falso;
        // se o valor do produto for maior que 100, dizer que esta caro, se nao dizer que esta barato

        // USANDO O IF E ELSE
        if (produto.getPreco()>100){
            System.out.println("produto esta caro");
        }else {
            System.out.println("produto esta barrato");
        }

        // USANDO O TERNÁRIO

        System.out.println(produto.getPreco()> 100 ? "produto está caro" : "produto está barato ");
        System.out.println(calcado.getPreco()> 100 ? "produto está caro" : "produto está barato ");
        System.out.println(calcado2.getPreco()> 100 ? "produto está caro" : "produto está barato ");
    }
}