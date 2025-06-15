## ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito en el diseño de software?
El Attribute-Driven Design (ADD) es un enfoque de diseño arquitectónico enfocado en la calidad, 
que identifica las diferentes capas y requisitos que puede poseer un sistema, su proposito es 
guiar al equipo de desarrollo en la creacion de tacticas, modulos, directorios y reglas 
para un correcto diseño de software y posterior exito en la implementacion del codigo 
y su mantenimiento.

## ¿Cómo se relaciona ADD con Clean Architecture en el proceso de diseño de sistemas?
ADD proporciona un documento que formaliza el diseño de software, mientras que,
clean architecture es una serie de reglas que se deben seguir para cumplir el diseño de software.
Por lo que ADD es donde describimos la arquitectura y el por que de las decisiones tomadas, mientras
que clean architecture es una implementacion de dicho enfoque.

## ¿Cómo se identifican los atributos de calidad en ADD y por qué son importantes?
Los atributos de calidad se identifican segun la prioridad del cliente y las necesidades del sistema,
por ejemplo, un sistema de ventas masivo puede requerir alto rendimiento y seguridad, un sistema 
de  aviacion puede requerir alta disponibilidad.

## ¿Por qué Clean Architecture complementa ADD en la implementación de una solución?
Clean Architecture viene con un marco de trabajo estructurado que ayuda a implementar ADD,
por lo que ADD solo debe heredar las reglas y la claridad del marco de clean architecture.

## ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?
Se debe considerar la responsabilidad unica (SRP), la regla de dependencia, la independencia de
tecnologias externas, una nomenclatura consistente,la escalabilidad y la mantenibilidad del sistema.

## ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?
ADD se centra en la identificacion de los atributos de calidad,
(tambien requisitos funcionales y no funcionales) y ademas el porque de cada decision tomada.

## ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?
* Responsabilidad unica de cada microservicio (SRP)
* Reglas de dependencia aplicadas a cada microservicio
* Si el equipo de desarrollo implemento las reglas de consistencia y un lenguaje comun, 
  cada microservicio tendra una estructura similar y entendible por todo el equipo de trabajo.
* Un plan frente a riesgos y mitigaciones que pueden surgir en la etapa de produccion.

## ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?
Se debe establecer de manera clara, no ambigua y medible los atributos de calidad, ademas,
cuando se desarrollo el ADD, se debio establecer una serie de tacticas las cuales ayudan al equipo
de desarrollo en como implementar cada atributo de calidad y como se medira su cumplimiento.

## ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?
En mi opinion, la forma mas sencilla de validar la arquitectura diseñada, es mediante la revision
de pares y consultores externos. En cuanto a herramientas, hay demasiadas, por mencionar algunas, diria que:
* SonarQube para analisis de codigo y calidad.
* ArchUnit para pruebas de arquitectura en Java.
* Jmeter para pruebas de rendimiento.
* Nessus para pruebas de seguridad.