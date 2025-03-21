public class Produto {
  private String nome;
  private double preco;
  public int quantidadeEmEstoque;

  public Produto(String nome, double preco, int quantidadeEmEstoque) {
    this.nome = nome;
    this.preco = preco;
    this.quantidadeEmEstoque = quantidadeEmEstoque;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public double getPreco() {
    return preco;
  }
  public void setPreco(double preco) {
    this.preco = preco;
  }
  public int getQuantidadeEmEstoque() {
    return quantidadeEmEstoque;
  }
  public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
    this.quantidadeEmEstoque = quantidadeEmEstoque;
  }

  public double calcularValorTotalEstoque(){
    return preco * quantidadeEmEstoque;
  }

  public boolean estaDisponivel(){
    return quantidadeEmEstoque >0;
  }

  public static void main(String[]args){
    Produto produto = new Produto("café", 15.40, 5);

    System.out.println("Produto: " + produto.getNome());
    System.out.println("Preço: R$ " + produto.getPreco());
    System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
    System.out.println("Valor Total em Estoque: R$ " + produto.calcularValorTotalEstoque());
    System.out.println("Produto disponível? " + (produto.estaDisponivel() ? "Sim" : "Não"));
  }
}
