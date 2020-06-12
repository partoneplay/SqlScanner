# noinspection SqlResolveForFile
# noinspection SqlNoDataSourceInspectionForFile

SELECT
  B.X,
  COUNT(1),
  SUM(Y)
FROM A
  INNER JOIN B
    ON (A.id1 = B.id1 AND A.id2 = B.id2)
WHERE A.DT BETWEEN 'YYYYMMDD' AND 'YYYYMMDD'
GROUP BY B.X;

SELECT
  B.X,
  COUNT(1),
  SUM(Y)
FROM A
  INNER JOIN B
    ON (A.id1 = B.id1 AND A.id2 = B.id2)
WHERE A.DT BETWEEN 'YYYYMMDD' AND 'YYYYMMDD'
GROUP BY B.X

UNION ALL

SELECT
  B.X,
  COUNT(1),
  SUM(Y)
FROM A
  INNER JOIN B
    ON (A.id1 = B.id1 AND A.id2 = B.id2)
WHERE A.DT BETWEEN 'YYYYMMDD' AND 'YYYYMMDD'
GROUP BY B.X;
;

INSERT INTO B
SELECT
  B.X,
  COUNT(1),
  (SELECT MIN(A) FROM B)
FROM A, B, (XXX, YYY)
WHERE A.DT BETWEEN 'YYYYMMDD' AND 'YYYYMMDD'
AND A.id1 = B.id1 AND A.id2 = B.id2
GROUP BY B.X;

SELECT
  B.X,
  COUNT(1),
  SUM(Y)
FROM A, (
  SELECT DISTINCT id1, id2 FROM DIM
) AS B
WHERE A.DT BETWEEN 'YYYYMMDD' AND 'YYYYMMDD'
      AND A.id1 = B.id1 AND A.id2 = B.id2
GROUP BY B.X;


SELECT
  B.X,
  A.CNT,
  A.AMT
FROM (
       SELECT
         id1,
         id2,
         COUNT(1) AS CNT,
         SUM(Y) AS AMT
       FROM T
       WHERE DT BETWEEN 'YYYYMMDD' AND 'YYYYMMDD'
     ) AS A
  INNER JOIN B
    ON (A.id1 = B.id1 AND A.id2 = B.id2);
