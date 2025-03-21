public class Circulo {
  private double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  public double calcularAreaCirculo() {
    return Math.PI * Math.pow(raio, 2);
  }

  public double CalcularPerimetroCirculo() {
    return 2 * Math.PI * raio;
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio() {
    this.raio = raio;
  }

  public static void main(String[] args) {
    Circulo c = new Circulo(5);

    System.out.println("Raio: " + c.getRaio());
    System.out.println("Área: " + c.calcularAreaCirculo());
    System.out.println("Perímetro: " + c.CalcularPerimetroCirculo());

  }

}
