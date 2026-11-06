# 🚗 Sistema de Gestión de Parqueaderos "Autos Colombia"

[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-blue.svg)](https://www.mysql.com/)
[![Architecture](https://img.shields.io/badge/Architecture-Multilayered%20(DAO)-green.svg)]()
[![Status](https://img.shields.io/badge/Status-Completed%20(Iterations%201%20%26%202)-brightgreen.svg)]()

## 📌 Descripción del Proyecto
**Autos Colombia** es una solución de software orientada a objetos diseñada para la administración integral de vehículos en estacionamientos. El sistema resuelve el control de flujo de entradas y salidas, asignación inteligente de celdas según el tipo de transporte (carros, motos, bicicletas), liquidación automatizada de tarifas y un módulo robusto de seguridad con control de accesos por roles (Administrador y Operador).

El proyecto fue desarrollado bajo una **Arquitectura Multicapa** (Presentación/UI, Controladores, Acceso a Datos/DAO y Persistencia SQL), integrando las fases de modelado UML y prototipado visual en modo oscuro.

---

## 🛠️ Tecnologías y Herramientas

- **Lenguaje de Programación:** Java (JDK 17+)
- **Base de Datos:** MySQL 8.0
- **Cifrado de Seguridad:** Hash BCrypt (Autenticación HU05)
- **Modelado UML:** Lucidchart / StarUML (Casos de Uso, Secuencia y Componentes)
- **Prototipado UI:** Figma (Dark Mode Interface Design)
- **Control de Versiones:** Git & GitHub

---

## 🏗️ Arquitectura del Software

El código fuente se organiza siguiendo el patrón de diseño en capas para asegurar la separación de responsabilidades:

```text
autos-colombia-parqueo/
├── src/
│   └── proyecto/
│       ├── Main.java               # Punto de entrada y orquestador del prototipo
│       ├── ui/                     # Capa de Presentación (Formularios Swing/JavaFX)
│       │   ├── FrmLogin.java
│       │   ├── FrmGestionUsuarios.java
│       │   ├── FrmGestionCeldas.java
│       │   ├── FrmIngresoVehiculo.java
│       │   └── FrmSalidaVehiculo.java
│       ├── controllers/            # Capa de Lógica de Negocio
│       │   ├── AuthControlador.java
│       │   ├── UsuarioControlador.java
│       │   ├── CeldaControlador.java
│       │   └── ParqueaderoControlador.java
│       ├── dao/                    # Capa de Acceso a Datos
│       │   ├── UsuarioDAO.java
│       │   ├── CeldaDAO.java
│       │   ├── RegistroDAO.java
│       │   └── ConexionBD.java
│       └── models/                 # Entidades de Dominio
│           ├── Usuario.java
│           ├── Celda.java
│           └── Vehiculo.java
├── database/
│   └── schema.sql                  # Script DDL/DML para MySQL
├── README.md                       # Documentación principal
└── .gitignore                      # Archivos excluidos del control de versiones


🚀 Funcionalidades Específicas (Iteraciones 1 & 2)
🔹 Iteración 1: Gestión de Vehículos y Tarifas
Ingreso de Vehículos (RF01): Captura de datos (placa, tipo de vehículo, marca, color), asignación automática de celdas disponibles según la tipología y generación de tiquete de entrada.

Salida y Liquidación de Tarifas (RF02): Registro del tiempo transcurrido en minutos/horas, cálculo automatizado del valor a pagar y liberación de celda.

Consulta de Disponibilidad (RF03): Visualización en tiempo real del mapa físico de celdas ocupadas y disponibles.

🔹 Iteración 2: Seguridad, Usuarios y Control de Celdas
Autenticación Segura (HU05): Validación de credenciales de usuario cifradas con algoritmo hash BCrypt. Incluye mecanismo de seguridad con bloqueo temporal de 5 minutos al acumular 3 intentos fallidos consecutivos.

Gestión de Usuarios y Roles (HU06): Módulo CRUD exclusivo para el rol Administrador. Permite crear, modificar e inhabilitar operadores, validando casos límite de duplicidad de cédula o nombre de usuario.

Parametrización de Celdas (HU07): Configuración visual de celdas físicas filtradas por tipo de transporte (Carro, Moto, Bicicleta), restringiendo el registro de códigos duplicados.

Control e Inhabilitación de Celdas por Mantenimiento (HU08): Gestión del estado operacional de las celdas, incluyendo la alerta de excepción que impide inhabilitar celdas que tengan vehículos parqueados activamente.

⚙️ Instalación y Ejecución Local
1. Requisitos Previos
Tener instalado Java JDK 17 o superior.

Tener instalado MySQL Server 8.0 y Git.

2. Clonar el Repositorio

git clone [https://github.com/caroalvarezdev/autos-colombia-parqueo.git](https://github.com/caroalvarezdev/autos-colombia-parqueo.git)
cd autos-colombia-parqueo

3. Configurar la Base de Datos
Ejecuta el script SQL ubicado en database/schema.sql en tu gestor de base de datos MySQL (ej. MySQL Workbench o DBeaver) para crear la base de datos BD_AutosColombia y sus respectivas tablas.

4. Compilar y Ejecutar
Desde la consola o terminal en la raíz del proyecto:

# Compilar la clase principal dentro del paquete proyecto
javac -d . Main.java

# Ejecutar el programa
java proyecto.Main

Autora
Carolina Álvarez - Desarrollo de Software  - @caroalvarezdev