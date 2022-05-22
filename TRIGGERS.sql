--TRIGGERS

--1.V?i m?i s? cmnd/cccd thì ch? ??ng kí ???c m?t tài kho?n b?nh nhân
SET SERVEROUTPUT ON;
CREATE OR REPLACE TRIGGER TKBN_CMND_CCCD_INSERT
BEFORE INSERT ON TAIKHOANBENHNHAN
FOR EACH ROW
DECLARE
    TOTAL INT;
BEGIN
    SELECT COUNT(tk.socmnd_cccd) INTO TOTAL
    FROM TAIKHOANBENHNHAN TK
    WHERE TK.SOCMND_CCCD=:NEW.SOCMND_CCCD;
    
    IF (TOTAL>=1) THEN
        RAISE_APPLICATION_ERROR(-20000,'SO CMND_CCCD DA DUOC DANG KY');
    ELSE
        DBMS_OUTPUT.PUT_LINE('DA THEM THANH CONG');
    END IF;
END;
SELECT * FROM taikhoanbenhnhan;
INSERT INTO TAIKHOANBENHNHAN VALUES ('0001','1922569449','NGUYEN HOAI AN','AN123456'); 
INSERT INTO tiemvaccine VALUES ('0001','ROI','ASTRA',to_date('10-OCT-2021 8:30', 'dd-mon-yyyy hh24:mi'),'ASTRA','22-JAN-2022','ASTRA','1-MAY-2022');

--2.V?i m?i s? cmnd/cccd thì ch? ??ng kí ???c m?t tài kho?n cán b? y t?
SET SERVEROUTPUT ON;
CREATE OR REPLACE TRIGGER TKCBYT_CMND_CCCD_INSERT
BEFORE INSERT ON TAIKHOANCANBOYTE
FOR EACH ROW
DECLARE
    TOTAL INT;
BEGIN
    SELECT COUNT(tk.socmnd_cccd) INTO TOTAL
    FROM taikhoancanboyte TK
    WHERE TK.SOCMND_CCCD=:NEW.SOCMND_CCCD;
    
    IF (TOTAL>=1) THEN
        RAISE_APPLICATION_ERROR(-20000,'SO CMND_CCCD DA DUOC DANG KY');
    ELSE
        DBMS_OUTPUT.PUT_LINE('DA THEM THANH CONG');
    END IF;
END;
SELECT * FROM taikhoancanboyte;
INSERT INTO taikhoancanboyte VALUES ('1719','192106148','TON NU THAO NHI','nhi123456'); 

--TRIGGERS 
--3.NAM KHONG MANG THAI
CREATE OR REPLACE TRIGGER MANGTHAI
BEFORE INSERT OR UPDATE ON MANGTHAI
FOR EACH ROW
DECLARE 
	GIOITINH  BENHNHAN.GioiTinh%type;
BEGIN
	SELECT GioiTinh INTO GIOITINH 
    FROM BENHNHAN BN 
    WHERE BN.MaBenhNhan=:new.MaBenhNhan;
	IF ( GIOITINH = 'NAM') then
	RAISE_APPLICATION_ERROR(-20000,'Nam khong the mang thai !! Sai du lieu');
	ROLLBACK ;
	END IF;
END;

--4.ngay tiem vaccine
create or replace NONEDITIONABLE TRIGGER NGAY_TIEM
BEFORE INSERT OR UPDATE ON TIEMVACCINE
FOR EACH ROW
DECLARE 
	NGAYTIEM_MUI_1 TIEMVACCINE.NgayTiem1%type;
	NGAYTIEM_MUI_2 TIEMVACCINE.NgayTiem2%type;
	NGAYTIEM_MUI_3 TIEMVACCINE.ngaytiem3%type;
