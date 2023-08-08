import java.util.ArrayList;

public class TestOrders{

    public static void main(String[] args) {
    
        
        // Creating new items and assigning them some attributes;
        Item item1 = new Item ();
        item1.name = "mocha";
        item1.price = 4.30;

        Item item2 = new Item (); 
        item2.name = "latte";
        item2.price = 3.25;

        Item item3 = new Item ();
        item3.name = "drip coffee";
        item3.price = 3.00;

        Item item4 = new Item ();
        item4.name = "cappuccino";
        item4.price = 4.55;

        //Creating new orders (instances) and giving them a "name" for the attribute NAME.  

        Order order1 = new Order ();
        order1.name = "Cindhuri";
        System.out.printf("Hi %s! The total price is %s\n\n", order1.name, order1.total);
        order1.items.add (item3);
        order1.ready = true;

        Order order2 = new Order ();
        order2.name = "Jimmy";
        order2.items.add(item1);
        order2.total += item1.price;
        order2.ready = true;

        Order order3 = new Order ();
        order3.name = "Noah";
        order3.items.add(item4);
        order3.total += item4.price;

        Order order4 = new Order ();
        order4.name = "Sam";
        order4.items.add(item2);
        order4.total += item2.price * 3;
        

        System.out.printf("Name: %s\nTotal: %s\n\n", order3.name, order3.total);
        System.out.printf("Name: %s\nREADY: %s\n\n", order1.name, order1.ready);
        System.out.printf("Name %s \nREADY: %s\nTotal: %s", order4.name, order4.ready, order4.total);
    }
}





      
 
