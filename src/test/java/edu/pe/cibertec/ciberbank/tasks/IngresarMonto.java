package edu.pe.cibertec.ciberbank.tasks;

import edu.pe.cibertec.ciberbank.userinterface.TransferenciaScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarMonto implements Task {

    private final String monto;

    public IngresarMonto(String monto) {
        this.monto = monto;
    }

    public static IngresarMonto de(String monto) {
        return instrumented(IngresarMonto.class, monto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(TransferenciaScreen.MONTO),
                Enter.theValue(monto)
                        .into(TransferenciaScreen.MONTO)
        );
    }
}