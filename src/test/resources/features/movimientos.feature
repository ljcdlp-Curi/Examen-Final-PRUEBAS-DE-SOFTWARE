# language: es

Característica: Consulta de movimientos

  @movimientos
  Escenario: Consultar los movimientos de la cuenta
    Dado que Jaime está en la pantalla de login
    Cuando ingresa el usuario "jaime" y la contraseña "Cibertec123"
    Entonces debería ver el saludo "Hola, Jaime Pretell"
    Cuando ingresa a la pantalla de movimientos
    Entonces debería ver el título "Movimientos"
    Cuando desplaza la lista hasta el final
    Entonces debería ver el contador "Mostrando 32 de 32 movimientos"