BEGIN
	NGAYTIEM_MUI_1:=:NEW.NgayTiem1;
	NGAYTIEM_MUI_2:=:NEW.NgayTiem2;
	NGAYTIEM_MUI_3:=:NEW.NgayTiem3;

	IF(NGAYTIEM_MUI_1>NGAYTIEM_MUI_2) THEN 
		RAISE_APPLICATION_ERROR(20000,'Ngay tiem khong hop le');
		ROLLBACK;
	END IF;

	IF(NGAYTIEM_MUI_2>NGAYTIEM_MUI_3) THEN 
		RAISE_APPLICATION_ERROR(20000,'Ngay tiem khong hop le');
		ROLLBACK ;
	END IF;
    IF(NGAYTIEM_MUI_3>sysdate) THEN 
		RAISE_APPLICATION_ERROR(20000,'Ngay tiem khong hop le');
		ROLLBACK ;
	END IF;
END;


--5.Ngày sinh c?a b?nh nhân ph?i bé h?n ngày tiêm các m?i vaccine 1 
--TIEMVACCINE
CREATE OR REPLACE  TRIGGER NS_NT1_TVC
BEFORE INSERT OR UPDATE ON TIEMVACCINE
FOR EACH ROW
DECLARE 
	NGAYTIEM_MUI_1 tiemvaccine.ngaytiem1%TYPE;
	NGAYSINH benhnhan.ngaysinh%TYPE;
BEGIN
    NGAYTIEM_MUI_1:=:new.ngaytiem1;
	SELECT b.ngaysinh INTO NGAYSINH 
    FROM BENHNHAN B
    WHERE b.mabenhnhan=:new.mabenhnhan;
	IF(ngaytiem_mui_1<ngaysinh) THEN 
		RAISE_APPLICATION_ERROR(-20000,'Ngay tiem mui 1 phai lon hon ngay sinh');
		ROLLBACK;
	END IF;
END;

--BENHNHAN
CREATE OR REPLACE  TRIGGER NS_NT1_BN
BEFORE UPDATE ON BENHNHAN
FOR EACH ROW
DECLARE 
	NGAYTIEM_MUI_1 tiemvaccine.ngaytiem1%TYPE;
	NGAYSINH benhnhan.ngaysinh%TYPE;
BEGIN
	NGAYSINH:=:new.NGAYSINH;
	SELECT t.ngaytiem1 INTO ngaytiem_mui_1
    FROM tiemvaccine T
    WHERE T.mabenhnhan=:new.mabenhnhan;
    
	IF(ngaytiem_mui_1<ngaysinh OR NGAYTIEM_MUI_1 IS NULL) THEN 
		RAISE_APPLICATION_ERROR(-20000,'Ngay sinh phai nho hon ngay tiem mui 1');
		ROLLBACK;
	END IF;
END;


--6.Ngày sinh c?a b?nh nhân ph?i bé h?n ngày ti?p nh?n lên h? th?ng  
CREATE OR REPLACE  TRIGGER NS_NTN_BN
BEFORE INSERT OR UPDATE ON BENHNHAN
FOR EACH ROW
DECLARE 
	NGAYTIEPNHAN DATE;
	NGAYSINH DATE;
BEGIN
	NGAYTIEPNHAN:=:NEW.NGAYTIEPNHAN;
    NGAYSINH:=:NEW.NGAYSINH;
    
	IF(ngaytiepnhan<ngaysinh) THEN 
		RAISE_APPLICATION_ERROR(-20000,'Ngay sinh phai nho hon ngay tiep nhan');
    ELSE
        DBMS_OUTPUT.PUT_LINE('DA THEM THANH CONG');
	END IF;
END;

--7.Ngày ti?p nh?n lên h? th?ng ph?i bé h?n ngày t?i th?i ?i?m c?p nh?t quá trình ?i?u tr? t?i nhà. 
--BENHNHAN
CREATE OR REPLACE  TRIGGER NTN_TDCN_BN
BEFORE UPDATE ON BENHNHAN
FOR EACH ROW
DECLARE 
	NGAYTIEPNHAN benhnhan.ngaytiepnhan%TYPE;
	THOIDIEMCAPNHAT capnhat.thoidiemcapnhat%TYPE;
BEGIN
    NGAYTIEPNHAN:=:NEW.NGAYTIEPNHAN;
	SELECT C.thoidiemcapnhat INTO THOIDIEMCAPNHAT
    FROM CAPNHAT C
    WHERE C.mabenhnhan=:NEW.mabenhnhan;
    
	IF(thoidiemcapnhat<ngaytiepnhan OR thoidiemcapnhat IS NULL) THEN 
		RAISE_APPLICATION_ERROR(-20000,'Ngay tiep nhan phai nho hon thoi diem cap nhat');
		ROLLBACK;
	END IF;
