## Nội dung yêu cầu

Viết chương trình OOP quản lý sinh viên đơn giản: Nhập, xuất thông tin, tính điểm trung bình.

Viết lớp Student  như sau:

Các thuộc tính:

Mã sinh viên: Kiểu số nguyên
Họ tên: Chuỗi ký tự
Điểm lý thuyết: float
Điểm thực hành: float
Tạo constructor mặc định

Tạo constructor có tham số nhận đầy đủ thông tin để khởi tạo giá trị cho tất cả các biến

Tạo method tính điểm trung bình (Điểm lý thuyết + điểm trung bình)/2



Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3 (Bằng constructor mặc định). Đối tượng sv4 (Bằng constructor có tham số)

Ví dụ:

//Tạo bằng constructor mặc định

Person person = new Person();

person.name = "Ngoc";

person.age = 25;

person.address = "HG";



//Tạo bằng constructor có tham số

Person person2 = new Person("Ngoc", 25, "HG");




