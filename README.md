# Como levantar el proyecto

## Database

Este proyecto utiliza una base de datos SQLite, por lo que necesitas correr el proyecto al menos una vez para que genere la base de datos.

```
gradle bootRun
```

La base de datos se generará por defecto en la ruta ```./DB/data/jalvadev.db```. 
Si quieres cambiar el nombre de la db o la ruta debes hacerlo cambiando la url en el archivo ```./blog/src/main/java/resources/application.properties```.

Este proyecto se basa en contendores Docker, por lo que si quieres acceder al sqlite no es necesario que lo instales ya que hay una imagen para ello en ```./DB```, para más información sobre esto consulta el archivo ```manage_db.md``` en la misma ruta.
