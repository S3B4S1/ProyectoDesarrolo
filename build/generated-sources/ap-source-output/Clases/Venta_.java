package Clases;

import Clases.DetalleVenta;
import Clases.Persona;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-14T21:30:09")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Persona> cliente;
    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Long> pk;
    public static volatile ListAttribute<Venta, DetalleVenta> detalleVentas;
    public static volatile SingularAttribute<Venta, Integer> CostoVentaTotal;

}