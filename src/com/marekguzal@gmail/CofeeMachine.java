package com;

import java.util.Scanner;

public class CofeeMachine {
    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;
    final int espressoWater = 250;
    final int espressoBeans = 16;
    final int espressoCosts = 4;
    final int latteWater = 350;
    final int latteMilk = 75;
    final int latteBeans = 20;
    final int latteCosts = 7;
    final int cappuccinoWater = 200;
    final int cappuccinoMilk = 100;
    final int cappuccinoBeans = 12;
    final int cappuccinoCosts = 6;

    Scanner scanner;

    {
        scanner = new Scanner(System.in);
    }

    public void welcomeOnCoffeeWorld() {
        System.out.println("Write action (buy, fill, take, remaining, exit)");

    }

    public String getChoice() {

        return scanner.nextLine();
    }

    public void run() {
        String exit;
        do {
            welcomeOnCoffeeWorld();
            exit = getChoice();
            actionForCoffeeMachine(exit);
        } while (getChoice() != "exit");
    }

    public void actionForCoffeeMachine(String choice) {
        switch (choice) {
            case "buy":
                buyAction();
                coffeeType();
                break;
            case "fill":
                fillAction();
                break;
            case "take":
                moneyBack();
                run();
                break;
            case "exit":
                System.exit(0);
                break;
            case "remaining":
                currentStatus();
                run();
                break;
            case "back":
                System.out.println();
                welcomeOnCoffeeWorld();
                break;
            default:
                System.out.println("Wrong action");
        }

    }

    public void coffeeType() {
        String choice = scanner.next();
        switch (choice) {
            case "1":
                esspressoChoice();
                esspressoLogic();
                break;
            case "2":
                latteChoice();
                latteLogic();
                break;
            case "3":
                cappuccinoChoice();
                cappucinoLogic();
                break;
            case "back":
                System.out.println();
                break;
            default:

        }

    }


    public void esspressoChoice() {
        if (water >= espressoWater && beans >= espressoBeans && cups >= 1 && money >= espressoCosts) {
            System.out.println("I have enough resources, making you a coffee!");
        }
        if (water < espressoWater && beans >= espressoBeans && cups >= 1 && money >= espressoCosts) {
            System.out.println("Sorry, not enough water!");
        }
        if (water >= espressoWater && beans < espressoBeans && cups >= 1 && money >= espressoCosts) {
            System.out.println("Sorry, not enough beans!");
        }
        if (water >= espressoWater && beans >= espressoBeans && cups < 1 && money >= espressoCosts) {
            System.out.println("Sorry, not enough cups!");
        }
        if (water >= espressoWater && beans >= espressoBeans && cups >= 1 && money < espressoCosts) {
            System.out.println("Sorry, not enough money!");
        }
        System.out.println();
    }

    public void latteChoice() {
        if (water >= latteWater && beans >= latteBeans && milk >= latteMilk && cups >= 1 && money >= latteCosts) {
            System.out.println("I have enough resources, making you a coffee!");
        }
        if (water < latteWater && beans >= latteBeans && milk >= latteMilk && cups >= 1 && money >= latteCosts) {
            System.out.println("Sorry, not enough water!");
        }
        if (water >= latteWater && beans < latteBeans && milk >= latteMilk && cups >= 1 && money >= latteCosts) {
            System.out.println("Sorry, not enough beans!");
        }
        if (water >= latteWater && beans >= latteBeans && milk < latteMilk && cups >= 1 && money >= latteCosts) {
            System.out.println("Sorry, not enough milk!");
        }
        if (water >= latteWater && beans >= latteBeans && milk >= latteMilk && cups < 1 && money >= latteCosts) {
            System.out.println("Sorry, not enough cups!");
        }
        if (water >= latteWater && beans >= latteBeans && milk >= latteMilk && cups >= 1 && money < latteCosts) {
            System.out.println("Sorry, not enough money!");
        }
        System.out.println();
    }

