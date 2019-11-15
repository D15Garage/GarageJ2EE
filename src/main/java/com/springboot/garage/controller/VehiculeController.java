package com.springboot.garage.controller;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.EmployeForm;
import com.springboot.garage.controller.form.VehiculeForm;
import com.springboot.garage.model.Vehicule;
import com.springboot.garage.services.IServiceListeVehicules;

@Controller
public class VehiculeController {

	@Autowired
	IServiceListeVehicules vehiculeService;
	
	@GetMapping(value = "/afficherVehicule")
	public String afficherVehicules(Model model) {
		model.addAttribute("listeVehicules", vehiculeService.afficherVehicules());
		return "vehicule/afficherVehicule";
	}
	
	@GetMapping(value = "/ajouterVehicule")
	public String ajouterVehiculeGet(Model model) {
		model.addAttribute("vehiculeForm", new VehiculeForm());
		return "vehicule/ajouterVehicule";
	}
	
	@GetMapping(value = "/detailVehicule/{id}")
	public String detailVehicule(@PathVariable final Integer id, Model model) {
		Vehicule vehicule = vehiculeService.trouverVehicule(id);
		model.addAttribute("vehicule", vehicule);
		if(model.containsAttribute("vehiculeForm") == false) {
			VehiculeForm vehiculeForm = new VehiculeForm();
			vehiculeForm.setId(vehicule.getId());
			vehiculeForm.setReference(vehicule.getReference());
			vehiculeForm.setModele(vehicule.getModele());
			vehiculeForm.setMarque(vehicule.getMarque());
			vehiculeForm.setCouleur(vehicule.getCouleur());
			vehiculeForm.setAnnee(vehicule.getAnnee());
			vehiculeForm.setQuantite(vehicule.getQuantite().toString());
			vehiculeForm.setPrixUnitaireHt(vehicule.getPrixUnitaireHt().toString());
			
			model.addAttribute("vehiculeForm", vehiculeForm);
		}
		return "vehicule/detailVehicule";
	}
	
	
	
	@PostMapping(value = "/ajouterVehicule")
	public String ajouterVehiculePost(@ModelAttribute VehiculeForm vehiculeForm, BindingResult presult, Model model) {
		if(!presult.hasErrors()) {
			Vehicule vehicule = new Vehicule();
			vehicule.setReference(vehiculeForm.getReference());
			vehicule.setAnnee(vehiculeForm.getAnnee());
			vehicule.setModele(vehiculeForm.getModele());
			vehicule.setMarque(vehiculeForm.getMarque());
			vehicule.setCouleur(vehiculeForm.getCouleur());
			vehicule.setQuantite(Integer.valueOf(vehiculeForm.getQuantite()));
			vehicule.setPrixUnitaireHt(Double.valueOf(vehiculeForm.getPrixUnitaireHt()));
			vehicule.setDateSaisieStock(new Date());
			vehiculeService.ajouterVehicule(vehicule);
		}
		model.addAttribute("listeVehicules", vehiculeService.afficherVehicules());
		return "vehicule/afficherVehicule";
	}

	@PostMapping("/modifierVehicule")
	public String modifierVehicule( 
			@Valid @ModelAttribute VehiculeForm vehiculeForm,
			BindingResult presult,Model model)
	{
		if(!presult.hasErrors()) {
			Vehicule vehicule = vehiculeService.trouverVehicule(vehiculeForm.getId());
			Integer qtVehicule = Integer.parseInt(vehiculeForm.getQuantite());
			
			vehicule.setPrixUnitaireHt(Double.valueOf(vehiculeForm.getPrixUnitaireHt()));
			vehicule.setQuantite(qtVehicule);
			vehicule.setReference(vehiculeForm.getReference());
			vehicule.setDateSaisieStock(new Date());
			vehiculeService.modifierVehicule(vehicule);
			
			model.addAttribute("listeVehicules", vehiculeService.afficherVehicules());
			return "vehicule/afficherVehicule";
		}
		return "vehicule/afficherVehicule";
	}
}
