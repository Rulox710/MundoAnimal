package mx.com.animales;

public abstract class Animal implements Movible {

  private String nombre;
  private int edad;

  /**
   * Método que imprime en consola la información del animal.
   */
  public void mostrarInformacion() {
    System.out.printf(
      "Este animal se llama %s y tiene tan solo %d añitos\n",
      nombre, edad
    );
  }

  /**
   * Método que imprime en consola el sonido que hace el animal.
   */
  public abstract void hacerSonido();

  /**
   * Asigna un nombre al animal.
   *
   * @param edad Una cadena para representar su nombre.
   */
  public void asignarNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Obtiene el nombre del animal.
   *
   * @return Una cadena con su nombre.
   */
  public String obtenerNombre() {
    return nombre;
  }

  /**
   * Asigna una edad al animal.
   *
   * @param edad Un entero para representar su edad.
   */
  public void asignarEdad(int edad) {
    this.edad = edad;
  }

  /**
   * Obtiene la edad del animal.
   *
   * @return Un entero con su edad.
   */
  public int obtenerEdad() {
    return edad;
  }
}
