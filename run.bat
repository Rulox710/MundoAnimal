@ECHO OFF
CHCP 65001 >NUL
SETLOCAL

REM EXEC=mx.app.Main
REM RES_DIR=.\src\main\resources
REM SRC_DIR=.\src\main\java
REM JAVA_PRIN=.\src\main\java\mx\app\Main.java
REM FLAG=--verbose
REM --verbose --log --debug

REM Obtener clase principal y argumentos
SET "EXEC=%~1"
SET "FLAG=%~2"

REM Convertir puntos del paquete a barras invertidas
SET "PKG_PATH=%EXEC:.=\%"

REM Definir rutas
SET "SRC_DIR=.\src\main\java"
SET "RES_DIR=.\src\main\resources"
SET "JAVA_PRIN=%SRC_DIR%\%PKG_PATH%.java"

REM Preguntar si desea compilar
CHOICE /C SN /N /M "¿Compilar (S/N)?"

IF ERRORLEVEL 2 GOTO EXE
IF ERRORLEVEL 1 GOTO COM

:COM
IF NOT EXIST ".\bin" (
    MKDIR ".\bin"
)

ECHO === Compilando código fuente ===
JAVAC -d ".\bin" -sourcepath "%SRC_DIR%" -cp ".\lib\*" "%JAVA_PRIN%"

IF ERRORLEVEL 1 (
    ECHO ERROR: Fallo la compilacion.
    PAUSE
    EXIT /B 1
)

ECHO === Copiando recursos ===
IF EXIST "%RES_DIR%" (
    XCOPY "%RES_DIR%\*" ".\bin\" /E /I /Y
)

:EXE
ECHO === Ejecutando el programa ===
ECHO.
JAVA -cp ".\bin;.\lib\*" "%EXEC%" %FLAG%
ECHO.

PAUSE
ENDLOCAL
EXIT /B
