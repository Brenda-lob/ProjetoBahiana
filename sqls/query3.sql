SELECT pro.Nome_Produto, COUNT(com.ID_Compra) AS ComprasFeitasNumero
FROM Compras com
RIGHT JOIN Produtos pro ON com.ID_Produto = pro.ID_Produto
GROUP BY pro.Nome_Produto;