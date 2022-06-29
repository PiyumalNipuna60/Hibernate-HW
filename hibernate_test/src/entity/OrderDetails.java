package entity;

import javax.persistence.*;

@Entity(name = "order_details")
public class OrderDetails {
    public static int  odQty ;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name="item_code")
    private Item item;
    private int orderQty;

    @Id
    private String id;

    public void removeItem(int orderQty){
        this.orderQty = odQty;

    }

    public int getRemoveItem(){
        return orderQty;
    }
    //==============================================================
    public OrderDetails() {

    }

    public OrderDetails(Order order, Item item, int orderQty, String id) {
        this.order = order;
        this.item = item;
        this.orderQty = orderQty;
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "order=" + order +
                ", item=" + item +
                ", orderQty=" + orderQty +
                ", id='" + id + '\'' +
                '}';
    }
}
