package Program_java.Slice_o_Heaven;

public class Main{
    public static void main(String[] args) {
        
        Info info = new Info("Slice O Heaven", "999 Heaven Street", "heaven@gmail.com", "1234567890", "cheesePizza", "tomatoSause, cheese, dough", 69.00, "fries", "coke", 7, 99.00 );
        System.out.println("Taking Order");
        info.takeOrder(info.getStoreMenu(), info.getPizzaIngredients(), info.getPizzaPrice(), info.getSides(), info.getDrinks());
        System.out.println("Making Pizza");
        info.makePizza(info.getPizzaIngredients());
    }
}