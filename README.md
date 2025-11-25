# API REST BLOG

API REST para una aplicación de gestión de blogs. Esta aplicación permite crear, actualizar y obtener blogs, asimismo registrar comentarios en los blogs.

## Tecnologías utilizadas

* Lenguaje: Java 21
* Framework: Spring Boot 4
* Base de datos: H2 Database
* Documentación: Open API 3

## Resumen

Se eligió Spring Boot 4 por ser la más reciente versión de Spring Boot.

En cuanto al lenguaje Java, se eligió la versión 21 por ser LTS y junto a Java 25 es la versión recomendada para Spring Boot 4.

La base de datos H2 Database es un gestor de base de datos en memoria, lo cual es adecuado para este proyecto.

La aplicación tiene una arquitectura de capas.

En la primera se tiene:

```
- application: Para las capas propias del negocio de la aplicación
- config: para las configuraciones globales, es un paquete transversal
- exception: para todas las clases Exception de la aplicación, es un paquete transversal
```

El paquete `application` contiene:

```
- controller: Todos los controladores
- data: se tienen los modelos de datos, por un lado los DTOs (paquete dto, implementados en record no en clases) y los Entities (paquete entity)
- repository: Para los JpaRepository. Se hace uso de JPA.
- service: Para los servicios. Se tienen las interfaces y sus implementaciones en el paquete impl
```

Para el manejo de excepciones se crearon clases Exception personalizadas. Los mensajes de validación son respuestas en formato array JSON y tienen el código de respuesta 400 (Bad Request). Por ejemplo:

```json
[
  "El apellido materno es requerido",
  "El apellido paterno es requerido",
  "El código de país debe contener 2 caracteres"
]
```

Cuando se intenta guardar un registro con un valor de llave foránea inexistente, la respuesta es un error 404 (Not Found).

Por ejemplo, si se intenta guardar un blog con un ID de autor que no existe en la base de datos:

```json
{
  "mensaje": "Autor no encontrado",
  "codigo": 404,
  "fechaHora": "2025-11-25T17:29:18.1488846"
}
```

El orden de ejecución de las validaciones es:

1. Primero valida al objeto DTO

2. Valida la relación de llaves foráneas (Si fuera el caso)

## Documentación de la API

Se implementó la documentación bajo la especificación Open API 3, mediante la herramienta Swagger. 

Al ejecutar la aplicación está disponible en [http://localhost:8080/api/v1/swagger-ui/index.html](http://localhost:8080/api/v1/swagger-ui/index.html)

## Ejecutar mediante Docker

Se ha creado una imagen de la aplicación y está disponible en dockerhub.

Ejecutar en la terminal:

```
docker run -p 8080:8080 davicotico/api-rest-blog:v1.0.0
```

## Ejecución de la aplicación clonando el repositorio

**Requiere Java 21**

Paso 1: Clonar el repositorio

```
git clone https://github.com/davicotico/api-rest-blog.git
```

Paso 2: Entrar a la carpeta del proyecto en `api-rest-blog/apiblog`

```shell
cd api-rest-blog
cd apiblog
```

Paso 3: Ejecutar la aplicación

```shell
./mvnw spring-boot:run
```

## Características

### Autor

- [x] Crear autor
- [x] Listar autores

### Blog

- [x] Crear blogs
- [x] Listar blogs
- [x] Añadir comentarios a un blog
- [x] Actualizar blog por ID
- [x] Consultar blog por ID
- [x] Lista de comentarios por blog (por ID del blog)
- [x] Histórico de cambios de un blog (por ID del blog)

