-- 코드를 작성해주세요
SELECT
    I.ITEM_ID,
    I.ITEM_NAME,
    I.RARITY
FROM ITEM_INFO I
JOIN
    (SELECT
        ITEM_ID
    FROM ITEM_TREE
    WHERE PARENT_ITEM_ID IN (SELECT ITEM_ID FROM ITEM_INFO WHERE RARITY = "RARE")) T
ON I.ITEM_ID = T.ITEM_ID
ORDER BY I.ITEM_ID DESC;