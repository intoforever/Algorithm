-- 코드를 입력하세요
SELECT
    T1. FOOD_TYPE,
    T1. REST_ID,
    T1. REST_NAME,
    T1. FAVORITES
FROM REST_INFO T1
JOIN
(SELECT FOOD_TYPE, MAX(FAVORITES) FAVORITES FROM REST_INFO GROUP BY FOOD_TYPE) T2
ON T1.FOOD_TYPE = T2.FOOD_TYPE AND T1.FAVORITES = T2.FAVORITES
GROUP BY FOOD_TYPE
ORDER BY FOOD_TYPE DESC;