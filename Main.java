public class Main {
    public static void main(String[] args) {
        Pizza basepizza = new Pizza(true);
        basepizza.addExtraToppings();
        basepizza.addExtraCheese();
        basepizza.takeAway();
        basepizza.getBill();


        DeluxPizza dp = new DeluxPizza(false);
        dp.addExtraToppings();
        dp.addExtraCheese();
        dp.takeAway();
        dp.getBill();
    }
}




