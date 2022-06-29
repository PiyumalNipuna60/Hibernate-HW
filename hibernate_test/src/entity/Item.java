package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "item")
public class Item {
    @Id
    private String item_code;
    private String item_description;
    private double item_price;
    private int qtyOnHand;
    @OneToMany(mappedBy = "item")
    private List<OrderDetails> orderDetails =new ArrayList<>();

    public Item() {

    }

    public Item(String item_code, String item_description, double item_price, int qtyOnHand) {
        this.item_code = item_code;
        this.item_description = item_description;
        this.item_price = item_price;
        this.qtyOnHand = qtyOnHand;
    }

    public Item(String item_code, String item_description, double item_price, int qtyOnHand, List<OrderDetails> orderDetails) {
        this.item_code = item_code;
        this.item_description = item_description;
        this.item_price = item_price;
        this.qtyOnHand = qtyOnHand;
        this.orderDetails = orderDetails;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item_code='" + item_code + '\'' +
                ", item_description='" + item_description + '\'' +
                ", item_price=" + item_price +
                ", qtyOnHand=" + qtyOnHand +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
