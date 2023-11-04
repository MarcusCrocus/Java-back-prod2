# Usa una imagen base de OpenJDK 21
FROM openjdk:21-jdk-slim

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo JAR de la aplicación al contenedor
COPY target/BearsJava-0.0.1-SNAPSHOT.jar BearsJava.jar

# Expone el puerto 8081
EXPOSE 8081

# Comando para ejecutar la aplicación al iniciar el contenedor
CMD ["java", "-jar", "BearsJava.jar"]