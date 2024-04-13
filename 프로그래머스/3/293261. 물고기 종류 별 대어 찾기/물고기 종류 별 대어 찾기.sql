-- 코드를 작성해주세요
SELECT
    fi.ID
    , fn.FISH_NAME
    , fi.LENGTH
FROM FISH_INFO fi
INNER JOIN FISH_NAME_INFO fn ON fi.FISH_TYPE = fn.FISH_TYPE
WHERE (fi.FISH_TYPE, fi.LENGTH) IN (
SELECT FISH_TYPE, MAX(LENGTH)
FROM FISH_INFO
GROUP BY FISH_TYPE)
ORDER BY FI.ID
;