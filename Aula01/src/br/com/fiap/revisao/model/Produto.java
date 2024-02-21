package br.com.fiap.revisao.model;

public class Produto {

    private  Long id;
    private String nome;
    private Double preco;



    public Produto(){
        super();
    }


    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //new Produto(10, 100.0, "Churros");
    public Produto(Long id, Double preco, String nome){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }


    public Produto(double preco) {
        this.preco = preco;
    }

    // Método para calcular desconto
    public double calcularDesconto(String cupom) {
        if (cupom != null && cupom.equals("FIAP40")) {
            return calcularDescontoS(40);
        } else {
            return preco;
        }
    }

    // Método para calcular desconto com base na porcentagem
    public double calcularDescontoS(double porcentagem) {
        return preco - (preco * porcentagem / 100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

}
