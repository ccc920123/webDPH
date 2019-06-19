package com.jysd.dphweb.bean.tablebean;

import java.util.List;

public class categoryActionBean {

    private Category currentCategory;
    private Category parentCategory;
    private List<Category> brotherCategory;

    public Category getCurrentCategory() {
        return currentCategory;
    }

    public void setCurrentCategory(Category currentCategory) {
        this.currentCategory = currentCategory;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public List<Category> getBrotherCategory() {
        return brotherCategory;
    }

    public void setBrotherCategory(List<Category> brotherCategory) {
        this.brotherCategory = brotherCategory;
    }
}
