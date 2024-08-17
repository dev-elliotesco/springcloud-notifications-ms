# Notifications Microservice 

## Descripción
Este es un microservicio de notificaciones desarrollado con Spring Boot y Spring Mail.
Este microservicio se encarga del envío de correos electrónicos. 



## Requisitos & Tecnologías
- Java Development Kit (JDK) 17
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Cloud](https://spring.io/projects/spring-cloud)
- [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)
- [Spring Mail](https://docs.spring.io/spring-framework/docs/3.0.x/spring-framework-reference/html/mail.html)
- [Eureka Server](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html)
- [Gradle](https://gradle.org/)
- [Docker](https://www.docker.com/)

## Instalación
Pasos para instalar las dependencias y el proyecto.

```bash
# Clona este repositorio
git clone https://github.com/dev-elliotesco/springcloud-notifications-ms.git

# Entra en el directorio del proyecto
cd springcloud-notifications-ms

# Compila el proyecto usando Gradle
./gradlew build

```

## Configuración
1. Antes de ejecutar el proyecto, debes configurar las propiedades de correo electrónico como variables de entorno. 
Las siguientes variables de entorno deben ser definidas:

- `MAIL_HOST`: El host de tu servidor de correo electrónico.
- `MAIL_PORT`: El puerto de tu servidor de correo electrónico.
- `MAIL_USERNAME`: El nombre de usuario para tu servidor de correo electrónico.
- `MAIL_PASSWORD`: La contraseña para tu servidor de correo electrónico.
- `MAIL_FROM`: La dirección de correo electrónico desde la cual se enviarán los correos.

Estas variables de entorno son utilizadas en el archivo `src/main/resources/application.yml` para configurar el servicio de correo electrónico.

Por ejemplo, puedes definir las variables de entorno en tu sistema operativo o en tu IDE. Si estás utilizando IntelliJ IDEA, puedes definir las variables de entorno en la configuración de tu Run/Debug Configuration.

2. Asegúrate de tener el servicio Eureka en ejecución.
   Puedes encontrar el código fuente y las instrucciones para ejecutar el servidor
   Eureka en el siguiente repositorio: [springcloud-eureka-service](https://github.com/dev-elliotesco/springcloud-eureka-service)

3. Asegúrate de tener el servicio Gateway en ejecución.
   Puedes encontrar el código fuente y las instrucciones para ejecutar el servidor
   Gateway en el siguiente repositorio: [springcloud-gateway-service](https://github.com/dev-elliotesco/springcloud-gateway-service)

## Uso
Pasos para ejecutar el proyecto.

### Localmente:

```bash
# Comando para iniciar el proyecto usando Gradle
./gradlew bootRun
```

```bash
# O ejecutando el JAR directamente
java -jar build/libs/notifications-ms-0.0.1-SNAPSHOT.jar
```
Para generar el JAR:

```bash
# Generando el JAR
# Nota: Este comando compila el código, ejecuta las pruebas y genera el JAR
/gradlew build
```

### Docker (Solo el servicio):

```bash
# Construye la imagen Docker
docker build -t notifications-ms .

# Ejecuta el contenedor Docker
docker run -p xxxxx notifications-ms
```

### Docker Compose (Todos los servicios)

```bash
# Clona este repositorio del proyecto completo
git clone https://github.com/dev-elliotesco/springcloud-demo-mr.git

# Entra en el directorio del proyecto completo
cd springcloud-demo-mr

# Ejecuta Docker Compose
docker-compose up
```

## Autor
- Elliot Escovicth Riaño - [Github](https://github.com/dev-elliotesco)
- [LinkedIn](https://https://www.linkedin.com/in/elliot-escovitch-580007205/)
- Correo electrónico: eescovitchr@gmail.com