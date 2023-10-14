package com.qsp.springboot_foodApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.springboot_foodApp.dao.MenuDao;
import com.qsp.springboot_foodApp.dto.Menu;
import com.qsp.springboot_foodApp.dto.User;
import com.qsp.springboot_foodApp.util.ResponseStructure;
@Service
public class MenuService {

	@Autowired
	private MenuDao menuDao;
	
	public ResponseEntity< ResponseStructure<Menu> > saveMenu(Menu menu) {
		ResponseStructure<Menu> responseStructure=new ResponseStructure<Menu>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("successfully inserted");
		responseStructure.setData(menuDao.saveMenu(menu));
		return new ResponseEntity<ResponseStructure<Menu>>(responseStructure,HttpStatus.CREATED);
		
		
		
	}
	public ResponseEntity< ResponseStructure<Menu> > fetchMenu(int id) {
		ResponseStructure<Menu> responseStructure=new ResponseStructure<Menu>();
		responseStructure.setStatus(HttpStatus.FOUND.value());
		responseStructure.setMessage("successfully fetched");
		responseStructure.setData(menuDao.fetchMenu(id));
		return new ResponseEntity<ResponseStructure<Menu>>(responseStructure,HttpStatus.FOUND);
		
	}
	public ResponseEntity< ResponseStructure<Menu>>  deleteMenu(int id) {
		ResponseStructure<Menu> responseStructure=new ResponseStructure<Menu>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("successfully deleted");
		responseStructure.setData(menuDao.deleteMenu(id));
		return new ResponseEntity<ResponseStructure<Menu>>(responseStructure,HttpStatus.OK);
		
	}
	public ResponseEntity< ResponseStructure<Menu>>  updateMenu(int id, Menu menu) {
		ResponseStructure<Menu> responseStructure=new ResponseStructure<Menu>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("successfully Updated");
		responseStructure.setData(menuDao.updateMenu(id, menu));
		return new ResponseEntity<ResponseStructure<Menu>>(responseStructure,HttpStatus.OK);
		
	}
	public List<Menu> fetchAllMenu(Menu menu) {
		return menuDao.fetchAllMenu(menu);
		
		
	}
}
