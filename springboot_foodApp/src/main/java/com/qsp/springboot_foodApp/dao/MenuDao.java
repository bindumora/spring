package com.qsp.springboot_foodApp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.springboot_foodApp.dto.Menu;
import com.qsp.springboot_foodApp.repo.MenuRepo;

@Repository
public class MenuDao {

	@Autowired
	private MenuRepo menuRepo;
	
	
	public Menu saveMenu(Menu menu) {
		return menuRepo.save(menu);
		
	}
	
	public Menu fetchMenu(int id) {
		return menuRepo.findById(id).get();
		
	}
	public Menu deleteMenu(int id) {
		Menu menu=menuRepo.findById(id).get();
		menuRepo.deleteById(id);
		return menu;
		
	}
	public Menu updateMenu(int id, Menu menu) {
//		Menu dbmenu=menuRepo.findById(id).get();
//		if(dbmenu!=null) {
			menu.setMenuId(id);
			menu.setProducts(menu.getProducts());
			return menuRepo.save(menu);
		}
//		else {
//			return menu;
//		}	
		public List<Menu> fetchAllMenu(Menu menu){
			return menuRepo.findAll();
	}
	}
