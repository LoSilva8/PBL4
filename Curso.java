public class Curso {
  private Professor professor;

  public Curso(Professor professor) { this.professor = professor;}
  
  public Professor getProfessor() { return professor; }

  public String getNomeProfessor() { return this.professor.getNome(); }
  
                                    
}
