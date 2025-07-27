package br;

public class Video implements AcoesVideo {
  private String titulo;
  private int avaliacao;
  private int views;
  private int curtidas;
  private boolean reproduzindo;

  //COSTRUTOR
  public Video(String titulo) {
    this.titulo = titulo;
    this.avaliacao = 1;
    this.views = 0;
    this.curtidas = 0;
    this.reproduzindo = false;

  }

  //GETTERS SETTERS
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public float getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(int avaliacao) {
    this.avaliacao = avaliacao;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public int getCurtidas() {
    return curtidas;
  }

  public void setCurtidas(int curtidas) {
    this.curtidas = curtidas;
  }

  public boolean isReproduzindo() {
    return reproduzindo;
  }

  public void setReproduzindo(boolean reproduzindo) {
    this.reproduzindo = reproduzindo;
  }

  //Metodos ABS
  @Override
  public void play() {
    this.reproduzindo = true;
    this.views++;

  }

@Override
  public void pause() {
    this.reproduzindo = false;
    this.views--;

  }

  @Override
  public void like() {
    this.curtidas++;
    this.avaliacao++;

  }

  @Override
  public String toString() {
    return "Video{" +
        "titulo='" + titulo + '\'' +
        ", avaliacao=" + avaliacao +
        ", views=" + views +
        ", curtidas=" + curtidas +
        ", reproduzindo=" + reproduzindo +
        '}';
  }
}
