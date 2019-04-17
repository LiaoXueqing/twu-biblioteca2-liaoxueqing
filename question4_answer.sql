INSERT INTO book VALUES(11,'The Pragmatic Programmer');
INSERT INTO member VALUES(43,'Liao Xueqing');
INSERT INTO checkout_item VALUES(43,11,NULL);

SELECT
    name
FROM
    member
WHERE
    id = (
    SELECT
        member_id
    FROM
        checkout_item
    WHERE
        book_id = (
        SELECT
            id
        FROM
            book
        WHERE
            title = 'The Pragmatic Programmer'
        )
    );