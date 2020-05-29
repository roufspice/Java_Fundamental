INSERT INTO test(id, sdate, edate)
VALUES ('syh1011',NOW(),ADDDATE(NOW(), INTERVAL 2 DAY));

INSERT INTO test(id, sdate, edate)
VALUES ('syh1012',NOW(),ADDDATE(NOW(), INTERVAL 20 DAY));

INSERT INTO test(id, sdate, edate)
VALUES ('syh1013',NOW(),ADDDATE(NOW(), INTERVAL 10 DAY));

INSERT INTO test(id, sdate, edate)
VALUES ('syh1014',NOW(),ADDDATE(NOW(), INTERVAL 40 HOUR));

SELECT id, sdate, edate
FROM test;

SELECT NOW(), SUBDATE(NOW(), INTERVAL 1 DAY)
FROM test;

SELECT NOW(), concat(DATEDIFF(edate, sdate),'일 남았다!!') AS 'DIFF' 
FROM test;

SELECT id, TIMESTAMPDIFF(HOUR, sdate, edate) AS 'TimeD'
FROM test; 

INSERT INTO test(id, sdate, edate)
VALUES ('syh1015',NOW(),ADDDATE(NOW(), INTERVAL 100 DAY));

SELECT id, sdate, edate
FROM test;

ALTER TABLE test
ADD differdate DATETIME;

ALTER TABLE test 
CHANGE differdate differ DATETIME;

ALTER TABLE test 
DROP differ;

SELECT id, DATE_FORMAT(sdate, '%Y.%m.%d %h:%i:%s') AS 'sdate', DATE_FORMAT(edate, '%Y.%m.%d %h:%i:%s') AS 'edate'
FROM test; 



