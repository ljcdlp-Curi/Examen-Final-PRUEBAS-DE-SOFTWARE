package edu.pe.cibertec.ciberbank.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferenciaScreen {

    private static final String PAQUETE =
            "edu.pe.cibertec.ciberbank:id/";

    private TransferenciaScreen() {
    }

    public static final Target SPINNER_BENEFICIARIO =
            Target.the("spinner de beneficiario")
                    .located(By.id(PAQUETE + "spn_beneficiario"));

    public static final Target BENEFICIARIO_LUIS_RAMOS =
            Target.the("beneficiario Luis Ramos - Interbank")
                    .located(By.xpath(
                            "//android.widget.TextView" +
                                    "[@resource-id='edu.pe.cibertec.ciberbank:id/lbl_spinner_opcion'" +
                                    " and @text='Luis Ramos - Interbank']"
                    ));

    public static final Target MONTO =
            Target.the("campo monto")
                    .located(By.id(PAQUETE + "inp_monto"));

    public static final Target CONCEPTO =
            Target.the("campo concepto")
                    .located(By.id(PAQUETE + "inp_concepto"));

    public static final Target BOTON_CONTINUAR =
            Target.the("botón Continuar")
                    .located(By.id(PAQUETE + "btn_continuar"));

    public static final Target SALDO_DISPONIBLE =
            Target.the("saldo disponible")
                    .located(By.id(PAQUETE + "lbl_saldo_disponible"));

    public static final Target ERROR_TRANSFERENCIA =
            Target.the("mensaje de error de transferencia")
                    .located(By.id(PAQUETE + "err_transferencia"));
}