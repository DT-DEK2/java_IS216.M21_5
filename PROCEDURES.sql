SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE INSERT_CANBOYTE (
MANV in canboyte.manv%TYPE, 
HOTEN in canboyte.hoten%TYPE,
GIOITINH in canboyte.gioitinh%TYPE,
CMND_CCCD in canboyte.cmnd_cccd%TYPE,
NGAYSINH in canboyte.ngaysinh%TYPE, 
SDT in canboyte.sdt%TYPE,
EMAIL in canboyte.email%TYPE, 
DONVICONGTAC in canboyte.donvicongtac%TYPE,
TINH_THANHPHO in canboyte.tinh_thanhpho%TYPE,
QUAN_HUYEN in canboyte.quan_huyen%TYPE,
PHUONG_XA in canboyte.phuong_xa%TYPE) 
AS
BEGIN
	INSERT INTO CANBOYTE 
    VALUES (MANV, HOTEN, GIOITINH, CMND_CCCD, NGAYSINH, SDT, EMAIL, DONVICONGTAC, 
    TINH_THANHPHO, QUAN_HUYEN, PHUONG_XA);
    
END;

exec INSERT_CANBOYTE('1718','TON NU THAO NHI', 'NU', '192106149', to_date('10-OCT-1988 8:30', 'dd-mon-yyyy hh24:mi'), '0379559360','nhitonnuthao@gmail.com','thuyphu','tt.hue','huongthuy','thuyphu');

COMMIT;


CREATE OR REPLACE PROCEDURE INSERT_BENHNHAN (
MABENHNHAN in benhnhan.mabenhnhan%TYPE, 
HOTEN in benhnhan.hoten%TYPE,
NGAYSINH in benhnhan.ngaysinh%TYPE,
GIOITINH in benhnhan.gioitinh%TYPE,
CMND_CCCD in benhnhan.cmnd_cccd%TYPE,
NOIOHIENTAI in benhnhan.noiohientai%TYPE,
TINH_THANHPHO in benhnhan.tinh_thanhpho%TYPE,
QUAN_HUYEN in benhnhan.quan_huyen%TYPE,
PHUONG_XA in benhnhan.phuong_xa%TYPE,
NGHENGHIEP IN benhnhan.nghenghiep%TYPE,
NOILAMVIEC IN benhnhan.noilamviec%TYPE,
SODIENTHOAI IN benhnhan.sodienthoai%TYPE,
NGAYTIEPNHAN IN benhnhan.ngaytiepnhan%TYPE,
NGAYXUATHIENTRIEUCHUNGDAUTIEN IN benhnhan.ngayxuathientrieuchungdautien%TYPE,
TUNGLAF0 IN benhnhan.tunglaf0%TYPE,
SONGAYLAF0 IN benhnhan.songaylaf0%TYPE,
TESTNHANH IN benhnhan.testnhanh%TYPE,
NGAYTESTNHANH IN benhnhan.ngaytestnhanh%TYPE,
KETQUAXETNGHIEM1 IN benhnhan.ketquaxetnghiem1%TYPE,
TESTRT_PCR IN benhnhan.testrt_pcr%TYPE,
NGAYTESTRT_PCR IN benhnhan.ngaytestrt_pcr%TYPE,
KETQUAXETNGHIEM2 IN benhnhan.ketquaxetnghiem2%TYPE
) 
AS
BEGIN
	INSERT INTO BENHNHAN 
    VALUES (MABENHNHAN , HOTEN, NGAYSINH, GIOITINH,CMND_CCCD , NOIOHIENTAI ,TINH_THANHPHO,QUAN_HUYEN,PHUONG_XA ,
    NGHENGHIEP ,NOILAMVIEC ,SODIENTHOAI,NGAYTIEPNHAN,NGAYXUATHIENTRIEUCHUNGDAUTIEN,TUNGLAF0,SONGAYLAF0,TESTNHANH ,
    NGAYTESTNHANH ,KETQUAXETNGHIEM1,TESTRT_PCR,NGAYTESTRT_PCR ,KETQUAXETNGHIEM2);
    
END;
exec INSERT_BENHNHAN('0001','NGUYEN HOAI AN',to_date('10-OCT-1988 8:30', 'dd-mon-yyyy hh24:mi'), 'NU', '1922569459','20 LE LOI','tt.hue','huongthuy','PHU BAI','SINH VIEN', 'CNTT', '0364895237','02-JAN-2022','01','1','1','1','02-JAN-2022','DUONG TINH', '1','03-JAN-2022','DUONG TINH');
COMMIT;



CREATE OR REPLACE PROCEDURE INSERT_BENHNEN (
MABENHNHAN in benhnen.mabenhnhan%TYPE, 
TANGHUYETAP IN benhnen.tanghuyetap%TYPE,
UNGTHU IN benhnen.ungthu%TYPE,
DAITHAODUONG IN benhnen.daithaoduong%TYPE,
HIV_AIDS IN benhnen.hiv_aids%TYPE,
BENHLYMACHMAUNAO IN benhnen.benhlymachmaunao%TYPE,
BENHTIMMACH IN benhnen.benhtimmach%TYPE,
BENHGAN IN benhnen.benhgan%TYPE,
BENHTHANMANTINH IN benhnen.benhthanmantinh%TYPE,
HOICHUNGDOWN IN benhnen.hoichungdown%TYPE,
HENKHIQUAN IN benhnen.henkhiquan%TYPE,
ROILOANSUDUNGCHATGAYNGHIEN IN benhnen.roiloansudungchatgaynghien%TYPE,
BEOPHI IN benhnen.beophi%TYPE,
GHEPTANGHOACCAYGHEPTEBAOGOCTAOMAU IN benhnen.gheptanghoaccaygheptebaogoctaomau%TYPE,
THIEUHUTMIENDICH IN benhnen.thieuhutmiendich%TYPE,
CACLOAIBENHHETHONG IN benhnen.cacloaibenhhethong%TYPE,
BENHPHOIMANTINH IN benhnen.benhphoimantinh%TYPE,
BENHHETHANKINHMANTINH IN benhnen.benhhethankinhmantinh%TYPE
) 
AS
BEGIN
	INSERT INTO BENHNEN 
    VALUES (MABENHNHAN ,TANGHUYETAP ,UNGTHU,DAITHAODUONG,HIV_AIDS,BENHLYMACHMAUNAO,BENHTIMMACH,BENHGAN,BENHTHANMANTINH,
    HOICHUNGDOWN,HENKHIQUAN,ROILOANSUDUNGCHATGAYNGHIEN,BEOPHI,GHEPTANGHOACCAYGHEPTEBAOGOCTAOMAU,THIEUHUTMIENDICH,
    CACLOAIBENHHETHONG,BENHPHOIMANTINH,BENHHETHANKINHMANTINH);
    
