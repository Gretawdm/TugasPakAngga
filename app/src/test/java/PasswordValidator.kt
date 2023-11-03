//class PasswordValidator digunakan untuk validasi panjang password.
class PasswordValidator {

    //Method yang berfungsi untuk memeriksa apakah panjang password memenuhi syarat.
    //Syarat dari panjang password adalah lebih dari sama dengan 6.
    fun isPasswordLengthValid(password: String): Boolean {
        return password.length >= 6
    }
    // Fungsi untuk memeriksa apakah password mengandung huruf besar.
    fun containsUpperCase(password: String): Boolean {
        return password.any { it.isUpperCase() }
    }

    // Fungsi untuk memeriksa apakah password mengandung huruf kecil.
    fun containsLowerCase(password: String): Boolean {
        return password.any { it.isLowerCase() }
    }

    // Fungsi untuk memeriksa apakah password mengandung karakter khusus.
    fun containsSpecialChar(password: String): Boolean {
        val specialChars = "!@#\$%^&*()-_+=<>?/[]{}|"
        return password.any { specialChars.contains(it) }
    }

    // Fungsi untuk memeriksa apakah password mengandung angka.
    fun containsNumber(password: String): Boolean {
        return password.any { it.isDigit() }
    }

    // Fungsi untuk memeriksa apakah password kuat sesuai kriteria.
    fun isPasswordStrong(password: String): Boolean {
        return isPasswordLengthValid(password) &&
                containsUpperCase(password) &&
                containsLowerCase(password) &&
                containsSpecialChar(password) &&
                containsNumber(password)
    }
}
