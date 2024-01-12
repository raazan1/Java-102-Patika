public class Main {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        System.out.println("Liste Kapasitesi : " +liste.getCapacty() );
        System.out.println("Eleman Sayisi : " +liste.size() );
        liste.add(12);
        liste.add(13);
        liste.add(14);
        liste.add(15);
        System.out.println("Liste Kapasitesi : " +liste.getCapacty() );
        System.out.println("Eleman Sayisi : " +liste.size() );
        liste.remove(1);
        System.out.println("Liste Kapasitesi : " +liste.getCapacty() );
        System.out.println("Eleman Sayisi : " +liste.size() );
        System.out.println("Liste Drumu" + (liste.isEmpty() ? " Dolu":" Boş"));
        //liste.clear();
        System.out.println("Eleman Sayisi : " +liste.size() );
        System.out.println("Liste Drumu" + (liste.isEmpty() ? " Dolu":" Boş"));
        System.out.println("1. değeri : " + liste.get(0));

    }
}