END;


CREATE OR REPLACE PROCEDURE INSERT_CAPNHAT (
MABENHNHAN in capnhat.mabenhnhan%TYPE, 
THOIDIEMCAPNHAT IN capnhat.thoidiemcapnhat%TYPE,
MANV IN capnhat.manv%TYPE
) 
AS
BEGIN
	INSERT INTO CAPNHAT 
    VALUES (MABENHNHAN ,THOIDIEMCAPNHAT,MANV);
    
END;

CREATE OR REPLACE PROCEDURE INSERT_DANHGIASOLUOC (
MABENHNHAN in danhgiasoluoc.mabenhnhan%TYPE, 
CHANDOANLUCTIEPNHAN IN danhgiasoluoc.chandoanluctiepnhan%TYPE,
DanhGiaTinhTrangBenhLyCOVID_19 IN danhgiasoluoc.danhgiatinhtrangbenhlycovid_19%TYPE,
DANHGIADUDIEUKIENCACHLYTAINHA IN danhgiasoluoc.danhgiadudieukiencachlytainha%TYPE) 
AS
BEGIN
	INSERT INTO DANHGIASOLUOC 
    VALUES (MABENHNHAN ,CHANDOANLUCTIEPNHAN,DanhGiaTinhTrangBenhLyCOVID_19,DANHGIADUDIEUKIENCACHLYTAINHA);  
END;

CREATE OR REPLACE PROCEDURE INSERT_DUOCHOTRO (
MABENHNHAN in duochotro.mabenhnhan%TYPE, 
MANV IN duochotro.manv%TYPE,
YEUCAU IN duochotro.yeucau%TYPE,
THOIDIEMYEUCAU IN duochotro.thoidiemyeucau%TYPE
) 
AS
BEGIN
	INSERT INTO DUOCHOTRO 
    VALUES (MABENHNHAN, MANV, YEUCAU, THOIDIEMYEUCAU);  
END;

CREATE OR REPLACE PROCEDURE INSERT_KETQUADIEUTRITAINHA (
MABENHNHAN in ketquadieutritainha.mabenhnhan%TYPE, 
TINHTRANG IN ketquadieutritainha.tinhtrang%TYPE,
TINHTRANGKHAC IN ketquadieutritainha.tinhtrangkhac%TYPE,
NGAYKETTHUCCACHLYTAINHA IN ketquadieutritainha.ngayketthuccachlytainha%TYPE,
NGAYXETNGHIEMAMTINH IN ketquadieutritainha.ngayxetnghiemamtinh%TYPE,
LOAIXETNGHIEM IN ketquadieutritainha.loaixetnghiem%TYPE,
NHAPVIEN IN ketquadieutritainha.nhapvien%TYPE,
NGAYNHAPVIEN IN ketquadieutritainha.ngaynhapvien%TYPE,
TRIEUCHUNGKHINHAPVIEN IN ketquadieutritainha.trieuchungkhinhapvien%TYPE,
TENCOSONHAPVIEN IN ketquadieutritainha.tencosonhapvien%TYPE,
LUUY IN ketquadieutritainha.luuy%TYPE,
TUVONG IN ketquadieutritainha.tuvong%TYPE,
NGAYTUVONG IN ketquadieutritainha.ngaytuvong%TYPE,
NOITUVONG IN ketquadieutritainha.noituvong%TYPE,
NOITUVONGKHAC IN ketquadieutritainha.noituvongkhac%TYPE,
LYDOTUVONG IN ketquadieutritainha.lydotuvong%TYPE,
LYDOTUVONGKHAC IN ketquadieutritainha.lydotuvongkhac%TYPE
) 
AS
BEGIN
	INSERT INTO KETQUADIEUTRITAINHA 
    VALUES (MABENHNHAN, TINHTRANG ,TINHTRANGKHAC ,NGAYKETTHUCCACHLYTAINHA ,NGAYXETNGHIEMAMTINH ,LOAIXETNGHIEM ,NHAPVIEN ,
    NGAYNHAPVIEN ,TRIEUCHUNGKHINHAPVIEN ,TENCOSONHAPVIEN,LUUY,TUVONG ,NGAYTUVONG ,NOITUVONG ,NOITUVONGKHAC,LYDOTUVONG ,
    LYDOTUVONGKHAC);  
END;

CREATE OR REPLACE PROCEDURE INSERT_MANGTHAI (
MABENHNHAN in mangthai.mabenhnhan%TYPE,
MANGTHAI in mangthai.mangthai%TYPE,
SOTUANMANGTHAI in mangthai.sotuanmangthai%TYPE,
HAUSAN in mangthai.hausan%TYPE,
TreSoSinhDuocXetNghiemCovid_19 IN mangthai.tresosinhduocxetnghiemcovid_19%TYPE,
KetQuaXetNghiemCovid_19 IN mangthai.ketquaxetnghiemcovid_19%TYPE
) 
IS
BEGIN
	INSERT INTO MANGTHAI
    VALUES (MABENHNHAN, MANGTHAI,SOTUANMANGTHAI,HAUSAN,TreSoSinhDuocXetNghiemCovid_19,KetQuaXetNghiemCovid_19);    
END;

CREATE OR REPLACE PROCEDURE INSERT_TAIKHOANBENHNHAN (
MABENHNHAN IN taikhoanbenhnhan.mabenhnhan%TYPE,
SOCMND_CCCD IN taikhoanbenhnhan.socmnd_cccd%TYPE,
HOTEN IN taikhoanbenhnhan.hoten%TYPE,
MATKHAU IN taikhoanbenhnhan.matkhau%TYPE
) 
IS
BEGIN
	INSERT INTO TAIKHOANBENHNHAN
    VALUES (MABENHNHAN,SOCMND_CCCD,HOTEN,MATKHAU);   
