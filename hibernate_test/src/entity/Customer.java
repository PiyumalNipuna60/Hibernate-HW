package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "customer")
public class Customer {
    @Id
    private String cus_id;
    private String cus_name;
    private String cus_address;
    private String cus_contact;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public Customer() {
    }

    public Customer(String cus_id, String cus_name, String cus_address, String cus_contact) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        this.cus_address = cus_address;
        this.cus_contact = cus_contact;
    }

    public Customer(String cus_id, String cus_name, String cus_address, String cus_contact, List<Order> orders) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        this.cus_address = cus_address;
        this.cus_contact = cus_contact;
        this.orders = orders;
    }

    public String getCus_id() {
        return cus_id;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_address() {
        return cus_address;
    }

    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }

    public String getCus_contact() {
        return cus_contact;
    }

    public void setCus_contact(String cus_contact) {
        this.cus_contact = cus_contact;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cus_id='" + cus_id + '\'' +
                ", cus_name='" + cus_name + '\'' +
                ", cus_address='" + cus_address + '\'' +
                ", cus_contact='" + cus_contact + '\'' +
                ", orders=" + orders +
                '}';
    }
}
