public class Professor{
  private String nome;
  private String codRh;

  public Professor(String nome, String codRh) {
    this.nome = nome;
    this.codRh = codRh;
  }

    public String getcodRh(){
      return codRh;
    }
    public void setcodRh(String codRh){
      this.codRh = codRh;
    
    }
    public String getNome(){
      return nome;
    }
    public void setnome(String nome){
      this.nome = nome;
  }
}
