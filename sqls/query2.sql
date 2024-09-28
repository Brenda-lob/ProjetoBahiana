SELECT TOP 1
    pro.Nome_Produto,
    SUM(com.Quantidade) AS Total
FROM 
    Compras com
JOIN 
    Produtos pro ON com.ID_Produto = pro.ID_Produto
GROUP BY 
    pro.Nome_Produto
ORDER BY 
    Total DESC;