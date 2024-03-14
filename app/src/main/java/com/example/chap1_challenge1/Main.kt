
import com.example.challenge1.FilledKite
import com.example.challenge1.FilledTriangle
import com.example.challenge1.FilledTriangleUpsideDown
import com.example.challenge1.StrokeTriangle
import com.example.challenge1.X
import com.example.challenge1.checkChosenNumber
import com.example.challenge1.checkRow
import com.example.challenge1.inputComponent
import com.example.challenge1.inputNumber
import com.example.challenge1.inputRows
import com.example.challenge1.inputTryAgain
import com.example.challenge1.isTryAgain
import com.example.challenge1.showChoices

fun main() {
    var chosenNumber: Int?
    var rows: Byte?

    do {
        showChoices()

        do {
            chosenNumber = inputNumber()
            checkChosenNumber(chosenNumber)
        } while (chosenNumber !in 1..5)

        do {
            rows = inputRows()
            checkRow(rows)
        } while (rows == null || rows <= 0)

        val component = inputComponent()

        val chosenShape = when (chosenNumber) {
            1 -> FilledTriangle(component, rows)
            2 -> FilledTriangleUpsideDown(component, rows)
            3 -> FilledKite(component, rows)
            4 -> X(component, rows)
            else -> StrokeTriangle(component, rows)
        }
        chosenShape.create()

        val again = inputTryAgain()
    } while (again.isTryAgain())
}