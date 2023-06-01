package week11;

public class SuperMario extends Game{

	public SuperMario(String title, String version) {
		super(title, version);
	}

	@Override
	public void start() {
		System.out.println("제목 : " + getTitle());
		System.out.println("버전 : " + getVersion());
		System.out.println(getTitle() + "게임을 시작합니다.");
		
	}

	@Override
	public void gameDesc() {
		System.out.println("닌텐도의 대표 비디오 게임 시리즈인 마리오 시리즈의 핵심이 되는 본가 시리즈.");
	}
}
