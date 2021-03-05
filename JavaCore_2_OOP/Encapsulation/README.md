## Tính chất đóng gói
Sự đóng gói là cơ chế ràng buộc dữ liệu và thao tác trên dữ liệu đó thành một thể thống nhất, tránh được các tác động bất ngờ từ bên ngoài.
Tính đóng gói được ám chỉ như việc dấu dữ liệu (data hiding).
Để cài đặt tính đóng gói, chúng ta thực hiện như sau:
- Tạo các thành viên dữ liệu của lớp là private để các lớp khác không thể truy cập được.
- Sử dụng các phương thức getter/setter có phạm vi truy cập là public để truy cập và sửa đổi các giá trị của thuộc tính trong lớp. 

## Getter và Setter
Getter và Setter là hai phương thức sử dụng để lấy ra hoặc cập nhật giá trị thuộc tính, đặc biệt dành cho thuộc tính ở phạm vi private.
Phương thức Getter là phương thức truy cập vào thuộc tính của đối tượng và trả về các thuộc tính của đối tượng.
Cú pháp phương thức Getter:

![image](https://user-images.githubusercontent.com/70504465/110074618-17b11a80-7db4-11eb-8775-eaf87adaa990.png)

Phương thức Setter là phương thức truy cập vào thuộc tính của đối tượng và gán giá trị cho các thuộc tính của đối tượng đó.
Cú pháp phương thức Setter: 

![image](https://user-images.githubusercontent.com/70504465/110074666-2bf51780-7db4-11eb-9a62-5919c66eff8d.png)