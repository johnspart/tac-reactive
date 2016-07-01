# Arquitectura de referencia wlp

Arquitectura de referencia de una aplicación para contenedor WAS Liberty (wlp) para el proyecto Advance.

Expone servicios HTTP siguiendo la especificación [JAX-RS](https://jax-rs-spec.java.net/), generando eventos a topicos [IBM MQ](http://www-03.ibm.com/software/products/en/ibm-mq) y persistiendo datos contra Oracle RDBMS 12c a través de [JDBI](http://jdbi.org/). 

Cada petición HTTP es atendida por un servlet JAX-RS que delega el procesamiento de la solicitud a RxJava, buscando aumentar la concurrencia sobre la JVM.

## Table of contents
- [Guía de uso](#Guía de uso)
- [Instalación de wlp](#Instalación de wlp)
- [Running](#Running)
- [Testing](#Testing)
- [Correr Oracle RDBMS en docker](#Correr Oracle RDBMS en docker)
- [Configuración Flyway](#Configuración Flyway)
- [Arquitectura como código](#Arquitectura como código) 

## Guía de uso

Todo el ciclo de desarrollo sobre la aplicación se realiza a través de [Gradle](http://gradle.org/). 

El proyecto cuenta con `gradlew` embebido con la versión en la cual se crea el proyecto, este script debería ser ejecutado por CI servers, en desarrollo es preferido usar la versión local con [Gradle Daemon](https://docs.gradle.org/current/userguide/gradle_daemon.html) instalado.

### Tareas disponibles en ```gradle```

- ```gradle eclipse```: Genera el .project para importar el proyecto en Eclipse.
- ```gradle idea```: Genera todos los artefactos y baja todas las dependencias del proyecto. Queda como un proyecto listo a abrir en IDEA.
- ```gradle cleanEclipse```: Cleans all Eclipse files.
- ```gradle cleanIdea```: Cleans IDEA project files (IML, IPR)
- ```gradleclean```: Deletes the build directory.
- ```gradlewar```: Generates a war archive with all the compiled classes, the web-app content and the libraries.
- ```gradle jacocoTestReport```: Reporte de la cobertura de pruebas unitarias.
- ```gradle flywayMigrate```: Migra el schema de datos a la última versión.
- ```gradle localDeploy```: Copia el ```war``` de la aplicación al servidor de aplicaciones. 
- ```gradle generateJsonSchema2Pojo```: Genera los POJOs correspondientes a los JSON encontrados en ```src/main/java/resources/json/```. Las rutas de origen y destino de generación se pueden configurar en la tarea 
jsonSchema2Pojo del ```build.gradle```.
- ```gradle tasks```: Despliega en consola todas las tareas disponibles.

## Instalación de wlp
Por favor remitirse al proyecto Advance/infraestructura donde se encontará el Dockerfile del wlp en uso.

## Running

Para desplegar el proyecto en el servidor configurado en ```gradle.properties```, ejecutar la tarea ```gradle localDeploy```.

## Testing

Pruebas unitarias: ```gradle test```

## Correr Oracle RDBMS en docker

Por favor remitirse al proyecto Advance/infraestructura donde se encontará el Dockerfile de la DB Oracle en uso.

## Configuración Flyway

1. Modificar los datos de conexión a la DB de la tarea "flyway" en ```build.gradle```
2. Para generar la base de datos ejecutar: ```gradle flywayClean flywayMigrate```

## Arquitectura como código

Copiar este proyecto y renombrar la carpeta con el nombre de la app.

1. Borrar el .git
2. Modificar el gradle.properties
  - Cambiar los datos de conexión a la DB si aplica.
  - Modificar el nombre de la app.
  - Modificar el deployPath.
  - Modificar la versión de la aplicación si aplica.




