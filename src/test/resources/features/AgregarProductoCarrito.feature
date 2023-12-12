Feature: Validar el funcionamiento del agregar productos al carro de compras
  Yo como automatizador
  Necesito validar los flujos de agregar productos al carro de compras
  Para validar el correcto funcionamiento de la web


  @testCase4
  Scenario: Agregar varios productos de laptos al carrito de compras
    Given el usuario realiza el login en la pagina Web con usuario registado
      | username | Pruebas961223 |
      | password | PruebasP1     |
    When Selecciona los productos de laptos que quiere comprar
    Then Valida que el carrito cuente con los productos de forma correcta