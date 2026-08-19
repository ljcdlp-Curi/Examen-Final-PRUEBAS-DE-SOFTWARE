# language: es

Característica: Transferencia bancaria en CiberBank
  Como cliente del banco
  Quiero realizar una transferencia
  Para enviar dinero a un beneficiario

  @transferencia
  Escenario: Transferencia con saldo insuficiente
    Dado que Jaime está en la pantalla de login
    Cuando ingresa el usuario "sinsaldo" y la contraseña "Cibertec123"
    Y selecciona la opción de transferencias
    Y ingresa el monto "100.00"
    Y ingresa el concepto "Prueba saldo insuficiente"
    Y presiona el botón continuar
    Entonces debería ver el mensaje de transferencia "Saldo insuficiente"