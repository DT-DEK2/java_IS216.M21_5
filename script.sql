
/*==============================================================*/
/* Table: BENHNHAN                                              */
/*==============================================================*/
create or replace table BENHNHAN 
(
   MaBenhNhan           varchar(4)                     not null,
   HoTen                varchar(40)                    null,
   NgaySinh             date                           null,
   GioiTinh             varchar(5)                     null,
   "CMND/CCCD"          varchar(12)                    null,
   NoiOHienTai          varchar(20)                    null,
   "Tinh/ThanhPho"      varchar(20)                    null,
   "Quan/Huyen"         varchar(20)                    null,
   "Phuong/Xa"          varchar(20)                    null,
   NgheNghiep           varchar(20)                    null,
   NoiLamViec           varchar(50)                    null,
   SoDienThoai          numeric(10)                    null,
   NgayTiepNhan         date                           null,
   NgayXuatHienTrieuChungDauTien varchar(10)                    null,
   TungLaF0             smallint                       null,
   SoNgayLaF0           integer                        null,
   TestNhanh            smallint                       null,
   NgayTestNhanh        date                           null,
   KetQuaXetNghiem1     varchar(40)                    null,
   "TestRT-PCR"         smallint                       null,
   NgayTestRT_PCR       date                           null,
   KetQuaXetNghiem2     varchar(40)                    null,
   constraint PK_BENHNHAN primary key clustered (MaBenhNhan)
);


/*==============================================================*/
/* Table: BENHNEN                                               */
/*==============================================================*/
create or replace table BENHNEN 
(
   MaBenhNhan           varchar(4)                     not null,
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
   add constraint FK_BENHNEN_CO8_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan)
      on update restrict
      on delete restrict;

ALTER TABLE BENHNEN 
 ADD ( CONSTRAINT BENHNEN_MABN_UK UNIQUE 
  (MaBenhNhan));


/*==============================================================*/
/* Table: THUOCDUNGTRUOCKHINHAPVIEN                             */
/*==============================================================*/
create or replace table THUOCDUNGTRUOCKHINHAPVIEN 
(
   MaBenhNhan           varchar(4)                     not null,
   Steroid              smallint                       null,
   CacLoaiThuocMienDichKhac smallint                       null,
   KhangSinh            smallint                       null,
   KhangVirus           smallint                       null,
   CacLoaiThuocDieuTriCovidKhac smallint                       null,
   CacThuocUcCheMienDichKhac smallint                       null
);

alter table THUOCDUNGTRUOCKHINHAPVIEN
   add constraint FK_THUOCDUN_CO2_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan)
      on update restrict
      on delete restrict;

ALTER TABLE THUOCDUNGTRUOCKHINHAPVIEN 
 ADD ( CONSTRAINT THUOCDUNGTRUOCKHINHAPVIEN_MABN_UK UNIQUE 
  (MaBenhNhan));

/*==============================================================*/
/* Table: MANGTHAI                                              */
/*==============================================================*/
create or replace table MANGTHAI 
(
   MaBenhNhan           varchar(4)                     not null,
   MangThai             smallint                       null,
   SoTuanMangThai       integer                        null,
   HauSan               smallint                       null,
   "TreSoSinhDuocXetNghiemCovid-19" smallint                       null,
   "KetQuaXetNghiemCovid-19" varchar(40)                    null
);


alter table MANGTHAI
   add constraint FK_MANGTHAI_CO_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan)
      on update restrict
      on delete restrict;
      
ALTER TABLE MANGTHAI
 ADD ( CONSTRAINT MANGTHAI_MABN_UK UNIQUE 
  (MaBenhNhan));



/*==============================================================*/
/* Table: TIEMVACCINE                                           */
/*==============================================================*/
create or replace table TIEMVACCINE 
(
   MaBenhNhan           varchar(4)                     not null,
   TinhTrangTiemVaccine varchar(40)                    null,
   Loai_Vaccine1        varchar(40)                    null,
   NgayTiem1            timestamp                      null,
   Loai_Vaccine2        varchar(40)                    null,
   NgayTiem2            timestamp                      null,
   Loai_Vaccine3        varchar(40)                    null,
   NgayTiem3            timestamp                      null
);


alter table TIEMVACCINE
   add constraint FK_TIEMVACC_COTINHTRA_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan)
      on update restrict
      on delete restrict;
      
ALTER TABLE TIEMVACCINE
 ADD ( CONSTRAINT TIEMVACCINE_MABN_UK UNIQUE 
  (MaBenhNhan));



