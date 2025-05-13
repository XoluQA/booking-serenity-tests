# 🧪 Proyecto de Automatización - Booking | XoluQA

Este proyecto automatiza casos de prueba funcionales sobre el sitio web [Booking](https://www.booking.com/) utilizando el framework **Serenity BDD** con el patrón **Screenplay**, en lenguaje **Java** y con **Gradle** como gestor de dependencias.

---

## 🚀 Tecnologías y herramientas usadas

- ✅ Java 11  
- 🔧 Gradle  
- 🎯 Serenity BDD  
- 🧠 Screenplay Pattern  
- 🥒 Cucumber  
- 🌐 Selenium WebDriver  
- 📄 Evidencias automáticas en HTML (Serenity Reports)  

---

## 📄 Casos de prueba automatizados

- Búsqueda de hoteles con filtros (destino, fechas, habitaciones, edades).  
- Aplicación de filtros adicionales: precio mínimo y categoría 3 estrellas.  
- Ordenamiento por precio más bajo.  
- Validación del primer hotel en el listado y acceso a su disponibilidad.

---

## 📁 Estructura del proyecto

📁 src
└── 📁 main
└── 📁 java
└── 📦 lógica de negocio, tareas y page objects
└── 📁 test
└── 📁 java
├── 🥒 definiciones de pasos (Step Definitions)
└── 🧪 runners de pruebas


---

## 🔧 Tecnologías usadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white)
![Serenity BDD](https://img.shields.io/badge/Serenity_BDD-00aaff?style=flat)
![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=flat&logo=cucumber&logoColor=white)
![Firefox](https://img.shields.io/badge/Firefox-FF7139?style=flat&logo=firefox&logoColor=white)
![Chrome](https://img.shields.io/badge/Chrome-4285F4?style=for-the-badge&logo=google-chrome&logoColor=white)

---

## 🧪 Cómo ejecutar los tests

1. Clona el repositorio:  
   `git clone https://github.com/XoluQA/booking-automation.git`

2. Ejecuta las pruebas desde la consola:  
   `./gradlew clean test`

3. Abre el reporte generado:  
   `target/site/serenity/index.html`

---

👨‍💻 Autor: **XoluQA**  
📩 Contacto: [xolugg@gmail.com](mailto:xolugg@gmail.com)  
🔗 [GitHub](https://github.com/XoluQA)

> ¡Gracias por visitar este repositorio! 🌟 Dale una estrella si te gustó este proyecto.
