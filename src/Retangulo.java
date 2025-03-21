public class Retangulo {
  private double altura;
  private double largura;

  public Retangulo(double altura, double largura) {
    this.altura = altura;
    this.largura = largura;
  }

  public double calcularAreaRetangulo() {
    return largura * altura;
  }

  public double CalcularPerimetroRetangulo() {
    return 2 * (largura * altura);
  }

  public double getLargura() {
    return largura;
  }

  public void setLargura(double largura) {
    this.largura = largura;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public static void main(String[] args) {

    Retangulo retangulo = new Retangulo(5, 10);

    System.out.println("Largura: " + retangulo.getLargura());
    System.out.println("Altura: " + retangulo.getAltura());
    System.out.println("Área: " + retangulo.calcularAreaRetangulo());
    System.out.println("Perímetro: " + retangulo.CalcularPerimetroRetangulo());
  }
}
