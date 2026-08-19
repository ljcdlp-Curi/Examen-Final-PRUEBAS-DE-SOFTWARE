package edu.pe.cibertec.ciberbank.tasks;

import edu.pe.cibertec.ciberbank.userinterface.TransferenciaScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarConcepto implements Task {

    private final String concepto;

    public IngresarConcepto(String concepto) {
        this.concepto = concepto;
    }

    public static IngresarConcepto conTexto(String concepto) {
        return instrumented(IngresarConcepto.class, concepto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(TransferenciaScreen.CONCEPTO),
                Enter.theValue(concepto)
                        .into(TransferenciaScreen.CONCEPTO)
        );
    }
}