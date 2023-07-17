class ItemData (private val originalValue: Any?) {

    fun getType(): String? {
        return when (originalValue) {
            is String -> "cadena"
            is Int -> "entero"
            is Boolean -> "booleano"
            else -> null
        }
    }

    fun getInfo(): String? {
        return when (getType()) {
            "cadena" -> "L${(originalValue as String).length}"
            "entero" -> {
                val numero = originalValue as Int
                if (numero % 10 == 0) {
                    "M10"
                } else if (numero % 5 == 0) {
                    "M5"
                } else if (numero % 2 == 0) {
                    "M2"
                } else {
                    null
                }
            }
            "booleano" -> if (originalValue as Boolean) "Verdadero" else "Falso"
            else -> null
        }
    }
}