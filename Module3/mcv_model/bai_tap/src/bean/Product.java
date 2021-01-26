package bean;

public class Product {
    private Integer id;
    private String name_product;
    private double cost;

    public Product(Integer id, String name_product, double cost) {
        this.id = id;
        this.name_product = name_product;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
