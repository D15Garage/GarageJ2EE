package com.springboot.garage.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.springboot.garage.enums.EtatFicheEntretien;
import com.springboot.garage.enums.Priorite;

@Entity
@Table(name="fiche_entretiens")
public class FicheEntretien {

	@Id
	@Column(name="idfiche_entretiens")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@ManyToOne
	@JoinColumn(name = "client_idclient")
	Client client;

	Employe employee;

	Date dateDeCreation;
	Date dateDeCloture;
	String description;
	EtatFicheEntretien etat = EtatFicheEntretien.En_Attente;
	Priorite priorité = Priorite.Normal;

	@OneToMany
	@JoinColumn(name = "tache_idtaches")
	List<Tache> taches;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
<<<<<<< HEAD
=======
	public Employe getEmployee() {
		return employee;
	}
	public void setEmployee(Employe employee) {
		this.employee = employee;
	}
>>>>>>> ede31582910761f9a48c7023af03b1abca078115
	public Date getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	public Date getDateDeCloture() {
		return dateDeCloture;
	}
	public void setDateDeCloture(Date dateDeCloture) {
		this.dateDeCloture = dateDeCloture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EtatFicheEntretien getEtat() {
		return etat;
	}
	public void setEtat(EtatFicheEntretien etat) {
		this.etat = etat;
	}
	public Priorite getPriorité() {
		return priorité;
	}
	public void setPriorité(Priorite priorité) {
		this.priorité = priorité;
	}
	public Tache getTaches() {
		return taches;
	}
	public void setTaches(Tache taches) {
		this.taches = taches;
	}
}
