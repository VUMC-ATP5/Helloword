package lekcijaDivi.majasDarbs;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
        printBusinessCardTwo("Diana","Popova",25677987,1943);
        printBusinessCardTwo("Oksana","Voroncova",24567389,1901);
        int x = 6;
        System.out.println(x < 28);
        System.out.println(x > 30);
        x = 10;
        System.out.println(x > 5 && x <= 10);
        x = 8;
        System.out.println(x>5 && x!= 5 && x < 10 );
        x = 0;
        System.out.println(x==0 && x==10 );
        x = 100;
        System.out.println( x * x > 10);

        int MenesaNumuri = 12;

        switch (MenesaNumuri) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
            case 6:
                System.out.println("Jūnijs");
            case 7:
                System.out.println("Jūlijs");
            case 8:
                System.out.println("Augusts");
            case 9:
                System.out.println("Septembris");
            case 10:
                System.out.println("Oktobris");
            case 11:
                System.out.println("Novembris");
            case 12:
                System.out.println("Decembris");
        }
        int i=120;
        int j=119;
        int k=110;
        int max;
        if(i>j)
            max=i;
        else
            max=j;
        if(max>k)
            System.out.println(max);
        else
            System.out.println(k);


        String trafficLight = "sarkans";
        System.out.println("Enter traffic light color (sarkans, dzeltans vai zals)");
        Scanner scanner = new Scanner(System.in);
        trafficLight = scanner.nextLine();

        if (trafficLight.equals("sarkans")) {
            System.out.println("Stavi!");
        } else if (trafficLight.equals("dzeltens")) {
            System.out.println("Gaidi!");
        } else if (trafficLight.equals("zals")) {
            System.out.println("Ej!");
        } else  {
            System.out.println("Gadi palidzibu un zvani celasatiksmes dienestam");
        }
    }
    public static void printBusinessCard(){
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: Valentina");
        System.out.println("Uzvārds: Golubkova");
        System.out.println("Telefona numurs: 25677748");
        System.out.println("Dzimšanas gads: 1989");
        System.out.println("#############");
    }
    public static void printBusinessCardTwo(String vards,String uzvards,int telefonanumurs,int dzimsanasgads){
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vards:" + vards);
        System.out.println("Uzvārds:" + uzvards);
        System.out.println("Telefona numurs:" + telefonanumurs);
        System.out.println("Dzimšanas gads:" + dzimsanasgads);
        System.out.println("#############");

    }
    }



