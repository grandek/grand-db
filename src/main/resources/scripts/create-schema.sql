
    alter table ORDERDETAILS 
        drop 
        foreign key FK_itva0v2jv7le72q4ol6wrsq1k;

    alter table ORDERDETAILS 
        drop 
        foreign key FK_h5ofes92nomkg86hivs3lkdx;

    alter table ORDERS 
        drop 
        foreign key FK_57wwsm6wqqkcr1amp4dtsk5bs;

    alter table ORDERS 
        drop 
        foreign key FK_1tgv0b76eq5mfba8xjeqhoml3;

    alter table PRODUCT 
        drop 
        foreign key FK_6t6fwpoax5485lfta1ha89rlh;

    drop table if exists CATEGORY;

    drop table if exists CUSTOMER;

    drop table if exists EMPLOYEE;

    drop table if exists ORDERDETAILS;

    drop table if exists ORDERS;

    drop table if exists PRODUCT;

    create table CATEGORY (
        CATEGORY_ID integer not null auto_increment,
        CATEGORY_NAME varchar(50) not null,
        primary key (CATEGORY_ID)
    );

    create table CUSTOMER (
        CUSTOMER_ID integer not null auto_increment,
        CUSTOMER_NAME varchar(255),
        primary key (CUSTOMER_ID)
    );

    create table EMPLOYEE (
        EMPLOYEE_ID integer not null auto_increment,
        BIRTHDAY datetime,
        FIRST_NAME varchar(255),
        LAST_NAME varchar(255),
        primary key (EMPLOYEE_ID)
    );

    create table ORDERDETAILS (
        ORDER_DETAIL_ID integer not null auto_increment,
        QUANTITY integer,
        ORDER_ID integer,
        PRODUCT_ID integer,
        primary key (ORDER_DETAIL_ID)
    );

    create table ORDERS (
        ORDER_ID integer not null auto_increment,
        ORDER_DATE datetime,
        CUSTOMER_ID integer,
        EMPLOYEE_ID integer,
        primary key (ORDER_ID)
    );

    create table PRODUCT (
        PRODUCT_ID integer not null auto_increment,
        IMAGE longblob,
        PRICE double precision not null,
        PRODUCT_NAME varchar(50) not null,
        CATEGORY_ID integer,
        primary key (PRODUCT_ID)
    );

    alter table ORDERDETAILS 
        add constraint FK_itva0v2jv7le72q4ol6wrsq1k 
        foreign key (ORDER_ID) 
        references ORDERS (ORDER_ID);

    alter table ORDERDETAILS 
        add constraint FK_h5ofes92nomkg86hivs3lkdx 
        foreign key (PRODUCT_ID) 
        references PRODUCT (PRODUCT_ID);

    alter table ORDERS 
        add constraint FK_57wwsm6wqqkcr1amp4dtsk5bs 
        foreign key (CUSTOMER_ID) 
        references CUSTOMER (CUSTOMER_ID);

    alter table ORDERS 
        add constraint FK_1tgv0b76eq5mfba8xjeqhoml3 
        foreign key (EMPLOYEE_ID) 
        references EMPLOYEE (EMPLOYEE_ID);

    alter table PRODUCT 
        add constraint FK_6t6fwpoax5485lfta1ha89rlh 
        foreign key (CATEGORY_ID) 
        references CATEGORY (CATEGORY_ID);
