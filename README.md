        Aplicación Spring Boot: Lista de Usuarios

Esta es una aplicación web simple hecha con Spring Boot y Thymeleaf que muestra una tabla con una lista de usuarios (nombre, apellido y correo). Si el correo no está disponible, se muestra "--------".

    Requisitos:

Java JDK 17 o superior

Apache Maven (agregado a la variable de entorno PATH)

Visual Studio Code 

Extensión "Extension Pack for Java" instalada en VSCode

        Cómo ejecutar la aplicación:

Opción 1: Desde la terminal con Maven
Abrir una terminal en la carpeta del proyecto y ejecutar:
mvn spring-boot:run
Luego abrir el navegador y entrar a:
http://localhost:8080/usuarios

Opción 2: Desde Visual Studio Code

Abrir el proyecto con VSCode.

Abrir el archivo UserListApplication.java.

Hacer clic en el botón que aparece sobre el método main.

Abrir el navegador y visita: http://localhost:8080/usuarios

    Personalización:
Se puede editar el archivo UserService.java para modificar o agregar más usuarios simulados fácilmente.

    Estilo visual:
La tabla tiene un diseño moderno y responsivo usando solo CSS personalizado. No se utilizan frameworks externos como Bootstrap.


