public class Main {
    public static void main(String[] args) {
        MakhlukHidup manusia = new Manusia();
        MakhlukHidup hewan = new Hewan();
        MakhlukHidup tumbuhan = new Tumbuhan();

        System.out.println(manusia.bernafas());
        System.out.println(manusia.berkembangBiak());

        System.out.println(hewan.bernafas());
        System.out.println(hewan.berkembangBiak());

        System.out.println(tumbuhan.bernafas());
        System.out.println(tumbuhan.berkembangBiak());
    }
}
