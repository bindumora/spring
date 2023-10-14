package Spring_Day3;

public class Menu {
 private int menuId;
 private String Catagory;
 private String Name;
 private Item item;
public int getMenuId() {
	return menuId;
}
public void setMenuId(int menuId) {
	this.menuId = menuId;
}
public String getCatagory() {
	return Catagory;
}
public void setCatagory(String catagory) {
	Catagory = catagory;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
 
 
}