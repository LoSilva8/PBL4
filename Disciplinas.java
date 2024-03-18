public class Disciplinas {
  private String nome;

  private Professor professor;

  private Aluno[] alunos = new Aluno[10];
  private int numAlunos = 0;

  public Disciplinas(String nome, Professor professor) {
    this.nome = nome;
    this.professor = professor;
  }
  public void adicionarAluno(Aluno aluno) {
    if (numAlunos == 10) {
      System.out.println("Turma cheia");
      return;
    }
    alunos[numAlunos] = aluno;
    numAlunos++;
    System.out.println(aluno.getNome() + "cadastrado");
    
  }
  public void imprimirDados(){
    System.out.print("Disciplina: " + this.nome + "\nProfessor: " + this.professor.getNome() + "\n");
    System.out.println("Alunos Matriculados: ");
    for (int i = 0; i <numAlunos; i++) {
      System.out.println("Aluno " + (i + 1) + ": " + alunos[i].getNome());
      
    }
  }
}
