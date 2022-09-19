package chapter2.goods;

public class Goods {
    private String goodsID ;
    private String goodsName;
    private double goodsPrice;
    private int goodsStock;

    public Goods() {
    }

    public Goods(String goodsID, String goodsName, double goodsPrice, int goodsStock) {
        this.goodsID = goodsID;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsStock = goodsStock;
    }

    public String getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(int goodsStock) {
        this.goodsStock = goodsStock;
    }
}
