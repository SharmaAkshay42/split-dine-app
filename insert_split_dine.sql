use split_dine;

insert into dish(name, description, price, dish_type)
values 
('TUNA STACK','ocean wise ™ ahi, citrus tamari vinaigrette, avocado, tomato, pickle',19.5, 'STARTERS'),
('MINI CRISPY CHICKEN SANDWICHES','spicy panko-crusted chicken, lettuce, tomato, pickle, onion',16, 'STARTERS'),
('MINI BURGERS','angus beef®, dijon mayonnaise',16.75, 'STARTERS'),
('CHICKEN WINGS','spicy panko-crusted chicken, spicy dip',17, 'STARTERS'),
('TRUFFLE FRIES','truffle, herbs, grana padano, garlic aioli',11.5, 'STARTERS'),
('GRILLED DIJON SALMON',' buttered mashed potatoes, roasted asparagus, soy-dijon butter sauce, cilantro',28.5, 'LUNCH'),
('FOUR MUSHROOM STEAK','8oz certified angus beef sirloin, shiitake, portobello, button and crimini mushroom demi-glace, buttered mashed potatoes',37.75, 'LUNCH'),
('CHARGRILLED STEAK','8oz certified angus beef sirloin, buttered mashed potatoes, roasted asparagus',31.5,'LUNCH'),
('CHEDDAR BACON BURGER','smashed certified angus beef, aged cheddar, smoked bacon, red relish, mayonnaise, ketchup, mustard, sea salted fries',21.5,'DINNER'),
('GARDENBURGER','aged cheddar, red relish, mayonnaise, ketchup, mustard, brioche bun, sea salted fries',21,'DINNER'),
('CHICKEN TENDERS','panko-breaded chicken, sea salted fries, honey mustard dip',18.25, 'DINNER'),
('APPLE TART','flaky pie crust, caramelized apples, tahitian vanilla ice cream, caramel sauce',11,'DESSERTS'),
('CHOCOLATE LAVA CAKE','molten dark chocolate cake, tahitian vanilla ice cream',11.5,'DESSERTS'),
('WHITE CHOCOLATE CHEESECAKE','chocolate cookie crust, raspberry compote, hand whipped cream',11.25,'DESSERTS');


insert into customer(cust_name, cust_email) values
('Rodolfo', 'rodolfo@example.com'),
('Akshay', 'akshay@example.com'),
('Iana', 'iana@example.com'),
('Gali', 'gali@example.com');