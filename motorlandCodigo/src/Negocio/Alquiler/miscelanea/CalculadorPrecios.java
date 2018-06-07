package Negocio.Alquiler.miscelanea;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculadorPrecios {
	
	private static final double PORCENTAJE = 0.03; 
	private static double TARIFA; 
	
	public static double calculaPrecioAgregado (double precioBase) {
		double p = Math.round((precioBase + (precioBase * TARIFA)) * 100.0 ) / 100.0;
		return CalculadorPrecios.redondeaPrecio(p);
	}
	
	public static void calculaTarifa (Calendar fechaI, Calendar fechaF) {
		int dias = diasEntreFechas(fechaI.getTime(), fechaF.getTime());
	    TARIFA = PORCENTAJE * dias; 
	}
	
	public static double redondeaPrecio(double precio) {
		return Math.round((precio * 100.0) / 100.0);
	}
	private static int diasEntreFechas(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}
	
}
