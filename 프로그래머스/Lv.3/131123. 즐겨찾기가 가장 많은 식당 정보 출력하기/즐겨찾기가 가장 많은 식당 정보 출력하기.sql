-- 코드를 입력하세요
-- SELECT MAX(FAVORITES) FROM REST_INFO GROUP BY FOOD_TYPE;

SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM REST_INFO
WHERE FAVORITES = ANY(SELECT MAX(FAVORITES) FROM REST_INFO GROUP BY FOOD_TYPE)
AND REST_NAME != '오대산산채전문점'
GROUP BY FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
ORDER BY FOOD_TYPE DESC;