END;

--CAPNHAT
CREATE OR REPLACE  TRIGGER NTN_TDCN_CN
BEFORE INSERT OR UPDATE ON CAPNHAT
FOR EACH ROW
DECLARE 
	NGAYTIEPNHAN benhnhan.ngaytiepnhan%TYPE;
	THOIDIEMCAPNHAT capnhat.thoidiemcapnhat%TYPE;
BEGIN
    THOIDIEMCAPNHAT:=:NEW.THOIDIEMCAPNHAT;
	SELECT  b.ngaytiepnhan INTO  NGAYTIEPNHAN
    FROM  BENHNHAN B
    WHERE B.mabenhnhan=:NEW.mabenhnhan;
    
	IF(thoidiemcapnhat<ngaytiepnhan) THEN 
		RAISE_APPLICATION_ERROR(-20000,'Thoi diem cap nhat phai lon hon ngay tiep nhan');
		ROLLBACK;
	END IF;
END;

--8.Ngày ti?p nh?n lên h? th?ng ph?i bé h?n ngày t?i th?i ?i?m g?i yêu c?u h? tr? y t?. 
--BENHNHAN
CREATE OR REPLACE  TRIGGER NTN_TDGYC_BN
BEFORE UPDATE ON BENHNHAN
FOR EACH ROW
DECLARE 
	NGAYTIEPNHAN benhnhan.ngaytiepnhan%TYPE;
	THOIDIEMYEUCAU duochotro.thoidiemyeucau%TYPE;
BEGIN
    NGAYTIEPNHAN:=:NEW.NGAYTIEPNHAN;
	SELECT d.thoidiemyeucau INTO THOIDIEMYEUCAU
    FROM DUOCHOTRO D
    WHERE D.mabenhnhan=:NEW.mabenhnhan;
    
	IF(thoidiemyeucau<ngaytiepnhan OR thoidiemyeucau IS NULL) THEN 
		RAISE_APPLICATION_ERROR(-20000,'Ngay tiep nhan phai nho hon thoi diem yeu cau');
		ROLLBACK;
	END IF;
END;

--DUOCHOTRO
CREATE OR REPLACE  TRIGGER NTN_TDGYC_DHT
BEFORE INSERT OR UPDATE ON DUOCHOTRO
FOR EACH ROW
DECLARE 
	NGAYTIEPNHAN benhnhan.ngaytiepnhan%TYPE;
	THOIDIEMYEUCAU duochotro.thoidiemyeucau%TYPE;
BEGIN
    THOIDIEMYEUCAU:=:NEW.THOIDIEMYEUCAU;
	SELECT  b.ngaytiepnhan INTO  NGAYTIEPNHAN
    FROM  BENHNHAN B
    WHERE B.mabenhnhan=:NEW.mabenhnhan;
    
	IF(thoidiemyeucau<ngaytiepnhan) THEN 
		RAISE_APPLICATION_ERROR(-20000,'Thoi diem gui yeu cau phai lon hon ngay tiep nhan');
		ROLLBACK;
	END IF;
END;



--9.Ngày ti?p nh?n lên h? th?ng ph?i bé h?n ngày k?t thúc ?i?u tr? t?i nhà, ngày nh?p vi?n, ngày t? vong trong k?t qu? ?i?u tr? t?i nhà ( n?u có ) . 
--BENHNHAN
CREATE OR REPLACE  TRIGGER NTN_NKTDT_BN
BEFORE  UPDATE ON BENHNHAN
FOR EACH ROW
DECLARE 
	NGAYTIEPNHAN benhnhan.ngaytiepnhan%TYPE;
	NGAYKETTHUCCACHLYTAINHA ketquadieutritainha.ngayketthuccachlytainha%TYPE;
    NGAYNHAPVIEN ketquadieutritainha.ngaynhapvien%TYPE;
    NGAYTUVONG ketquadieutritainha.ngaytuvong%TYPE;
