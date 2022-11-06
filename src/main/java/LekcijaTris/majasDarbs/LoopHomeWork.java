package LekcijaTris.majasDarbs;
public class LoopHomeWork {

    public static void main(String[] args) {
        int n =0;
        while ( n <= 100) {
            System.out.println(" .Gatavs");
            n++;
        }
int[]candy = new int[5];
        candy[0] = 4;
        candy[1] = 5;
        candy[2] = 6;
        candy[3] = 7;
        candy[4] = 8;
        System.out.println(candy[0]);
 for (int i = 0; i < candy.length; ++i) {
     System.out.println("Tasty: " + candy[i]);
 }

 int f = 10;
 while (f < 50) {
     System.out.println("I ir"+ f);
     f = f + 1;
        }

        int [] speletajuNumuri = {5,7,12};
        char [] pirmieBurti = {'A', 'B', 'C'};
        String []  drauguVardi = {"Niks", "Karlis", "Leine"};
        int index1 = 0;
        while (index1 < speletajuNumuri.length) {
            int numuri = speletajuNumuri[index1];
            System.out.println(numuri);
            index1++;
        }
        int index2 = 0;
        while (index2 < drauguVardi.length) {
            String vardi = drauguVardi[index2];
            System.out.println(vardi);
            index2++;
        }
        int index3 = 0;
        while (index3 < pirmieBurti.length) {
            char burti = pirmieBurti[index3];
            System.out.println(burti);
            index3++;
        }

        int a= 0;
        do {
            int numuri = speletajuNumuri[a];
            System.out.println(numuri);
            a++;
        }
        while (a < speletajuNumuri.length);

        int c= 0;
        do {
            String vardi = drauguVardi[c];
            System.out.println(vardi);
            c++;
        }
        while (c< drauguVardi.length);

        int x = 0;
        do{
            char burti = pirmieBurti[x];
            System.out.println(burti);
            x++;
        }
        while (x < pirmieBurti.length);


        for (int j = 0; j < speletajuNumuri.length; j++) {
            System.out.println(speletajuNumuri[j]);
        }

        for (int j = 0; j < drauguVardi.length; j++) {
            System.out.println(drauguVardi[j]);
        }
        for (int j = 0; j < pirmieBurti.length; j++) {
            System.out.println(pirmieBurti[j]);
        }

        for (int numuri : speletajuNumuri) {
            System.out.println(numuri);
        }
        for (String draugi : drauguVardi) {
            System.out.println(draugi);
        }
        for (char burti : pirmieBurti) {
            System.out.println(burti);
        }

        for (int m = 10; m <= 200; m++) {
            if (m % 14 == 0) {
                System.out.print(m + " ");
            }


}
    }
}



