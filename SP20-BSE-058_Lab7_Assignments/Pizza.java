public class Pizza {

    private String pizzaSize;
    private int noOfCheese;
    private int pepperoniCount;
    private int noOfHam;

    public Pizza() {
        this.pizzaSize = "";
        this.noOfCheese = 0;
        this.pepperoniCount = 0;
        this.noOfHam = 0;
    }

    public Pizza(String pizzaSize, int noOfCheese, int pepperoniCount, int noOfHam) {
        this.pizzaSize = pizzaSize;
        this.noOfCheese = noOfCheese;
        this.pepperoniCount = pepperoniCount;
        this.noOfHam = noOfHam;
    }

    public Pizza(Pizza piz) {
        if(piz == null)
            return;

        this.pizzaSize = piz.pizzaSize;
        this.noOfCheese = piz.noOfCheese;
        this.pepperoniCount = piz.pepperoniCount;
        this.noOfHam = piz.noOfHam;
    }

    public void setPizzaSize(String pizzaSize)
    {
        this.pizzaSize = pizzaSize;
    }

    public String getPizzaSize()
    {
        return pizzaSize;
    }


    public void setNumCheeseToppings(int noOfCheese)
    {
        this.noOfCheese = noOfCheese;
    }

    public int getNumCheeseToppings()
    {
        return noOfCheese;
    }



    public void setNumPepperoniToppings(int pepperoniCount)
    {
        this.pepperoniCount = pepperoniCount;
    }

    public int getNumPepperoniToppings()
    {
        return pepperoniCount;
    }


    public int getNumHmaToppings()
    {
        return noOfHam;
    }

    public void setNumHmaToppings(int hamCount)
    {
        this.noOfHam = hamCount;
    }

    public double calcCost()
    {
        if(pizzaSize.equalsIgnoreCase("small"))
        {
            return 10 + (noOfCheese + pepperoniCount + noOfHam) * 2;
        }
        else if(pizzaSize.equalsIgnoreCase("medium"))
        {
            return 12 + (noOfCheese + pepperoniCount + noOfHam) * 2;
        }
        else if(pizzaSize.equalsIgnoreCase("large"))
        {
            return 14 + (noOfCheese + pepperoniCount + noOfHam) * 2;
        }
        else
        {
            return 0.0;
        }
    }

    public String getDescription()
    {
        return "Size of Pizza: " + pizzaSize + "\nToppings of Cheese: "
                + noOfCheese + "\nToppings of Pepperoni: "
                + pepperoniCount + "\nToppings of Ham: "
                + noOfHam + "\nPizza cost: $" + calcCost() + "\n";
    }
}
