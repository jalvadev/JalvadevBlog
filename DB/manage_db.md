# Acceder a la DB

## Crear la imagen

Para crear la imagen sobre el Dockerfile, lanzamos el comando build:

- docker build -t <[nombre de la imagen]> <[ruta del Dockerfile]>

## Crear el contenedor, acceder a él y ejecutar sqlite

- docker run -v $(pwd)/data:/usr/local -it <[nombre de la imagen]> bash
- sqlite3: ejecuta un browser de sqlite en terminal
- .quit: salir del browser

Con esto ya podemos hacer modificaciones sobre la db de la aplicación por consola.

Una vez creado el contenedor ya simplemente accedemos cada vez con:

- docker exec -it <[nombre del contendor]> bash
