# --- Etapa 1: Construcción (Build) ---
# Usamos una imagen de Maven con Java 21 para compilar el proyecto
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Establecemos el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos primero el archivo de dependencias (pom.xml)
# Esto permite aprovechar la caché de Docker si no cambian las dependencias
COPY pom.xml .

# Descargamos las dependencias (modo offline para acelerar futuros builds)
# RUN mvn dependency:go-offline

# Copiamos el código fuente del proyecto
COPY src ./src

# Compilamos el proyecto y creamos el JAR (saltando los tests para agilizar)
RUN mvn clean package -DskipTests

# --- Etapa 2: Ejecución (Runtime) ---
# Usamos una imagen ligera de Java 21 (solo JRE, sin herramientas de compilación)
FROM eclipse-temurin:21-jre-alpine

# Directorio de trabajo en la imagen final
WORKDIR /app

# Copiamos solo el artefacto compilado (.jar) desde la etapa "build"
# El *.jar busca cualquier jar generado, y lo renombramos a app.jar
COPY --from=build /app/target/*.jar app.jar

# Exponemos el puerto (por defecto Spring Boot usa el 8080)
EXPOSE 8080

# Comando para iniciar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]