class Carro{
  String marca;
  int ano;
  int distancia;
  int velocidade;

  void andar () {
    System.out.println("O carro da marca " + marca + " ano " + ano + " percorreu " + distancia + "km em uma velocidade de " + velocidade + "km/h"  );

    if (velocidade > 60)
    System.out.println("O carro " + marca + " Foi multado por ultrapassar o limite de velocidade da via, a velocidade detectada foi de " +velocidade);

      else
      System.out.println("O carro " + marca + " Estava dentro do limete de velocidade, detectada em " + velocidade + "km/h");

  }
}