END;

CREATE OR REPLACE PROCEDURE INSERT_TAIKHOANCANBOYTE (
MANV IN taikhoancanboyte.manv%TYPE,
SOCMND_CCCD IN taikhoancanboyte.socmnd_cccd%TYPE,
HOTEN IN taikhoancanboyte.hoten%TYPE,
MATKHAU IN taikhoancanboyte.matkhau%TYPE
) 
IS
BEGIN
	INSERT INTO TAIKHOANCANBOYTE
    VALUES (MANV,SOCMND_CCCD,HOTEN,MATKHAU);   
END;

CREATE OR REPLACE PROCEDURE INSERT_THUOCDUNGTRUOCKHINHAPVIEN (
MABENHNHAN IN thuocdungtruockhinhapvien.mabenhnhan%TYPE,
STEROID IN thuocdungtruockhinhapvien.steroid%TYPE,
CACLOAITHUOCMIENDICHKHAC IN thuocdungtruockhinhapvien.cacloaithuocmiendichkhac%TYPE,
KHANGSINH IN thuocdungtruockhinhapvien.khangsinh%TYPE,
KHANGVIRUS IN thuocdungtruockhinhapvien.khangvirus%TYPE,
CACLOAITHUOCDIEUTRICOVIDKHAC IN thuocdungtruockhinhapvien.cacloaithuocdieutricovidkhac%TYPE,
CACTHUOCUCCHEMIENDICHKHAC IN thuocdungtruockhinhapvien.cacthuocucchemiendichkhac%TYPE
) 
IS
BEGIN
	INSERT INTO thuocdungtruockhinhapvien
    VALUES (MABENHNHAN,STEROID,CACLOAITHUOCMIENDICHKHAC,KHANGSINH,KHANGVIRUS,CACLOAITHUOCDIEUTRICOVIDKHAC, 
    CACTHUOCUCCHEMIENDICHKHAC);    
END;

CREATE OR REPLACE PROCEDURE INSERT_TIEMVACCINE (
MABENHNHAN IN tiemvaccine.mabenhnhan%TYPE,
TINHTRANGTIEMVACCINE IN tiemvaccine.tinhtrangtiemvaccine%TYPE,
LOAI_VACCINE1 IN tiemvaccine.loai_vaccine1%TYPE,
NGAYTIEM1 IN tiemvaccine.ngaytiem1%TYPE,
LOAI_VACCINE2 IN tiemvaccine.loai_vaccine2%TYPE,
NGAYTIEM2 IN tiemvaccine.ngaytiem2%TYPE,
LOAI_VACCINE3 IN tiemvaccine.loai_vaccine3%TYPE,
NGAYTIEM3 IN tiemvaccine.ngaytiem3%TYPE
) 
IS
BEGIN
	INSERT INTO tiemvaccine
    VALUES (MABENHNHAN,TINHTRANGTIEMVACCINE,LOAI_VACCINE1,NGAYTIEM1,LOAI_VACCINE2,NGAYTIEM2,LOAI_VACCINE3,NGAYTIEM3);    
END;

CREATE OR REPLACE PROCEDURE INSERT_TONGTRANG (
MABENHNHAN IN tongtrang.mabenhnhan%TYPE,
NHIETDO IN tongtrang.nhietdo%TYPE,
NHIPTIM IN tongtrang.nhiptim%TYPE,
HUYETAPTAMTHU IN tongtrang.huyetaptamthu%TYPE,
HUYETAPTAMTRUONG IN tongtrang.huyetaptamtruong%TYPE,
DOBAOHOAOXYTRONGMAU IN tongtrang.dobaohoaoxytrongmau%TYPE,
CHIEUCAO IN tongtrang.chieucao%TYPE,
CANNANG IN tongtrang.cannang%TYPE,
NHIPTHO IN tongtrang.nhiptho%TYPE) 
IS
BEGIN
	INSERT INTO tongtrang
    VALUES (MABENHNHAN, NHIETDO, NHIPTIM, HUYETAPTAMTHU, HUYETAPTAMTRUONG,DOBAOHOAOXYTRONGMAU,CHIEUCAO, CANNANG, NHIPTHO);    
END; 

CREATE OR REPLACE PROCEDURE INSERT_TRIEUCHUNGTAITHOIDIEMTIEPNHAN (
MABENHNHAN IN trieuchungtaithoidiemtiepnhan.mabenhnhan%TYPE,
SOT IN trieuchungtaithoidiemtiepnhan.sot%TYPE,
DAUHONG IN trieuchungtaithoidiemtiepnhan.dauhong%TYPE,
NOIHACHNGOAIVI IN trieuchungtaithoidiemtiepnhan.noihachngoaivi%TYPE,
DAUDAU IN trieuchungtaithoidiemtiepnhan.daudau%TYPE,
MATKHUUGIAC IN trieuchungtaithoidiemtiepnhan.matkhuugiac%TYPE,
COGIAT IN trieuchungtaithoidiemtiepnhan.cogiat%TYPE,
DAUCO IN trieuchungtaithoidiemtiepnhan.dauco%TYPE,
DAUKHOP IN trieuchungtaithoidiemtiepnhan.daukhop%TYPE,
DAUBUNG IN trieuchungtaithoidiemtiepnhan.daubung%TYPE,
MATVIGIAC IN trieuchungtaithoidiemtiepnhan.matvigiac%TYPE,
BUONNON IN trieuchungtaithoidiemtiepnhan.buonnon%TYPE,
XUATHUYET IN trieuchungtaithoidiemtiepnhan.xuathuyet%TYPE,
TRIEUCHUNGKHAC IN trieuchungtaithoidiemtiepnhan.trieuchungkhac%TYPE
) 
IS
BEGIN
	INSERT INTO trieuchungtaithoidiemtiepnhan
    VALUES (MABENHNHAN,SOT,DAUHONG ,NOIHACHNGOAIVI ,DAUDAU ,MATKHUUGIAC ,COGIAT ,DAUCO ,
    DAUKHOP ,DAUBUNG ,MATVIGIAC ,BUONNON ,XUATHUYET ,TRIEUCHUNGKHAC);
    
