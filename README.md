# MVC Example with Swing - proyectoEjemploGUI

## Description

Example project that demonstrates the **MVC** pattern applied to a **Swing** interface for human resources registration. The layers are clearly separated into packages: `controller`, `logic`, `persistence`, `view` and `util`, so each class has a single responsibility.

Academic project developed for the **Java programming** courses - Systems Engineering, Universidad El Bosque.

## Author

- Sergio Alejandro Parra Rivera

## Technologies

- Java 21 (compiled with `maven-compiler-plugin`)
- Swing for the graphical interface (`JFrame`, modal `JDialog`)
- Maven 3.8+ with `exec-maven-plugin` to run the application
- **MVC** pattern with explicit layers (`controller`, `logic`, `persistence`, `view`, `util`)

## Requirements

| Requirement | Version | How to check |
| --- | --- | --- |
| JDK | 21 or higher | `javac -version` |
| Maven | 3.8 or higher | `mvn -v` |
| Git | Any recent version | `git --version` |

## Installation

Follow these steps exactly so the application runs on the first try.

### 1. Clone the repository

```bash
git clone https://github.com/P2X4A/proyectoEjemploGUI.git
```

### 2. Enter the project folder

```bash
cd proyectoEjemploGUI
```

> On Windows, if your path contains spaces, always quote it, for example: `cd "C:\Users\Example\Documents\proyectoEjemploGUI"`.

### 3. Verify your environment

```bash
javac -version
mvn -v
```

Expected: JDK 21 (or higher) and Maven 3.8 (or higher). If any command fails, install or update that tool before continuing.

### 4. Compile the project

```bash
mvn clean compile
```

What success looks like:

- The console ends with `BUILD SUCCESS`.
- A `target/classes/` folder is created with the compiled classes.

## Running the application

```bash
mvn exec:java
```

The main window opens; the registration option opens a modal dialog to capture the human resources data.

Troubleshooting:

- `ClassNotFoundException` or missing main class: compile first with `mvn clean compile`.
- `UnsupportedClassVersionError`: your JDK is older than 21; install JDK 21 or higher and check it with `javac -version`.

## Main features

- **Layered MVC example:** each package plays one role, `controller` coordinates, `logic` holds the business rules, `persistence` stores data, `view` draws the interface and `util` shares constants.
- **Human resources registration:** form to capture data through a modal dialog (`DialogoRegistro`).
- **Business logic layer:** `BusinessLogic` processes the data before `RRHH` stores it.
- **Teaching oriented:** a small code base designed to explain how MVC works in a Swing application.

## Project structure

```text
proyectoEjemploGUI/
├── pom.xml
├── README.md
├── LICENSE
└── src/
    └── co/edu/unbosque/
        ├── controller/
        │   ├── AplMain.java               # Entry point (main class)
        │   └── Controller.java            # Coordinates model and view (MVC)
        ├── logic/
        │   └── BusinessLogic.java         # Business rules
        ├── persistence/
        │   └── RRHH.java                  # Human resources data storage
        ├── util/
        │   └── Constants.java             # Shared constants
        └── view/
            ├── VentanaPrincipal.java      # Main window
            └── DialogoRegistro.java       # Modal registration dialog
```
