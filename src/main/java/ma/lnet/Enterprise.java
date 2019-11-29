package ma.lnet;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Enterprise {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private int numEmp;
	@OneToMany(mappedBy = "enterprise")
	private Collection<Employeur> emps;
	public Enterprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enterprise(Long id, String nom, int numEmp, Collection<Employeur> emps) {
		super();
		this.id = id;
		this.nom = nom;
		this.numEmp = numEmp;
		this.emps = emps;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumEmp() {
		return numEmp;
	}
	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}
	public Collection<Employeur> getEmps() {
		return emps;
	}
	public void setEmps(Collection<Employeur> emps) {
		this.emps = emps;
	}

}
