SELECT 
    com.ID_Compra,
    com.Quantidade,
    pro.Nome_Produto,
    pro.Preco_Unitario,
    (com.Quantidade * pro.Preco_Unitario) AS Total
FROM 
    Compras as com
JOIN 
    Produtos as pro ON com.ID_Produto = pro.ID_Produto;