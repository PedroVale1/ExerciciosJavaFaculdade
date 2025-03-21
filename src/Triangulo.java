public class Triangulo {
  private double lado1;
  private double lado2;
  private double lado3;

  public Triangulo(double lado1, double lado2, double lado3) {
      this.lado1 = lado1;
      this.lado2 = lado2;
      this.lado3 = lado3;
  }

  // Verifica se os lados formam um triângulo válido
  public boolean verificarTrianguloValido() {
      return (lado1 + lado2 > lado3) &&
             (lado1 + lado3 > lado2) &&
             (lado2 + lado3 > lado1);
  }

  // Calcula a área usando a Fórmula de Heron
  public double calcularAreaTriangulo() {
      if (!verificarTrianguloValido()) {
          throw new IllegalArgumentException("Os lados informados não formam um triângulo válido.");
      }

      double semiPerimetro = (lado1 + lado2 + lado3) / 2;
      return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
  }

  public static void main(String[] args) {
      Triangulo triangulo = new Triangulo(3, 4, 5);

      System.out.println("Triângulo válido? " + (triangulo.verificarTrianguloValido() ? "Sim" : "Não"));

      if (triangulo.verificarTrianguloValido()) {
          System.out.println("Área do triângulo: " + triangulo.calcularAreaTriangulo());
      }
  }
}
