package extensions

//Class 가 아닌 File 로 생성하여 Top-Level 로 확장함수를 사용
fun String?.getNotEmptyString(): String {
    var input = this
    while(input.isNullOrBlank()) {
        println("값을 입력해주세요")
        input = readLine()
    }
    //input 에 공백을 포함한 부분을 제거해서 반환
    return input.trim()
}

fun String?.getNotEmptyInt(): Int {
    var input = this?.trim()
    while(input.isNullOrEmpty() || input.toIntOrNull() == null) {
        println("값을 입력해주세요")
        input = readLine()
    }
    return input.toInt()
}