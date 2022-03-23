package screen

//Project 전역에서 화면 이동을 관리하는 싱글톤 객체
object ScreenStack {
    // stack 를 mutableList 로 구현
    private val screenStack = mutableListOf<Screen>()

    fun push(screen: Screen) {
        screenStack.add(screen)
    }

    fun pop() {
        screenStack.removeLastOrNull()
    }

    fun peek(): Screen? {
        return screenStack.lastOrNull()
    }

}

// 모든 화면을 Screen의 Subclass 로 선언해줌 ( 클래스 파일에서 : Screen() 으로 처리)
sealed class Screen