package screen

import LINE_DIVIDER
import extensions.getNotEmptyString

class ShoppingHome {

    fun start() {
        showWelcomeMessage()
        showCategories()
    }

    private fun showWelcomeMessage() {
        println("안녕하세요, Shoppi 에 오신 것을 환영합니다!")
        println("쇼핑을 계속 하시려면 이름을 입력해주세요 :)")

        val name = readLine().getNotEmptyString()

        //""" 입력 후 enter 치면 바로 해당 코드 생성
        println(
            """
            감사합니다. 반갑습니다. $name 님
            원하시는 카테고리를 입력해주세요.
            $LINE_DIVIDER
        """.trimIndent()
        )
    }

    private fun showCategories() {
        val shoppingCategory = ShoppingCategory()
        shoppingCategory.showCategories()
    }
}