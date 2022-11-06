package lekcijaCetri.labDarbs;

public class House {
    int stavuDaudzum;
    int loguSkaits;
    int durvjuSkaits;
    String adrese;
    double driestuAugums;
    long kadastralaVertiba;
    boolean vaiPrivatipasums;

    public String printHouse() {
        return "House{" +
                "stavuDaudzum=" + stavuDaudzum +
                ", loguSkaits=" + loguSkaits +
                ", durvjuSkaits=" + durvjuSkaits +
                ", adrese='" + adrese + '\'' +
                ", driestuAugums=" + driestuAugums +
                ", kadastralaVertiba=" + kadastralaVertiba +
                ", vaiPrivatipasums=" + vaiPrivatipasums +
                '}';
    }
}
