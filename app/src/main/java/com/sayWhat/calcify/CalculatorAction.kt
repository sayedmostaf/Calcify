package com.sayWhat.calcify

sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    data object Clear: CalculatorAction()
    data object Delete: CalculatorAction()
    data object Calculate: CalculatorAction()
    data object Decimal: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}