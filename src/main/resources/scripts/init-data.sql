
insert into `category`(`CATEGORY_ID`,`CATEGORY_NAME`) values (1,'Beverages');
insert into `category`(`CATEGORY_ID`,`CATEGORY_NAME`) values (2,'Food');

insert into `customer`(`CUSTOMER_ID`,`CUSTOMER_NAME`) values (1,'Victoria Ashworth');
insert into `customer`(`CUSTOMER_ID`,`CUSTOMER_NAME`) values (2,'Elizabeth Brown');
insert into `customer`(`CUSTOMER_ID`,`CUSTOMER_NAME`) values (3,'Thomas Hardy');

insert into `employee`(`EMPLOYEE_ID`,`BIRTHDAY`,`FIRST_NAME`,`LAST_NAME`) values (1,'1990-04-04 00:00:00','Nancy','Peacock');
insert into `employee`(`EMPLOYEE_ID`,`BIRTHDAY`,`FIRST_NAME`,`LAST_NAME`) values (2,'1990-04-04 00:00:00','Andrew','Fuller');
insert into `employee`(`EMPLOYEE_ID`,`BIRTHDAY`,`FIRST_NAME`,`LAST_NAME`) values (3,'1990-04-04 00:00:00','Steven','King');

insert into `product`(`PRODUCT_ID`,`PRICE`,`PRODUCT_NAME`,`CATEGORY_ID`,`IMAGE`) values (1,60,'Chang',1,null);
insert into `product`(`PRODUCT_ID`,`PRICE`,`PRODUCT_NAME`,`CATEGORY_ID`,`IMAGE`) values (2,55,'Leo',1,null);
insert into `product`(`PRODUCT_ID`,`PRICE`,`PRODUCT_NAME`,`CATEGORY_ID`,`IMAGE`) values (3,65,'Singha',1,null);
insert into `product`(`PRODUCT_ID`,`PRICE`,`PRODUCT_NAME`,`CATEGORY_ID`,`IMAGE`) values (4,220,'Massaman',2,null);
insert into `product`(`PRODUCT_ID`,`PRICE`,`PRODUCT_NAME`,`CATEGORY_ID`,`IMAGE`) values (5,220,'Fried rice',2,null);

insert into `orders`(`ORDER_ID`,`ORDER_DATE`,`CUSTOMER_ID`,`EMPLOYEE_ID`) values (1,'2015-04-05 00:00:00',1,1);
insert into `orders`(`ORDER_ID`,`ORDER_DATE`,`CUSTOMER_ID`,`EMPLOYEE_ID`) values (2,'2015-04-05 00:00:00',2,2);
insert into `orders`(`ORDER_ID`,`ORDER_DATE`,`CUSTOMER_ID`,`EMPLOYEE_ID`) values (3,'2015-04-05 00:00:00',3,1);
insert into `orders`(`ORDER_ID`,`ORDER_DATE`,`CUSTOMER_ID`,`EMPLOYEE_ID`) values (4,'2015-04-05 00:00:00',2,1);

insert into `orderdetails`(`ORDER_DETAIL_ID`,`QUANTITY`,`ORDER_ID`,`PRODUCT_ID`) values (1,5,1,1);
insert into `orderdetails`(`ORDER_DETAIL_ID`,`QUANTITY`,`ORDER_ID`,`PRODUCT_ID`) values (2,1,1,4);
insert into `orderdetails`(`ORDER_DETAIL_ID`,`QUANTITY`,`ORDER_ID`,`PRODUCT_ID`) values (3,1,1,5);
insert into `orderdetails`(`ORDER_DETAIL_ID`,`QUANTITY`,`ORDER_ID`,`PRODUCT_ID`) values (4,8,2,2);
insert into `orderdetails`(`ORDER_DETAIL_ID`,`QUANTITY`,`ORDER_ID`,`PRODUCT_ID`) values (5,11,3,3);
insert into `orderdetails`(`ORDER_DETAIL_ID`,`QUANTITY`,`ORDER_ID`,`PRODUCT_ID`) values (6,3,4,2);
insert into `orderdetails`(`ORDER_DETAIL_ID`,`QUANTITY`,`ORDER_ID`,`PRODUCT_ID`) values (7,1,4,5);

