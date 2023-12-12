
SingleTon 생성

    public class SngletonService {
    	//static영역에 객체를 딱 한개만 생성해둔다
    	private static final SngletonService instance = new SngletonService();

    	// public으로 열어서 객체 인스턴스가 필요하면 이 static메서드를 통해서만 조회하도록 허용한다
    	public static SngletonService getInstance(){
    		return instance;
    	}
    	//생성자를 private로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다
    	private SngletonService() {

    	}
    	public void logic() {
    		System.out.println("싱글톤 객체 로직 호출출");
    	}
    }
 
테스트 

    @Test
	@DisplayName("싱글톤 패턴을 적용한 객체 사용")
	public void singletonServiceTest() {
		//private으로 생성자를 막아두었다. 컴파일 오류가 발생한다.
		//new SingletonService();
		//1. 조회: 호출할 때 마다 같은 객체를 반환
		SngletonService singletonService1 = SngletonService.getInstance();
		//2. 조회: 호출할 때 마다 같은 객체를 반환
		SngletonService singletonService2 = SngletonService.getInstance();
		//참조값이 같은 것을 확인
		System.out.println("singletonService1 = " + singletonService1);
		System.out.println("singletonService2 = " + singletonService2);
		// singletonService1 == singletonService2
		assertThat(singletonService1).isSameAs(singletonService2);
		singletonService1.logic();
	}
    output을 보면 
        singletonService1 = singleton.SngletonService@76f4b65
        singletonService2 = singleton.SngletonService@76f4b65
    이 나온다 결과적으로 하나의 객체만 생성되었다. 
    싱글톤패턴은 이미 만들어진 객체를 공유하는 방식으로 생성된다.
싱글톤패턴 문제점

    코드가 길다
    의존관계상 클래스가 구체클레스에 의존해서 OCP를 위반한다
    테스트가 어렵
    내부속성을 변경하거나 초기화하기 어렵 
    유연성이 떨어짐
    안티패턴 ㅠ 
    