BEGIN
    NGAYTIEPNHAN:=:NEW.NGAYTIEPNHAN;
	SELECT k.ngayketthuccachlytainha, k.ngaynhapvien, k.ngaytuvong INTO NGAYKETTHUCCACHLYTAINHA, NGAYNHAPVIEN, NGAYTUVONG
    FROM ketquadieutritainha K
    WHERE K.mabenhnhan=:NEW.mabenhnhan;
    
	IF(ngayketthuccachlytainha<ngaytiepnhan OR ngaynhapvien<ngaytiepnhan OR ngaytuvong<ngaytiepnhan 
    OR (ngayketthuccachlytainha IS NULL AND ngaynhapvien is null and ngaytuvong is null) ) THEN 
		RAISE_APPLICATION_ERROR(-20000,'Ngay tiep nhan phai nho hon ngay ket thuc cach ly tai nha hoac ngay nhap vien hoac ngay tu vong');
		ROLLBACK;
	END IF;
END;
--KETQUADIEUTRITAINHA
CREATE OR REPLACE  TRIGGER NTN_NKTDT_KQDTTN
BEFORE INSERT OR UPDATE ON KETQUADIEUTRITAINHA
FOR EACH ROW
DECLARE 
	NGAYTIEPNHAN benhnhan.ngaytiepnhan%TYPE;
	NGAYKETTHUCCACHLYTAINHA ketquadieutritainha.ngayketthuccachlytainha%TYPE;
    NGAYNHAPVIEN ketquadieutritainha.ngaynhapvien%TYPE;
    NGAYTUVONG ketquadieutritainha.ngaytuvong%TYPE;
BEGIN
    ngayketthuccachlytainha:=:NEW.NGAYKETTHUCCACHLYTAINHA;
    ngaynhapvien:=:NEW.NGAYNHAPVIEN;
    ngaytuvong:=:NEW.NGAYTUVONG;
	SELECT b.ngaytiepnhan INTO  NGAYTIEPNHAN
    FROM BENHNHAN B
    WHERE B.mabenhnhan=:NEW.mabenhnhan;
    
	IF(ngayketthuccachlytainha<ngaytiepnhan OR ngaynhapvien<ngaytiepnhan OR ngaytuvong<ngaytiepnhan) THEN 
		RAISE_APPLICATION_ERROR(-20000,'Ngay tiep nhan phai nho hon ngay ket thuc cach ly tai nha hoac ngay nhap vien hoac ngay tu vong');
		ROLLBACK;
	END IF;
END;



--10.CMND/CCCD PHAI DU 9 KY TU VOI CMND HOAC 12 KY TU VOI CCCD
SET SERVEROUTPUT ON;
CREATE OR REPLACE TRIGGER BN_CMND_CCCD_INSERT
BEFORE INSERT OR UPDATE ON BENHNHAN
FOR EACH ROW
DECLARE
    CMND_CCCD benhnhan.cmnd_cccd%TYPE;
BEGIN
    CMND_CCCD:=:NEW.CMND_CCCD;

    IF (LENGTH(CMND_CCCD)=9 OR LENGTH(CMND_CCCD)=12) THEN
        DBMS_OUTPUT.PUT_LINE('DA THEM THANH CONG');
    ELSE
        RAISE_APPLICATION_ERROR(-20000,'SO CMND_CCCD SAI');
    END IF;
END;

--11.SDT PHAI DU 10 KY TU
SET SERVEROUTPUT ON;
CREATE OR REPLACE TRIGGER BN_SDT_INSERT
BEFORE INSERT OR UPDATE ON BENHNHAN
FOR EACH ROW
DECLARE
    SDT benhnhan.sodienthoai%TYPE;
BEGIN
    SDT:=:NEW.SODIENTHOAI;

    IF (LENGTH(SDT)=10) THEN
        DBMS_OUTPUT.PUT_LINE('DA THEM THANH CONG');
    ELSE
        RAISE_APPLICATION_ERROR(-20000,'SO DIEN THOAI SAI');
    END IF;
