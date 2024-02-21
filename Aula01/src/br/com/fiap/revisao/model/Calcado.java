package br.com.fiap.revisao.model;

public class Calcado extends Produto {

    private int tamanho;

    public Calcado() {}

    public Calcado(Long id, Double preco, String nome,int tamanho) {
        super(id, preco, nome);
        this.tamanho = tamanho;
    }

    public double calcularDesconto(String cupom) {
        if(cupom.equals("calcado40")){
            return getPreco() * 0.6;
        }else {
            //chamar o método do pai(Produto) usando o super
            return super.calcularDesconto(cupom);
        }

    }



    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
