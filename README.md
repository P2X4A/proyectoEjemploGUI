# Ejemplo de Patron MVC con Swing

Proyecto de ejemplo que demuestra el patron MVC aplicado a una interfaz grafica con recursos humanos.

## Detalle

| | |
|---|---|
| Tipo | Swing (MVC) |
| Archivos Java | 7 |
| Version de Java | 25 |
| Patron | Proyecto de ejemplo del patron MVC con Swing |

## Funcionalidades

- Separacion clara de modelo, vista y controlador
- Dialogo de registro
- Logica de negocio (RRHH)
- Constantes centralizadas

## Estructura del proyecto

```
proyectoEjemploGUI/
|-- pom.xml       configuracion de Maven, importable desde cualquier IDE
|-- src/          codigo fuente
`-- README.md
```

## Como ejecutarlo

### Con Maven

```bash
mvn clean compile
mvn exec:java
```

### Con javac directamente

```bash
# Linux / macOS
javac -d bin $(find src -name "*.java")

# Windows (PowerShell)
javac -d bin (Get-ChildItem -Recurse -Filter *.java src).FullName
```

```bash
java -cp bin co.edu.unbosque.controller.AplMain
```

### Desde un IDE

Cualquier IDE con soporte de Java (Eclipse, IntelliJ IDEA, VS Code o NetBeans)
puede importar el proyecto directamente como **proyecto Maven**. Basta con abrir
o importar la carpeta: el IDE detecta el `pom.xml`, resuelve las dependencias y
compila sin configuracion adicional.

## Autor

Desarrollado por [Sergio Parra](https://github.com/P2X4A) como parte de su
formacion en Java.

## Licencia

Ver el archivo [LICENSE](LICENSE).