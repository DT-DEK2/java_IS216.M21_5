
/*==============================================================*/
/* Table: BENHNHAN                                              */
/*==============================================================*/
create table BENHNHAN 
(
   MaBenhNhan            varchar2(4)                     not null,
   HoTen                 varchar2(40)                    null,
   NgaySinh             date                           null,
   GioiTinh              varchar2(5)                     null,
   "CMND/CCCD"           varchar2(12)                    null,
   NoiOHienTai           varchar2(20)                    null,
   "Tinh/ThanhPho"       varchar2(20)                    null,
   "Quan/Huyen"          varchar2(20)                    null,
   "Phuong/Xa"           varchar2(20)                    null,
   NgheNghiep            varchar2(20)                    null,
   NoiLamViec            varchar2(50)                    null,
   SoDienThoai          numeric(10)                    null,
   NgayTiepNhan         date                           null,
   NgayXuatHienTrieuChungDauTien  varchar2(10)                    null,
   TungLaF0             smallint                       null,
   SoNgayLaF0           integer                        null,
   TestNhanh            smallint                       null,
   NgayTestNhanh        date                           null,
   KetQuaXetNghiem1      varchar2(40)                    null,
   "TestRT-PCR"         smallint                       null,
   NgayTestRT_PCR       date                           null,
   KetQuaXetNghiem2      varchar2(40)                    null
   
);
alter table BENHNHAN 
 add constraint PK_BENHNHAN primary key (MaBenhNhan);

/*==============================================================*/
/* Table: BENHNEN                                               */	
/*==============================================================*/
create table BENHNEN 
(
   MaBenhNhan            varchar2(4)                     not null,
   TangHuyetAp          smallint                       null,
   UngThu               smallint                       null,
   DaiThaoDuong         smallint                       null,
   "HIV/AIDS"           smallint                       null,
   BenhLyMachMauNao     smallint                       null,
   BenhTimMach          smallint                       null,
   BenhGan              smallint                       null,
   BenhThanManTinh      smallint                       null,
   HoiChungDown         smallint                       null,
   HenKhiQuan           smallint                       null,
   RoiLoanSuDungChatGayNghien smallint                       null,
   BeoPhi               smallint                       null,
   GhepTangHoacCayGhepTeBaoGocTaoMau smallint                       null,
   ThieuHutMienDich     smallint                       null,
   CacLoaiBenhHeThong   smallint                       null,
   BenhPhoiManTinh      smallint                       null,
   BenhHeThanKinhManTinh smallint                       null
);

alter table BENHNEN
   add constraint FK_BENHNEN_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan);

ALTER TABLE BENHNEN 
 ADD ( CONSTRAINT BENHNEN_MABN_UK UNIQUE 
  (MaBenhNhan));


/*==============================================================*/
/* Table: THUOCDUNGTRUOCKHINHAPVIEN                             */
/*==============================================================*/
create table THUOCDUNGTRUOCKHINHAPVIEN 
(
   MaBenhNhan            varchar2(4)                     not null,
   Steroid              smallint                       null,
   CacLoaiThuocMienDichKhac smallint                       null,
   KhangSinh            smallint                       null,
   KhangVirus           smallint                       null,
   CacLoaiThuocDieuTriCovidKhac smallint                       null,
   CacThuocUcCheMienDichKhac smallint                       null
);

alter table THUOCDUNGTRUOCKHINHAPVIEN
   add constraint FK_THUOCDUN_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan);

ALTER TABLE THUOCDUNGTRUOCKHINHAPVIEN 
 ADD ( CONSTRAINT THUOCDUNGTRUOCKHINHAPVIEN_MABN_UK UNIQUE 
  (MaBenhNhan));

/*==============================================================*/
/* Table: MANGTHAI                                              */
/*==============================================================*/
create table MANGTHAI 
(
   MaBenhNhan            varchar2(4)                     not null,
   MangThai             smallint                       null,
   SoTuanMangThai       integer                        null,
   HauSan               smallint                       null,
   "TreSoSinhDuocXetNghiemCovid-19" smallint                       null,
   "KetQuaXetNghiemCovid-19"  varchar2(40)                    null
);


alter table MANGTHAI
   add constraint FK_MANGTHAI_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan);
      
ALTER TABLE MANGTHAI
 ADD ( CONSTRAINT MANGTHAI_MABN_UK UNIQUE 
  (MaBenhNhan));



/*==============================================================*/
/* Table: TIEMVACCINE                                           */
/*==============================================================*/
create table TIEMVACCINE 
(
   MaBenhNhan            varchar2(4)                     not null,
   TinhTrangTiemVaccine  varchar2(40)                    null,
   Loai_Vaccine1         varchar2(40)                    null,
   NgayTiem1            timestamp                      null,
   Loai_Vaccine2         varchar2(40)                    null,
   NgayTiem2            timestamp                      null,
   Loai_Vaccine3         varchar2(40)                    null,
   NgayTiem3            timestamp                      null
);


