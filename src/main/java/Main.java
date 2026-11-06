import mx.com.animales.Animal;
import mx.com.animales.Gato;
import mx.com.animales.Perro;
import mx.com.animales.Vaca;

public class Main {

  public static void main(String... args) {
    Animal[] animales = new Animal[3];

    Animal perro = new Perro();
    perro.asignarNombre("Lili");
    perro.asignarEdad(7);

    Animal gato = new Gato();
    gato.asignarNombre("Michino");
    gato.asignarEdad(1);

    Animal vaca = new Vaca();
    vaca.asignarNombre("Lola");
    vaca.asignarEdad(10);

    animales[0] = perro;
    animales[1] = gato;
    animales[2] = vaca;

    for(Animal animal : animales) {
      animal.moverse();
    }
  }
}
