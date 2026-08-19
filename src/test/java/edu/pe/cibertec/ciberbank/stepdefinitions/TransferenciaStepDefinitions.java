package edu.pe.cibertec.ciberbank.stepdefinitions;

import edu.pe.cibertec.ciberbank.questions.TextoDe;
import edu.pe.cibertec.ciberbank.tasks.ContinuarTransferencia;
import edu.pe.cibertec.ciberbank.tasks.IngresarConcepto;
import edu.pe.cibertec.ciberbank.tasks.IngresarMonto;
import edu.pe.cibertec.ciberbank.tasks.IrATransferencias;
import edu.pe.cibertec.ciberbank.tasks.SeleccionarBeneficiario;
import edu.pe.cibertec.ciberbank.userinterface.TransferenciaScreen;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class TransferenciaStepDefinitions {

    @Cuando("selecciona la opción de transferencias")
    public void seleccionaLaOpcionDeTransferencias() {

        theActorInTheSpotlight().attemptsTo(
                IrATransferencias.ahora()
        );
    }

    @Y("selecciona el beneficiario {string}")
    public void seleccionaElBeneficiario(String beneficiario) {

        theActorInTheSpotlight().attemptsTo(
                SeleccionarBeneficiario.conNombre(beneficiario)
        );
    }

    @Y("ingresa el monto {string}")
    public void ingresaElMonto(String monto) {

        theActorInTheSpotlight().attemptsTo(
                IngresarMonto.de(monto)
        );
    }

    @Y("ingresa el concepto {string}")
    public void ingresaElConcepto(String concepto) {

        theActorInTheSpotlight().attemptsTo(
                IngresarConcepto.conTexto(concepto)
        );
    }

    @Y("presiona el botón continuar")
    public void presionaElBotonContinuar() {

        theActorInTheSpotlight().attemptsTo(
                ContinuarTransferencia.ahora()
        );
    }

    @Entonces("debería ver el mensaje de transferencia {string}")
    public void deberiaVerElMensajeDeTransferencia(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                that(TextoDe.el(TransferenciaScreen.ERROR_TRANSFERENCIA))
                        .isEqualTo(mensaje)
        );
    }
}