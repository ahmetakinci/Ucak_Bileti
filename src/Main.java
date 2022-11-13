import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance, age, trip_type;
        double discount;

        System.out.print("Gidilecek mesafeyi giriniz(KM cinsinden): ");
        distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1-Tek Yön, 2-Gidiş Dönüş): ");
        trip_type = scanner.nextInt();

        double price = distance * (0.10);
        if (distance > 0) {
            if (age >= 0 && age < 12) {
                discount = price * (0.50);
                price -= discount;
                if (trip_type == 1) {
                    System.out.println("Yaş indirimi: " + discount);
                    System.out.println("İndirimli Tutar: " + price);
                } else if (trip_type == 2) {
                    price *= 2;
                    System.out.println("Yaş indirimi: " + discount);
                    discount = price * 0.20;
                    price -= discount;
                    System.out.println("Gidiş dönüş bilet indirimi: " + discount);
                    System.out.println("İndirimli tutar: " + price);
                } else {
                    System.out.println("Geçersiz işlem...");
                }

            } else if (age <= 24) {
                discount = price * (0.10);
                price -= discount;
                if (trip_type == 1) {
                    System.out.println("Yaş indirimi: " + discount);
                    System.out.println("İndirimli Tutar: " + price);
                } else if (trip_type == 2) {
                    price *= 2;
                    System.out.println("Yaş indirimi: " + discount);
                    discount = price * 0.20;
                    price -= discount;
                    System.out.println("Gidiş dönüş bilet indirimi: " + discount);
                    System.out.println("İndirimli tutar: " + price);
                } else {
                    System.out.println("Geçersiz işlem...");
                }
            } else if (age < 65) {
                if (trip_type == 1) {
                    System.out.println("Ücret: " + price);
                } else if (trip_type == 2) {
                    price *= 2;
                    discount = price * 0.20;
                    price -= discount;
                    System.out.println("Gidiş Dönüş bilet indirimi: " + discount);
                    System.out.println("İndirimli tutar: " + price);
                } else {
                    System.out.println("Geçersiz işlem...");
                }

            } else if (age >= 65) {
                discount = price * 0.30;
                price -= discount;
                if (trip_type == 1) {
                    System.out.println("Yaş indirimi: " + discount);
                    System.out.println("İndirimli tutar: " + price);
                } else if (trip_type == 2) {
                    price *= 2;
                    System.out.println("Yaş indirimi: " + discount);
                    discount = price * 0.20;
                    price -= discount;
                    System.out.println("Gidiş Dönüş bilet indirimi: " + discount);
                    System.out.println("İndirimli tutar: " + price);
                } else {
                    System.out.println("Geçersiz işlem...");
                }

            } else {
                System.out.println("Geçersiz işlem...");
            }
        } else {
            System.out.println("Geçersiz işlem...");
        }
    }
}
