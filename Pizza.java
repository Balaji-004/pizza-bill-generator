class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    
    
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        this.basePizzaPrice = veg?300:400;
        this.price += basePizzaPrice;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway(){
        isOptedForTakeAway = true;
        this.price += backPackPrice;
    }
    public void getBill(){
        String bill = "";
        System.out.println("Pizza:"+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra cheese added: "+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings added: "+extraToppingsPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill+="Take away : "+backPackPrice+"\n";
        }
        bill += "Bill: "+price+"\n";
        System.out.println(bill);
    }
}