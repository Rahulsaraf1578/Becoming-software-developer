

public class FunctionWithInputs {
    public static  double calculatePriceOfMeal( double tipRate, double listedPrice, double taxRate){
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double totalPrice = tip + tax + listedPrice;
        return totalPrice;

    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculatePriceOfMeal( .2,100,0.08);
        System.out.println(groupTotalMealPrice);

    }
}