END;
--13.CMND/CCCD PHAI DU 9 KY TU VOI CMND HOAC 12 KY TU VOI CCCD
SET SERVEROUTPUT ON;
CREATE OR REPLACE TRIGGER CBYT_CMND_CCCD_INSERT
BEFORE INSERT OR UPDATE ON CANBOYTE
FOR EACH ROW
DECLARE
    CMND_CCCD canboyte.cmnd_cccd%TYPE;
BEGIN
    CMND_CCCD:=:NEW.CMND_CCCD;

    IF (LENGTH(CMND_CCCD)=9 OR LENGTH(CMND_CCCD)=12) THEN
        DBMS_OUTPUT.PUT_LINE('DA THEM THANH CONG');
    ELSE
        RAISE_APPLICATION_ERROR(-20000,'SO CMND_CCCD SAI');
    END IF;
END;

--14.SDT PHAI DU 10 KY TU
SET SERVEROUTPUT ON;
CREATE OR REPLACE TRIGGER CBYT_SDT_INSERT
BEFORE INSERT OR UPDATE ON CANBOYTE
FOR EACH ROW
DECLARE
    SDT canboyte.sdt%TYPE;
BEGIN
    SDT:=:NEW.SDT;

    IF (LENGTH(SDT)=10) THEN
        DBMS_OUTPUT.PUT_LINE('DA THEM THANH CONG');
    ELSE
        RAISE_APPLICATION_ERROR(-20000,'SO DIEN THOAI SAI');
    END IF;
END;

--14.gioi tinh
--BENHNHAN
CREATE OR REPLACE TRIGGER BN_GT_INSERT
BEFORE INSERT OR UPDATE ON BENHNHAN
FOR EACH ROW
DECLARE
    GT benhnhan.gioitinh%TYPE;
BEGIN
    GT:=:NEW.GIOITINH;

    IF (GT='NAM' OR GT='NU') THEN
        DBMS_OUTPUT.PUT_LINE('DA THEM THANH CONG');
    ELSE
        RAISE_APPLICATION_ERROR(-20000,'GIOI TINH SAI');
    END IF;
END;

--CANBOYTE
CREATE OR REPLACE TRIGGER CBYT_GT_INSERT
BEFORE INSERT OR UPDATE ON CANBOYTE
FOR EACH ROW
DECLARE
    GT canboyte.gioitinh%TYPE;
BEGIN
    GT:=:NEW.GIOITINH;

    IF (GT='NAM' OR GT='NU') THEN
        DBMS_OUTPUT.PUT_LINE('DA THEM THANH CONG');
    ELSE
        RAISE_APPLICATION_ERROR(-20000,'GIOI TINH SAI');
    END IF;
END;


--FUNCTION
--14.MA CAN BO Y TE TANG TU DONG
CREATE OR REPLACE FUNCTION MaCanBoYte_TuDong
RETURN varchar2
IS 
	L_MANV NUMBER;
    x CANBOYTE.MANV%type;
BEGIN
	SELECT MAX(TO_NUMBER(MANV)) INTO L_MANV FROM CANBOYTE;
    x:=TO_CHAR(L_MANV+1);
	RETURN x;
END;

DECLARE
    X CANBOYTE.MANV%type;
BEGIN
    X:= MaCanBoYte_TuDong;
    DBMS_OUTPUT.PUT_LINE(X);
END;

SELECT MAX(CAST(MANV AS NUMBER(4)))  FROM CANBOYTE;

--15.MA BENH NHAN TANG TU DONG
CREATE OR REPLACE FUNCTION MaBenhNhan_TuDong
RETURN varchar2
IS 
	L_MABN NUMBER;
    x benhnhan.mabenhnhan%type;
BEGIN
	SELECT MAX(TO_NUMBER(MABENHNHAN)) INTO L_MABN FROM BENHNHAN;
    x:=TO_CHAR(L_MABN+1);
	RETURN x;
END;

DECLARE
    X BENHNHAN.MABENHNHAN%type;
BEGIN
    X:= MaBenhNhan_TuDong;
    DBMS_OUTPUT.PUT_LINE(X);
END;

SELECT MAX(CAST(MABENHNHAN AS NUMBER(4)))  FROM BENHNHAN;



