-- 코드를 작성해주세요

SELECT
    CONCAT(EXTRACT(QUARTER FROM DIFFERENTIATION_DATE), 'Q') QUARTER
    , COUNT(*) ECOLI_COUNT
FROM ECOLI_DATA
GROUP BY QUARTER
ORDER BY QUARTER
;