import entity.Customer;
import entity.Item;
import entity.Order;
import entity.OrderDetails;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class AppInitialize {
    public static void main(String[] args) {


        Customer c1 = new Customer();
        c1.setCus_id("C001");
        c1.setCus_name("nipuna");
        c1.setCus_address("Galle");
        c1.setCus_contact("071-1245256");

        Item i1 = new Item();
        i1.setItem_code("I001");
        i1.setItem_description("chocolate");
        i1.setItem_price(1200.00);
        i1.setQtyOnHand(100);

        Order o1=new Order();
        o1.setOrderId("O001");
        o1.setCustomer(c1);
        o1.setPrice(500.00);

        OrderDetails OD1 = new OrderDetails();
        OD1.setId("OD001");
        OD1.setItem(i1);
        OD1.setOrder(o1);
        OD1.setOrderQty(20);

        Customer c2 = new Customer();
        c2.setCus_id("C003");
        c2.setCus_name("kamal");
        c2.setCus_address("matara");
        c2.setCus_contact("071-9256354");

        Item i2 = new Item();
        i2.setItem_code("I002");
        i2.setItem_description("iceCream");
        i2.setItem_price(1200.00);
        i2.setQtyOnHand(100);

        Order o2=new Order();
        o2.setOrderId("O002");
        o2.setCustomer(c2);
        o2.setPrice(500.00);

        OrderDetails OD2 = new OrderDetails();
        OD2.setId("OD002");
        OD2.setItem(i2);
        OD2.setOrder(o2);
        OD2.setOrderQty(20);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //*save
//        session.save(c1);

        //*update
//        session.update(c1);

        //*get
//        Customer c = session.get(Customer.class, "C0002");
//        System.out.println(c.getId() + "," + c.getName());

        //*delete
//        Customer c4=new Customer();
//        c4.setId("C0001");
//        session.delete(c4);
//      =====or=====
//        Customer c = session.get(Customer.class, "C0002");
//        session.delete(c);

        session.save(c1);
        session.save(c2);
        session.save(i1);
        session.save(i2);
        session.save(o2);
        session.save(OD2);
        session.save(o1);
        session.save(OD1);
        session.delete(session.get(OrderDetails.class,"OD001"));

        transaction.commit();
        session.close();


    }
}
