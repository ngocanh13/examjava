package examjava2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Thêm liên lạc mới");
            System.out.println("2. Tìm liên lạc theo tên");
            System.out.println("3. Hiển thị tất cả các liên lạc");
            System.out.println("4. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Tiêu thụ dòng mới

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phoneNumber = scanner.nextLine();
                    addressBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Nhập tên để tìm kiếm: ");
                    String searchName = scanner.nextLine();
                    addressBook.findContactByName(searchName);
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.println("Đang thoát khỏi chương trình Sổ Địa Chỉ. Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập một số từ 1 đến 4.");
            }
        }
    }
}