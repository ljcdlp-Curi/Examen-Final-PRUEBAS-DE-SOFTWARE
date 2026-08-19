package edu.pe.cibertec.ciberbank.questions;

import edu.pe.cibertec.ciberbank.userinterface.ConfirmacionScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarSaldoInsuficiente implements Question<Boolean> {

    private final String mensajeEsperado;

    public ValidarSaldoInsuficiente(String mensajeEsperado) {
        this.mensajeEsperado = mensajeEsperado;
    }

    public static ValidarSaldoInsuficiente conMensaje(String mensaje) {
        return new ValidarSaldoInsuficiente(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ConfirmacionScreen.MENSAJE_DIALOGO
                .resolveFor(actor)
                .getText()
                .equalsIgnoreCase(mensajeEsperado);
    }
}