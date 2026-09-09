public class Main {
    public static void main(String[] args) {

        // Opgave1
        /*
        double totalPrice = 1200.0;
        double finalPrice = 0;

        if (totalPrice > 1000){
            finalPrice = totalPrice * 0.8;
            System.out.println("Discount applied!");
        }
        System.out.println("Final price: " + finalPrice + "kr");
        */
        // Opgave2
        /*
        double weight = 62;
        double height = 172;

        double BMI = weight / (height*height);

        if (BMI >= 25){
            System.out.println("overwight");
        } else if (BMI >= 18.5){
            System.out.println("Normal overwight");
        } else {
            System.out.println("Underweight");
        }
        */
        // Opgave3
        /*
        int hour = 14;

        if (hour >= 5 && hour <= 11) {
            System.out.println("Good morning!");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("Good afternoon!");
        } else if (hour >= 18 && hour <= 21) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Good night!");
        }
        */
        // Opgave4
        /*
        int score = 88;
        char grade;
        String status = " ";
        String comment = " ";

        if (score >= 90) {
            grade = 'A';
            comment = "Exellent";
        } else if (score >= 80) {
            grade = 'B';
            comment = "Good";
        } else if (score >= 70) {
            grade = 'C';
            comment = "Satisfactory";
        } else if (score >= 70) {
            grade = 'D';
            comment = "Needs improvement";
        } else {
            grade = 'F';
            comment = "Failing";
        }

        if (score >= 60){status= "PASS";}
        else {status = "Fail";}

        System.out.println("=== STUDENT REPORT===");
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
        System.out.println("Comment: " + comment);
        */
        // Opgave5
        /*
        double totalPrice = 350;
        boolean isMember = true;
        double shippingFee;

        if (totalPrice > 500 || (isMember && totalPrice > 200)){
            System.out.println("Free shipping");
            shippingFee = 0.0;
        } else {
            System.out.println("Shipping fee");
             shippingFee = 50.0;
        }

        double finalPrice = totalPrice + shippingFee;

        System.out.println("Total price: " + finalPrice);
        */
        // Opgave6
        /*
        int guestAge = 14;
        int ageLimit = 15;
        boolean hasParentalConsent = true;

        if (guestAge >= ageLimit || (guestAge >= 13 && hasParentalConsent)){
            System.out.println("Can watch movie");
        } else {
            System.out.println("Cant watch movie");
        }
        */
        // Opgave7
        /*
        int partySize = 4;
        int available = 6;
        boolean hasReservation = false;
        int waitTime = 20;
        boolean restaurantFull = false;

        if (partySize <= available && (hasReservation || waitTime < 30) && restaurantFull){
            System.out.println("Table available");
            System.out.println("Estimated wait: " + waitTime + " minutes");
        } else {
            System.out.println("No table available");
        }
        */
        // Opgave8
        /*
        int basisPremium = 5000;
        int premium;
        int age = 22;
        boolean hasAccidents = false;
        int accidents = 0;
        boolean riskZone = false;


        if (age < 25 || age > 70 || ( hasAccidents && accidents >= 2) || riskZone){
            System.out.println("Higher risk category");
            premium = basisPremium + 2000;
        }   else {
            System.out.println("Standard risk category");
            premium = basisPremium;
        }

        System.out.println(premium + "kr");
        */
        // Opgave9
        /*
        boolean hasAdmin= true;
        boolean isActive = true;
        boolean isSuperUser = false;
        boolean suspended = false;
        boolean isUser = false;
        boolean isGuest = false;
        boolean validTime = false;

        String accessLevel;

        if (hasAdmin && isActive || isSuperUser){
            accessLevel = "FULL ACCESS";
        } else if ((isUser && isActive && !suspended) || (isGuest && validTime)) {
            accessLevel = "LIMITED ACCESS";
        } else {
            accessLevel = "ACCESS DENIED";
        }

        System.out.println("=== ACCESS CONTROL ===");
        System.out.println("Admin: " + hasAdmin);
        System.out.println("Active: " + isActive);
        System.out.println("Result: " + accessLevel);
        */
        // Opgave10
        /*
        String item = "pizza";
        int quantity = 2;
        double price = 0;

        switch (item){
            case "burger":
                price = 89;
                break;
            case "pizza":
                price = 95;
                break;
            case "salad":
                price = 65;
                break;
            case "pasta":
                price = 79;
                break;
            case "steak":
                price = 145;
                break;
            default:
                System.out.println("Invalid");
        }

        double finalprice = price * quantity;

        System.out.println("Odered: " + quantity + " " + item + " for the total price off " + finalprice + "kr");
        */
        // Opgave11
        /*
        String zone = "National";
        double weight = 7;
        double price = 0;
        double weightcost = 0;

        switch (zone){
            case "Local":
                price = 50;
                break;
            case "Regional":
                price = 100;
                break;
            case "National":
                price = 150;
                break;
            case "International":
                price = 300;
                break;
            default:
                System.out.println("Invalid");
        }

        if (weight > 5){
            double extraKg = weight - 5;
            weightcost = extraKg * 20;
        }

        double finalprice = price + weightcost;

        System.out.println("Zone: " + zone);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Base price: " + price + "kr");
        System.out.println("Extra weight cost: " + weightcost + " kr");
        System.out.println("Total: " + finalprice + " kr");
        */
        // Opgave12
        /*
        double balance = 5000;
        double amount = 1000;
        String operation = "withdraw";
        boolean success = true;

        switch (operation) {
            case "withdraw":
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Amount left in your balance " + balance + "kr");
                    System.out.println("Amount you withdrew " + amount + "kr");
                } else {
                    System.out.println("Insufficient funds");
                    success = false;
                }
                break;
            case "deposit":
                balance += amount;
                System.out.println("Deposited: " + amount + "kr");
                break;
            case "balance":
                System.out.println("Current balance: " + balance + "kr");
                break;
            case "transfer":
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Amount left in your balance " + balance + "kr");
                    System.out.println("Amount you transferred " + amount + "kr");
                } else {
                    System.out.println("Insufficient funds");
                    success = false;}
                break;
            default:
                System.out.println("Invalid");
        }

        System.out.println("The " + operation + " was successfull: " +  success);
        */
        // Opgave13
        /*
        String eventType = "concert";
        double price = 0;
        boolean isStudent = true;
        int qauntity = 2;
        double discount = 0;

        switch (eventType){
            case "movie":
                price = 100;
                break;
            case "concert":
                price = 250;
                if (isStudent){
                    discount = 0.20;
                }
                break;
            case "sports":
                price = 2000;
                break;
            case "theater":
                price = 150;
                if (isStudent) {
                    discount = 0.20;
                }
                break;
            default:
                System.out.println("Invalid");
                price = 0;
        }

        double finalDiscount = price * discount;
        double discountPrice = price - finalDiscount;

        double finalprice = discountPrice * qauntity;

        System.out.println("Total price: " + finalprice);
        */
        // Opgave14



        // Opgave15
        /*
        double savings = 0;
        double goal = 10000;
        int month = 0;
        double deposit = 500;

        while (savings < goal){
            savings += deposit;
            month++;
        }

        System.out.println("Det tager " + month + " så mange månder for at spare 10.000kr");
        */
        // Opgave16
        /*
        double debt = 5000;
        int month = 0;
        double deposit = 200;

        while (debt > 0){
            debt -= deposit;
            month++;
        }

        System.out.println("Det tager " + month + " månder: " + debt + " gæld tilbage");
        */
        // Opgave17

        // Opgave18

        // Opgave19

        // Opgave20
        /*
        int saving = 0;

        for (int i = 0; i < 12; i++){
            saving += 1000;
        }

        System.out.println("Savings after 12 months: " + saving + "kr");
        */
        // Opgave21
        /*
        for (int i = 1; i <= 10; i++){
            System.out.println("Table for " + i);
            for (int n = 1; n <= 10; n++){
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }
        */
        // Opgave22

        // Opgave23

        // Opgave24




        // Opgave25

        // Opgave26

        // Opgave27

        // Opgave28

        // Opgave29


    }
}

