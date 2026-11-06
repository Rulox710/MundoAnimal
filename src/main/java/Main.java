import mx.com.animales.Animal;
import mx.com.animales.Gato;
import mx.com.animales.Perro;
import mx.com.animales.Vaca;

public class Main {

  public static void main(String... args) {
    Animal perro = new Perro();
    perro.hacerSonido();

    Animal gato = new Gato();
    gato.hacerSonido();

    Animal vaca = new Vaca();
    vaca.hacerSonido();
  }
}
