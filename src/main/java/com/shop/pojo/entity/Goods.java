package com.shop.pojo.entity;

public class Goods {
	private Integer id_goods;
	private String goods_name;
	private Integer goods_price;
	private Integer goods_num;
	private String goods_comment;
	private String goods_image;
	
	/**
	 * ?д??????????????????????????ι?
	 */
	public Goods() {

	}

	/**
	 * ???ι?????
	 * @param id_goods
	 * @param goods_name
	 * @param goods_price
	 * @param goods_num
	 * @param goods_comment
	 * @param goods_image
	 */
	public Goods(Integer id_goods, String goods_name, Integer goods_price, Integer goods_num, String goods_comment,
			String goods_image) {
		this.id_goods = id_goods;
		this.goods_name = goods_name;
		this.goods_price = goods_price;
		this.goods_num = goods_num;
		this.goods_comment = goods_comment;
		this.goods_image = goods_image;
	}

	public Integer getId_goods() {
		return id_goods;
	}

	public void setId_goods(Integer id_goods) {
		this.id_goods = id_goods;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public Integer getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(Integer goods_price) {
		this.goods_price = goods_price;
	}

	public Integer getGoods_num() {
		return goods_num;
	}

	public void setGoods_num(Integer goods_num) {
		this.goods_num = goods_num;
	}

	public String getGoods_comment() {
		return goods_comment;
	}

	public void setGoods_comment(String goods_comment) {
		this.goods_comment = goods_comment;
	}

	public String getGoods_image() {
		return goods_image;
	}

	public void setGoods_image(String goods_image) {
		this.goods_image = goods_image;
	}

	@Override
	public String toString() {
		return "Goods [id_goods=" + id_goods + ", goods_name=" + goods_name + ", goods_price=" + goods_price
				+ ", goods_num=" + goods_num + ", goods_comment=" + goods_comment + ", goods_image=" + goods_image
				+ "]";
	}

}
