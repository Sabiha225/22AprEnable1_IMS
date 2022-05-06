
USE IMS; 

INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Emily', 'Williams');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Jane', 'Smith');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Harry', 'Kane');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Muhammed', 'Ali');

-- SELECT * FROM `ims`.`customers`

INSERT INTO `ims`.`orders`(`order_id`, `customer_id`, `total_cost`, `order_date`) VALUES ('1','1','15.50','03-05-2022');
INSERT INTO `ims`.`orders`(`order_id`, `customer_id`, `total_cost`, `order_date`) VALUES ('2','2', '5.99','03-05-2022');
INSERT INTO `ims`.`orders`(`order_id`, `customer_id`, `total_cost`, `order_date`) VALUES ('3','3', '30.00','03-05-2022');
INSERT INTO `ims`.`orders`(`order_id`, `customer_id`, `total_cost`, `order_date`) VALUES ('4','4', '45.00','03-05-2022');
INSERT INTO `ims`.`orders`(`order_id`, `customer_id`, `total_cost`, `order_date`) VALUES ('5','5', '100.00','05-05-2022');

-- SELECT * FROM `ims`.`customers` JOIN `ims`.`orders` ON `ims`.`customers`.customer_id = `ims`.`orders`.customer_id;

-- SELECT * FROM `ims`.`products`;

INSERT INTO `ims`.`products`(`product_id`, `product_name`, `cost`) VALUES ('1','Mascara', '9.99');
INSERT INTO `ims`.`products`(`product_id`, `product_name`, `cost`) VALUES ('2','Makeup', '18.99');
INSERT INTO `ims`.`products`(`product_id`, `product_name`, `cost`) VALUES ('3','Body Lotion', '5.99');
INSERT INTO `ims`.`products`(`product_id`, `product_name`, `cost`) VALUES ('4','Eyeshadow', '14.99');
INSERT INTO `ims`.`products`(`product_id`, `product_name`, `cost`) VALUES ('5','Perfume', '50.00');