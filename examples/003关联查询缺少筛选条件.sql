# noinspection SqlResolveForFile
# noinspection SqlNoDataSourceInspectionForFile

SELECT
  *
FROM A
  LEFT JOIN B
    ON (
    A.id1 = B.id1 AND A.id2 = B.id2
    AND A.dt BETWEEN 'YYYYMMDD' AND 'YYYYMMDD'
    AND CONCAT(SUBSTR(X, 1, 4), SUBSTR(A.X, 5, 2), SUBSTR(A.X, 6, 2)) = 'abcd1234'
    AND A.id1 IN (SELECT XXX FROM B WHERE X > 3)
    );

SELECT
  *
FROM A
  LEFT JOIN B
    ON (
    A.id1 = B.id1 AND A.id2 = B.id2
    AND A.dt BETWEEN 'YYYYMMDD' AND 'YYYYMMDD'
    AND CONCAT(SUBSTR(X, 1, 4), SUBSTR(A.X, 5, 2), SUBSTR(A.X, 6, 2)) = 'abcd1234'
    AND A.id1 IN (SELECT XXX FROM B WHERE X > 3)
    )
UNION
SELECT
  *
FROM A
  LEFT JOIN B
    ON (
    A.id1 = B.id1 AND A.id2 = B.id2
    AND A.dt BETWEEN 'YYYYMMDD' AND 'YYYYMMDD'
    AND CONCAT(SUBSTR(X, 1, 4), SUBSTR(A.X, 5, 2), SUBSTR(A.X, 6, 2)) = 'abcd1234'
    AND A.id1 IN (SELECT XXX FROM B WHERE X > 3)
    );

SELECT
  *
FROM A
  LEFT JOIN B
    ON (
    A.id1 = B.id1 AND A.id2 = B.id2
    AND A.dt BETWEEN 'YYYYMMDD' AND 'YYYYMMDD'
    AND A.dt = TO_CHAR(TO_DATE('YYYYMMDD'), 'YYYYMMDD')
    AND A.X = 2 AND A.Y > 4.0
    AND CONCAT(SUBSTR(A.X, 1, 4), SUBSTR(A.X, 5, 2), SUBSTR(A.X, 6, 2)) = 'abcd1234'
    );

SELECT
  *
FROM A
  LEFT JOIN B
    ON (
    A.id1 = B.id1 AND A.id2 = B.id2
    )
WHERE A.dt BETWEEN 'YYYYMMDD' AND 'YYYYMMDD';
