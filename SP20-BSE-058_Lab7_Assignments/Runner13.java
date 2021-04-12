public class Runner13 {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("large", 2, 1, 2);
        Pizza pizza2 = new Pizza("medium", 3, 2, 3);

        PizzaOrder order1 = new PizzaOrder();
        order1.setNumPizzas(2);
        order1.setPizza1(pizza1);
        order1.setPizza2(pizza2);
        double total1 = order1.calcTotal();

        System.out.println(order1.getPizza1().getDescription());
        System.out.println(order1.getPizza2().getDescription());
        System.out.println("Total cost1: $" + total1);
        System.out.println();

        PizzaOrder order2 = new PizzaOrder(order1);
        order2.getPizza1().setNumCheeseToppings(3);
        double total2 = order2.calcTotal();

        System.out.println(order2.getPizza1().getDescription());
        System.out.println(order2.getPizza2().getDescription());
        System.out.println("Total cost2: $" + total2);
        System.out.println();

        double origTotal = order1.calcTotal();
        System.out.println("Total cost1: $" + origTotal);
    }
    }





