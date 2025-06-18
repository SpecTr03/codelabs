### `Direccion publica del ingress:` 34.120.189.1
Cuando se accede a la direccion http://34.120.189.1/api/pais-service/hola/alvaro obtenemos
el mensaje "Hola alvaro" en pantalla.  
Sin embargo, con la direccion http://34.120.189.1/api/pais-service/pais-actuator/health obtenemos
un error HTTP 401, esto es debido a que el endpoint esta protegido, por lo tanto, no podemos acceder
si no tenemos las credenciales correctas.  
Una posible solucion es cambiar el SecurityConfig.java para que el endpoint pueda ser accedido sin autenticacion
o bien, crear un usuario y contraseña por defecto para acceder a este endpoint. Por ultimo, actualizar
la imagen de Docker y desplegarla nuevamente en el cluster de GKE.