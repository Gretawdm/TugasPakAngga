import org.junit.Test
import org.junit.Assert.assertEquals

//Class PasswordValidatorTest merupakan kelas unit test yang digunakan untuk menguji.
class PasswordValidatorTest {

    @Test

    //Method yang berfungsi untuk menguji validitas password.
    fun testPasswordLength() {
        val passwordValidator = PasswordValidator()

        // Test jika password hanya terdiri dari angka.
        val isNumericPassword = passwordValidator.isPasswordStrong("123456")
        assertEquals(false, isNumericPassword)

        // Test jika password hanya terdiri dari huruf kecil.
        val isLowerCasePassword = passwordValidator.isPasswordStrong("abcdef")
        assertEquals(false, isLowerCasePassword)

        // Test jika password hanya terdiri dari huruf besar.
        val isUpperCasePassword = passwordValidator.isPasswordStrong("ABCDEF")
        assertEquals(false, isUpperCasePassword)

        // Test jika password hanya terdiri dari karakter khusus.
        val isSpecialCharPassword = passwordValidator.isPasswordStrong("!@#$%^")
        assertEquals(false, isSpecialCharPassword)

        // Test jika password terdiri dari campuran huruf besar, huruf kecil, dan karakter khusus.
        val isStrongPassword = passwordValidator.isPasswordStrong("AbCdEf@1")
        assertEquals(true, isStrongPassword)
    }
}