    public void cappuccinoChoice() {
        if (water >= cappuccinoWater && beans >= cappuccinoBeans && milk >= cappuccinoMilk && cups >= 1 && money >= cappuccinoCosts) {
            System.out.println("I have enough resources, making you a coffee!");
        }
        if (water < cappuccinoWater && beans >= cappuccinoBeans && milk >= cappuccinoMilk && cups >= 1 && money >= cappuccinoCosts) {
            System.out.println("Sorry, not enough water!");
        }
        if (water >= cappuccinoWater && beans < cappuccinoBeans && milk >= cappuccinoMilk && cups >= 1 && money >= cappuccinoCosts) {
            System.out.println("Sorry, not enough beans!");
        }
        if (water >= cappuccinoWater && beans >= cappuccinoBeans && milk < cappuccinoMilk && cups >= 1 && money >= cappuccinoCosts) {
            System.out.println("Sorry, not enough milk!");
        }
        if (water >= cappuccinoWater && beans >= cappuccinoBeans && milk >= cappuccinoMilk && cups < 1 && money >= cappuccinoCosts) {
            System.out.println("Sorry, not enough cups!");
        }
        if (water >= cappuccinoWater && beans >= cappuccinoBeans && milk >= cappuccinoMilk && cups >= 1 && money < cappuccinoCosts) {
            System.out.println("Sorry, not enough money!");
        }
        System.out.println();
    }

    public void esspressoLogic() {
        int esspressoWaterUpdate = water - espressoWater;
        water = esspressoWaterUpdate;
        int esspressoBeansUpdate = beans - espressoBeans;
        int esspressoCupsUpdate = cups - 1;
        cups = esspressoCupsUpdate;
        beans = esspressoBeansUpdate;
        int esspressoMoneyUpdate = money + espressoCosts;
        money = esspressoMoneyUpdate;

        if (esspressoWaterUpdate < 0 || esspressoBeansUpdate < 0 || esspressoCupsUpdate < 0) {
            water = water + espressoWater;
            beans = beans + espressoBeans;
            cups = cups + 1;
            money = money - espressoCosts;
        }
    }

    private void latteLogic() {
        int latteWaterUpdate = water - latteWater;
        water = latteWaterUpdate;
        int latteBeansUpdate = beans - latteBeans;
        beans = latteBeansUpdate;
        int latteMilkUpdate = milk - latteMilk;
        milk = latteMilkUpdate;
        int latteCupsUpdate = cups - 1;
        cups = latteCupsUpdate;
        int latteMoneyUpdates = money + latteCosts;
        money = latteMoneyUpdates;

        if (latteWaterUpdate < 0 || latteBeansUpdate < 0 || latteMilkUpdate < 0 || latteCupsUpdate < 0) {
            water = water + latteWater;
            beans = beans + latteBeans;
            milk = milk + latteMilk;
            cups = cups + 1;
            money = money - latteCosts;

        }
    }

    private void cappucinoLogic() {
        int cappuccinoWaterUpdate = water - cappuccinoWater;
        water = cappuccinoWaterUpdate;
        int cappucinoBeansUpdate = beans - cappuccinoBeans;
        beans = cappucinoBeansUpdate;
        int cappuccinoMilkUpdate = milk - cappuccinoMilk;
        milk = cappuccinoMilkUpdate;
        int cappuccinoCupsUpdate = cups - 1;
        cups = cappuccinoCupsUpdate;
        int cappucinoMoneyUpdates = money + cappuccinoCosts;
        money = cappucinoMoneyUpdates;

        if (cappuccinoWaterUpdate < 0 || cappucinoBeansUpdate < 0 || cappuccinoMilkUpdate < 0 || cups < 0) {
            water = water + cappuccinoWater;
            beans = beans + cappuccinoBeans;
            milk = milk + cappuccinoMilk;
            cups = cups + 1;
            money = money - cappuccinoCosts;
        }
    }

    public void currentStatus() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        if (money == 0) {
            System.out.println(money + " of money");
        } else {
            System.out.println("$" + money + " of money");
        }
        System.out.println();
    }


    public void fillAction() {
        System.out.println();
        System.out.println("Write how many ml of water do you want to add: ");
        int input = scanner.nextInt();
        int addWater = water + input;
        water = input + water;
        System.out.println("Write how many ml of milk do you want to add: ");
        input = scanner.nextInt();
        int addMilk = milk + input;
        milk = milk + input;
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        input = scanner.nextInt();
        int addBeans = beans + input;
        beans = input + beans;
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        input = scanner.nextInt();
        int addCups = cups + input;
        cups = input + cups;
        System.out.println();

    }

    public void buyAction() {
        System.out.println();
        System.out.println("What do you want to buy? 1- espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
    }

    public void moneyBack() {
        System.out.println();
        System.out.println("I gave you $" + money);
        System.out.println();
        int updatesStatusMoney = money - money;
        money = updatesStatusMoney;

    }


}



