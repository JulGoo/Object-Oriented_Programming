package week11;

public class Tetris extends Game{

	public Tetris(String title, String version) {
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
		System.out.println("테트리스(Tetris)는 퍼즐 게임으로, 소련의 프로그래머 알렉세이 파지르노프가 처음 디자인하고 프로그래밍 한 게임이다.");
	}
}
