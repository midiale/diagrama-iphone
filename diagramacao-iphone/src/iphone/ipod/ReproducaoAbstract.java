package iphone.ipod;

public abstract class ReproducaoAbstract implements ReproducaoInterface {

  protected String nome;

  public ReproducaoAbstract(String nome) {
    this.nome = nome;
  }

  @Override
  public void tocar() {
    System.out.println("tocando " + nome);
  }

  @Override
  public void pausar() {
    System.out.println(nome + " em pausa!");
  }

  @Override
  public void selecionaMusica(String nome) {
    this.nome = nome;
    System.out.println(nome + " selecionada");
  }

  public String getNome() {
    return nome;
  }
}
