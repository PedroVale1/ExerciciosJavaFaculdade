public class ContaBancaria {
  private String numeroDaConta;
  private String nomeDoTitular;
  private double saldo;

  public ContaBancaria(String numeroDaConta, String nomeDoTitular, double saldoInicial) {
    this.numeroDaConta = numeroDaConta;
    this.nomeDoTitular = nomeDoTitular;
    this.saldo = saldoInicial;
  }

  public void realizarDeposito(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.println("Depósito de R$: " + valor + "realizado com sucesso.");
    } else {
      System.out.println("Valor inválido para depósito.");
    }
  }

  public boolean realizarSaque(double valor) {
    if (valor > 0 && valor <= saldo) {
      saldo -= valor;
      System.out.println("Saque de R$: " + valor + "Realizado com sucesso.");
      return true;
    } else {
      System.out.println("Saldo insuficiente ou valor inválido.");
      return false;
    }
  }

  public void exibirSaldo() {
    System.out.println("Saldo atual: R$" + saldo);
  }

  // Getters e Setters
  public String getNumeroConta() {
    return numeroDaConta;
  }

  public String getTitular() {
    return nomeDoTitular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setTitular(String titular) {
    this.nomeDoTitular = nomeDoTitular;
  }

  public static void main(String[] args) {

    ContaBancaria conta = new ContaBancaria("12345-6", "João Silva", 1000.0);

    conta.exibirSaldo();


    conta.realizarDeposito(500.0);
    conta.realizarSaque(200.0);
    conta.realizarSaque(2000.0); // Tentando sacar um valor maior que o saldo

    conta.exibirSaldo();
  }
}
