package com.example.challenge1

fun inputNumber(): Int? {
    print("Masukkan nomor bentuk pilihan: ")
    return readln().toIntOrNull()
}

fun inputRows(): Byte? {
    print("Tentukan ukuran bentuk (baris): ")
    return readln().toByteOrNull()
}

fun inputComponent(): Char {
    print("Tentukan huruf/simbol/angka untuk menyusun bentuk: ")
    return readln()[0]
}

fun inputTryAgain(): Char {
    print("Ketik 'Y' untuk mencoba lagi: ")
    return readln()[0]
}

fun checkChosenNumber (nomorPilihan: Int?){
    if (nomorPilihan !in 1..5 || nomorPilihan == null) println("tolong ya...pilihannya cuma 1 sampai 5 aja 😡\n".uppercase())
}

fun checkRow(jumlahBaris: Byte?){
    if (jumlahBaris == null || jumlahBaris <= 0) println("waduh...mohon masukkan nilai berupa angka positif ya agar bentuk bisa dibuat 😇\n".uppercase())
}

fun showChoices(){
    println(
        """Pilihan Bentuk :
1. [Filled] Segitiga
2. [Filled] Segitiga Terbalik
3. [Filled] Layang-layang
4. Huruf X
5. [Stroke] Segitiga
    """.trimMargin()
    )
}