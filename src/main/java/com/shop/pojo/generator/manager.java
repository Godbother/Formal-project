package com.shop.pojo.generator;

public class manager {
    private Integer idManager;

    private String managerName;

    private String managerPassword;

    private String managerImage;

    private String managerRemark;

    public Integer getIdManager() {
        return idManager;
    }

    public void setIdManager(Integer idManager) {
        this.idManager = idManager;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword == null ? null : managerPassword.trim();
    }

    public String getManagerImage() {
        return managerImage;
    }

    public void setManagerImage(String managerImage) {
        this.managerImage = managerImage == null ? null : managerImage.trim();
    }

    public String getManagerRemark() {
        return managerRemark;
    }

    public void setManagerRemark(String managerRemark) {
        this.managerRemark = managerRemark == null ? null : managerRemark.trim();
    }
}