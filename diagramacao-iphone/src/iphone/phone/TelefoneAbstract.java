package iphone.phone;

public abstract class TelefoneAbstract implements TelefoneInterface {

  @Override
  public void atender() {
    System.out.println("Ligação atendida.");
  }
 
  @Override
  public void ligar(int numero) {
    System.out.println("Ligando para N°" + numero);
  } 

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Deixe seu recado...");
  }
}