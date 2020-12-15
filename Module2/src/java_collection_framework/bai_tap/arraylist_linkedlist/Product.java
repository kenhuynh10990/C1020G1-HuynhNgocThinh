package java_collection_framework.bai_tap.arraylist_linkedlist;

public class Product {
    private int id;
    private String name;
    private String productInfo;
    private int cost;


    public Product() {
    }


    public Product(int id, String name, String productInfo, int cost) {
        this.id = id;
        this.name = name;
        this.productInfo = productInfo;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productInfo='" + productInfo + '\'' +
                ", cost=" + cost +
                '}';
    }
}
