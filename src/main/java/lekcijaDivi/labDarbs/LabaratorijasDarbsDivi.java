package lekcijaDivi.labDarbs;

import java.util.Scanner;

public class LabaratorijasDarbsDivi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello lekcija Divi");
        int vecums;
        System.out.println("Ievadi cilveka vecumu...");
        vecums=scanner.nextInt();
        if(vecums>=18){
            System.out.println("Cilvek var balsot"); }
            System.out.println("Kā tevi sauc?");
            String name = scanner.nextLine();

            System.out.println("Labdien, " + name + "Esi sveicināts/a manā programmā");
        //Salidzināšanas izteiksmes
        //Lielāks
        int x = 3;
        int y = 2;
        //šeit būs true
        System.out.println(x > y);
        y = 3;
        //šeit būs false
        System.out.println(x > y);
        //Mazāks
        x=5;
        y=3;
        System.out.println(x < y);
        y=10;
        System.out.println(x < y);

        String luksaforaKrasa = "green";
        System.out.println(luksaforaKrasa.equals("green"));
        System.out.println(luksaforaKrasa.equals("red"));
//nav vienāds
        System.out.println(x!=y);
        System.out.println(!luksaforaKrasa.equals("red"));

int vozrast = 19;

        System.out.println("Paskaties cilvela pase");
        if(vozrast>=18) {
            System.out.println("Drikst balsot");
        }
        System.out.println("Talakas darbibas");
int skaitlis = -5;
        if(skaitlis>=-5) {
            System.out.println("Nefativs");
        }
        System.out.println("Talakas darbibas");
        int age = 18;
        boolean hasVoted = false;

        System.out.println("Paskaties cilvēka pasē");
        if (age >= 18 && hasVoted==false) {
            System.out.println("Drīkst balsot");
        }
// KODS - LUKSOFORS
        String trafficLight;
        System.out.println("Enter traffic light color (red, yellow or green):");
        Scanner scanner1= new Scanner(System.in);
        trafficLight = scanner1.nextLine();

        if (trafficLight.equals("red")){
            System.out.println("Stay!");
        } else if (trafficLight.equals("yellow")) {
            System.out.println("Wait!");
        } else if (trafficLight.equals("green")){
            System.out.println("Go!");
        } else {
            System.out.println("Wrong color!");
        }

//noteikt vai ievadītais skaitlis ir pāra vai nepāra skaitlis
        int number = scanner.nextInt();
        //te uzrakstīt kodu, kurš izvada vai skaitlis ir para vai nepara
        if (number % 2 == 0) {
            System.out.println(number + " ir pāra skaitlis");
        } else {
            System.out.println(number + " ir nepāra skaitlis");
        }

        int monthNumber = 0;
        switch(monthNumber){
            case 1: System.out.println("Janvāris");
                break;
            case 2: System.out.println("Februāris");
                break;
            case 3: System.out.println("Marts");
                break;
            case 4: System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Majis");
        }




    }
    }