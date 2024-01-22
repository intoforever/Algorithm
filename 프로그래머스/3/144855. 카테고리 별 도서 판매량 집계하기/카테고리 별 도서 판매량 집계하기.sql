-- 코드를 입력하세요
SELECT
    CATEGORY,
    SUM(SALES) TOTAL_SALES
FROM BOOK B
LEFT JOIN BOOK_SALES S ON B.BOOK_ID = S.BOOK_ID
WHERE SALES_DATE BETWEEN '2022-01-01' AND '2022-01-31'
GROUP BY CATEGORY
ORDER BY CATEGORY;