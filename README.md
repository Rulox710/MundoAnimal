# Mundo Animal (Práctica de Java para Generation)

## Ejecución
Esta práctica usa Java 17 con JAVA_TOOL_OPTIONS: -Dfile.encoding="UTF-8".
Por favor, agréguelas también a sus variables de entorno o vera signos raros en los acentos y las eñes :)

Para compilar y ejecutar se debe hacer desde terminal en Linux
````bash
./run.sh Main
````

O desde terminal en Windows
````bash
run.bat Main
````

## Ejemplo de salida
````bash
./run.sh Main
¿Compilar? (S/N)? s
=== Compilando código fuente ===
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding="UTF-8"
=== Copiando recursos ===
cp: cannot stat './src/main/resources/*': No such file or directory
=== Ejecutando el programa ===

Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding="UTF-8"
Este animal se llama Lili y tiene tan solo 7 añitos
El perro mueve sus 4 patas cuando corre

Este animal se llama Michino y tiene tan solo 1 añitos
El gato mueve sus 4 patas cuando salta

Este animal se llama Lola y tiene tan solo 10 añitos
La vaca mueve sus 4 patas cuando camina a pastar

Este animal se llama Horseluis y tiene tan solo 5 añitos
El gato mueve sus 4 patas cuando corre veloz como el viento


Presione alguna tecla para continuar . . .
````

## Preguntas de la práctica
1. ¿Puedes crear un objeto directamente de Animal? ¿Por qué?
    > No. Porque la clase el abstracta y por tanto no se puede instanciar.

2. ¿Qué propiedades se comparten y qué comportamiento cambia?
    > Todas las propiedades se comparten, lo único que cambia el el método hacerSonido() ya que ahora si tiene implementación
    > y es propia de cada animal.

3. Explica la diferencia entre `extends` e `implements`.
    > `extends` es para "extender" una clase abstracta, o sea que puede tener constructores, atributos o métodos abstractos o definidos.
    > `implements` es para "implementar" una interfaz, una clase que únicamente puede tener firmas de métodos que posteriormente se deben implementar por la clase que le implemente.

4. ¿Qué se reutiliza al heredar de Animal?
    > Los atributos `nombre` y `edad`; los métodos `mostrarInformacion()` `hacerSonido()` `asignarNombre(nombre)` `obtenerNombre()` `asignarEdad(edad)` y `obtenerEdad()`; y además, como implementa a `Movible`, también hereda `moverse()` para que la implementen sus clases hijas.

5. ¿Qué hace `super(nombre, edad)`?
    > No lo hice así en la práctica porque no se indicó de tal forma, pero lo que hace es llamar al constructor de la clase padre (superclase) para usarlo en la clase hija (subclase).

6. ¿Para qué sirve `@Override`?
    > Le indica a la máquina virtual que un método se está sobrescribiendo.
    > Si bien, su ausencia no afecta, es útil porque podría dar el caso de que se trate de sobrescribir un método y por error se ponga mál su firma y por tanto, en ves de sobrescribirse, se crea un nuevo método con la nueva firma.

7. ¿Por qué el mismo método `hacerSonido()` produce resultados distintos?
    > Por que cada clase sobrescribió el método y cuando se llama al método, Java sabe que debe ver la versión sobrescrita, no la del padre.

8. ¿Cuál es la diferencia entre una clase abstracta y una interfaz?
    > Una clase abstracta puede tener constructores, atributos o métodos abstractos o definidos.
    > Una interfaz es una clase que únicamente puede tener firmas de métodos que posteriormente se deben implementar por la clase que le implemente.
