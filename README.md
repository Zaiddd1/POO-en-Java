<h1 align="center">☕ POO en Java — Lenguajes de Programación III</h1>

<p align="center">
  <em>Programación Orientada a Objetos en Java: clases y objetos, miembros de instancia y de clase,
  encapsulamiento, agregación, composición, herencia y polimorfismo.</em>
</p>

<p align="center">
  <img alt="Lenguaje" src="https://img.shields.io/badge/Java-8%2B-orange?logo=openjdk&logoColor=white">
  <img alt="Paradigma" src="https://img.shields.io/badge/Paradigma-POO-blue">
  <img alt="Curso" src="https://img.shields.io/badge/Curso-LP%20III-6f42c1">
  <img alt="Estado" src="https://img.shields.io/badge/Sesi%C3%B3n-02-brightgreen">
  <img alt="Licencia" src="https://img.shields.io/badge/Uso-Educativo-lightgrey">
</p>

---

## 📌 Sobre este repositorio

Este repositorio reúne **todo el código fuente** desarrollado en la **Sesión N.° 02** del curso
**Lenguajes de Programación III** de la Escuela Profesional de Ingeniería de Sistemas
(Universidad Católica de Santa María).

Cada archivo se implementa como un ejemplo **ejecutable** que ilustra un concepto de POO. Junto a
cada grupo de clases se incluye un archivo `salida-esperada.txt` con la salida por pantalla que
produce el programa.

## 👥 Integrantes

| Código | Apellidos y Nombres | Participación |
|---|---|---|
| 2025001659 | Del Carpio Aspilcueta, Farid Andree | 100 % |
| 2025000961 | Figueroa Landeo, Walter | 100 % |
| 2025002309 | Medina Llanquecha, Cesar Manuel | 100 % |

---

## 🗂️ Estructura del repositorio

```
POO-en-Java/
├── actividades/
│   ├── actividad-01-clases-y-objetos/     → Clase Coche: atributos, constructores, getters/setters
│   ├── actividad-02-miembros-de-clase/    → Contador: variables/métodos static, constantes (3 versiones)
│   │   ├── 01-version-original/
│   │   ├── 02-version-valor-inicial/
│   │   └── 03-version-contadores-y-ultimo/
│   ├── actividad-03-agregacion/           → Automovil ◇── Motor
│   ├── actividad-04-composicion/          → Persona ◆── Cuenta
│   └── actividad-05-herencia/             → Cuenta ◁── CuentaAhorro / CuentaCorriente
└── ejercicios/
    └── gestion-de-cursos/                 → Sistema de Gestión de Cursos (clase abstracta + polimorfismo)
```

> Los `package` declarados en el código se conservan tal como fueron entregados
> (`actividades2` para las actividades y `ejercicio` para el ejercicio propuesto).

---

## 📚 Contenido por actividad

### 🧩 Actividad 01 — Clases y objetos
**Carpeta:** [`actividades/actividad-01-clases-y-objetos`](actividades/actividad-01-clases-y-objetos)

Clase `Coche` con atributos `marca`, `modelo`, `añoFabricacion` y `precio`. Incluye constructor por
defecto, constructor con cuatro parámetros, getters/setters y el método `aplicarDescuento()`, que
rebaja el precio solo si el vehículo fue fabricado antes de 2010 y devuelve si el descuento se aplicó.
`EjemploCoche` enciende, acelera, frena y apaga dos coches, y prueba descuentos y setters.

| Archivo | Descripción |
|---|---|
| `Coche.java` | Definición de la clase (atributos, 2 constructores, accesores, lógica de descuento). |
| `EjemploCoche.java` | Clase con `main()` que crea e interactúa con los objetos. |

---

### 🧮 Actividad 02 — Miembros de instancia y de clase
**Carpeta:** [`actividades/actividad-02-miembros-de-clase`](actividades/actividad-02-miembros-de-clase)

Análisis de las clases `Contador` y `ContadorTest`, con foco en variables y métodos `static`, la
palabra `this`, constantes `final static` y el encadenamiento de constructores con `this(...)`.
Se conservan las **tres versiones** que se van construyendo durante la actividad:

| Versión | Qué añade |
|---|---|
| `01-version-original` | `Contador` con acumulador `static` + `ContadorTest` básico. |
| `02-version-valor-inicial` | Constante `VALOR_INICIAL` y constructor por defecto que delega con `this(VALOR_INICIAL)`; `ContadorTest` ampliado con verificaciones. |
| `03-version-contadores-y-ultimo` | Variables de clase `nContadores` y `ultimoContador` con sus getters `static`. |

---

### 🔗 Actividad 03 — Agregación
**Carpeta:** [`actividades/actividad-03-agregacion`](actividades/actividad-03-agregacion)

