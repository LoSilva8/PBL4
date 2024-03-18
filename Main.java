public class Main {
  public static void main(String[] args) {
    Professor professor = new Professor("Ferdinando", "123456789");

    Disciplinas disciplina = new Disciplinas("POO", professor);

    Aluno aluno = new Aluno("João", "9876543211");

    disciplina.adicionarAluno(aluno);
    disciplina.adicionarAluno(aluno);
    disciplina.adicionarAluno(aluno);
    disciplina.adicionarAluno(aluno);
    disciplina.adicionarAluno(aluno);
    disciplina.adicionarAluno(aluno);
    disciplina.adicionarAluno(aluno);
    disciplina.adicionarAluno(aluno);
    disciplina.adicionarAluno(aluno);
    disciplina.adicionarAluno(aluno);
    disciplina.adicionarAluno(aluno);
    


    Curso curso = new Curso(new Professor("Ligia", "98765432122"));

    
    System.out.println("Professor do curso: " + professor.getNome());
    disciplina.imprimirDados();

    System.out.println("Professor main: " + professor.getNome());

    System.out.println("Nome do professor do curso: " + curso.getNomeProfessor());

  }
}