/*==============================================================*/
/* Table: TONGTRANG                                             */
/*==============================================================*/
create or replace table TONGTRANG 
(
   MaBenhNhan           varchar(4)                     not null,
   NhietDo              tinyint                        null,
   NhipTim              tinyint                        null,
   HuyetApTamThu        tinyint                        null,
   HuyetApTamTruong     tinyint                        null,
   DoBaoHoaOxyTrongMau  tinyint                        null,
   ChieuCao             tinyint                        null,
   CanNang              tinyint                        null,
   NhipTho              tinyint                        null
);

alter table TONGTRANG
   add constraint FK_TONGTRAN_CO4_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan)
      on update restrict
      on delete restrict;

ALTER TABLE TONGTRANG
 ADD ( CONSTRAINT TONGTRANG_MABN_UK UNIQUE 
  (MaBenhNhan));

/*==============================================================*/
/* Table: TRIEUCHUNGTAITHOIDIEMTIEPNHAN                         */
/*==============================================================*/
create or replace table TRIEUCHUNGTAITHOIDIEMTIEPNHAN 
(
   MaBenhNhan           varchar(4)                     not null,
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
   add constraint FK_TRIEUCHU_CO7_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan)
      on update restrict
      on delete restrict;

ALTER TABLE TRIEUCHUNGTAITHOIDIEMTIEPNHAN
 ADD ( CONSTRAINT TRIEUCHUNGTAITHOIDIEMTIEPNHAN_MABN_UK UNIQUE 
  (MaBenhNhan));


/*==============================================================*/
/* Table: DANHGIASOLUOC                                         */
/*==============================================================*/
create or replace table DANHGIASOLUOC 
(
   MaBenhNhan           varchar(4)                     not null,
   ChuanDoanLucNhapVien varchar(200)                   null,
   "DanhGiaTinhTrangBenhLyCOVID-19" varchar(40)                    null,
   DanhGiaDuDieuKienCachLyTaiNha smallint                       null
);

alter table DANHGIASOLUOC
   add constraint FK_DANHGIAS_CO11_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan)
      on update restrict
      on delete restrict;
      
ALTER TABLE DANHGIASOLUOC
 ADD ( CONSTRAINT DANHGIASOLUOC_MABN_UK UNIQUE 
  (MaBenhNhan));


/*==============================================================*/
/* Table: CANBOYTE                                              */
/*==============================================================*/
create or replace table CANBOYTE 
(
   MaNV                 varchar(10)                    not null,
   HoTen                varchar(40)                    null,
   GioiTinh             varchar(5)                     null,
   "CMND/CCCD"          varchar(12)                    null,
   NgaySinh             date                           null,
   SDT                  varchar(10)                    null,
   Attribute_94         varchar(40)                    null,
   DonViCongTac         varchar(50)                    null,
   "Tinh/ThanhPho"      varchar(20)                    null,
   "Quan/Huyen"         varchar(20)                    null,
   "Phuong/Xa"          varchar(20)                    null,
   constraint PK_CANBOYTE primary key clustered (MaNV)
);


alter table CANBOYTE
   add constraint FK_CANBOYTE_ASSOCIATI_TAIKHOAN foreign key ()
      references TAIKHOANCANBOYTE
      on update restrict
      on delete restrict;



/*==============================================================*/
/* Table: QUATRINHDIEUTRITAINHA                                 */
/*==============================================================*/
create or replace table QUATRINHDIEUTRITAINHA 
(
   ThoiDiemCapNhat      timestamp                      not null,
   Mach                 numeric(2)                     null,
   NhietDo              tinyint                        null,
   NhipTho              tinyint                        null,
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
   DauTucNgucKeoDai     varchar(10)                    null,
   LoMoKhongTinhTao     smallint                       null,
   GoiThuocA            smallint                       null,
   GoiThuocB            smallint                       null,
   GoiThuocC            smallint                       null,
   XetNghiem            smallint                       null,
   NgayXetNghiem        timestamp                      null,
   KetQuaXetNghiem1     varchar(40)                    null,
   constraint PK_QUATRINHDIEUTRITAINHA primary key clustered (ThoiDiemCapNhat)
);