END; 

CREATE OR REPLACE PROCEDURE INSERT_QUATRINHDIEUTRITAINHA (
THOIDIEMCAPNHAT IN quatrinhdieutritainha.thoidiemcapnhat%TYPE,
MACH IN quatrinhdieutritainha.mach%TYPE,
NHIETDO IN quatrinhdieutritainha.nhietdo%TYPE,
NHIPTHO IN quatrinhdieutritainha.nhiptho%TYPE,
SPO2 IN quatrinhdieutritainha.spo2%TYPE,
HUYETAPTOIDA IN quatrinhdieutritainha.huyetaptoida%TYPE,
HUYETAPTOITHIEU IN quatrinhdieutritainha.huyetaptoithieu%TYPE,
KIETSUC IN quatrinhdieutritainha.kietsuc%TYPE,
HO IN quatrinhdieutritainha.ho%TYPE,
HORADOM IN quatrinhdieutritainha.horadom%TYPE,
ONLANH IN quatrinhdieutritainha.onlanh%TYPE,
MATVIGIAC IN quatrinhdieutritainha.matvigiac%TYPE,
MATKHUUGIAC IN quatrinhdieutritainha.matkhuugiac%TYPE,
TIEUCHAY IN quatrinhdieutritainha.tieuchay%TYPE,
HORAMAU IN quatrinhdieutritainha.horamau%TYPE,
THODOCHOACKHOTHO IN quatrinhdieutritainha.thodochoackhotho%TYPE,
DAUTUCNGUCKEODAI IN quatrinhdieutritainha.dautucnguckeodai%TYPE,
LOMOKHONGTINHTAO IN quatrinhdieutritainha.lomokhongtinhtao%TYPE,
GOITHUOCA IN quatrinhdieutritainha.goithuoca%TYPE,
GOITHUOCB IN quatrinhdieutritainha.goithuocb%TYPE,
GOITHUOCC IN quatrinhdieutritainha.goithuocc%TYPE,
XETNGHIEM IN quatrinhdieutritainha.xetnghiem%TYPE,
NGAYXETNGHIEM IN quatrinhdieutritainha.ngayxetnghiem%TYPE,
KETQUAXETNGHIEM1 IN quatrinhdieutritainha.ketquaxetnghiem1%TYPE
) 
IS
BEGIN
	INSERT INTO quatrinhdieutritainha
    VALUES (THOIDIEMCAPNHAT,MACH,NHIETDO ,NHIPTHO ,SPO2 ,HUYETAPTOIDA ,HUYETAPTOITHIEU ,KIETSUC ,HO ,HORADOM ,ONLANH ,MATVIGIAC ,
    MATKHUUGIAC ,TIEUCHAY ,HORAMAU ,THODOCHOACKHOTHO ,DAUTUCNGUCKEODAI ,LOMOKHONGTINHTAO ,GOITHUOCA ,GOITHUOCB ,GOITHUOCC ,
    XETNGHIEM ,NGAYXETNGHIEM ,KETQUAXETNGHIEM1);
    
END;

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


--UPDATE
CREATE OR REPLACE PROCEDURE UPDATE_CANBOYTE (
MANV_1 in canboyte.manv%TYPE, 
HOTEN_1 in canboyte.hoten%TYPE,
GIOITINH_1 in canboyte.gioitinh%TYPE,
CMND_CCCD_1 in canboyte.cmnd_cccd%TYPE,
NGAYSINH_1 in canboyte.ngaysinh%TYPE, 
SDT_1 in canboyte.sdt%TYPE,
EMAIL_1 in canboyte.email%TYPE, 
DONVICONGTAC_1 in canboyte.donvicongtac%TYPE,
TINH_THANHPHO_1 in canboyte.tinh_thanhpho%TYPE,
QUAN_HUYEN_1 in canboyte.quan_huyen%TYPE,
PHUONG_XA_1 in canboyte.phuong_xa%TYPE) 
AS
BEGIN
	UPDATE CANBOYTE 
    SET  MANV=MANV_1, HOTEN=HOTEN_1, GIOITINH=GIOITINH_1, CMND_CCCD=CMND_CCCD_1,
         NGAYSINH=NGAYSINH_1 , SDT=SDT_1, EMAIL=EMAIL_1, DONVICONGTAC=DONVICONGTAC_1, 
         TINH_THANHPHO=TINH_THANHPHO_1, QUAN_HUYEN=QUAN_HUYEN_1, PHUONG_XA=PHUONG_XA_1; 
END;

exec UPDATE_CANBOYTE('1718','TON NU THAO NHI', 'NU', '192106149', to_date('11-AUG-2002 8:30', 'dd-mon-yyyy hh24:mi'), '0379559360','nhitonnuthao@gmail.com','thuyphu','tt.hue','huongthuy','thuyphu');

COMMIT;

