<h1>Hệ thống Quản lí bệnh nhân Covid-19 tại nhà</h3>

[![tag](https://img.shields.io/badge/-qualif0-008080)](https://github.com/DT47UIT/java_IS216.M21_5)
[![tag](https://img.shields.io/badge/-covid--19-008080)](https://github.com/DT47UIT/java_IS216.M21_5)
[![tag](https://img.shields.io/badge/-management-008080)](https://github.com/DT47UIT/java_IS216.M21_5)
[![os](https://img.shields.io/badge/-windows-008080)](https://github.com/DT47UIT/java_IS216.M21_5)
[![framework](https://img.shields.io/badge/-Java%20Swing-7C81E4)](https://github.com/DT47UIT/java_IS216.M21_5)
[![framework](https://img.shields.io/badge/-Desktop%20App-008080)](https://github.com/DT47UIT/java_IS216.M21_5)

[![school](https://img.shields.io/badge/school-UIT-3f6cb6)](https://www.uit.edu.vn/)
[![subject](https://img.shields.io/badge/subject-LTJava-3f6cb6)](https://www.uit.edu.vn/)
[![contributors](https://img.shields.io/badge/contributors-4-1d9583)](#team)

<br>

<p align="center">
 <img src="https://i.ibb.co/qWp39SJ/logo.png" alt="Quản lí bệnh nhân F0 logo" width = "450"></a>
</p>

<p align="center">
<i>Ứng dụng  "<b>Quản lí bệnh nhân Covid-19 tại nhà</b>".</i>
<br/>
<i>Đồ án môn học Lập trình Java.</i>
</p>

<h3 align="center">Hiện tại, nhầm đáp ứng nhanh việc xử lí điều trị bệnh nhân Covid-19 tại nhà một cách nhanh chóng và giảm tải được khối lượng công việc cho tuyến đầu là vô cùng cần thiết. 🚩</h3>
<h3 align="center">Vì vậy, Phần mềm này được ra đời để giúp các cán bộ y tế ở địa phương có thể dễ dàng quản lí bệnh nhân tại khu vực của mình. 📈</h3>
<h3 align="center">Việc ứng dụng công nghệ thông tin vào quy trình thăm khám và chữa bệnh sẽ thúc đẩy hiệu quả công việc lên cao và giảm được nhiều chi phí phát sinh 📊</h3>

---

## 📝 Nội dung 

- [Giới thiệu sơ lược](#gioithieu)
- [Mở đầu](#modau)
	- [Điều kiện cài đặt](#dieukiencaidat)
	- [Hướng dẫn cài đặt](#huongdancaidat)
- [Cấu hình yêu cầu](#cauhinh)
- [Các tính năng](#tingnang)
 - [Chung](#chung)
   - [Đăng nhập ](#dangnhap)
   - [Quên mật khẩu ](#quenmk)
 - [Cán bộ y tế](#canboyte)
    - [Quản lí bệnh nhân](#quanlibenhnhan)
   - [Thống kê ](#thongke)
   - [Xử lí hỗ trợ](#xulihotro)
	- [Xem quy trình nghiệp vụ](#xemquytrinhnv)
	- [Cập nhật thông tin cá nhân](#capnhatttcn)
 - [Bệnh nhân](#benhnhan)
   - [Đăng kí tài khoản](#dktaikhoan)
   - [Khai báo, cập nhật thông tin cá nhân](#thongtincn)
   - [Khai báo, cập nhật tình hình điều trị](#thongtindieutri)
   - [Yêu cầu hỗ trợ](#yeucauhotro)
   - [Cập nhật thông tin tài khoản](#capnhattttk)
- [Công cụ](#congcu)
- [Nhóm Agile](#team)


<a name="gioithieu"></a>

## Giới thiệu sơ lược

Trước tình hình dịch bệnh có diễn biến phức tạp với nhiều biến chủng mới, số ca bệnh tăng nhanh, lây lan mạnh trong cộng đồng, chính phủ và bộ y tế đã ban hành chính sách “Quản lý bệnh nhân Covid 19 tại nhà”. Nó nhằm mục đích giảm lây nhiễm cộng đồng, phát hiện sớm và điều trị kịp thời các ca bệnh diễn biến nặng, giảm quá tải hệ thống y tế và vai trò giảm lây nhiễm vẫn cần nhưng trở nên không còn quá thiết yếu. Đây là chính sách có quy mô toàn quốc, đòi hỏi sự quản lý chặt chẽ về thông tin cá nhân của các bệnh nhân, thông tin sức khỏe, tiền sử bệnh nền, số mũi vaccine đã tiêm, hỗ trợ bệnh nhân,… Để đảm bảo tất cả những công việc này được thực hiện một cách chuẩn xác nhất thì cần phải có một hệ thống cơ sở dữ liệu để lưu trữ, xử lý các thông tin cần thiết trên.

Trước đây, quá trình quản lý, lưu trữ các thông tin của bệnh nhân cách ly tại nhà, đều được thực hiện trên giấy tờ. Nó còn quá phức tạp, dễ dàng thất lạc thông tin bệnh nhân và không đảm bảo quá trình quản lý bệnh nhân. Do đó, Chính phủ cần phát triển một hệ thống quản lý bệnh nhân Covid 19 tại nhà. Hệ thống này cho phép các đợn vị y tế tổ chức cách ly tại địa phương, công nhân truy cập vào bằng cách đăng nhập và sử dụng các quyền truy cập khác nhau. Các đơn vị y tế có quyền cập nhập thông tin bệnh nhân cũng như các quy định về điều kiện cách ly tại nhà, hướng dẫn, theo dõi và khám chữa bệnh tại nhà, thống kê số bệnh nhân nhiễm và khỏi bệnh. Bệnh nhân sử dụng hệ thống này để cập nhập thông tin cá nhân, tình hình sức khỏe và nhận được sự hướng dẫn và chăm sóc sức khỏe tại nhà. Mọi bệnh nhân khi đã đủ điều kiện cách ly tại nhà đều có thể tự cách ly tại nhà riêng. a ra, bệnh nhân còn có thể tra cứu các thông tin về số ca nhiễm và các thông tin mới nhất do Bộ Y Tế cập nhập. 

<a name="Modau"></a>

## Mở đầu

<a name="dieukiencaidat"></a>
### Điều kiện cài đặt

Ứng dụng sử dụng [Oracle](https://www.oracle.com/index.html) làm **Hệ quản trị cơ sở dữ liệu** và [Netbean](https://netbeans.apache.org/) (phiên bản 13) làm IDE.

* **Oracle** có thể được tải tại [đây](https://www.oracle.com/database/technologies/oracle-database-software-downloads.html).
* **Netbean IDE** có thể được tải tại [đây](https://netbeans.apache.org/download/index.html).

Hãy chắc rằng bạn đã cài đặt các ứng dụng trên trước khi tiến hành cài đặt và sử dụng phần mềm này.

<a name="huongdancaidat"></a>
### Hướng dẫn cài đặt

1. Truy cập đường dẫn sau :  [Demo và cài đặt](https://drive.google.com/drive/folders/16Jq-HBYCLTOTetuThS-jgjq_oQyvml3C?usp=sharing).
2. Xem file **HuongDanCaiDat.docx**.
3. Làm theo yêu cầu trong hướng dẫn.

<a name="cauhinh"></a>
## Cấu hình yêu cầu
### Yêu cầu hệ thống/ máy tính tối thiểu có :
* **Hệ điều hành:** Windows 10.
* **RAM:** 4GB.
* **Processor:** 2 GHz.
* **Dung lượng ổ cứng còn tối thiểu:**  10GB.

<a name="tingnang"></a>
## Các tính năng

<br/>

<p align="center">
 <img src="https://i.ibb.co/bL14dKt/971b86a91b4bdb15825a.jpg" alt="Sơ đồ giao diện và chức năng"></a>
<i>Sơ đồ giao diện và chức năng</i>
</p>

<br/>

<a name="chung"></a>
### Chung
* Người dùng sẽ dùng tài khoản đăng nhập vào hệ thống với tài khoản là **Số CMND/CCCD**
* Người dùng cũng có thể cập nhật lại mật khẩu khi đã quên
* Tính năng đăng kí chỉ sử dụng cho bệnh nhân

<a name="dangnhap"></a>
#### Đăng nhập
<br/>

<p align="center">
 <img src="https://i.ibb.co/98h3kkQ/Screenshot-2022-06-09-202255.png" alt="Màn hình đăng nhập"></a>
<i>Màn hình đăng nhập</i>
</p>

<br/>

<a name="quenmk"></a>
#### Quên mật khẩu

<br/>

<p align="center">
 <img src="https://i.ibb.co/HnHJdCV/Screenshot-2022-06-09-202327.png" alt="Quên mật khẩu"></a>
<i>Quên mật khẩu</i>
</p>

<a name="canboyte"></a>
### Cán bộ y tế
* Cán bộ nhân viên y tế có thể tra cứu, tìm kiếm bệnh nhân, thêm mới bệnh nhân, xóa bệnh nhân, xem chi tiết thông tin bệnh nhân và cập nhật quá trình điều trị tại nhà.
* Cán bộ nhân viên y tế dựa trên tình hình điều trị mà có thể tạo kết quả điều trị cho bệnh nhân để kết thúc quá trình điều trị.
* Ngoài ra, cán bộ nhân viên tế cũng có thể xuất danh sách bệnh nhân - bệnh nhân có nguy cơ chuyển năng ra <i>file excel</i>.

<a name="quanlibenhnhan"></a>
#### Quản lí bệnh nhân

<br/>

<p align="center">
 <img src="https://i.ibb.co/JcQpKBS/NEW1.png" alt="Giao diện quản lí bệnh nhân"></a>
<i>Giao diện quản lí bệnh nhân</i>
</p>

<br/>

<p align="center">
 <img src="https://i.ibb.co/zS2X1LW/Screenshot-2022-06-09-202602.png" alt="Thêm bệnh nhân"></a>
<i>Thêm bệnh nhân</i>
</p>

<br/>

<p align="center">
 <img src="https://i.ibb.co/BsNdw9x/Screenshot-2022-06-09-202719.png" alt="Xem chi tiết và cập nhật thông tin"></a>
<i>Xem chi tiết và cập nhật thông tin</i>
</p>

<br/>

<p align="center">
 <img src="https://i.ibb.co/7z8dWgs/Screenshot-2022-06-09-203430.png" alt="Tạo kết quả điều trị"></a>
<i>Tạo kết quả điều trị</i>
</p>

<br/>

</p>
<p align="center">
 <img src="https://i.ibb.co/NSrVD9k/new7.png" alt="Mẫu bệnh án"></a>
<i>Mẫu bệnh án</i>
</p>

<br/>

<a name="thongke"></a>
#### Thống kê
* Cán bộ nhân viên y tế có thể xem các thông số thống kê tự động, xuất báo cáo nếu cần

<br/>

<p align="center">
 <img src="https://i.ibb.co/KNWtVVc/NEW2.png" alt="Xem thống kê"></a>
<i>Xem thống kê</i>
</p>

<br/>

<p align="center">
 <img src="https://i.ibb.co/v4Q6MsZ/new8.png" alt=" 1 Mẫu thống kê"></a>
<i>1 Mẫu thống kê</i>
</p>  

<a name="xulihotro"></a>
#### Xử lí hỗ trợ
* Cán bộ y tế có thể xin thông tin yêu cầu được hỗ trợ của bệnh nhân gửi đến, xác nhận xử lí và chuyển tiếp hỗ trợ cho cán bộ khác nếu cần

<br/>

<p align="center">
 <img src="https://i.ibb.co/jgY9Vm3/NEW3.png" alt="Thông tin hỗ trợ"></a>
<i>Thông tin hỗ trợ</i>
</p>

<br/>

<p align="center">
 <img src="https://i.ibb.co/yVJXKLP/new9.png" alt=" Chuyển tiếp yêu cầu "></a>
<i> Chuyển tiếp yêu cầu</i>
</p>  

<a name="xemquytrinhnv"></a>
#### Xem quy trình nghiệp vụ

* Xem thông tin sơ lược về quy trình nghiệp vụ chăm sóc, xử lí bệnh tình F0 tại nhà.

<br/>

<p align="center">
 <img src="https://i.ibb.co/ynNZLkj/NEW4.png" alt="Thông tin quy trình nghiệp vụ"></a>
<i>Thông tin quy trình nghiệp vụ</i>
</p>

<br/>

<a name="capnhatttcn"></a>
#### Cập nhật thông tin cá nhân

* Cán bộ y tế cũng có thể cập nhật thông tin cá nhân cơ bản và thông tin tài khoản.

<br/>

<p align="center">
 <img src="https://i.ibb.co/bz0mD3V/NEW6.png" alt="Xem và cập nhật thông tin"></a>
<i>Xem và cập nhật thông tin</i>
</p>

<br/>

<a name="benhnhan"></a>
### Bệnh nhân
* Bệnh nhân sẽ có thể đăng kí tài khoản ( nếu chưa được cán bộ y tế thêm ), khai báo thông tin cá nhân và các thông tin liên quan.
* Bệnh nhân có thể cập nhật liên tục quá trình điều trị của mình và gửi yêu cầu hỗ trợ nếu cần.

<a name="dktaikhoan"></a>
#### Đăng kí tài khoản

<br/>

<p align="center">
 <img src="https://i.ibb.co/XkWt8KW/Screenshot-2022-06-09-202346.png" alt="
Đăng kí tài khoản bệnh nhân"></a>
<p align="center">
<i>Đăng kí tài khoản bệnh nhân</i>
</p>
</p>

<br/>

<a name="thongtincn"></a>
#### Khai báo, cập nhật thông tin cá nhân

<br/>

<p align="center">
 <img src="https://i.ibb.co/gRSnmZC/new11.png" alt="Xem và cập nhật thông tin"></a>
<i>Xem và cập nhật thông tin</i>
</p>

<br/>

<a name="thongtindieutri"></a>
#### Khai báo, cập nhật tình hình điều trị

<br/>

<p align="center">
 <img src="https://i.ibb.co/vmwNck4/new12.png" alt="Cập nhật quá trình điều trị"></a>
<i>Cập nhật quá trình điều trị</i>
</p>

<br/>



<a name="yeucauhotro"></a>
#### Yêu cầu hỗ trợ

* Bệnh nhân xem thông tin cá bộ y tế và chọn cán bộ để gửi yêu cầu, có thể gửi nhiều lần
<br/>

<p align="center">
 <img src="https://i.ibb.co/VDHDbcM/new12a.png" alt="Gửi yêu cầu hỗ trợ"></a>
<i>Gửi yêu cầu hỗ trợ</i>
</p>

<br/>

<a name="capnhattttk"></a>
#### Cập nhật thông tin tài khoản

<br/>

<p align="center">
 <img src="https://i.ibb.co/PFHzgfM/new12b.png" alt="Xem, cập nhật thông tin tài khoản"></a>
<i>Xem, cập nhật thông tin tài khoản</i>
</p>


<a name="congcu"></a>
## Công cụ

- **Languages:** [Java](https://docs.microsoft.com/en-us/dotnet/csharp/).
- **Database:** [Oracle](https://www.oracle.com/index.html).
- **IDE:** [NetBean](https://netbeans.apache.org/).
- **Version Control System:** [Git](https://git-scm.com/).
- **Design:** [draw.io](https://app.diagrams.net/), [PowerDesigner](https://www.sap.com/products/powerdesigner-data-modeling-tools.html)


<a name="team"></a>
## Nhóm Agile

Dự án được hoàn thành bởi sự góp sức của 4 thành viên :
- Nguyễn Minh Cường *(MC115-UIT)*: 20520422@gm.uit.edu.vn
- Nguyễn Đạt *(DT47UIT)*: 20520434@gm.uit.edu.vn
- Tôn Nữ Thảo Nhi *(TonNuThaoNhi)*: 20521718@gm.uit.edu.vn
- Đinh Thị Ánh Nguyệt *(anhnguyet2002)*: 20521688@gm.uit.edu.vn

**CẢM ƠN ĐÃ THEO DÕI <3**
