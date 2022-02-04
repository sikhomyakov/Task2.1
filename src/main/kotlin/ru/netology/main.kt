package ru.netology


fun main() {
    val amount = 6500
    val minDiscount = 35
    val pennies = 100

    val fullAmount = amount * pennies
    val fullMinDiscount = minDiscount * pennies
    val discount = fullAmount * 0.0075
    val fullDiscount = if (discount <= fullMinDiscount) fullMinDiscount  else discount
    println("Ваша комиссия составляет: ${fullDiscount.toInt() / 100} рублей ${fullDiscount.toInt() % 100} копеек")
}
