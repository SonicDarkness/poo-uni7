class Main {
    public static void main(String[] args){
      Carro m1 = new Carro();
      m1.setMarca("Fiat");
      m1.setAno(2005);
      m1.setDistancia(50);
      m1.setVelocidade(60);
      m1.andar();

      Carro m2 = new Carro();
      m2.setMarca("Ford");
      m2.setAno(2010);
      m2.setDistancia(60);
      m2.setVelocidade(80);
      m2.andar();
    }



}