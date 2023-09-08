# Proyecto en Spring Boot con Arquitectura Hexagonal

## Descripción

Este proyecto es un ejemplo de una aplicación construida utilizando Spring Boot y siguiendo la arquitectura hexagonal.

## Requisitos Previos

- Openjdk 20 o superior
- Maven
- IDE favorito (IntelliJ IDEA, Eclipse, etc.)

## Configuración Inicial

Clone el repositorio:

\`\`\`bash
git clone https://github.com/devangelmotta/hexagonal-arch-address-directory.git
\`\`\`

Navegue hasta el directorio del proyecto:

\`\`\`bash
cd hexagonal-arch-address-directory
\`\`\`

Compile y ejecute el proyecto:

\`\`\`bash
mvn clean install
java -jar target/hexagonal-arch-address-directory-0.0.1-SNAPSHOT.jar
\`\`\`

## Arquitectura Hexagonal

Este proyecto sigue la arquitectura hexagonal, que separa la lógica de negocio del código que interactúa con el mundo exterior (por ejemplo, la base de datos, la interfaz de usuario, etc.)

### Capas

- `Aplicación`: Contiene toda la lógica de la aplicación y las APIs.
- `Dominio`: Contiene las entidades y los casos de uso.
- `Infraestructura`: Contiene la implementación de la base de datos, servicios externos, etc.

## Diagrama de la Arquitectura

<p align="center">
    <img src="https://github.com/devangelmotta/hexagonal-arch-address-directory/blob/b187d3253b24bb9c0cbb9de8f12651fa71a872b8/address-project-architecture.png" alt="Project arquitectura">
</p>