CREATE OR REPLACE PROCEDURE UPDATE_BENHNHAN (
MABENHNHAN_1 in benhnhan.mabenhnhan%TYPE, 
HOTEN_1 in benhnhan.hoten%TYPE,
NGAYSINH_1 in benhnhan.ngaysinh%TYPE,
GIOITINH_1 in benhnhan.gioitinh%TYPE,
CMND_CCCD_1 in benhnhan.cmnd_cccd%TYPE,
NOIOHIENTAI_1 in benhnhan.noiohientai%TYPE,
TINH_THANHPHO_1 in benhnhan.tinh_thanhpho%TYPE,
QUAN_HUYEN_1 in benhnhan.quan_huyen%TYPE,
PHUONG_XA_1 in benhnhan.phuong_xa%TYPE,
NGHENGHIEP_1 IN benhnhan.nghenghiep%TYPE,
NOILAMVIEC_1 IN benhnhan.noilamviec%TYPE,
SODIENTHOAI_1 IN benhnhan.sodienthoai%TYPE,
NGAYTIEPNHAN_1 IN benhnhan.ngaytiepnhan%TYPE,
NGAYXUATHIENTRIEUCHUNGDAUTIEN_1 IN benhnhan.ngayxuathientrieuchungdautien%TYPE,
TUNGLAF0_1 IN benhnhan.tunglaf0%TYPE,
SONGAYLAF0_1 IN benhnhan.songaylaf0%TYPE,
TESTNHANH_1 IN benhnhan.testnhanh%TYPE,
NGAYTESTNHANH_1 IN benhnhan.ngaytestnhanh%TYPE,
KETQUAXETNGHIEM1_1 IN benhnhan.ketquaxetnghiem1%TYPE,
TESTRT_PCR_1 IN benhnhan.testrt_pcr%TYPE,
NGAYTESTRT_PCR_1 IN benhnhan.ngaytestrt_pcr%TYPE,
KETQUAXETNGHIEM2_1 IN benhnhan.ketquaxetnghiem2%TYPE
) 
AS
BEGIN
	UPDATE BENHNHAN 
    SET MABENHNHAN=MABENHNHAN_1 , HOTEN=HOTEN_1, NGAYSINH=NGAYSINH_1, GIOITINH=GIOITINH_1,CMND_CCCD=CMND_CCCD_1 ,
        NOIOHIENTAI=NOIOHIENTAI_1 ,TINH_THANHPHO=TINH_THANHPHO_1,QUAN_HUYEN=QUAN_HUYEN_1,PHUONG_XA=PHUONG_XA_1 ,
        NGHENGHIEP=NGHENGHIEP_1 ,NOILAMVIEC=NOILAMVIEC_1 ,SODIENTHOAI=SODIENTHOAI_1,NGAYTIEPNHAN=NGAYTIEPNHAN_1,
        NGAYXUATHIENTRIEUCHUNGDAUTIEN=NGAYXUATHIENTRIEUCHUNGDAUTIEN_1, TUNGLAF0=TUNGLAF0_1,SONGAYLAF0=SONGAYLAF0_1,
        TESTNHANH=TESTNHANH_1, NGAYTESTNHANH=NGAYTESTNHANH_1 ,KETQUAXETNGHIEM1=KETQUAXETNGHIEM1_1,
        TESTRT_PCR=TESTRT_PCR_1,NGAYTESTRT_PCR=NGAYTESTRT_PCR_1 ,KETQUAXETNGHIEM2=KETQUAXETNGHIEM2_1;
    
END;
exec UPDATE_BENHNHAN('0001','NGUYEN HOAI LAM',to_date('10-OCT-1988 8:30', 'dd-mon-yyyy hh24:mi'), 'NAM', '1922569459','20 LE LOI','tt.hue','huongthuy','PHU BAI','SINH VIEN', 'CNTT', '0364895237','02-JAN-2022','01','1','1','1','02-JAN-2022','DUONG TINH', '1','03-JAN-2022','DUONG TINH');

COMMIT;



CREATE OR REPLACE PROCEDURE UPDATE_BENHNEN (
MABENHNHAN_1 in benhnen.mabenhnhan%TYPE, 
TANGHUYETAP_1 IN benhnen.tanghuyetap%TYPE,
UNGTHU_1 IN benhnen.ungthu%TYPE,
DAITHAODUONG_1 IN benhnen.daithaoduong%TYPE,
HIV_AIDS_1 IN benhnen.hiv_aids%TYPE,
BENHLYMACHMAUNAO_1 IN benhnen.benhlymachmaunao%TYPE,
BENHTIMMACH_1 IN benhnen.benhtimmach%TYPE,
BENHGAN_1 IN benhnen.benhgan%TYPE,
BENHTHANMANTINH_1 IN benhnen.benhthanmantinh%TYPE,
HOICHUNGDOWN_1 IN benhnen.hoichungdown%TYPE,
HENKHIQUAN_1 IN benhnen.henkhiquan%TYPE,
ROILOANSUDUNGCHATGAYNGHIEN_1 IN benhnen.roiloansudungchatgaynghien%TYPE,
BEOPHI_1 IN benhnen.beophi%TYPE,
GHEPTANGHOACCAYGHEPTEBAOGOCTAOMAU_1 IN benhnen.gheptanghoaccaygheptebaogoctaomau%TYPE,
THIEUHUTMIENDICH_1 IN benhnen.thieuhutmiendich%TYPE,
CACLOAIBENHHETHONG_1 IN benhnen.cacloaibenhhethong%TYPE,
BENHPHOIMANTINH_1 IN benhnen.benhphoimantinh%TYPE,
BENHHETHANKINHMANTINH_1 IN benhnen.benhhethankinhmantinh%TYPE
) 
AS
BEGIN
	UPDATE BENHNEN 
    SET MABENHNHAN=MABENHNHAN_1 ,TANGHUYETAP=TANGHUYETAP_1 ,UNGTHU=UNGTHU_1,DAITHAODUONG=DAITHAODUONG_1,
        HIV_AIDS=HIV_AIDS_1,BENHLYMACHMAUNAO=BENHLYMACHMAUNAO_1,BENHTIMMACH=BENHTIMMACH_1,BENHGAN=BENHGAN_1,
        BENHTHANMANTINH=BENHTHANMANTINH_1,HOICHUNGDOWN=HOICHUNGDOWN_1,HENKHIQUAN=HENKHIQUAN_1,
        ROILOANSUDUNGCHATGAYNGHIEN=ROILOANSUDUNGCHATGAYNGHIEN_1,BEOPHI=BEOPHI_1,
        GHEPTANGHOACCAYGHEPTEBAOGOCTAOMAU=GHEPTANGHOACCAYGHEPTEBAOGOCTAOMAU_1,THIEUHUTMIENDICH=THIEUHUTMIENDICH_1,
        CACLOAIBENHHETHONG=CACLOAIBENHHETHONG_1,BENHPHOIMANTINH=BENHPHOIMANTINH_1,BENHHETHANKINHMANTINH=BENHHETHANKINHMANTINH_1;
    
END;


CREATE OR REPLACE PROCEDURE UPDATE_CAPNHAT (
MABENHNHAN_1 in capnhat.mabenhnhan%TYPE, 
THOIDIEMCAPNHAT_1 IN capnhat.thoidiemcapnhat%TYPE,
MANV_1 IN capnhat.manv%TYPE
) 
AS
BEGIN
	UPDATE CAPNHAT 
    SET MABENHNHAN=MABENHNHAN_1 ,THOIDIEMCAPNHAT=THOIDIEMCAPNHAT_1,MANV=MANV_1;
    
