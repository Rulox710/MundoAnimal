package mx.com.animales;

public class Caballo extends Animal {

  /**
   * Constructor que genera un Caballo que extiede a {@link Animal}
   *
   * @see Animal
   */
  public Caballo() {
    super();
  }

  /**
   * {@inheritDoc}
   * <br>
   * Se sobreescribe a {@link Animal#hacerSonido()} de la clase
   * {@link Animal} para que haga el sonido propio de un Caballo.
   *
   * @see Animal#hacerSonido()
   */
  @Override
  public void hacerSonido() {
    System.out.println("Iiiieee~~~🐴");
  }

  /**
   * {@inheritDoc}
   * <br>
   * Se implementa el método para demostrar que el gato se mueve.
   */
  @Override
  public void moverse() {
    System.out.println(
      "El gato mueve sus 4 patas cuando corre veloz como el viento"
    );
  }
}
