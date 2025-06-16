## ¿Cuál es el propósito principal de Clean Architecture en el desarrollo de software?
Asegurar la separacion de responsabilidades y el desacoplamiento de componentes
(logica de negocio, aplicacion, infraestructura, presentacion)

## ¿Qué beneficios aporta Clean Architecture a un microservicio en Spring Boot?
* Desacoplamiento entre la logica de negocio y el framework
* Independencia de una base de datos especifica
* Mayor mantenibilidad y testabilidad
* Escalabilidad y flexibilidad para cambios futuros

## ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?
* Dominio: Contiene las entidades y los objetos de valor con las reglas de negocio puras, su
y una de sus principales responsabilidades es la de no depender de ningun framework o tecnologia
* Aplicacion: Contiene los casos de uso y es la responsable de manejar la logica del negocio
sin acoplarse a detalles de infraestructura o frameworks, para ello usa interfaces.
* Infraestructura: Contiene la implementacion de repositorios y servicios externos, su
responsabilidad es definir la configuracion de las tecnologias y frameworks utilizados
* Presentacion: Contiene los controladores y la logica de presentacion, su responsabilidad
es interactuar con el usuario y presentar los datos de manera adecuada, esto sin acoplarse
a la logica de negocio.

## ¿Por qué se recomienda desacoplar la lógica de negocio de la infraestructura en un microservicio?
Para que el codigo sea mas facil de mantener, testear y escalar, ademas, esto permite una mayor
resistencia a cambios, ya que la logica de negocio es la mas estable y no cambia tan abruptamente
como si lo hacen las tecnologias.

## ¿Cuál es el rol de la capa de aplicación y qué tipo de lógica debería contener?
Orquestar la logica de negocio, logrando esto con los casos de uso, que son los principales
encargados de:
* Validar las entradas y salidas de la aplicacion
* Coordinar con la infraestructura a traves de interfaces
* Transformar los datos con DTOs (Data Transfer Objects)
* Verificar los permisos de acceso a recursos y datos

## ¿Qué diferencia hay entre un UseCase y un Service en Clean Architecture?
Un UseCase contiene la logica de negocio especifica de la aplicacion, mientras que un service
es mas general. Por ejemplo, un UseCase puede ser "CrearUsuario" que contiene la logica de solo
crear un usuario, mientras que un service puede ser "UsuarioService" que contiene la logica de
varios casos de uso relacionados con usuarios, como crear, actualizar, eliminar, etc.

## ¿Por qué se recomienda definir Repositories como interfaces en la capa de dominio en lugar de usar directamente JpaRepository?
Para aplicar el principio de inversion de dependencias, y asi cumplir con la arquitectura hexagonal.

## ¿Cómo se implementa un UseCase en un microservicio con Spring Boot y qué ventajas tiene?
Se aplica con una inyeccion de dependencias del repository y la implementacion de la logica de negocio,
es decir, manejar la logica de la consulta enviada por el controlador y modificar solo esa accion en particular.
Las ventajas son:
* Facilita la prueba unitaria de la logica de negocio
* Permite una mayor flexibilidad para cambiar la implementacion de la logica de negocio
* Reduce el acoplamiento entre la persistencia, la infraestructura y la interfaz de usuario (API)
* Facilita la aplicacion de principios SOLID

## ¿Qué problemas podrían surgir si no aplicamos Clean Architecture en un proyecto de microservicios?
La logica del negocio puede estar contaminada con la infraestructura, provocando dificultad a la hora
de cambiar de tecnologias. La testabilidad puede verse afectada, ya que se debe testear toda la aplicacion
en lugar de solo fragmentos de codigo. La mantenibilidad puede verse afectada al no haber una
estructura clara sobre la separacion de responsabilidades.

## ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad en un entorno basado en microservicios?
Clean Architecture facilita la claridad de responsabilidades, cada capa tiene una responsabilidad y cuando
surjan cambios, solo se vera afectada la capa correspondiente, haciendo que el codigo sea mas llevable
en cuanto al refactoring.