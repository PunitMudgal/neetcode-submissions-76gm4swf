-- Write your query below
-- SELECT  s.seller_name FROM seller s INNER JOIN orders o ON s.seller_id = o.seller_id WHERE 


SELECT s.seller_name 
    FROM seller s 
    WHERE s.seller_id NOT IN 
    (select seller_id from orders where sale_date >= '2020-01-01' AND sale_date <= '2020-12-31')
    ORDER BY s.seller_name ASC;
    