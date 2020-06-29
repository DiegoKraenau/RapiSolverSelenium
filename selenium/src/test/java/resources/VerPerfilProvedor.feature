
Feature: El app permitira registar un servicio solo para proveedores
  Scenario: Registro de un servicio por parte de un proveedor
    Given El usuario ingresa sus credenciales de acceso
    And Hace click en Sing In
    And Hace click en Buscar Proveedor
    And Ingresa el nombre del Proveedor
    When Selecciona el boton Ver Perfil
    And  Se posiciona el puntero en la foto del Proveedor
    Then Se Muestra los datos del proveedor