package mx.com.animales;

public class Gato extends Animal {

  /**
   * Constructor que genera un Gato que extiede a {@link Animal}
   *
   * @see Animal
   */
  public Gato() {
    super();
  }

  /**
   * {@inheritDoc}
   * <br>
   * Se sobreescribe a {@link Animal#hacerSonido()} de la clase
   * {@link Animal} para que haga el sonido propio de un Gato.
   *
   * @see Animal#hacerSonido()
   */
  @Override
  public void hacerSonido() {
    System.out.println("Miuaaaau~~~🐱");
  }
}
