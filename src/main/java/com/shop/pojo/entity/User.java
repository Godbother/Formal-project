package com.shop.pojo.entity;

public class User{
	private Integer id_user;

    private String user_name;

    private String user_password;

    private String user_address;

    private String user_remark;

    private String users_image;

    private Integer shopcar_id_shopcar;

    private Integer orders_id_orders;

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_remark() {
		return user_remark;
	}

	public void setUser_remark(String user_remark) {
		this.user_remark = user_remark;
	}

	public String getUsers_image() {
		return users_image;
	}

	public void setUsers_image(String users_image) {
		this.users_image = users_image;
	}

	public Integer getShopcar_id_shopcar() {
		return shopcar_id_shopcar;
	}

	public void setShopcar_id_shopcar(Integer shopcar_id_shopcar) {
		this.shopcar_id_shopcar = shopcar_id_shopcar;
	}

	public Integer getOrders_id_orders() {
		return orders_id_orders;
	}

	public void setOrders_id_orders(Integer orders_id_orders) {
		this.orders_id_orders = orders_id_orders;
	}

	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", user_name=" + user_name + ", user_password=" + user_password
				+ ", user_address=" + user_address + ", user_remark=" + user_remark + ", users_image=" + users_image
				+ ", shopcar_id_shopcar=" + shopcar_id_shopcar + ", orders_id_orders=" + orders_id_orders + "]";
	}

	public User(Integer id_user, String user_name, String user_password, String user_address, String user_remark,
			String users_image, Integer shopcar_id_shopcar, Integer orders_id_orders) {
		this.id_user = id_user;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_address = user_address;
		this.user_remark = user_remark;
		this.users_image = users_image;
		this.shopcar_id_shopcar = shopcar_id_shopcar;
		this.orders_id_orders = orders_id_orders;
	}

	public User() {
	}
    
}
