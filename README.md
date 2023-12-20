# API 서버 테스트 를 위한 소스 

## 1. 개발환경
* JAVA 21 , spring boot 3.2.x
* 터미널로 프로젝트 상위 폴더 infra 폴더로 진입 docker-compose up 명령어로 로컬 DB 설치
* 접속정보 오라클 DB 대신 postgres 로 대체 

| 데이터베이스 |  포트   | ID | 비밀번호 |
|---|------|---|---|
| XPRODB | 5501 | XADMIN | XADMIN |

* backup 폴더-> xprodb.sql 의 초기 데모데이터를 넣어준다 

## 2. API TEST
 

````
aptCd 를 DB 에 유효한 아파트 코드 조회시 정상 호출
JPA 테스트 URL 
http://localhost:8888/api/v1/tdginfo?aptCd=99999  

{
    "status": "SUCCESS",
    "message": null,
    "data": {
        "aptCd": "99999",
        "aptNm": "테스트",
        "aptOutputNm": null,
        "aptForm": "7",
        "aptNoNum": 4,
        "householdNum": 322
    }
}

QueryDSl 테스트 URL 
http://localhost:8888/api/v1/tdginfo/querydsl?aptCd=99999

{
    "status": "SUCCESS",
    "message": null,
    "data": {
        "aptCd": "99999",
        "aptNm": "테스트",
        "aptOutputNm": null,
        "aptForm": "7",
        "aptNoNum": 4,
        "householdNum": 322
    }
}