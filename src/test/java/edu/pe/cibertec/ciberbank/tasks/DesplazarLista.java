package edu.pe.cibertec.ciberbank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DesplazarLista implements Task {

    public static DesplazarLista hastaElFinal() {
        return instrumented(DesplazarLista.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver =
                BrowseTheWeb.as(actor).getDriver();

        JavascriptExecutor javascript =
                (JavascriptExecutor) driver;

        Map<String, Object> parametros =
                new HashMap<>();

        parametros.put("left", 0);
        parametros.put("top", 700);
        parametros.put("width", 1080);
        parametros.put("height", 1600);
        parametros.put("direction", "down");
        parametros.put("percent", 3.0);

        javascript.executeScript(
                "mobile: scrollGesture",
                parametros
        );
    }
}