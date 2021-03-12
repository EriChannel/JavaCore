## Interface trong java
Interface là một kiểu dữ liệu tham chiếu trong Java. Nó là tập hợp các phương  thức abstract (trừu tượng). Khi một lớp kế thừa interface, thì nó sẽ kế thừa những phương thức abstract của interface đó

## Một số đặc điểm của Interface

- Không thể khởi tạo, nên không có phương thức khởi tạo.
- Tất cả các phương thức trong interface luôn ở dạng public abstract mà không cần khai báo.
- Các thuộc tính trong interface luôn ở dạng public static final mà không cần khai báo, yêu cầu phải có giá trị.

## Cú pháp:
![image](https://user-images.githubusercontent.com/70504465/110243620-c52b5600-7f8d-11eb-866b-591891232cbf.png)

## Bài tập ví dụ
Hãy tạo interface và class giống như trong sơ đồ sau:

![image](https://user-images.githubusercontent.com/70504465/110243526-59e18400-7f8d-11eb-9115-65683de2c1f6.png)

Sơ đồ trên mô tả chương trình tính lương của nhân viên part time và full time 
Ta có:
+ interface IEmployee có chưa hai phương thức trừu tượng calculatorSalary() và getName().
+ Lớp Employee kế thừa từ interface IEmployee, lớp này lưu trữ các thông tin của nhân viên bao gồm: name và paymentPerHour. Trong lớp này có chứa constructor và setter và getter
+ Lớp PartTimeEmployee và FullTimeEmployee: hai lớp này kế thừa lớp Employee, trong đó:
Lớp PartTimeEmployee có thuộc tính workHours, constructor và phương thức tính lương calculatorSalary
Lớp FullTimeEmployee chứa constructor và phương thức tính lương calculatorSalary, với lớp FullTimeEmployee nhân viên làm việc 8 tiếng một này nên không có thuộc tính workingHours