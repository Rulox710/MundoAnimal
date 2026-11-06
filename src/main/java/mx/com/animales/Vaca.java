package mx.com.animales;

public class Vaca extends Animal {

  /**
   * Constructor que genera una Vaca que extiede a {@link Animal}
   *
   * @see Animal
   */
  public Vaca() {
    super();
  }

  /**
   * {@inheritDoc}
   * <br>
   * Se sobreescribe a {@link Animal#hacerSonido()} de la clase
   * {@link Animal} para que haga el sonido propio de una Vaca.
   *
   * @see Animal#hacerSonido()
   */
  @Override
  public void hacerSonido() {
    System.out.println("Muuuuu~~~🐮");
  }

  /**
   * {@inheritDoc}
   * <br>
   * Se implementa el método para demostrar que la vaca se mueve.
   */
  @Override
  public void moverse() {
    System.out.println(
      "La vaca mueve sus 4 patas cuando camina a pastar"
    );
  }
}
