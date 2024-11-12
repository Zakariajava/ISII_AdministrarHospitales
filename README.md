# ISII_AdministrarHospitales
## Proyecto de Prácticas - Sistema de Gestión Hospitalaria para la Comunidad Valenciana
Descripción General
Este proyecto tiene como objetivo desarrollar un sistema de software para gestionar de manera eficiente la información y las operaciones cotidianas en los hospitales de la Comunidad Valenciana. Está diseñado para facilitar el trabajo del personal sanitario, como médicos y enfermeras, brindándoles acceso seguro a la información que necesitan para la administración de pacientes, medicamentos e inventario de suministros médicos. El sistema también incluye funcionalidades avanzadas de consulta y administración de historiales médicos, mejorando la precisión y calidad de la atención sanitaria.

# Funcionalidades Principales
1. Autenticación y Perfiles de Usuario
Autenticación segura: Los médicos y enfermeras deben iniciar sesión en el sistema usando un usuario y contraseña.
Roles y acceso personalizado: Dependiendo del rol, el sistema mostrará una interfaz específica con funcionalidades acordes a las necesidades del perfil (médico o enfermera).
2. Gestión de Información para Médicos
Agenda diaria de pacientes: Los médicos pueden ver una lista de pacientes que necesitan atención, incluyendo detalles como apellidos, habitación y síntomas.
Consulta y actualización de historial médico: Acceso a un historial cronológico detallado de cada paciente y posibilidad de actualizarlo con información de altas y tratamientos.
Búsqueda avanzada:
Enfermedades: Permite consultar enfermedades por nombre, tratamientos recomendados, dosis, tomas diarias y contagiosidad.
Medicamentos: Ofrece detalles sobre las enfermedades que trata cada medicamento, sus posibles efectos secundarios y alergias.
3. Gestión de Información para Enfermeras
Planificación de administración de medicamentos: Las enfermeras pueden consultar la lista de pacientes con la información de los medicamentos que deben administrarse (incluyendo dosis y frecuencia).
Inventario de medicamentos: Visualización del estado del inventario y alertas automáticas en caso de medicinas con niveles bajos.
4. Control de Errores en el Historial Médico
El sistema previene la duplicación de datos en el historial médico. En caso de que un médico intente agregar una entrada repetida (con el mismo DNI y fecha), el sistema generará una excepción, indicando los datos duplicados.

# Estructura del Proyecto
Controlador: Contiene la lógica de negocio y gestiona la interacción entre la vista y el modelo.
Enfermera: Incluye los módulos específicos para el acceso y funcionalidades disponibles para las enfermeras.
Médico: Módulos específicos para la gestión de los accesos y funcionalidades disponibles para los médicos.
Modelo: Implementa la lógica de datos y la gestión de información en la base de datos.
Vista Principal: Interfaz gráfica principal que conecta las vistas específicas para cada perfil de usuario.

# Repositorio
Este proyecto está organizado en diversas carpetas:
controlador: Módulo controlador de la lógica del sistema.
enfermera: Implementación de la interfaz y funcionalidades específicas de enfermería.
medico: Módulo para la interfaz y funcionalidades específicas de los médicos.
modelo: Contiene el modelo de datos y la gestión de bases de datos.
vista_Principal: Interfaz gráfica de inicio, que permite la autenticación de usuarios y navegación inicial.
imagenes: Archivos visuales que soportan la interfaz del sistema.

Actualizaciones
Este README se actualizará conforme se desarrollen nuevas funcionalidades o se hagan ajustes en el proyecto.
