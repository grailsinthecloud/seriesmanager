# Series Manager

Es una aplicación móvil que permite a sus usuarios mantenerse al tanto de los episodios de sus series favoritas, marcar los que ya vió y planificar cuáles series mirará.

Para abaratar costos, la empresa contrató a tres grupos distintos de desarrolladores, cada uno experto en determinada plataforma (Android, iOS y Windows Phone).

Estos tres equipos de desarrollo esperan que se les provea una API con las funcionalidades que proveerá la aplicación, dejando la menor cantidad de lógica posible en las aplicaciones y centralizando la misma en esa API.

Para obtener la información sobre las series, se utilizará un servicio externo provisto por [The Movie Database (TMDb)](https://www.themoviedb.org/). Toda la información accesible desde su página, también la proveen a través de una API, cuya documentación y uso es libre.

La documentación está en: http://docs.themoviedb.apiary.io/

La API key a usar es: 

> 4883683d8402af2dfc264b8d1fc64316

En principio, se pide **implementar** las siguientes funcionalidades:

- Obtener una lista de series populares
- Buscar una serie por título
- Listar los actores principales de una serie
- Listar series similares a determinada serie
- Obtener información sobre el último episodio emitido de una serie

Además, para el futuro del desarrollo de la aplicación, es necesario **investigar** sobre:

- Manejo de requests HTTP en Grails
- HTTP methods
- HTTP response codes
- HTTP headers
- JSON encoding y decoding en Grails
- Servicios de API status
- OAuth
