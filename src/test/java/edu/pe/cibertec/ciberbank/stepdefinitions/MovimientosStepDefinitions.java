package edu.pe.cibertec.ciberbank.stepdefinitions;

import edu.pe.cibertec.ciberbank.questions.TextoDe;
import edu.pe.cibertec.ciberbank.tasks.AbrirMovimientos;
import edu.pe.cibertec.ciberbank.tasks.DesplazarLista;
import edu.pe.cibertec.ciberbank.userinterface.MovimientosScreen;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.ensure.Ensure.that;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class MovimientosStepDefinitions {

    @Cuando("ingresa a la pantalla de movimientos")
    public void ingresaALaPantallaDeMovimientos() {

        theActorInTheSpotlight().attemptsTo(
                AbrirMovimientos.desdeDashboard()
        );
    }

    @Cuando("desplaza la lista hasta el final")
    public void desplazaLaListaHastaElFinal() {

        theActorInTheSpotlight().attemptsTo(
                DesplazarLista.hastaElFinal()
        );
    }

    @Entonces("debería ver el contador {string}")
    public void deberiaVerElContador(String contador) {

        theActorInTheSpotlight().attemptsTo(
                that(TextoDe.el(
                        MovimientosScreen.CONTADOR_MOVIMIENTOS
                )).isEqualTo(contador)
        );
    }

    @Entonces("debería ver el título {string}")
    public void deberiaVerElTitulo(String titulo) {

        theActorInTheSpotlight().should(
                seeThat(
                        TextoDe.el(MovimientosScreen.TITULO),
                        equalTo(titulo)
                )
        );
    }

    @Entonces("debería ver el movimiento {string}")
    public void deberiaVerElMovimiento(String movimiento) {

        theActorInTheSpotlight().attemptsTo(
                that(TextoDe.el(
                        MovimientosScreen.CONCEPTO_MOVIMIENTO
                )).isEqualTo(movimiento)
        );
    }
}