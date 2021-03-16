class Data{ 
  private final int dia;
  private final int mes;
  private final int ano;


  public Data (int dia, int mes, int ano){
  this.dia = dia;
  this.mes = mes;
  this.ano = ano;
  }

  public int getDia(){
  return dia;
  }

  public int getMes(){
  return mes;
  }

  public int getAno(){
  return ano;
  }

  public String getDataFormatada(){
    return dia + "/" + mes + "/" + ano;
  }
  public String toString(){
    return getDataFormatada();
  }

  
}