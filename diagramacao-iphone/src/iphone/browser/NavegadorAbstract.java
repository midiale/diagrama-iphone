package iphone.browser;

public abstract class NavegadorAbstract implements NavegadorInterface {

  @Override
  public void adicionarNovaAba() {
    System.out.println("Página adicionada.");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Página exibida.");
 } 

  @Override
  public void atualizarPagina() {
    System.out.println("Página atualizada.");
  }
}
