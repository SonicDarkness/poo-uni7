public class Voo {
  private Data data;
  private int assentosLivres;
  private int capacidadeTotal;

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public int getAssentosLivres(){
    return assentosLivres;
  }

  public void setAssentosLivres(int assentos){
    if(assentos > 100)
      assentos = 100;
      this.assentosLivres = assentos;
  }

  public int getCapacidadeTotal(){
    return capacidadeTotal;
  }

  public void setCapacidadeTotal(int capacidade){
    this.capacidadeTotal = capacidade;
  }
}