END;

CREATE OR REPLACE PROCEDURE UPDATE_DANHGIASOLUOC (
MABENHNHAN_1 in danhgiasoluoc.mabenhnhan%TYPE, 
CHANDOANLUCTIEPNHAN_1 IN danhgiasoluoc.chandoanluctiepnhan%TYPE,
DanhGiaTinhTrangBenhLyCOVID_19_1 IN danhgiasoluoc.danhgiatinhtrangbenhlycovid_19%TYPE,
DANHGIADUDIEUKIENCACHLYTAINHA_1 IN danhgiasoluoc.danhgiadudieukiencachlytainha%TYPE) 
AS
BEGIN
	UPDATE DANHGIASOLUOC 
    SET MABENHNHAN=MABENHNHAN_1, CHANDOANLUCTIEPNHAN=CHANDOANLUCTIEPNHAN_1,
    DanhGiaTinhTrangBenhLyCOVID_19=DanhGiaTinhTrangBenhLyCOVID_19_1,
    DANHGIADUDIEUKIENCACHLYTAINHA=DANHGIADUDIEUKIENCACHLYTAINHA_1;  
END;

CREATE OR REPLACE PROCEDURE UPDATE_DUOCHOTRO (
MABENHNHAN_1 in duochotro.mabenhnhan%TYPE, 
MANV_1 IN duochotro.manv%TYPE,
YEUCAU_1 IN duochotro.yeucau%TYPE,
THOIDIEMYEUCAU_1 IN duochotro.thoidiemyeucau%TYPE
) 
AS
BEGIN
	UPDATE DUOCHOTRO 
    SET MABENHNHAN=MABENHNHAN_1, MANV=MANV_1, YEUCAU=YEUCAU_1, THOIDIEMYEUCAU=thoidiemyeucau_1;  
END;

CREATE OR REPLACE PROCEDURE UPDATE_KETQUADIEUTRITAINHA (
MABENHNHAN_1 in ketquadieutritainha.mabenhnhan%TYPE, 
TINHTRANG_1  IN ketquadieutritainha.tinhtrang%TYPE,
TINHTRANGKHAC_1  IN ketquadieutritainha.tinhtrangkhac%TYPE,
NGAYKETTHUCCACHLYTAINHA_1 IN ketquadieutritainha.ngayketthuccachlytainha%TYPE,
NGAYXETNGHIEMAMTINH_1 IN ketquadieutritainha.ngayxetnghiemamtinh%TYPE,
LOAIXETNGHIEM_1 IN ketquadieutritainha.loaixetnghiem%TYPE,
NHAPVIEN_1 IN ketquadieutritainha.nhapvien%TYPE,
NGAYNHAPVIEN_1 IN ketquadieutritainha.ngaynhapvien%TYPE,
TRIEUCHUNGKHINHAPVIEN_1 IN ketquadieutritainha.trieuchungkhinhapvien%TYPE,
TENCOSONHAPVIEN_1 IN ketquadieutritainha.tencosonhapvien%TYPE,
LUUY_1 IN ketquadieutritainha.luuy%TYPE,
TUVONG_1 IN ketquadieutritainha.tuvong%TYPE,
NGAYTUVONG_1 IN ketquadieutritainha.ngaytuvong%TYPE,
NOITUVONG_1 IN ketquadieutritainha.noituvong%TYPE,
NOITUVONGKHAC_1 IN ketquadieutritainha.noituvongkhac%TYPE,
LYDOTUVONG_1 IN ketquadieutritainha.lydotuvong%TYPE,
LYDOTUVONGKHAC_1 IN ketquadieutritainha.lydotuvongkhac%TYPE
) 
AS
BEGIN
	UPDATE KETQUADIEUTRITAINHA 
    SET MABENHNHAN=MABENHNHAN_1, TINHTRANG=TINHTRANG_1 ,TINHTRANGKHAC=TINHTRANGKHAC_1 ,
        NGAYKETTHUCCACHLYTAINHA=NGAYKETTHUCCACHLYTAINHA_1 ,NGAYXETNGHIEMAMTINH=NGAYXETNGHIEMAMTINH_1 ,
        LOAIXETNGHIEM=LOAIXETNGHIEM_1 ,NHAPVIEN=NHAPVIEN_1 ,NGAYNHAPVIEN=NGAYNHAPVIEN_1 ,
        TRIEUCHUNGKHINHAPVIEN=TRIEUCHUNGKHINHAPVIEN_1 ,TENCOSONHAPVIEN=TENCOSONHAPVIEN_1,LUUY=LUUY_1,
        TUVONG=TUVONG_1 ,NGAYTUVONG=NGAYTUVONG_1 ,NOITUVONG=NOITUVONG_1 ,NOITUVONGKHAC=NOITUVONGKHAC_1,
        LYDOTUVONG=LYDOTUVONG_1 ,LYDOTUVONGKHAC=LYDOTUVONGKHAC_1;  
END;

CREATE OR REPLACE PROCEDURE UPDATE_MANGTHAI (
MABENHNHAN_1 in mangthai.mabenhnhan%TYPE,
MANGTHAI_1 in mangthai.mangthai%TYPE,
SOTUANMANGTHAI_1 in mangthai.sotuanmangthai%TYPE,
HAUSAN_1 in mangthai.hausan%TYPE,
TreSoSinhDuocXetNghiemCovid_19_1 IN mangthai.tresosinhduocxetnghiemcovid_19%TYPE,
KetQuaXetNghiemCovid_19_1 IN mangthai.ketquaxetnghiemcovid_19%TYPE
) 
IS
BEGIN
	UPDATE MANGTHAI
    SET MABENHNHAN=MABENHNHAN_1, MANGTHAI=MANGTHAI_1,SOTUANMANGTHAI=SOTUANMANGTHAI_1,HAUSAN=HAUSAN_1,
    TreSoSinhDuocXetNghiemCovid_19=TreSoSinhDuocXetNghiemCovid_19_1,KetQuaXetNghiemCovid_19=KetQuaXetNghiemCovid_19_1;    
