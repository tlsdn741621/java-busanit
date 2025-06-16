-- 샘플 시퀀스 만들기
-- 세미 콜론으로 문장 구분을 안했을 경우, 해당 문장 직접 드래그 해사, ctrl + enter 로 실행 해주세요.
create SEQUENCE member501_seq
start with 1
increment By 1;

DROP SEQUENCE member501_seq;
DROP TABLE member501;
-- 샘플 확인용 테이블 만들기
CREATE TABLE member501 (
    id NUMBER PRIMARY key,
    name VARCHAR2(100),
    password VARCHAR2(100),
    email VARCHAR2(100),
    reg_date VARCHAR2(50)
)

-- 샘플 데이터 하나 넣기
INSERT INTO MEMBER501 (id, name, password, email, reg_date) VALUES(
    member501_seq.NEXTVAL,
    '강신우',
    '1234',
    'ksw@naver.com',
    '2025년6월16일12시9분'
);

COMMIT;

-- 테이블 조회
SELECT * FROM MEMBER501;

-- 한명 회원 조회 sql
SELECT * FROM MEMBER501 WHERE ID = 2;

-- 검색 조회
SELECT * FROM MEMBER501 WHERE NAME LIKE '%강신우%';