<?php
//deklarasi class
class WordCount{
    //deklarasi method dan parameter(digunakan untuk menghitung kata yang ada dalam kalimat yang akan diuji)
    public function countWords($sentence){
        //explode digunakan untuk membagi kalimat yang diinputkan menjadi array
        //explode juga berfungsi memisahkan kalimat berdasarkan spasi (" "), sehingga menghasilkan array kata-kata
        //method count digunakan untuk menghitung jumlah elemen dalam array kata-kata tersebut. Jumlah ini akan menjadi jumlah kata dalam kalimat.
        return count(explode(" ", $sentence));
        //return untuk mengembalikan hasil dari perhitungan kata
           
        }
    }
?>
