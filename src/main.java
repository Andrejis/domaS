import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Kolac k1 = new Kolac("Cokoladovy", "Hnedy", 500);
        Kolac k2 = new Kolac("Jahodovy", "Cerveny", 250);

        k1.variSa();
        k1.kysne();
        k1.VypisInfo();
        System.out.println("----------------------");
        k2.kysne();
        k2.pecieSa();
        k2.VypisInfo();


        ArrayList<Kolac> a1 = new ArrayList<>();

        a1.add(k1);
        a1.add(k2);
        //a1.remove(0);
        System.out.println(a1.size());
        a1.get(1).VypisInfo();

    }
}
