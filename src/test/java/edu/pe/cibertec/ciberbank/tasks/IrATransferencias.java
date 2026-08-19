package edu.pe.cibertec.ciberbank.tasks;

import edu.pe.cibertec.ciberbank.userinterface.DasboardScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrATransferencias implements Task {

    public static IrATransferencias ahora() {
        return instrumented(IrATransferencias.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DasboardScreen.BOTON_MENU),
                Click.on(DasboardScreen.BOTON_TRANSFERENCIAS)
        );
    }
}