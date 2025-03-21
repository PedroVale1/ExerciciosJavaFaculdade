public class Funcionario {
  private String nome;
  private double salario;
  private String cargo;

  public Funcionario(String nome, double salario, String cargo) {
    this.nome = nome;
    this.salario = salario;
    this.cargo = cargo;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public double getSalario() {
    return salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }
  public String getCargo() {
    return cargo;
  }
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public double calculoSalarioLiquido(){
    double imposto = salario * 0.15; // 15% de desconto suponhamos
    double beneficio = salario * 0.05; // e o beneficio seja de 5%
    return (salario - imposto) + beneficio;
  }

  public static void main(String[] args){

    Funcionario funcionario = new Funcionario("Pedro", 1500.33, "estagiário desenvolvimento");

    System.err.println("Nome: " + funcionario.getNome());
    System.err.println("Cargo: " + funcionario.getCargo());
    System.err.println("Salário Bruto: " + funcionario.getSalario());
    System.err.println("Salário Liquido: " +funcionario.calculoSalarioLiquido());
  }
}
