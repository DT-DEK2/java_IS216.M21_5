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
CHUANDOANLUCTIEPNHAN IN danhgiasoluoc.chandoanluctiepnhan%TYPE,
DanhGiaTinhTrangBenhLyCOVID_19 IN danhgiasoluoc.danhgiatinhtrangbenhlycovid_19%TYPE,
DANHGIADUDIEUKIENCACHLYTAINHA IN danhgiasoluoc.danhgiadudieukiencachlytainha%TYPE) 
AS
BEGIN
	INSERT INTO DANHGIASOLUOC 
    VALUES (MABENHNHAN ,CHUANDOANLUCTIEPNHAN,DanhGiaTinhTrangBenhLyCOVID_19,DANHGIADUDIEUKIENCACHLYTAINHA);  
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
