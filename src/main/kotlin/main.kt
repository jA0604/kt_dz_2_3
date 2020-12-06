fun main() {
    val previousAmount = 12_000
    val isMusicLover = true

    val discountMin = 100
    val discountPercent = 0.05
    val discountStart = 1_000
    val discountStartPercent = 10_000
    val discountMusicLover = 0.01

    var currentAmount = 3_020.0

    if (previousAmount > discountStart && previousAmount <= discountStartPercent) currentAmount -= discountMin
    else if (previousAmount > discountStartPercent) currentAmount -= currentAmount * discountPercent

    if (isMusicLover) currentAmount -= currentAmount * discountMusicLover

    println("Total price = " + currentAmount)
}