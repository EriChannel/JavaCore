import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Khoi tao ArrayList
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo"); // Them phan tu
        cars.add("Audi");
        cars.add("Mazda");
        cars.add("Audi");
        cars.add("Audi");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Bentley");

        System.out.println(cars); // Xuat du lieu

        // Xuat du lieu su dung vong lap
        for (String car : cars) {
            System.out.println(car);
        }

        // Lay kich thuoc
        System.out.println("Kich thuoc: " + cars.size());

        // Truy cap phan tu co index = 1
        System.out.println("Phan tu cos index = 1 la: " + cars.get(1));

        // Cap nhat gia tri cua phan tu tai vi tri index = 3
        cars.set(3, "Toyota");
        System.out.println("ArrayList sau khi sua la: ");
        System.out.println(cars); // Xuat du lieu

        // Xoa phan tu co gia tri là BMW ra khoi danh sach
        cars.remove("BMW");
        System.out.println("ArrayList sau khi xoa la: ");
        System.out.println(cars);
        System.out.println("Kich thuoc: " + cars.size());

        //Xoa phan tu tai vi tri index = 0
        cars.remove(0);
        System.out.println("ArrayList sau khi xoa la: ");
        System.out.println(cars);
        System.out.println("Kich thuoc: "+cars.size());

        ArrayList<String> cars2 = new ArrayList<String>();
        cars2.add("Ford");
        cars2.add("BMW");
        System.out.println("Cars2: " + cars2);

        // Chen cac phan tu trong cars2 vao cars, bat dau tu vi tri index = 2
        cars.addAll(2, cars2);
        System.out.println("ArrayList sau khi chen la: ");
        System.out.println(cars);

        // Xoa nhung phan tu khong thuoc cars2 ra khoi danh sach
        // cars.retainAll(cars2);
        // System.out.println(cars);

        // Dem so luong tu Audi xuat hien trong danh sach
        int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).equals("Audi")) {
                count = count + 1;
            }
        }

        System.out.println("So luong Audi xuat hien trong danh sach la: " + count);

        System.out.println("Vi tri cu Ford là: index = "+cars.lastIndexOf("Ford"));


        System.out.println("---------------------------------------------------------");
        //In danh sach cac so tu 0 -> 100
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            arr.add(i);
        }
        System.out.println("Danh sach ca so tu 0 -> 100");
        System.out.println(arr);

        //In danh sach cac so chan tu 0-100
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i+=2) {
            arr1.add(i);
        }
        System.out.println("Danh sach ca so chan tu 0->100");
        System.out.println(arr1);

    }
}
