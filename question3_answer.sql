SELECT
    'book title:', title
FROM
    book
WHERE
    id
NOT IN
    (
    SELECT
        book_id
    FROM
        checkout_item
    WHERE
        book_id != NULL
    );

SELECT
    'movie title:', title
FROM
    movie
WHERE
    id
NOT IN
    (
    SELECT
        movie_id
    FROM
        checkout_item
    WHERE
        movie_id != NULL
    );
