class Carro{
  private String marca;
  private int ano;
  private int distancia;
  private int velocidade;

  public String getMarca(){
    return marca;
  }

  public int getAno(){
    return ano;
  }

  public int getDistancia(){
    return distancia;
  }

  public int getVelocidade(){
    return velocidade;
  }

  public void setMarca(String novaMarca){
    marca = novaMarca;
  }

  public void setAno(int novoAno){
    ano = novoAno;
  }

  public void setDistancia(int novaDistancia){
    distancia = novaDistancia;
  }

  public void setVelocidade(int novaVelocidade){
    velocidade = novaVelocidade;
  }



  void andar () {
    System.out.println("O carro da marca " + marca + " ano " + ano + " percorreu " + distancia + "km em uma velocidade de " + velocidade + "km/h"  );

    if (velocidade > 60)
    System.out.println("O carro " + marca + " Foi multado por ultrapassar o limite de velocidade da via, a velocidade detectada foi de " +velocidade);

      else
      System.out.println("O carro " + marca + " Estava dentro do limete de velocidade, detectada em " + velocidade + "km/h");

  }
}