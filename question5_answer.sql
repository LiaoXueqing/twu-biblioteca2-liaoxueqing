SELECT
    name
FROM
    member
WHERE
    id
IN
    (
    SELECT
          member_id
    FROM (
        SELECT
          member_id,
          count( member_id) as checkoutNumber
        FROM
          checkout_item
        GROUP BY
          member_id
        )
    WHERE
        checkoutNumber > 1
    );