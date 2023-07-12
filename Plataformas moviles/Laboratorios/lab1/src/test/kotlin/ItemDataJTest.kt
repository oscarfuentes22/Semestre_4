import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class ItemDataJTest {

    @Test
    fun `Given a list, When it has multiple elements, Then result type and info should be correct`() {
        val result = listOf(
            ItemDataJ(10),
            ItemDataJ("Enero"),
            ItemDataJ(null),
            ItemDataJ(true)
        )

        assertNotNull(result)
        assertTrue(
            result[0].type == "entero"
                    && result[0].info == "M10"
        )

        assertTrue(
            result[1].type == "cadena"
                    && result[1].info == "L5"
        )
        assertTrue(
            result[2].type == null
                    && result[2].info == null
        )

        assertTrue(
            result[3].type == "booleano"
                    && result[3].info == "Verdadero"
        )
    }
}