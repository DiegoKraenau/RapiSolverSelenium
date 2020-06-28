Feature: El app permitira registar un servicio solo para proveedores
  Scenario: Registro de un servicio por parte de un proveedor
    Given El usuario ingresa sus credenciales de acceso
    And Hace click en Sing In
    And Hace click en Publicar Servicio
    And Ingresa el nombre del servicio
    And Ingresa la descripcion del servicio
    And Ingresa el costo del servicio
    And Selecciona la categoria del servicio
    When Se presiona el boton Agregar
    Then El servicio fue registrado en el sistema