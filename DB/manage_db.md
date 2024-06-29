# Creación y puesta en marcha de la DB

## Crear la imagen

Para crear el contenedor, sobre la imagen del Dockerfile, lanzamos el comando build:

- docker build -t <[nombre del contendor]> <[ruta del Dockerfile]>

## Lanzar el contenedor y ejecutar sqlite

- docker run -v $(pwd)/data:/usr/local -it <[nombre del contenedor]> bash
- sqlite3: ejecuta un browser de sqlite en terminal
- .quit: salir del browser

Con esto ya podemos hacer modificaciones sobre la db de la aplicación por consola.
