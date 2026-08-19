package edu.pe.cibertec.ciberbank.tasks;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarBeneficiario implements Task {

    private final String beneficiario;

    public SeleccionarBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public static SeleccionarBeneficiario conNombre(String beneficiario) {
        return instrumented(
                SeleccionarBeneficiario.class,
                beneficiario
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Target opcionBeneficiario = Target.the(
                "beneficiario " + beneficiario
        ).located(
                AppiumBy.androidUIAutomator(
                        "new UiSelector().text(\"" + beneficiario + "\")"
                )
        );

        actor.attemptsTo(
                Click.on(By.id(
                        "edu.pe.cibertec.ciberbank:id/spn_beneficiario"
                )),

                WaitUntil.the(opcionBeneficiario, isVisible())
                        .forNoMoreThan(10)
                        .seconds(),

                Click.on(opcionBeneficiario)
        );
    }
}