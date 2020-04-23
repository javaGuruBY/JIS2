package by.alhr.Hw4_Task4_Stock.service;

public class Stock implements Runnable {
    private String nameCompany;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock() {
    }

    public Stock(String nameCompany, double currentPrice) {
        this.nameCompany = nameCompany;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(double currentPrice) {
        if (currentPrice >= maxPrice) {
            maxPrice = currentPrice;
        } else if (currentPrice <= minPrice) {
            minPrice = currentPrice;
        } else {
            this.currentPrice = currentPrice;
        }
    }

    public String printInformation() {

        System.out.println("Company name = " + nameCompany
                + ", current price = " + currentPrice
                + " $, maximum price = " + maxPrice
                + " $, minimal price = " + minPrice + "$");
        return ("Company name = " + nameCompany
                + ", current price = " + currentPrice
                + " $, maximum price = " + maxPrice
                + " $, minimal price = " + minPrice + "$");
    }

    @Override
    public void run() {

        Stock stock1 = new Stock("MebelLab", 120);
        stock1.printInformation();

//        stock1.updatePrice(150);
//        stock1.updatePrice(22);
//        stock1.updatePrice(38);
//
//        stock1.printInformation();
    }
}
