package testEntidades;

import dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		//Realizamos las respectivas instancias 
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		
		//Asignamos Valores
		producto.setNombrecl2("Televisor");
		producto.setPrecioVentacl2(100);
		producto.setPrecioCompCl2(1000);
		producto.setEstado("Nuevo");
		producto.setDescriocioncl2("Made in China");
		
		//Invocamos al método registrar
		crud.RegistrarProducto(producto);
		

	}

}
