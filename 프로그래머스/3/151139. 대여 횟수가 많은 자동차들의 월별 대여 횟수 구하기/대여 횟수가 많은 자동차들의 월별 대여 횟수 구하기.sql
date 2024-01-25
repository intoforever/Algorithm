-- 코드를 입력하세요
SELECT
    EXTRACT(MONTH FROM START_DATE) MONTH,
    CAR_ID,
    COUNT(*) RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE TO_CHAR(START_DATE, 'YYYY-MM-DD') BETWEEN '2022-08-01' AND '2022-10-31'
AND CAR_ID IN (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE TO_CHAR(START_DATE, 'YYYY-MM-DD') BETWEEN '2022-08-01' AND '2022-10-31'
    GROUP BY CAR_ID
    HAVING COUNT(*) >= 5
)
GROUP BY CAR_ID, EXTRACT(MONTH FROM START_DATE)
ORDER BY MONTH, CAR_ID DESC;