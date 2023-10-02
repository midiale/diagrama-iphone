package iphone;

/**
 * Classe para testar as saídas.
 */
public class Main {

  public static void main(String[] args) {
    IphoneCompleto aparelho = new IphoneCompleto();

    aparelho.selecionaMusica("Charlie Brown");
    aparelho.pausar();
    aparelho.tocar();
    
    aparelho.atender();
    aparelho.ligar(12345678);
    aparelho.iniciarCorreioVoz();
        
    aparelho.exibirPagina();
    aparelho.atualizarPagina();
    aparelho.adicionarNovaAba();
    
  }

}