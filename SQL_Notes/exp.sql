DECLARE
    X NUMBER := 4;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE(X);
        X := X+1;
        EXIT WHEN X>5;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE(X);
END;



SELECT
    CONCAT(CONCAT(CONCAT('A',
    'B'),
    'C'),
    'D')
FROM
    DUAL;