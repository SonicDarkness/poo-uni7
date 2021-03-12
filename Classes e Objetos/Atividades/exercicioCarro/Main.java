class Main {
    public static void main(String[] args){
      Carro m1 = new Carro();
      m1.marca = "Fiat";
      m1.ano = 2005;
      m1.distancia = 50;
      m1.velocidade= 60;

      m1.andar();

      Carro m2 = new Carro();
      m2.marca = "Ford";
      m2.ano = 2010;
      m2.distancia = 60;
      m2.velocidade= 80;

      m2.andar();
      
    }



}