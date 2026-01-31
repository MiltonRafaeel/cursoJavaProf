INSERT INTO tb_product(name) VALUES ('Computador');
INSERT INTO tb_product(name) VALUES ('Livro');
INSERT INTO tb_product(name) VALUES ('Papel');
INSERT INTO tb_product(name) VALUES ('Memoria Ram');

INSERT INTO tb_category(name) VALUES ('Eletronico');
INSERT INTO tb_category(name) VALUES ('Estudo');

INSERT INTO tb_product_category(product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category(product_id, category_id) VALUES (2, 2);
INSERT INTO tb_product_category(product_id, category_id) VALUES (3, 2);
INSERT INTO tb_product_category(product_id, category_id) VALUES (4, 1);