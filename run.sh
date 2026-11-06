#!/bin/bash

function jumpto {
  label=$1
  cmd=$(sed -n "/$label:/{:a;n;p;ba};" $0 | grep -v ':$')
  eval "$cmd"
  exit
}

function pause {
  read -s -n 1 -p "Presione alguna tecla para continuar . . ."
  echo ""
}

# EXEC="mx.app.Main"
# RES_DIR="./src/main/resources"
# SRC_DIR="./src/main/java"
# JAVA_PRIN="./src/main/java/mx/app/Main.java"
# FLAG="--verbose"
# --verbose --log --debug

EXEC="$1"
# Convierte puntos a barras
PKG_PATH=$(echo "$EXEC" | sed 's/\./\//g')
SRC_DIR="./src/main/java"
RES_DIR="./src/main/resources"
JAVA_PRIN="${SRC_DIR}/${PKG_PATH}.java"
FLAG="$2"

# Pregunta al usuario si desea compilar
while true; do
  read -p "¿Compilar? (S/N)? " yn
  if [[ "$yn" =~ [sS] ]]; then jumpto comp; fi
  if [[ "$yn" =~ [nN] ]]; then jumpto exe; fi
  echo "Opción inválida. Por favor, seleccione S o N."
done

# Compilar si se ha seleccionado
comp:
if [[ ! -d ./bin ]]; then mkdir bin; fi
echo "=== Compilando código fuente ==="
javac -d ./bin -sourcepath "$SRC_DIR" -cp "./lib/*" "$JAVA_PRIN"

echo "=== Copiando recursos ==="
cp -r "$RES_DIR"/* ./bin/

# Ejecutar el programa compilado
exe:
echo "=== Ejecutando el programa ==="
echo
java -cp "./bin;./lib/*" "$EXEC" "$FLAG"
echo
pause

exit
