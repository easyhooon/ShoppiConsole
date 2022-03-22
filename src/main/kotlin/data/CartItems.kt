package data

//프로젝트 전역에서 상품 데이터를 저장하는 클래스, 항상 같은 값을 유지(싱글턴)
object CartItems {
    //read-only
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products: Map<Product, Int> = mutableProducts

    fun addProduct(product: Product) {
        //Map 의 key 조회는 nullable (value가 없을 수 있음)
        mutableProducts[product]?.let {
            mutableProducts[product] = it + 1
        } ?: kotlin.run {
            mutableProducts[product] = 1
        }
    }
}