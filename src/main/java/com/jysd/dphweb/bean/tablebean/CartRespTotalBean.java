package com.jysd.dphweb.bean.tablebean;

public class CartRespTotalBean {


    private  int  goodsCount;
    private  float goodsAmount;
    private  int checkedGoodsCount;
    private  float  checkedGoodsAmount;

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public float getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(float goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public int getCheckedGoodsCount() {
        return checkedGoodsCount;
    }

    public void setCheckedGoodsCount(int checkedGoodsCount) {
        this.checkedGoodsCount = checkedGoodsCount;
    }

    public float getCheckedGoodsAmount() {
        return checkedGoodsAmount;
    }

    public void setCheckedGoodsAmount(float checkedGoodsAmount) {
        this.checkedGoodsAmount = checkedGoodsAmount;
    }
}
