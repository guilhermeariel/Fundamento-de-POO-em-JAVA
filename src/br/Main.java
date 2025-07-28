package br;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Video[] v = new Video[5];
    v[0] = new Video("Aula 1 de POO");
    v[1] = new Video("Aula 2 de HTML 5");
    v[2] = new Video("Aula 3 de PHP");

    Usuario[] u = new Usuario[2];
    u[0] = new Usuario("Ariel", 20, "M", "WW");
    u[1] = new Usuario("Maria", 25, "F", "maria");

    Visualizacao[] vi = new Visualizacao[5];
    vi[0] = new Visualizacao(u[0], v[2]);
    vi[0].avaliar();
    System.out.println(vi[0].toString());

    vi[1] = new Visualizacao(u[0], v[1]);
    vi[0].avaliar(93.0f);
    System.out.println(vi[1].toString());

//    System.out.println("Videos\n--------------------------");
//    System.out.println(v[0].toString());
//    System.out.println(v[1].toString());
//    System.out.println(v[2].toString());
//    System.out.println(">\nUsuarios\n--------------------------");
//    //Precisou do to STRING
//    System.out.println(u[0].toString());
//    System.out.println(u[1].toString());





  }
}