package ru.netology

fun main() {
    val amount = 12165_00
    val minDiscount = 35_00

    val discount = amount * 0.0075
    val result = if (discount <= minDiscount) minDiscount else discount
    println("Ваша комиссия составляет: ${result.toInt() / 100} рублей ${result.toInt() % 100} копеек")
}
