public class Carro {
  private String marca;
  private String modelo;
  private double velocidadeAtual;

  public Carro(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidadeAtual = 0;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getVelocidadeAtual() {
    return velocidadeAtual;
  }

  public void acelerar(double velocidadeAcelerada) {
    if (velocidadeAcelerada > 0) {
      velocidadeAtual += velocidadeAcelerada;
    } else {
      System.out.println("Aceleração inválida.");
    }
  }

  public void frear(double velocidadeReduzida) {
    if (velocidadeReduzida > 0) {
      velocidadeAtual -= velocidadeReduzida;
      if (velocidadeAtual < 0) {
        velocidadeAtual = 0;
      }
    } else {
      System.out.println("Velocidade de frenagem inválida.");
    }
  }

  public void exibirVelocidade() {
    System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
  }
  public static void main(String[] args) {
    Carro carro = new Carro("Toyota", "Corolla");

    carro.acelerar(50);
    carro.exibirVelocidade(); // Deve exibir 50 km/h

    carro.frear(20);
    carro.exibirVelocidade(); // Deve exibir 30 km/h

    carro.frear(40); // Teste de frenagem além da velocidade atual
    carro.exibirVelocidade(); // Deve exibir 0 km/h
}
}
