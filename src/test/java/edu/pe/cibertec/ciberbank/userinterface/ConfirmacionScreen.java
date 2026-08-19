package edu.pe.cibertec.ciberbank.userinterface;

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

    public static final Target DIALOGO_ACEPTAR =
            Target.the("botón Aceptar del diálogo")
                    .located(By.id("android:id/button1"));

    public static final Target DIALOGO_CANCELAR =
            Target.the("botón Cancelar del diálogo")
                    .located(By.id("android:id/button2"));

    public static final Target TITULO_DIALOGO =
            Target.the("título del diálogo")
                    .located(By.id("edu.pe.cibertec.ciberbank:id/alertTitle"));

    public static final Target MENSAJE_DIALOGO =
            Target.the("mensaje del diálogo")
                    .located(By.id("android:id/message"));
}