END;

CREATE OR REPLACE PROCEDURE UPDATE_TAIKHOANBENHNHAN (
MABENHNHAN_1 IN taikhoanbenhnhan.mabenhnhan%TYPE,
SOCMND_CCCD_1 IN taikhoanbenhnhan.socmnd_cccd%TYPE,
HOTEN_1 IN taikhoanbenhnhan.hoten%TYPE,
MATKHAU_1 IN taikhoanbenhnhan.matkhau%TYPE
) 
IS
BEGIN
	UPDATE TAIKHOANBENHNHAN
    SET MABENHNHAN=MABENHNHAN_1,SOCMND_CCCD=SOCMND_CCCD_1,HOTEN=HOTEN_1,MATKHAU=MATKHAU_1;   
END;

CREATE OR REPLACE PROCEDURE UPDATE_TAIKHOANCANBOYTE (
MANV_1 IN taikhoancanboyte.manv%TYPE,
SOCMND_CCCD_1 IN taikhoancanboyte.socmnd_cccd%TYPE,
HOTEN_1 IN taikhoancanboyte.hoten%TYPE,
MATKHAU_1 IN taikhoancanboyte.matkhau%TYPE
) 
IS
BEGIN
	UPDATE TAIKHOANCANBOYTE
    SET MANV=MANV_1,SOCMND_CCCD=SOCMND_CCCD_1,HOTEN=HOTEN_1,MATKHAU=MATKHAU_1;   
END;

CREATE OR REPLACE PROCEDURE UPDATE_THUOCDUNGTRUOCKHINHAPVIEN (
MABENHNHAN_1 IN thuocdungtruockhinhapvien.mabenhnhan%TYPE,
STEROID_1 IN thuocdungtruockhinhapvien.steroid%TYPE,
CACLOAITHUOCMIENDICHKHAC_1 IN thuocdungtruockhinhapvien.cacloaithuocmiendichkhac%TYPE,
KHANGSINH_1 IN thuocdungtruockhinhapvien.khangsinh%TYPE,
KHANGVIRUS_1 IN thuocdungtruockhinhapvien.khangvirus%TYPE,
CACLOAITHUOCDIEUTRICOVIDKHAC_1 IN thuocdungtruockhinhapvien.cacloaithuocdieutricovidkhac%TYPE,
CACTHUOCUCCHEMIENDICHKHAC_1 IN thuocdungtruockhinhapvien.cacthuocucchemiendichkhac%TYPE
) 
IS
BEGIN
	UPDATE thuocdungtruockhinhapvien
    SET MABENHNHAN=MABENHNHAN_1,STEROID=STEROID_1,CACLOAITHUOCMIENDICHKHAC=CACLOAITHUOCMIENDICHKHAC_1,
    KHANGSINH=KHANGSINH_1,KHANGVIRUS=KHANGVIRUS_1,CACLOAITHUOCDIEUTRICOVIDKHAC=CACLOAITHUOCDIEUTRICOVIDKHAC_1, 
    CACTHUOCUCCHEMIENDICHKHAC=CACTHUOCUCCHEMIENDICHKHAC_1;    
END;

CREATE OR REPLACE PROCEDURE UPDATE_TIEMVACCINE (
MABENHNHAN_1 IN tiemvaccine.mabenhnhan%TYPE,
TINHTRANGTIEMVACCINE_1 IN tiemvaccine.tinhtrangtiemvaccine%TYPE,
LOAI_VACCINE1_1 IN tiemvaccine.loai_vaccine1%TYPE,
NGAYTIEM1_1 IN tiemvaccine.ngaytiem1%TYPE,
LOAI_VACCINE2_1 IN tiemvaccine.loai_vaccine2%TYPE,
NGAYTIEM2_1 IN tiemvaccine.ngaytiem2%TYPE,
LOAI_VACCINE3_1 IN tiemvaccine.loai_vaccine3%TYPE,
NGAYTIEM3_1 IN tiemvaccine.ngaytiem3%TYPE
) 
IS
BEGIN
	UPDATE tiemvaccine
    SET MABENHNHAN=MABENHNHAN_1,TINHTRANGTIEMVACCINE=TINHTRANGTIEMVACCINE_1,
    LOAI_VACCINE1=LOAI_VACCINE1_1,NGAYTIEM1=NGAYTIEM1_1,
    LOAI_VACCINE2=LOAI_VACCINE2_1,NGAYTIEM2=NGAYTIEM2_1,
    LOAI_VACCINE3=LOAI_VACCINE3_1,NGAYTIEM3=NGAYTIEM3_1;    
END;

CREATE OR REPLACE PROCEDURE UPDATE_TONGTRANG (
MABENHNHAN_1 IN tongtrang.mabenhnhan%TYPE,
NHIETDO_1 IN tongtrang.nhietdo%TYPE,
NHIPTIM_1 IN tongtrang.nhiptim%TYPE,
HUYETAPTAMTHU_1 IN tongtrang.huyetaptamthu%TYPE,
HUYETAPTAMTRUONG_1 IN tongtrang.huyetaptamtruong%TYPE,
DOBAOHOAOXYTRONGMAU_1 IN tongtrang.dobaohoaoxytrongmau%TYPE,
CHIEUCAO_1 IN tongtrang.chieucao%TYPE,
CANNANG_1 IN tongtrang.cannang%TYPE,
NHIPTHO_1 IN tongtrang.nhiptho%TYPE) 
IS
BEGIN
	UPDATE tongtrang
    SET MABENHNHAN=MABENHNHAN_1, NHIETDO=NHIETDO_1, NHIPTIM=NHIPTIM_1, HUYETAPTAMTHU=HUYETAPTAMTHU_1,
    HUYETAPTAMTRUONG=HUYETAPTAMTRUONG_1,DOBAOHOAOXYTRONGMAU=DOBAOHOAOXYTRONGMAU_1,
    CHIEUCAO=CHIEUCAO_1, CANNANG=CANNANG_1, NHIPTHO=NHIPTHO_1;    
END; 

