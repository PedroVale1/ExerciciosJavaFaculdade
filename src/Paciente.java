import java.lang.reflect.Array;
import java.util.ArrayList;

public class Paciente {
  private String nome;
  private int idade;
  private ArrayList<String> historicoConsultas;

  public Paciente(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    this.historicoConsultas = new ArrayList<>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public ArrayList<String> getHistoricoConsultas() {
    return historicoConsultas;
  }

  public void adicionarNovaConsulta(String consulta) {
    historicoConsultas.add(consulta);
    System.out.println("Consulta adiciona" + consulta);
  }

  public void exibirConsultasRealizadas() {
    System.out.println("Histórico de consultas do paciente " + nome + ":");
    if (historicoConsultas.isEmpty()) {
        System.out.println("Nenhuma consulta realizada.");
    } else {
        for (String consulta : historicoConsultas) {
            System.out.println("- " + consulta);
        }
    }
  }

  public static void main(String[] args) {
    // Criando um paciente
    Paciente paciente = new Paciente("Pedro", 25);

    // Adicionando consultas
    paciente.adicionarNovaConsulta("Consulta Cardiologista - 12/03/2024");
    paciente.adicionarNovaConsulta("Exame de Sangue - 25/03/2024");

    // Exibindo histórico
    paciente.exibirConsultasRealizadas();
}
}
