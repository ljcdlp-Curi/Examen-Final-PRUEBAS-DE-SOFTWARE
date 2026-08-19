package edu.pe.cibertec.ciberbank.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConstanciaScreen {

    private static final String PAQUETE = "edu.pe.cibertec.ciberbank:id/";

    private ConstanciaScreen() {
    }

    public static final Target OPERACION_EXITOSA =
            Target.the("mensaje de operación exitosa")
                    .located(By.id(PAQUETE + "lbl_operacion_exitosa"));

    public static final Target NUMERO_OPERACION =
            Target.the("número de operación")
                    .located(By.id(PAQUETE + "lbl_numero_operacion"));

    public static final Target BENEFICIARIO =
            Target.the("beneficiario de la constancia")
                    .located(By.id(PAQUETE + "lbl_constancia_destino"));

    public static final Target MONTO =
            Target.the("monto de la constancia")
                    .located(By.id(PAQUETE + "lbl_constancia_monto"));

    public static final Target FECHA_EJECUCION =
            Target.the("fecha de ejecución")
                    .located(By.id(PAQUETE + "lbl_constancia_fecha"));

    public static final Target SALDO_ACTUALIZADO =
            Target.the("saldo actualizado")
                    .located(By.id(PAQUETE + "lbl_saldo_actualizado"));

    public static final Target BOTON_IR_INICIO =
            Target.the("botón Ir al inicio")
                    .located(By.id(PAQUETE + "btn_ir_inicio"));
}