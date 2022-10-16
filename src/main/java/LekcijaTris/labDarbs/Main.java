package LekcijaTris.labDarbs;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sakas");
manaMetode();
manaMetode();
        System.out.println("Beidzas");
        int lalaukims = aprekinaTransLauk (4,5);
        System.out.printf("Taistasrura laukums ir: " + lalaukims);
    }
    public static void manaMetode(){
        System.out.println(" @@@@@@@@@@@@@");
        System.out.println("Valentina Golubkova");
        System.out.println("Riga");
        System.out.println("###########");

    }
    public static int aprekinaTransLauk(int platums,int garums) {
        return platums*garums;
    }
    public static void printCard2(String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("@@@@@@@@@@@@@");
        System.out.println(vards + " " + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums:" + vecums);
        System.out.println("$$$$$$$$$$$$$");
    }


}

