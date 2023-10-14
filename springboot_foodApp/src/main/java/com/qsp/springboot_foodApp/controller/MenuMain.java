package com.qsp.springboot_foodApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.springboot_foodApp.dto.Menu;
import com.qsp.springboot_foodApp.service.MenuService;
import com.qsp.springboot_foodApp.util.ResponseStructure;

@RestController
public class MenuMain {

	@Autowired
	private MenuService menuService;
	
	@PostMapping("/saveMenu")
	public ResponseEntity<ResponseStructure<Menu>> saveMenu(@RequestBody Menu menu) {
		return menuService.saveMenu(menu);
		
	}
	@GetMapping("/fetchMenu")
	public ResponseEntity<ResponseStructure<Menu>> fetchMenu(@RequestParam int id) {
		return menuService.fetchMenu(id);
		
	}
	@DeleteMapping("/deleteMenu")
		public ResponseEntity<ResponseStructure<Menu>> deleteMenu(@RequestParam int id)
		{
			return menuService.deleteMenu(id);
		
		}
	@PutMapping("/updateMenu")
	public ResponseEntity<ResponseStructure<Menu>> updateMenu(@RequestParam int id, @RequestBody Menu menu) {
		return menuService.updateMenu(id, menu);
		
	}
	@GetMapping("/fetchAllMenu")
	public List<Menu> fetchAllMenu(Menu menu) {
		return menuService.fetchAllMenu(menu);

	}
}
