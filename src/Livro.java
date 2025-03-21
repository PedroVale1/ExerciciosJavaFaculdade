public class Livro {
  private String titulo;
  private String autor;
  private int numeroPaginas;
  private boolean disponivel;

  public Livro(String titulo, String autor, int numeroPaginas) {
      this.titulo = titulo;
      this.autor = autor;
      this.numeroPaginas = numeroPaginas;
      this.disponivel = true;  // O livro começa disponível
  }

  public String getTitulo() {
      return titulo;
  }

  public void setTitulo(String titulo) {
      this.titulo = titulo;
  }

  public String getAutor() {
      return autor;
  }

  public void setAutor(String autor) {
      this.autor = autor;
  }

  public int getNumeroPaginas() {
      return numeroPaginas;
  }

  public void setNumeroPaginas(int numeroPaginas) {
      this.numeroPaginas = numeroPaginas;
  }

  public boolean isDisponivel() {
      return disponivel;
  }

  public void setDisponivel(boolean disponivel) {
      this.disponivel = disponivel;
  }

  public void emprestarLivro() {
      if (disponivel) {
          disponivel = false;
          System.out.println("O livro '" + titulo + "' foi emprestado com sucesso.");
      } else {
          System.out.println("O livro '" + titulo + "' não está disponível para empréstimo.");
      }
  }

  public void devolverLivro() {
      if (!disponivel) {
          disponivel = true;
          System.out.println("O livro '" + titulo + "' foi devolvido com sucesso.");
      } else {
          System.out.println("O livro '" + titulo + "' já está disponível.");
      }
  }

  public void verificarDisponibilidade() {
      if (disponivel) {
          System.out.println("O livro '" + titulo + "' está disponível.");
      } else {
          System.out.println("O livro '" + titulo + "' não está disponível.");
      }
  }

  public static void main(String[] args) {
      // Criando um objeto Livro
      Livro livro1 = new Livro("Java para Iniciantes", "João Silva", 300);

      // Verificando disponibilidade
      livro1.verificarDisponibilidade();

      // Emprestando o livro
      livro1.emprestarLivro();

      // Verificando disponibilidade novamente
      livro1.verificarDisponibilidade();

      // Devolvendo o livro
      livro1.devolverLivro();

      // Verificando a disponibilidade após a devolução
      livro1.verificarDisponibilidade();
  }
}
