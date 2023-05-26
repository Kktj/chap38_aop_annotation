[Spring AOP Annotation 방식]

 
[순서]

1. 기존 프로젝트 복사해서 이름 변경
 -> chap38_aop_annotation
 
2. pom.xml AOP 관련 디펜던시(라이브러리) 확인
	<!-- AspectJ -->
	<dependency>
		<groupId>org.aspectj</groupId>
		<artifactId>aspectjrt</artifactId>
		<version>${aspectj-version}</version>
	</dependency>	
	<dependency>
	    <groupId>org.aspectj</groupId>
	    <artifactId>aspectjweaver</artifactId>
	    <version>${aspectj-version}</version>
	    <scope>runtime</scope>
	</dependency>
	<dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjtools</artifactId>
        <version>${aspectj-version}</version>
    </dependency>	

3. [주의]root-context.xml 수정 
	common 패키지에 있는 어드바이스들이 자동 스캔되어 빈으로 생성될 수 있도록   

	<!-- common 패키지도 검색 대상에 포함 -->
	<context:component-scan base-package="com.javalab.board.common" />

   [중요]
	<!-- AOP를 어노테이션 방식으로 사용하겠다고 선언 -->
	<aop:aspectj-autoproxy></aop:aspectj-autoproxy>   

	<!-- 기존 Advice Bean 모두 주석처리 -->
	 
4. com.javalab.board.common 패키지에 어드바이스 클래스를
  어노테이션 방식 AOP 설정으로 코드 수정
  
 1) BeforeAdvice 클래스 수정
  - 어드바이스 클래스에가 포인트컷 설정과 애스펙트 설정까지 다되어 있음
  
 2) [주의]XML에 있는 모든 어드바이스 빈들은 주석처리
  - 주석처리 안하면 빈들이 두번 생성됨.
 
5. BeforeAdvice 단위테스트

6. After Advice 단위테스트는 BeforeAdvice 와 동일한 방식으로

7. AfterReturningAdvice
 1) AfterReturningAdvice 어드바이스 클래스 내용 수정
 2) 단위테스트 할때는 다음 메소드에서 테스트할것(왜냐하면 애스펙트를 getPointCut()으로 했으므로)
     public void testGetBoardById() {
 
  
  
  
  
  
  