alter table TIEMVACCINE
   add constraint FK_TIEMVACCINE_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan);
      
ALTER TABLE TIEMVACCINE
 ADD ( CONSTRAINT TIEMVACCINE_MABN_UK UNIQUE 
  (MaBenhNhan));



/*==============================================================*/
/* Table: TONGTRANG                                             */
/*==============================================================*/
create table TONGTRANG 
(
   MaBenhNhan            varchar2(4)                     not null,
   NhietDo              smallint                        null,
   NhipTim              smallint                        null,
   HuyetApTamThu        smallint                        null,
   HuyetApTamTruong     smallint                        null,
   DoBaoHoaOxyTrongMau  smallint                        null,
   ChieuCao             smallint                        null,
   CanNang              smallint                        null,
   NhipTho              smallint                        null
);

alter table TONGTRANG
   add constraint FK_TONGTRAN_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan);

ALTER TABLE TONGTRANG
 ADD ( CONSTRAINT TONGTRANG_MABN_UK UNIQUE 
  (MaBenhNhan));

/*==============================================================*/
/* Table: TRIEUCHUNGTAITHOIDIEMTIEPNHAN                         */
/*==============================================================*/
create table TRIEUCHUNGTAITHOIDIEMTIEPNHAN 
(
   MaBenhNhan            varchar2(4)                     not null,
   Sot                  smallint                       null,
   DauHong              smallint                       null,
   NoiHachNgoaiVi       smallint                       null,
   DauDau               smallint                       null,
   MatKhuuGiac          smallint                       null,
   CoGiat               smallint                       null,
   DauCo                smallint                       null,
   DauKhop              smallint                       null,
   DauBung              smallint                       null,
   MatViGiac            smallint                       null,
   BuonNon              smallint                       null,
   XuatHuyet            smallint                       null,
   TrieuChungKhac       smallint                       null
);

alter table TRIEUCHUNGTAITHOIDIEMTIEPNHAN
   add constraint FK_TRIEUCHU_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan);

ALTER TABLE TRIEUCHUNGTAITHOIDIEMTIEPNHAN
 ADD ( CONSTRAINT TRIEUCHUNGTAITHOIDIEMTIEPNHAN_MABN_UK UNIQUE 
  (MaBenhNhan));


/*==============================================================*/
/* Table: DANHGIASOLUOC                                         */
/*==============================================================*/
create table DANHGIASOLUOC 
(
   MaBenhNhan            varchar2(4)                     not null,
   ChuanDoanLucNhapVien  varchar2(200)                   null,
   "DanhGiaTinhTrangBenhLyCOVID-19"  varchar2(40)                    null,
   DanhGiaDuDieuKienCachLyTaiNha smallint                       null
);

alter table DANHGIASOLUOC
   add constraint FK_DANHGIA_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan);
      
ALTER TABLE DANHGIASOLUOC
 ADD ( CONSTRAINT DANHGIASOLUOC_MABN_UK UNIQUE 
  (MaBenhNhan));


/*==============================================================*/
/* Table: CANBOYTE                                              */
/*==============================================================*/
create table CANBOYTE 
(
   MaNV                  varchar2(10)                    not null,
   HoTen                 varchar2(40)                    null,
   GioiTinh              varchar2(5)                     null,
   "CMND/CCCD"           varchar2(12)                    null,
   NgaySinh             date                           null,
   SDT                   varchar2(10)                    null,
   Email        varchar2(40)                    		null,
   DonViCongTac          varchar2(50)                    null,
   "Tinh/ThanhPho"       varchar2(20)                    null,
   "Quan/Huyen"          varchar2(20)                    null,
   "Phuong/Xa"           varchar2(20)                    null
   
);	

alter table CANBOYTE
   add constraint PK_CANBOYTE primary key (MaNV);




/*==============================================================*/
/* Table: QUATRINHDIEUTRITAINHA                                 */
/*==============================================================*/
create table QUATRINHDIEUTRITAINHA 
(
   ThoiDiemCapNhat      timestamp                      not null,
   Mach                 numeric(2)                     null,
   NhietDo              smallint                        null,
   NhipTho              smallint                        null,
   SpO2                 numeric(3)                     null,
   HuyetApToiDa         numeric(3)                     null,
   HuyetApToiThieu      numeric(3)                     null,
   KietSuc              smallint                       null,
   Ho                   smallint                       null,
   HoRaDom              smallint                       null,
   OnLanh               smallint                       null,
   MatViGiac            smallint                       null,
   MatKhuuGiac          smallint                       null,
   TieuChay             smallint                       null,
   HoRaMau              smallint                       null,
   ThoDocHoacKhoTho     smallint                       null,
   DauTucNgucKeoDai      varchar2(10)                    null,
   LoMoKhongTinhTao     smallint                       null,
   GoiThuocA            smallint                       null,
   GoiThuocB            smallint                       null,
   GoiThuocC            smallint                       null,
   XetNghiem            smallint                       null,
   NgayXetNghiem        timestamp                      null,
   KetQuaXetNghiem1      varchar2(40)                    null
);
alter table QUATRINHDIEUTRITAINHA 
add constraint PK_QUATRINHDIEUTRITAINHA primary key (ThoiDiemCapNhat);


