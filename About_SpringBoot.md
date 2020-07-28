Spring Boot 내용 정리
========================
# 1. 스프링 부트(Spring boot)란?
* 스프링 부트는 단독 실행되는, 실행하기만 하면 되는 상용화 가능한 수준의 스프링 기반 어플리케이션을 쉽게 만들어낼 수 있다. 
* 최소한의 설정으로 스프링 플랫폼과 3rd party 라이브러리들을 사용할 수 있도록 하고 있다. 
## 1.1 스프링 부트 기능
* Create stand-alone Spring applications
> 단독실행가능한 스프링애플리케이션을 생성한다.
* Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR files)
> 내장형 톰캣, 제티 혹은 언더토우를 내장(```WAR``` 파일로 배포할 경우에는 필요없음)
* Provide opinionated 'starter' component to simplify your build configuration
> 기본설정되어 있는 'starter' 컴포넌트들을 쉽게 추가
* Automatically configure Spring whenever possible
> 가능한 자동설정되어 있음
* Provide production-ready features such as metrics, health checks and externalized configuration
> 상용화에 필요한 통계, 상태 점검 및 외부설정을 제공
* Absolutely no code generation and no requirement for XML configuration
> 설정을 위한 XML 코드를 생성하거나 요구하지 않음



## 1.2 개발 환경 디렉토리 구조
<table class="tg">
<thead>
  <tr>
    <th class="tg-gdc4" colspan="8">디텍토리 및 파일</th>
    <th class="tg-gdc4">설명</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-c3ow" rowspan="19">업무 프로젝트</td>
    <td class="tg-c3ow" rowspan="15">src</td>
    <td class="tg-c3ow" rowspan="13">main</td>
    <td class="tg-c3ow" rowspan="8">java</td>
    <td class="tg-c3ow" rowspan="8">com.cname<br>(도메인)</td>
    <td class="tg-c3ow" rowspan="8">서비스<br>(ex. display)</td>
    <td class="tg-c3ow" rowspan="6">업무 영역</td>
    <td class="tg-0pky">common</td>
    <td class="tg-0pky">프로젝트 내에서 사용하는 공통 모듈</td>
  </tr>
  <tr>
    <td class="tg-0pky">controller</td>
    <td class="tg-0pky">서블릿 요청을 처리하는 컨트롤러</td>
  </tr>
  <tr>
    <td class="tg-0pky">service</td>
    <td class="tg-0pky">비지니스 로직 처리</td>
  </tr>
  <tr>
    <td class="tg-0pky">dao(VO)</td>
    <td class="tg-0pky">데이터 access를 위한 로직</td>
  </tr>
  <tr>
    <td class="tg-0pky">model</td>
    <td class="tg-0pky">데이터를 저장하는 POJO 객체</td>
  </tr>
  <tr>
    <td class="tg-0pky">intercepter</td>
    <td class="tg-0pky">controller 클래스 호출 전에 비지니스 로직 처리</td>
  </tr>
  <tr>
    <td class="tg-0pky" colspan="2">config</td>
    <td class="tg-0pky">프로젝트 내의 configuration 설정 bean</td>
  </tr>
  <tr>
    <td class="tg-0pky" colspan="2">exception</td>
    <td class="tg-0pky">전역 예외처리 클래스</td>
  </tr>
  <tr>
    <td class="tg-0pky" rowspan="5">resources</td>
    <td class="tg-0pky" colspan="4">application.property</td>
    <td class="tg-0pky">업무 프로세스 환경 별 설정 및 property 정보 저장</td>
  </tr>
  <tr>
    <td class="tg-0pky" colspan="4">mapper</td>
    <td class="tg-0pky">mybatis 관련 설정 및 xml query 파일 저장</td>
  </tr>
  <tr>
    <td class="tg-0pky" colspan="4">logback.xml</td>
    <td class="tg-0pky">업무 프로젝트 별 로그 설정 저장</td>
  </tr>
  <tr>
    <td class="tg-0pky">static</td>
    <td class="tg-0pky" colspan="3">js</td>
    <td class="tg-0pky">업무 로직 javascript 파일</td>
  </tr>
  <tr>
    <td class="tg-0pky">templetes</td>
    <td class="tg-0pky" colspan="3">서비스</td>
    <td class="tg-0pky">Thymeleaf 파일 저장</td>
  </tr>
  <tr>
    <td class="tg-0pky" rowspan="2">test</td>
    <td class="tg-0pky">java</td>
    <td class="tg-0pky" colspan="4"></td>
    <td class="tg-0pky">테스트에 필요한 Junit 테스트 케이스</td>
  </tr>
  <tr>
    <td class="tg-0pky">resources</td>
    <td class="tg-0pky" colspan="4"></td>
    <td class="tg-0pky">테스트에 필요한 설정 관련 파일</td>
  </tr>
  <tr>
    <td class="tg-0pky" colspan="7">.project</td>
    <td class="tg-0pky">STS 프로젝트 설정 파일</td>
  </tr>
  <tr>
    <td class="tg-0pky" colspan="7">.classpath</td>
    <td class="tg-0pky">STS 클래스패스 설정 파일</td>
  </tr>
  <tr>
    <td class="tg-0pky" colspan="7">.gitignore</td>
    <td class="tg-0pky">git 제외 대상 파일 등록</td>
  </tr>
  <tr>
    <td class="tg-0pky" colspan="7">build.gradle</td>
    <td class="tg-0pky">Gradle 설정 파일-의존성 관리</td>
  </tr>
</tbody>
</table>
* Gradle이 아닌 Maven 프로젝트일 경우 build.gradle 대신 pom.xml로 의존성을 관리 한다. 
