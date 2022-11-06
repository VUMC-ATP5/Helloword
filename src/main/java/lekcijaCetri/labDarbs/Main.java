package lekcijaCetri.labDarbs;

public class Main {
    public static  void main(String[] args){
        String vards = "Valntina";
        House majaViens = new House();
        majaViens.adrese = "Brvibas iela 123";
        majaViens.durvjuSkaits = 6;
        majaViens.kadastralaVertiba = 10000;
        majaViens.driestuAugums = 2.5;
        majaViens.stavuDaudzum = 5;
        majaViens.vaiPrivatipasums = true;
        majaViens.loguSkaits = 4;

        House majaDivi = new House();
        majaDivi.adrese = "Appes 6";
        majaDivi.vaiPrivatipasums = true;
        majaDivi.stavuDaudzum = 6;
        majaDivi.driestuAugums = 3;
        majaDivi.kadastralaVertiba = 50000;
        majaDivi.durvjuSkaits = 7;
        majaDivi.loguSkaits = 2;

        House [] majas = {majaViens,majaDivi};
        for (House maja : majas) {
            System.out.println(maja.adrese);
            System.out.println(maja.driestuAugums);
            System.out.println(maja.vaiPrivatipasums);
            System.out.println(maja.stavuDaudzum);
            System.out.println(maja.durvjuSkaits);
            System.out.println(maja.kadastralaVertiba);
        }
        Velosipeds mansVelo = new Velosipeds();
        System.out.println();
    }
}