/*==============================================================*/
/* Table: KETQUADIEUTRITAINHA                                   */
/*==============================================================*/
create table KETQUADIEUTRITAINHA 
(
   MaBenhNhan            varchar2(4)                     not null,
   TinhTrang             varchar2(40)                    null,
   TinhTrangKhac         varchar2(100)                   null,
   NgayKetThucCachLyTaiNha date                           null,
   NgayXetNghiemAmTinh  date                           null,
   LoaiXetNghiem        smallint                       null,
   NhapVien             smallint                       null,
   NgayNhapVien         date                           null,
   TrieuChungKhiNhapVien  varchar2(200)                   null,
   TenCoSoNhapVien       varchar2(100)                   null,
   LuuY                  varchar2(200)                   null,
   TuVong               smallint                       null,
   NgayTuVong           date                           null,
   NoiTuVong             varchar2(100)                   null,
   NoiTuVongKhac         varchar2(50)                    null,
   LyDoTuVong           smallint                       null,
   LyDoTuVongKhac        varchar2(100)                   null
);


alter table KETQUADIEUTRITAINHA
   add constraint FK_KETQUADI_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan);

ALTER TABLE KETQUADIEUTRITAINHA
 ADD ( CONSTRAINT KETQUADIEUTRITAINHA_MABN_UK UNIQUE 
  (MaBenhNhan));

create table TAIKHOANCANBOYTE 
(
   MaNV                  varchar2(10)                    not null,
   "SoCMND/CCCD"        varchar2(12)                    null,
   HoTen                 varchar2(40)                    null,
   MatKhau               varchar2(20)                    null
);


alter table TAIKHOANCANBOYTE
   add constraint FK_TAIKHOAN_CANBOYTE foreign key (MaNV)
      references CANBOYTE (MaNV);

ALTER TABLE TAIKHOANCANBOYTE
 ADD CONSTRAINT TAIKHOANCANBOYTE_SoCMND_CCCD_UK UNIQUE 
  ("SoCMND/CCCD");



/*==============================================================*/
/* Table: TAIKHOANBENHNHAN                                      */
/*==============================================================*/
create table TAIKHOANBENHNHAN 
(
   MaBenhNhan            varchar2(4)                     not null,
   "SoCMND/CCCD"         varchar2(12)                    null,
   HoTen                 varchar2(40)                    null,
   MatKhau               varchar2(20)                    null
);


alter table TAIKHOANBENHNHAN
   add constraint FK_TAIKHOAN_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan);
ALTER TABLE TAIKHOANBENHNHAN
 ADD CONSTRAINT TAIKHOANBENHNHAN_SoCMND_CCCD_UK UNIQUE 
  ("SoCMND/CCCD");


/*==============================================================*/
/* Table: DuocHoTro                                         */
/*==============================================================*/
create table DuocHoTro                                         
(
   MaBenhNhan            varchar2(4)                     not null,
   MaNV                  varchar2(10)                    not null,
   YeuCau                varchar2(100)                   null,
   ThoiDiemYeuCau       timestamp                      null
);

alter table DuocHoTro add constraint PK_ASSOCIATION_9 primary key (MaBenhNhan, MaNV);

alter table DuocHoTro                                         
   add constraint FK_HOTRO_CANBOYTE foreign key (MaNV)
      references CANBOYTE (MaNV);

alter table DuocHoTro                                         
   add constraint FK_HOTRO_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan);





/*==============================================================*/
/* Table: CapNhat                                     */
/*==============================================================*/
create table CapNhat                                      
(
   MaBenhNhan            varchar2(4)                     not null,
   ThoiDiemCapNhat      timestamp                      not null,
   MaNV                  varchar2(10)                    not null
   
);
alter table CapNhat                                     
add constraint PK_CAPNHAT primary key (MaBenhNhan, ThoiDiemCapNhat, MaNV);

alter table CapNhat                                     
   add constraint FK_CAPNHAT_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan);

alter table CapNhat                                     
   add constraint FK_CAPNHAT_QUATRINH foreign key (ThoiDiemCapNhat)
      references QUATRINHDIEUTRITAINHA (ThoiDiemCapNhat);

alter table CapNhat                                     
   add constraint FK_CAPNHAT_CANBOYTE foreign key (MaNV)
      references CANBOYTE (MaNV);