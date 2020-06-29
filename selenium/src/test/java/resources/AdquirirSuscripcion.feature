Feature: El app permitira registar un servicio solo para proveedores
  Scenario: Registro de un servicio por parte de un proveedor
    Given El usuario ingresa sus credenciales de acceso
    And Hace click en Sing In
    And Hace click en Mi Perfil
    When Hace click en Comprar suscripcion
    And Hace click en Comprar ahora de cualquier opcion
    And Se rellena el campo de validacion de pago
    And Hace click en Siguiente
    Then Se Muestra el perfil la duracion de la suscripcion