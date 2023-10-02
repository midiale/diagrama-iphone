package iphone;

import iphone.browser.NavegadorInterface;
import iphone.ipod.ReproducaoInterface;
import iphone.phone.TelefoneInterface;

/**
 * Classe com Herança Múltipla.
 */
public class IphoneCompleto implements ReproducaoInterface, TelefoneInterface, NavegadorInterface {


  @Override
  public void pausar() {
    System.out.println("Pausando a música.");
  }
  
  @Override
  public void tocar() {
    System.out.println("Ouvindo a música.");
  }

  @Override
  public void selecionaMusica(String nome) {
    System.out.println(nome + " selecionada");
  }

  @Override
  public void ligar(int numero) {
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo ligação.");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Correio de voz.");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo a página.");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando página.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página.");
  }
}
