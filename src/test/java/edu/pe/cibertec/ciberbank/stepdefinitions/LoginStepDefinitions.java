package edu.pe.cibertec.ciberbank.stepdefinitions;

import edu.pe.cibertec.ciberbank.questions.TextoDe;
import edu.pe.cibertec.ciberbank.tasks.EsperarLaPantallaDeLogin;
import edu.pe.cibertec.ciberbank.tasks.IniciarSesion;
import edu.pe.cibertec.ciberbank.userinterface.DashboardScreen;
import edu.pe.cibertec.ciberbank.userinterface.LoginScreen;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class LoginStepDefinitions {

    @Before
    public void preparaEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void cierraEscenario() {
        OnStage.drawTheCurtain();
    }

    @Dado("que {word} está en la pantalla de login")
    public void queEstaEnLaPantallaDeLogin(String actor) {
        theActorCalled(actor).attemptsTo(
                EsperarLaPantallaDeLogin.queSeMuestre()
        );
    }

    @Cuando("ingresa el usuario {string} y la contraseña {string}")
    public void ingresaElUsuarioYLaContrasena(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.con(usuario, clave)
        );
    }

    @Entonces("debería ver el saludo {string}")
    public void deberiaVerElSaludo(String saludo) {
        theActorInTheSpotlight().attemptsTo(
                that(TextoDe.el(DashboardScreen.SALUDO)).isEqualTo(saludo)
        );
    }

    @Y("el saldo mostrado debería ser {string}")
    public void elSaldoMostradoDeberiaSer(String saldo) {
        theActorInTheSpotlight().attemptsTo(
                that(TextoDe.el(DashboardScreen.SALDO_PRINCIPAL)).isEqualTo(saldo)
        );
    }

    @Entonces("debería ver el mensaje de error {string}")
    public void deberiaVerElMensajeDeError(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                that(TextoDe.el(LoginScreen.ERROR_LOGIN)).isEqualTo(mensaje)
        );
    }

    @Entonces("debería ver el mensaje de error del usuario {string}")
    public void deberiaVerElMensajeDeErrorDelUsuario(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                that(TextoDe.el(LoginScreen.ERROR_USUARIO)).isEqualTo(mensaje)
        );
    }


}