/*==============================================================*/
/* Table: KETQUADIEUTRITAINHA                                   */
/*==============================================================*/
create or replace table KETQUADIEUTRITAINHA 
(
   MaBenhNhan           varchar(4)                     not null,
   TinhTrang            varchar(40)                    null,
   TinhTrangKhac        varchar(100)                   null,
   NgayKetThucCachLyTaiNha date                           null,
   NgayXetNghiemAmTinh  date                           null,
   LoaiXetNghiem        smallint                       null,
   NhapVien             smallint                       null,
   NgayNhapVien         date                           null,
   TrieuChungKhiNhapVien varchar(200)                   null,
   TenCoSoNhapVien      varchar(100)                   null,
   LuuY                 varchar(200)                   null,
   TuVong               smallint                       null,
   NgayTuVong           date                           null,
   NoiTuVong            varchar(100)                   null,
   NoiTuVongKhac        varchar(50)                    null,
   LyDoTuVong           smallint                       null,
   LyDoTuVongKhac       varchar(100)                   null
);


alter table KETQUADIEUTRITAINHA
   add constraint FK_KETQUADI_CO13_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan)
      on update restrict
      on delete restrict;

ALTER TABLE KETQUADIEUTRITAINHA
 ADD ( CONSTRAINT KETQUADIEUTRITAINHA_MABN_UK UNIQUE 
  (MaBenhNhan));

create or replace table TAIKHOANCANBOYTE 
(
   MaNV                 varchar(10)                    not null,
   "SoCMND/CCCD"       varchar(12)                    null,
   HoTen                varchar(40)                    null,
   MatKhau              varchar(20)                    null
);


alter table TAIKHOANCANBOYTE
   add constraint FK_TAIKHOAN_ASSOCIATI_CANBOYTE foreign key (MaNV)
      references CANBOYTE (MaNV)
      on update restrict
      on delete restrict;

ALTER TABLE TAIKHOANCANBOYTE
 ADD ( CONSTRAINT TAIKHOANCANBOYTE_SoCMND/CCCD_UK UNIQUE 
  ("SoCMND/CCCD" ));



/*==============================================================*/
/* Table: TAIKHOANBENHNHAN                                      */
/*==============================================================*/
create or replace table TAIKHOANBENHNHAN 
(
   MaBenhNhan           varchar(4)                     not null,
   "SoCMND/CCCD"        varchar(12)                    null,
   HoTen                varchar(40)                    null,
   MatKhau              varchar(20)                    null
);


alter table TAIKHOANBENHNHAN
   add constraint FK_TAIKHOAN_ASSOCIATI_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan)
      on update restrict
      on delete restrict;
ALTER TABLE TAIKHOANBENHNHAN
 ADD ( CONSTRAINT TAIKHOANBENHNHAN_SoCMND/CCCD_UK UNIQUE 
  ("SoCMND/CCCD" ));


/*==============================================================*/
/* Table: DuocHoTro                                         */
/*==============================================================*/
create or replace table DuocHoTro                                         
(
   MaBenhNhan           varchar(4)                     not null,
   MaNV                 varchar(10)                    not null,
   YeuCau               varchar(100)                   null,
   ThoiDiemYeuCau       timestamp                      null,
   constraint PK_ASSOCIATION_9 primary key clustered (MaBenhNhan, MaNV)
);


alter table DuocHoTro                                         
   add constraint FK_ASSOCIAT_ASSOCIATI_CANBOYTE foreign key (MaNV)
      references CANBOYTE (MaNV)
      on update restrict
      on delete restrict;

alter table DuocHoTro                                         
   add constraint FK_ASSOCIAT_ASSOCIATI_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan)
      on update restrict
      on delete restrict;





/*==============================================================*/
/* Table: CapNhat                                     */
/*==============================================================*/
create or replace table CapNhat                                      
(
   MaBenhNhan           varchar(4)                     not null,
   ThoiDiemCapNhat      timestamp                      not null,
   MaNV                 varchar(10)                    not null,
   constraint PK_ASSOCIATION_11 primary key clustered (MaBenhNhan, ThoiDiemCapNhat, MaNV)
);


alter table CapNhat                                     
   add constraint FK_ASSOCIAT_ASSOCIATI_BENHNHAN foreign key (MaBenhNhan)
      references BENHNHAN (MaBenhNhan)
      on update restrict
      on delete restrict;

alter table CapNhat                                     
   add constraint FK_ASSOCIAT_ASSOCIATI_QUATRINH foreign key (ThoiDiemCapNhat)
      references QUATRINHDIEUTRITAINHA (ThoiDiemCapNhat)
      on update restrict
      on delete restrict;

alter table CapNhat                                     
   add constraint FK_ASSOCIAT_ASSOCIATI_CANBOYTE foreign key (MaNV)
      references CANBOYTE (MaNV)
      on update restrict
      on delete restrict;