CREATE OR REPLACE PROCEDURE UPDATE_TRIEUCHUNGTAITHOIDIEMTIEPNHAN (
MABENHNHAN_1 IN trieuchungtaithoidiemtiepnhan.mabenhnhan%TYPE,
SOT_1 IN trieuchungtaithoidiemtiepnhan.sot%TYPE,
DAUHONG_1 IN trieuchungtaithoidiemtiepnhan.dauhong%TYPE,
NOIHACHNGOAIVI_1 IN trieuchungtaithoidiemtiepnhan.noihachngoaivi%TYPE,
DAUDAU_1 IN trieuchungtaithoidiemtiepnhan.daudau%TYPE,
MATKHUUGIAC_1 IN trieuchungtaithoidiemtiepnhan.matkhuugiac%TYPE,
COGIAT_1 IN trieuchungtaithoidiemtiepnhan.cogiat%TYPE,
DAUCO_1 IN trieuchungtaithoidiemtiepnhan.dauco%TYPE,
DAUKHOP_1 IN trieuchungtaithoidiemtiepnhan.daukhop%TYPE,
DAUBUNG_1 IN trieuchungtaithoidiemtiepnhan.daubung%TYPE,
MATVIGIAC_1 IN trieuchungtaithoidiemtiepnhan.matvigiac%TYPE,
BUONNON_1 IN trieuchungtaithoidiemtiepnhan.buonnon%TYPE,
XUATHUYET_1 IN trieuchungtaithoidiemtiepnhan.xuathuyet%TYPE,
TRIEUCHUNGKHAC_1 IN trieuchungtaithoidiemtiepnhan.trieuchungkhac%TYPE
) 
IS
BEGIN
	UPDATE trieuchungtaithoidiemtiepnhan
    SET MABENHNHAN=MABENHNHAN_1,SOT=SOT_1,DAUHONG=DAUHONG_1 ,NOIHACHNGOAIVI=NOIHACHNGOAIVI_1,
    DAUDAU=DAUDAU_1 ,MATKHUUGIAC=MATKHUUGIAC_1,COGIAT=COGIAT_1 ,DAUCO=DAUCO_1,
    DAUKHOP=DAUKHOP_1 ,DAUBUNG=DAUBUNG_1 ,MATVIGIAC=MATVIGIAC_1,
    BUONNON=BUONNON_1 ,XUATHUYET=XUATHUYET_1 ,TRIEUCHUNGKHAC=TRIEUCHUNGKHAC_1;
    
END; 

CREATE OR REPLACE PROCEDURE UPDATE_QUATRINHDIEUTRITAINHA (
THOIDIEMCAPNHAT_1 IN quatrinhdieutritainha.thoidiemcapnhat%TYPE,
MACH_1 IN quatrinhdieutritainha.mach%TYPE,
NHIETDO_1 IN quatrinhdieutritainha.nhietdo%TYPE,
NHIPTHO_1 IN quatrinhdieutritainha.nhiptho%TYPE,
SPO2_1 IN quatrinhdieutritainha.spo2%TYPE,
HUYETAPTOIDA_1 IN quatrinhdieutritainha.huyetaptoida%TYPE,
HUYETAPTOITHIEU_1 IN quatrinhdieutritainha.huyetaptoithieu%TYPE,
KIETSUC_1 IN quatrinhdieutritainha.kietsuc%TYPE,
HO_1 IN quatrinhdieutritainha.ho%TYPE,
HORADOM_1 IN quatrinhdieutritainha.horadom%TYPE,
ONLANH_1 IN quatrinhdieutritainha.onlanh%TYPE,
MATVIGIAC_1 IN quatrinhdieutritainha.matvigiac%TYPE,
MATKHUUGIAC_1 IN quatrinhdieutritainha.matkhuugiac%TYPE,
TIEUCHAY_1 IN quatrinhdieutritainha.tieuchay%TYPE,
HORAMAU_1 IN quatrinhdieutritainha.horamau%TYPE,
THODOCHOACKHOTHO_1 IN quatrinhdieutritainha.thodochoackhotho%TYPE,
DAUTUCNGUCKEODAI_1 IN quatrinhdieutritainha.dautucnguckeodai%TYPE,
LOMOKHONGTINHTAO_1 IN quatrinhdieutritainha.lomokhongtinhtao%TYPE,
GOITHUOCA_1 IN quatrinhdieutritainha.goithuoca%TYPE,
GOITHUOCB_1 IN quatrinhdieutritainha.goithuocb%TYPE,
GOITHUOCC_1 IN quatrinhdieutritainha.goithuocc%TYPE,
XETNGHIEM_1 IN quatrinhdieutritainha.xetnghiem%TYPE,
NGAYXETNGHIEM_1 IN quatrinhdieutritainha.ngayxetnghiem%TYPE,
KETQUAXETNGHIEM1_1 IN quatrinhdieutritainha.ketquaxetnghiem1%TYPE
) 
IS
BEGIN
	UPDATE quatrinhdieutritainha
    SET THOIDIEMCAPNHAT=THOIDIEMCAPNHAT_1,MACH=MACH_1,NHIETDO=NHIETDO_1, NHIPTHO=NHIPTHO_1,SPO2=SPO2_1 ,
    HUYETAPTOIDA=HUYETAPTOIDA_1 ,HUYETAPTOITHIEU=HUYETAPTOITHIEU_1 ,KIETSUC=KIETSUC_1 ,HO=HO_1 ,
    HORADOM=HORADOM_1 ,ONLANH=ONLANH_1 ,MATVIGIAC=MATVIGIAC_1 ,MATKHUUGIAC=MATKHUUGIAC_1,TIEUCHAY=TIEUCHAY_1 ,
    HORAMAU=HORAMAU_1 ,THODOCHOACKHOTHO=THODOCHOACKHOTHO_1 ,DAUTUCNGUCKEODAI=DAUTUCNGUCKEODAI_1 ,
    LOMOKHONGTINHTAO=LOMOKHONGTINHTAO_1 ,GOITHUOCA=GOITHUOCA_1 ,GOITHUOCB=GOITHUOCB_1 ,GOITHUOCC=GOITHUOCC_1 ,
    XETNGHIEM=XETNGHIEM_1 ,NGAYXETNGHIEM=NGAYXETNGHIEM_1 ,KETQUAXETNGHIEM1=KETQUAXETNGHIEM1_1;
    
END;
