SELECT LEFT(PRODUCT_CODE, 2) CATEGORY, COUNT(*) PRODUCTS
FROM PRODUCT
GROUP BY LEFT(PRODUCT_CODE, 2)
ORDER BY CATEGORY