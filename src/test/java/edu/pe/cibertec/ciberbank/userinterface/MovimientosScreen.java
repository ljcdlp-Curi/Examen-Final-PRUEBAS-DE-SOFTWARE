package edu.pe.cibertec.ciberbank.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MovimientosScreen {

    private static final String PAQUETE =
            "edu.pe.cibertec.ciberbank:id/";

    private MovimientosScreen() {
    }

    public static final Target BOTON_ATRAS =
            Target.the("botón volver")
                    .located(By.id(PAQUETE + "btn_atras"));

    public static final Target TITULO =
            Target.the("título Movimientos")
                    .located(By.id(PAQUETE + "lbl_titulo_pantalla"));

    public static final Target FECHA_DESDE =
            Target.the("campo fecha desde")
                    .located(By.id(PAQUETE + "inp_fecha_desde"));

    public static final Target FECHA_HASTA =
            Target.the("campo fecha hasta")
                    .located(By.id(PAQUETE + "inp_fecha_hasta"));

    public static final Target BOTON_FILTRAR =
            Target.the("botón Filtrar")
                    .located(By.id(PAQUETE + "btn_filtrar"));

    public static final Target BOTON_LIMPIAR =
            Target.the("botón Limpiar")
                    .located(By.id(PAQUETE + "btn_limpiar"));

    public static final Target CONTADOR_MOVIMIENTOS =
            Target.the("contador de movimientos")
                    .located(By.id(PAQUETE + "lbl_total_movimientos"));

    public static final Target LISTA_MOVIMIENTOS =
            Target.the("lista de movimientos")
                    .located(By.id(PAQUETE + "lst_movimientos"));

    public static final Target ITEM_MOVIMIENTO =
            Target.the("item de movimiento")
                    .located(By.id(PAQUETE + "item_movimiento"));

    public static final Target CONCEPTO_MOVIMIENTO =
            Target.the("concepto del movimiento")
                    .located(By.id(PAQUETE + "lbl_mov_concepto"));

    public static final Target FECHA_MOVIMIENTO =
            Target.the("fecha del movimiento")
                    .located(By.id(PAQUETE + "lbl_mov_fecha"));

    public static final Target MONTO_MOVIMIENTO =
            Target.the("monto del movimiento")
                    .located(By.id(PAQUETE + "lbl_mov_monto"));
}