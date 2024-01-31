-- 코드를 입력하세요
SELECT
    YEAR(SALES_DATE) YEAR,
    MONTH(SALES_DATE) MONTH,
    GENDER,
    COUNT(DISTINCT S.USER_ID) USERS
FROM ONLINE_SALE S
LEFT JOIN USER_INFO U ON S.USER_ID = U.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY YEAR(SALES_DATE), MONTH(SALES_DATE), GENDER
ORDER BY YEAR, MONTH, GENDER;