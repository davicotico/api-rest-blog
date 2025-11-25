# API REST BLOG

API REST para una aplicación de gestión de blogs. Esta aplicación permite crear, actualizar y obtener blogs, asimismo registrar comentarios en los blogs.

## Tecnologías utilizadas

* Lenguaje: Java 21
* Framework: Spring Boot 4
* Base de datos: H2 Database
* Documentación: Open API 3

Spring Boot 4 es la más reciente versión de Spring Boot.
He utilizado Java 21 ya que junto a Java 25 es la versión recomendada para Spring Boot 4.
La base de datos H2 Database es un gestor de base de datos en memoria.

## Documentación de la API

Se implementó la documentación bajo la especificación Open API 3, mediante la herramienta Swagger. 

Al ejecutar la aplicación está disponible en [http://localhost:8080/api/v1/swagger-ui/index.html](http://localhost:8080/api/v1/swagger-ui/index.html)

## Ejecución de la aplicación

Clonar el repositorio

```
git clone https://github.com/davicotico/api-rest-blog.git
```

Entrar a la carpeta del proyecto en `api-rest-blog/apiblog`

```shell
cd api-rest-blog
cd apiblog
```

Ejecutar la aplicación

```shell
./mvnw spring-boot:run
```

## Características

### Autor

[x] Crear autor
[x] Listar autores

### Blog

[x] Crear blogs
[x] Listar blogs
[x] Añadir comentarios a un blog
[x] Actualizar blog ID
[x] Consultar blog por ID
[x] Lista de comentarios por blog (ID del blog)


