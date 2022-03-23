package screen

import extensions.getNotEmptyString

class ShoppingCategory: Screen() {

    /*
    Step 1. 장바구니에 추가한 상품 관리
    Step 2. 사용자 입력값 요청 처리 공통화 (코드의 난잡함을 해결하는 중요한 부분-> 반복되는 부분 확장 함수로 공통화)
    Step 3. 프로젝트 전역에서 참조하는 상수 (구분선과 같은)
     */

    // 함수로 묶고 싶은 만큼 드래그해서 refactor -> function
    // ctrl alt m 하면 함수로 빼낼 수 있음
    fun showCategories() {
        ScreenStack.push(this)
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        for (category in categories) {
            println(category)
        }
        println("=> 장바구니로 이동하시려면 #을 입력해주세요")

        //확장함수를 통해 입력받는 코드 개선
        val selectedCategory = readLine().getNotEmptyString()

        if (selectedCategory == "#") {
            val shoppingCart = ShoppingCart()
            shoppingCart.showCartItems()
        } else {
            if(categories.contains(selectedCategory)) {
                val shoppingProductList = ShoppingProductList(selectedCategory)
                shoppingProductList.showProducts()
            } else {
                showErrorMessage(selectedCategory)
            }
        }
    }

    private fun showErrorMessage(selectedCategory: String?) {
        println("[$selectedCategory] : 존재하지 않는 카테고리 입니다. 다시 입력해주세요.")
        showCategories()
    }
}