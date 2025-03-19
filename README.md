# Implementación del Problema de Parar en Java

## Descripción del Proyecto
Este proyecto es una simulación conceptual del Problema de Parar de Alan Turing. Su objetivo es explorar la indecidibilidad de problemas computacionales y los límites teóricos de la computación. Se implementan programas que se detienen y que no se detienen, junto con un **HaltChecker** y un **Reverser** que ilustran la paradoja del Problema de Parar.

## Estructura del Proyecto
```
src/
├── main/java/com/haltingproblem/
│   ├── model/               # Modelos de programas
│   ├── haltchecker/         # Lógica del HaltChecker
│   ├── reverser/            # Implementación de Reverser
│   └── Main.java            # Punto de entrada
pom.xml                      # Configuración de Maven
```

## Componentes Principales
### Programas de Ejemplo

#### HaltingProgram
Programa que cuenta hacia abajo desde un valor inicial hasta 0 y se detiene.
```java
public void run() {
    int num = initialValue;
    while (num > 0) {
        System.out.println(num);
        num--;
    }
}
```

#### NonHaltingProgram
Programa que cuenta hacia arriba indefinidamente.
```java
public void run() {
    int num = initialValue;
    while (true) {
        System.out.println(num);
        num++;
    }
}
```

### HaltChecker
Determina si un programa se detendrá o no (simulación simplificada).
```java
public static boolean willHalt(Program program) {
    return program instanceof HaltingProgram; // Simulación simplificada
}
```

### Reverser
Programa que, al recibir la salida de `HaltChecker`, genera un comportamiento paradójico.
```java
public void run() {
    if (HaltChecker.willHalt(program)) {
        while (true) System.out.println("Bucle infinito...");
    } else {
        System.out.println("Se detiene.");
    }
}
```

## Instrucciones de Ejecución
### Requisitos
- Java 22+
- Maven

### Pasos
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/halting-problem.git
   ```
2. Compilar y ejecutar:
   ```bash
   mvn clean install
   mvn exec:java -Dexec.mainClass="com.haltingproblem.Main"
   ```

### Salida Esperada
```
=== Simulación del Problema de Parar ===
Probando Reverser con HaltingProgram:
Bucle infinito...
Bucle infinito...
...

Probando Reverser con NonHaltingProgram:
Se detiene.
```

## ¿Por qué elegir Builder?
El patrón **Builder** resulta especialmente adecuado para este proyecto por las siguientes razones:

### 1. Separación de la Lógica de Construcción
- **Claridad en la construcción:** Separa la lógica de creación del objeto de su representación final.
- **Encapsulación de la configuración:** Centraliza validaciones y ajustes en un único lugar.

### 2. Manejo Eficiente de Parámetros Opcionales
- **Flexibilidad en la configuración:** Permite definir solo los atributos necesarios.
- **Establecimiento gradual:** Usa *method chaining* para una configuración clara y progresiva.

### 3. Legibilidad y Mantenibilidad del Código
- **Código más claro:** Facilita la lectura y el mantenimiento.
- **Facilidad para refactorizar:** Permite cambios sin afectar la lógica del sistema.

### 4. Validación y Consistencia en la Creación de Objetos
- **Validación centralizada:** El método `build()` puede asegurar la coherencia de los objetos.
- **Reducción de errores:** Previene la creación de instancias en estados inválidos.

### 5. Flexibilidad y Escalabilidad
- **Adaptación a cambios futuros:** Permite extender el sistema sin afectar su base.
- **Facilidad para extender configuraciones:** Se pueden agregar nuevas opciones sin reestructurar el código.

### 6. Comparación con Otros Patrones Creacionales
- **Abstract Factory:** Útil para crear familias de objetos relacionados, pero innecesario aquí, ya que la variabilidad está en la configuración de un solo tipo de objeto (`Program`).
- **Prototype:** Útil para clonar objetos, pero no ayuda a configurar desde cero con múltiples opciones como lo hace Builder.
- **Singleton:** No es aplicable, ya que necesitamos múltiples instancias con diferentes configuraciones.
- **Factory Method:** Útil para delegar la creación de objetos a subclases, pero no permite una configuración detallada como Builder.

En conclusión, **Builder** es la mejor opción porque facilita la construcción de objetos con múltiples configuraciones, mejora la legibilidad y escalabilidad, y permite una validación eficiente antes de instanciarlos.

## Licencia
Este proyecto está bajo la licencia Apache. Consulta el archivo `LICENSE` para más detalles.

