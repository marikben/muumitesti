package com.example.muumi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.muumi.model.KategoriaRepository;
import com.example.muumi.model.Muumi;
import com.example.muumi.model.MuumiRepository;

@Controller
public class MuumiController {
	@Autowired
	private MuumiRepository repository;
	@Autowired 
	private KategoriaRepository krepository;
	
	@RequestMapping
	(value="/login")
	public String login() {	
	return "login";
	}	
	@RequestMapping
	(value="/muumilist")
	public String muumiList(Model model) {
		model.addAttribute("muumis", repository.findAll());
		return "muumilist";}
	@RequestMapping
	(value="/add")
	public String addMuumi(Model model){
		model.addAttribute("muumi", new Muumi());
		model.addAttribute("kategoriat", krepository.findAll());
		return "addmuumi";}
	@RequestMapping
	(value="/save",method=RequestMethod.POST)
	public String save(Muumi muumi){
		repository.save(muumi);
		return"redirect:muumilist";}
	@RequestMapping
	(value= "/edit/{id}")
	public String addMuumi(@PathVariable("id")Long muumiId, Model model){
		model.addAttribute("muumi", repository.findById(muumiId));
		model.addAttribute("kategoriat", krepository.findAll());
		return "editmuumi";}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping
	(value ="/delete/{id}", method =RequestMethod.GET)
	public String deleteMuumi(@PathVariable("id")Long muumiId, Model model) {
		repository.deleteById(muumiId);
		return"redirect:../muumilist";}
	}
	
	

