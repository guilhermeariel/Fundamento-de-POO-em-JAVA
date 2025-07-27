package br;

public class Usuario extends Pessoa {
  private String login;
  private int totalAssistindo;

  // CONSTRUTOR
  public Usuario(String nome, int idade, String sexo, String login) {
    super(nome, idade, sexo);
    this.totalAssistindo = 0;
    this.login = login;
  }

  // GETTER SETTES
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;

  }

  public int getTotalAssistindo() {
    return totalAssistindo;
  }

  public void setTotalAssistindo(int totalAssistindo) {
    this.totalAssistindo = totalAssistindo;
    this.experiencia++;
  }

  // Metodos publicos
  public void viuMaisUm(){

  }

  @Override
  public String toString() {
    return "Usuario{" + super.toString()+
        "login='" + login + '\'' +
        ", totalAssistindo=" + totalAssistindo +
        '}';
  }
}
