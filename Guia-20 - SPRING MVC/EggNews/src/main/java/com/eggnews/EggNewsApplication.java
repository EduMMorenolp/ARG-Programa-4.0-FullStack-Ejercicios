package com.eggnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EggNewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EggNewsApplication.class, args);
    }

    /**
     *
     * EJERCICIOS DE APRENDIZAJE Para la realización de este trabajo práctico se
     * recomienda ver todos los videos de Spring, de esta manera sabemos todos
     * lo que tenemos que hacer, antes de empezar a hacerlo. SITIO DE NOTICIAS
     * EGG NEWS El objetivo de este ejercicio consiste en el desarrollo de un
     * sistema web en Java utilizando una base de datos MySQL, JPA Repository
     * para persistir objetos y Spring Boot como framework de desarrollo web.
     * Creación de la Base de Datos MySQL Crear el esquema sobre el cual operará
     * el sistema de noticias. Para esto, en el IDE de base de datos que esté
     * utilizando (por ejemplo, Workbench) ejecute la sentencia: CREATE DATABASE
     * noticia; Paquetes del Proyecto Los paquetes que se deben utilizar para el
     * proyecto se deben estructurar de la siguiente manera: • vistas: en este
     * paquete se almacenarán aquellas clases que se utilizarán como vistas con
     * el usuario. • controladores: en este paquete se almacenarán aquellas
     * clases que se utilizarán para mediar entre la vista con el usuario y las
     * capas inferiores. • servicios: en este paquete se almacenarán aquellas
     * clases que llevarán adelante lógica del negocio. • repositorios: en este
     * paquete se crearán los repositorios que servirán como interfaces entre el
     * modelo de objetos y la base de datos relacional. • entidades: en este
     * paquete se almacenarán aquellas clases que es necesario persistir en la
     * base de datos. Nota: Abajo explicamos en detalle cada capa. 29 Capa
     * entidades Spring utiliza una anotación para identificar aquellas clases
     * que serán entidades y repositorios. Todas las entidades deben estar
     * marcadas con la anotación @Entity y los repositorios con la anotación
     * @Repository, los repositorios heredarán la interfaz JPARepository, que
     * nos dará todos los métodos para persistir, editar, eliminar, etc. Entidad
     * Noticia La entidad Noticia modela las noticias que se publicarán en la
     * web. En esta entidad, el atributo “título” contiene el nombre con el cuál
     * vamos a encontrar la noticia, mientras que el atributo “cuerpo” contiene
     * toda la información que queremos que el usuario pueda leer. El
     * repositorio que persiste a esta entidad (NoticiaRepositorio) debe
     * contener los métodos necesarios para guardar/actualizar noticias en la
     * base de datos, realizar consultas o dar de baja según corresponda. Capa
     * de Servicios Spring utiliza una anotación para identificar aquellas
     * clases que serán servicios. Todos los servicios deben estar marcados con
     * la anotación @Service. NoticiaServicio Esta clase tiene la
     * responsabilidad de llevar adelante las funcionalidades necesarias para
     * administrar noticias (consulta, creación, modificación y dar de baja).
     * Capa de Comunicación Spring utiliza una anotación para identificar
     * aquellas clases que serán controladores. Todos los controladores deben
     * estar marcados con la anotación
     *
     * @Controller. NoticiaControlador Esta clase tiene la responsabilidad de
     * llevar adelante las funcionalidades necesarias para operar con la vista
     * del usuario diseñada para la gestión de noticias (guardar/modificar
     * noticia, listar noticias, dar de baja, etc). Capa de Vistas Esta capa
     * tiene la responsabilidad de llevar adelante las funcionalidades
     * necesarias para interactuar con el usuario. Las vistas para este proyecto
     * tienen que estar desarrolladas en HTML5 y se debe utilizar la biblioteca
     * Thymeleaf y CSS para implementar las plantillas. Además, se debe utilizar
     * el framework de Bootstrap para los componentes. Se deben diseñar y crear
     * todas las vistas web necesarias para llevar a cabo las siguientes
     * funcionalidades: • Vista inicio: en esta vista deben estar las
     * tarjetas(bootstrap) con el título de cada noticia, ordenadas de más
     * reciente a más antigua. • Vista noticia: en esta vista tendremos el
     * acceso a la noticia completa (cuerpo). Es la vista que se abre cuando
     * hacemos click en alguna tarjeta de la vista inicio. • Vista panelAdmin:
     * en esta vista es donde gestionaremos las noticias. Aquí encontraremos los
     * formularios necesarios para crear, modificar o eliminar una Noticia
     */
}
