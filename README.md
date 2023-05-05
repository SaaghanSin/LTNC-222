---
title: 'Project documentation template'
disqus: hackmd
---

Student Dormitory Management System
===


## Table of Contents

[TOC]

## I. Giới thiệu hệ thống

Phần mềm đơn giản quản lý các sinh viên tại một ký túc xá sinh viên cho phép người quản lí đăng nhập với tài khoản. Dành cho người quản lí (admin) và sinh viên với username và password là "admin" và "123"



## II. Các tính năng của hệ thống
---


## III. Class Diagram
---


## IV.Cấu trúc thư mục
---
├── controller/ 
│   ├── studentController.java #Đây là file test của lập trình viên
│   └── studentManage.java #Thực hiện lập mô hình bảng, phục vụ cho GUI
├── dao/
│   ├── DBConnect.java #Thiết lập kết nối với SQL để chuẩn bị cho các phương thức khác
│   ├── studentDao.java #Class Interface cho studentDaoImp.java
│   └── studentDaoImp.java #Thực hiện kết nối với SQL để kéo dữ liệu về danh sách
├── model/
│   └── Students.java #Mô hình biến được định nghĩa - sinh viên
├── run/
│   └── run.java #Chương trình chạy thử với khởi tạo là giao diện đăng nhập
├── service/
│   ├── studentService.java #Class Interface cho studentServiceImp
│   └── studentServiceImp.java #Thực hiện khởi tạo danh sách
├── ubility/
│   └── tableModel.java #Định nghĩa model table
└── view/
    ├── StudentsView.java #Giao diện quản lí sinh viên
    ├── StudentsPanel.java #Đây là file test của lập trình viên
    ├── login.java #Giao diện đăng nhập
    └── mainpage.java #Giao diện trang chủ


## V. Cách chạy chương trình:
Có 3 cách để chạy chương trình:

Cách 1: Sử dụng Eclipse IDE hoặc NetBeans IDE và chạy bằng file run.java(trong thư mục run) -> Run as Java Application.

Cách 2: Sử dụng VSCode và chạy bằng file run.java chọn Run Java.

Cách 3: Export file run ra file có đuôi .jar (đã đính kèm sẵn STDS.rar)
LƯU Ý: Nếu sử dụng cách 3, java -version và javac -version phải cùng phiên bản, đồng thời phải có JDK.

Video demo chương trình được đặt tại:
https://drive.google.com/file/d/1YslivfHiUrQcspoDlx4MWAS8J5MNPLtX/view?usp=sharing
Thực hiện bởi:
Vũ Lâm Hoàng Đại - 2110992

Nếu có thắc mắc, vui lòng liên hệ qua mail: dai.vuvieleddy@hcmut.edu.com
