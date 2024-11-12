import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Nhap loai nhan vien (PartTime/Fulltime): ");
        String type = sc.nextLine();
        if (Objects.equals(type, "PartTime")) {
            System.out.println("Nhap thong tin nhan vien (Ten - Luong theo gio - So gio lam viec):");
            PartTimeEmployee tmpEmployee1 = new PartTimeEmployee(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            System.out.println(tmpEmployee1.getName() + " " + tmpEmployee1.calculateSalary());
        }
        if (Objects.equals(type, "FullTime")) {
            System.out.println("Nhap thong tin nhan vien (Ten - Luong theo gio):");
            FullTimeEmployee tmpEmployee2 = new FullTimeEmployee(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            System.out.println(tmpEmployee2.getName() + " " + tmpEmployee2.calculateSalary());
        }

    }
}