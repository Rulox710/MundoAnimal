package mx.com.animales;

public abstract class Animal {

  private String nombre;
  private int edad;

  public void mostrarInformacion() {
    System.out.printf("Este animal se llama %s y tiene solo %d añitos", nombre, edad);
  }

  public abstract void hacerSonido();
}
