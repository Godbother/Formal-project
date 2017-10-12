package com.shop.pojo.generator;

public class users {
    private Integer idUser;

    private String userName;

    private String userPassword;

    private String userAddress;

    private String userRemark;

    private String usersImage;

    private Integer shopcarIdShopcar;

    private Integer ordersIdOrders;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark == null ? null : userRemark.trim();
    }

    public String getUsersImage() {
        return usersImage;
    }

    public void setUsersImage(String usersImage) {
        this.usersImage = usersImage == null ? null : usersImage.trim();
    }

    public Integer getShopcarIdShopcar() {
        return shopcarIdShopcar;
    }

    public void setShopcarIdShopcar(Integer shopcarIdShopcar) {
        this.shopcarIdShopcar = shopcarIdShopcar;
    }

    public Integer getOrdersIdOrders() {
        return ordersIdOrders;
    }

    public void setOrdersIdOrders(Integer ordersIdOrders) {
        this.ordersIdOrders = ordersIdOrders;
    }
}