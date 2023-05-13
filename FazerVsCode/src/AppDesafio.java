import java.util.Scanner;

import javax.sound.midi.MetaMessage;

public class App {
  // Comentário

  public static void funcao_teste() {
    // Biblioteca para entrada de dados
    Scanner ler = new Scanner(System.in);

    // variável local
    float massa = 0;
    float altura = 0;
    float imc = 0;

    System.out.println("Digite a sua Massa: " + massa);
    ler.nextFloat();

    System.out.println("Digite a sua altura " + altura);
    ler.nextFloat();

    System.out.println("Esse e o seu IMC: " + imc);
    ler.nextFloat();
    System.out.println(imc == massa / altura);
    ler.close();
  }

  public static void main(String[] args) throws Exception {
    Corpo_Humano c1 = new Corpo_Humano(10, 5);
    c1.SetMassa(10);
    c1.Setaltura(5);
    System.out.println("Esse e o seu Imc: " + c1.Getimc());
  }
}
