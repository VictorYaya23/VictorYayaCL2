package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_productocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_productocl2")
@NamedQuery(name="TblProductocl2.findAll", query="SELECT t FROM TblProductocl2 t")
public class TblProductocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductocl2;

	private String descriocioncl2;

	private String estado;

	private String nombrecl2;

	private double precioCompCl2;

	private double precioVentacl2;

	public TblProductocl2() {
	}

	public int getIdproductocl2() {
		return this.idproductocl2;
	}

	public void setIdproductocl2(int idproductocl2) {
		this.idproductocl2 = idproductocl2;
	}

	public String getDescriocioncl2() {
		return this.descriocioncl2;
	}

	public void setDescriocioncl2(String descriocioncl2) {
		this.descriocioncl2 = descriocioncl2;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombrecl2() {
		return this.nombrecl2;
	}

	public void setNombrecl2(String nombrecl2) {
		this.nombrecl2 = nombrecl2;
	}

	public double getPrecioCompCl2() {
		return this.precioCompCl2;
	}

	public void setPrecioCompCl2(double precioCompCl2) {
		this.precioCompCl2 = precioCompCl2;
	}

	public double getPrecioVentacl2() {
		return this.precioVentacl2;
	}

	public void setPrecioVentacl2(double precioVentacl2) {
		this.precioVentacl2 = precioVentacl2;
	}

}