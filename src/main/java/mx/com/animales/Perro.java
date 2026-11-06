package mx.com.animales;

public class Perro extends Animal {

  /**
   * Constructor que genera un Perro que extiede a {@link Animal}
   *
   * @see Animal
   */
  public Perro() {
    super();
  }

  /**
   * {@inheritDoc}
   * <br>
   * Se sobreescribe a {@link Animal#hacerSonido()} de la clase
   * {@link Animal} para que haga el sonido propio de un Perro.
   *
   * @see Animal#hacerSonido()
   */
  @Override
  public void hacerSonido() {
    System.out.println("Arrfff~~~🐶");
  }
}