Relación de **agregación** entre `Automovil` y `Motor`: el motor puede existir de forma independiente
del automóvil y se asigna mediante `setMotor()`. Ambas clases implementan `toString()`.

| Archivo | Descripción |
|---|---|
| `Motor.java` | `numMotor`, `revPorMin`, accesores y `toString()`. |
| `Automovil.java` | `placa`, `numPuertas`, `marca`, `modelo` y una referencia a `Motor`. |
| `TestAgregacion.java` | Crea autos y motores, los enlaza y muestra sus datos. |

---

### 🧷 Actividad 04 — Composición
**Carpeta:** [`actividades/actividad-04-composicion`](actividades/actividad-04-composicion)

Relación de **composición** entre `Persona` y `Cuenta`: la cuenta se crea **dentro** del constructor
de `Persona` (`this.cuenta = new Cuenta(numero)`), por lo que su ciclo de vida depende de la persona.

| Archivo | Descripción |
|---|---|
| `Cuenta.java` | `numero`, `saldo`, dos constructores y `toString()`. |
| `Persona.java` | Crea su propia `Cuenta` al construirse; expone `getCuenta()`. |
| `TestComposicion.java` | Crea personas y modifica el saldo de sus cuentas. |

---

### 🧬 Actividad 05 — Herencia
**Carpeta:** [`actividades/actividad-05-herencia`](actividades/actividad-05-herencia)

Jerarquía donde `CuentaAhorro` y `CuentaCorriente` **extienden** `Cuenta`, reutilizando atributos
`protected` y métodos. `CuentaAhorro` añade `aplicarInteres()`; `CuentaCorriente` **sobrescribe**
`retirar()` para permitir sobregiro hasta un límite.

| Archivo | Descripción |
|---|---|
| `Cuenta.java` | Clase base: `depositar()`, `retirar()`, `toString()`. |
| `CuentaAhorro.java` | Añade `tasaInteres` y `aplicarInteres()`. |
| `CuentaCorriente.java` | Añade `limiteSobregiro` y redefine `retirar()`. |
| `TestHerencia.java` | Prueba interés, retiros válidos e inválidos y sobregiro. |

---

### 🎓 Ejercicio propuesto — Sistema de Gestión de Cursos
**Carpeta:** [`ejercicios/gestion-de-cursos`](ejercicios/gestion-de-cursos)

Estudiantes que se inscriben en cursos a cargo de profesores. Integra **clase abstracta**
(`Persona` con `getRol()` abstracto), **polimorfismo** (`toString()` usa `getRol()`), **variables de
clase** (`totalEstudiantes`, `totalProfesores`), **constantes** (`MAX_ESTUDIANTES`) y relaciones
entre `Estudiante`, `Profesor` y `Curso`.

| Archivo | Descripción |
|---|---|
| `Persona.java` | Clase **abstracta** con `getRol()` sin implementar. |
| `Estudiante.java` | Lleva su lista de cursos; contador `static` de estudiantes. |
| `Profesor.java` | Tiene `especialidad`; contador `static` de profesores. |
| `Curso.java` | Enlaza profesor y estudiantes; cupo máximo constante. |
| `TestGestionCursos.java` | Inscribe estudiantes y muestra datos y contadores. |

---

## ▶️ Cómo compilar y ejecutar

Necesitas un **JDK 8 o superior** (`javac` y `java` en el `PATH`).

Cada carpeta es un mini‑programa independiente. Por ejemplo, para la Actividad 01:

```bash
cd actividades/actividad-01-clases-y-objetos
javac -encoding UTF-8 *.java
java EjemploCoche
```

Para las carpetas con varias versiones (Actividad 02), entra a la versión concreta:

```bash
cd actividades/actividad-02-miembros-de-clase/02-version-valor-inicial
javac -encoding UTF-8 *.java
java ContadorTest
```

> 💡 Se recomienda `-encoding UTF-8` porque algunos identificadores y textos usan tildes y `ñ`
> (por ejemplo `añoFabricacion`).

La clase con `main()` de cada carpeta es la que empieza por `Ejemplo…`, `Test…` o `…Test`.

---

## 🧠 Conceptos cubiertos

`clases y objetos` · `atributos y métodos de instancia` · `variables y métodos static` ·
`constantes final static` · `encapsulamiento (getters/setters)` · `sobrecarga de constructores` ·
`this(...)` · `agregación` · `composición` · `herencia (extends / super)` ·
`sobrescritura de métodos` · `clases abstractas` · `polimorfismo` · `toString()`

---

<p align="center"><sub>
Material con fines educativos — Universidad Católica de Santa María · Ingeniería de Sistemas · Lenguajes de Programación III
</sub></p>
