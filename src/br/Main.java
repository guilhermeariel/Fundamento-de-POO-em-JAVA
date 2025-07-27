package br;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Video[] v = new Video[5];
    v[0] = new Video("Aula 1 de POO");
    v[1] = new Video("Aula 2 de HTML 5");
    v[2] = new Video("Aula 3 de PHP");
    v[3] = new Video("Aula 4 de JS");
    v[4] = new Video("Aula 5 de CSS");
    System.out.println(v[0].toString());

    Usuario[] u = new Usuario[3];
    u[0] = new Usuario("Ariel", 20, "M", "WW");
    u[1] = new Usuario("Maria", 25, "F", "maria");
    u[2] = new Usuario("Joao", 30, "M", "joao");

    Visualizacao v = new Visualizacao();

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