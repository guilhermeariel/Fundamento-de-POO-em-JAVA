package br;

public class Visualizacao {
  private Usuario espectador;
  private Video filme;

  //CONSTRUTOR
  public Visualizacao(Usuario espectador, Video filme) {
    this.espectador = espectador;
    this.filme = filme;
    this.espectador.setTotalAssistindo(this.espectador.getTotalAssistindo()+1);
    this.filme.setViews(this.filme.getViews()+1);

  }

  //GETTER E SETTER
  public Usuario getEspectador() {
    return espectador;
  }

  public void setEspectador(Usuario espectador) {
    this.espectador = espectador;
  }

  public Video getFilme() {
    return filme;
  }

  public void setFilme(Video filme) {
    this.filme = filme;
  }

  // METODOS PUBLICOS
  public void avaliar(){
    this.filme.setAvaliacao(5);

  }
  public void avaliar(int nota){
    this.filme.setAvaliacao(nota);
  }
  public void avaliar(float porc){
    int tot = 0;
    if(porc <= 20) {
      tot = 3;
    } else if(porc <= 40) {
      tot = 5;
    } else if(porc <= 60) {
      tot = 8;
    } else if(porc <= 80) {
      tot = 10;
    } else {
      tot = 15;
    }
    this.filme.setAvaliacao(tot);


  }

}
