package ie.atu.examproduct;

public class Product {

    private int id;
    private String name;
    private int quantity;
    public Product(String name, int id, int quantity)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
