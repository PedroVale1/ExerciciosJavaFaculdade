public class Aluno {
  private String nome;
  private String matricula;
  private double[] notas;

  public Aluno(String nome, String Matricula, double[] notas) {
    this.nome = nome;
    this.matricula = matricula;
    this.notas = notas;
  }

  public double calcularMediaAlunos(){
    double soma = 0;
    for(double nota: notas){
      soma += nota;
    }
    return soma/notas.length;
  }

  public String verificarSituacao(){
    double media = calcularMediaAlunos();
    return media>= 7.0 ? "aprovado" : "reprovado";
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public double[] getNotas() {
    return notas;
  }
  public void setNotas(double[] notas) {
    this.notas = notas;
  }

  public static void main(String[] args){

    double[] notas = {8.0, 7.0 ,6.0};
    Aluno aluno = new Aluno("João silva", "20230105", notas);

    System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Média: " + aluno.calcularMediaAlunos());
        System.out.println("Situação: " + aluno.verificarSituacao());
  }
}
