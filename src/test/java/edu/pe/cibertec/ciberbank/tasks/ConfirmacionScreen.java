package edu.pe.cibertec.ciberbank.tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionScreen {

    private ConfirmacionScreen() {
    }

    public static final Target BOTON_CONFIRMAR =
            Target.the("botón Confirmar")
                    .located(By.id("edu.pe.cibertec.ciberbank:id/btn_confirmar"));

    public static final Target BOTON_VOLVER =
            Target.the("botón Volver")
                    .located(By.id("edu.pe.cibertec.ciberbank:id/btn_volver"));

    public static final Target MENSAJE =
            Target.the("mensaje de confirmación")
                    .located(By.id("android:id/message"));

}
