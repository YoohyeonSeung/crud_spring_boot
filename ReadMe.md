CRUD Project 개요
================
## 1. 개발 환경
    1) Java Spring Boot - Rest API   
    2) Gadle
    3) Oracle DB - 11c

## 2. 기능
    1) 게시판 CRUD 기능
    2) 회원 기능 - Under Construction

## 3. 특이사항
* Oracle DB 11c 연동을 위한 ojdbc6.jar 처리
    1) lib 폴더 생성 후 ojdbc6.jar 저장. 
    2) build.gradle에 다음 코드 삽입하여 의존성 관리
    >	```
    >	compile fileTree(dir: 'libs', include: ['*.jar'])
    >	```

       
    

## 4. Reference
* 게시판 CRUD 기능 참조 : <https://private.tistory.com/35> 
* 회원 기능 참조 : <https://daddyprogrammer.org/post/series/springboot2-make-rest-api/>
* 로그인 기능 참조 : <https://tbbrother.tistory.com/65>

## P.S
* Spring Boot를 이용하여 게시판 CRUD 를 구현할 때 H2를 이용하거나 MySql을 많이 이용하나 이 프로젝트에서는 Oracle DB를 이용하였다.
* 웹으로 표현하는 방법은 자바스크립트 같은 언어를 아직 배우지 않아서 참조사이트에서 만들어놓은 JSP를 이용하였으며, 회원 기능의 경우 이것을 수정하여 보여줄 것이다. 
