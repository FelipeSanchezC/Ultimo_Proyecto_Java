Feature: Validar los flujos de login en la Web
  Yo como automatizador
  Necesito realizar flujos de login de los usuarios
  Para validar el correcto funcionamiento de la web

  @testCase1
  Scenario: Realizar login con usuario y contraseña correcta
    Given Me encuentro en el Home de la pagina
    And Selecciono la opcion de Login en la pagina web
    When Ingreso las credenciales correctas usuario 'Pruebas1' y password 'Pruebas1'
    Then Valido que realice de forma correcta el Login en la web

  @testCase2
  Scenario: Realizar login con usuario y contraseña incorrecta
    Given Me encuentro en el Home de la pagina
    And Selecciono la opcion de Login en la pagina web
    When Ingreso las credenciales incorrectas usuario 'Pruebas112' y password 'Pruebas1'
    Then Valido que se presente el mensaje de control para usuario y contraseña erroneo

  Escenario


    #comentarios