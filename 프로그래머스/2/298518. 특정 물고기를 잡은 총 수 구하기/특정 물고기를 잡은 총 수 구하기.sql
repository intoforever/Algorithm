-- 코드를 작성해주세요
SELECT
    COUNT(*) FISH_COUNT
FROM FISH_INFO I
JOIN FISH_NAME_INFO N ON I.FISH_TYPE = N.FISH_TYPE
WHERE N.FISH_NAME IN('BASS', 'SNAPPER');