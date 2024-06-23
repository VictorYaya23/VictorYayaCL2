package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProducto;
import model.TblProductocl2;

public class ClassProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		//	Establecer conexión con la unidad de persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("VictorYayaCL2");
		// Permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//Iniciar Transacción
		em.getTransaction().begin();
		//Registramos
		em.persist(producto);
		//Emitimos mensaje por consola
		System.out.println("Producto Registrado");
		//Confirmamos
		em.getTransaction().commit();
		//Cerramos la transacción
		em.close();
		//fin del método registrar....
		
	}

	@Override
	public List<TblProductocl2> ListadoProducto() {
		// TODO Auto-generated method stub
		return null;
	}

}
