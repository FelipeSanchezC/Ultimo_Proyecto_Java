Feature: Validar el flujo de registros de usuarios
  Yo como automatizador
  Necesito validar los flujos de registros para nuevos usuarios
  Para validar el correcto funcionamiento de la web


  @testCase3
  Scenario: Realizar el registro de forma correct de un usuario nuevo
    Given Selecciono la opcion de Login en la pagina web
    When Selecciono la opcion de Crear cuenta y complemento la informacion
      | username | Pruebas961223           |
      | email    | pruebas9612@pruebas.com |
      | password | PruebasP1               |
    Then Valido que realice de forma el registro del usuario

