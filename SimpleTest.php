<?php
//deklarasi penggunaan class TestCase dari kerangka kerja pengujian PHPUnit. 
use PHPUnit\Framework\TestCase;

//pernyataan untuk mengimport class WordCount yang akan diuji.
require_once "WordCount.php";

//deklarasikan class SimpleTest yang merupakan class turunan dari TestCase
class SimpleTest extends TestCase
{

    //Methid ini akan dijalankan oleh PHPUnit saat pengujian dilakukan
    public function testCountWords()
    {
        //pembuatan objek $Wc dari class "WordCount" untuk emanggil method yang akan diuji
        $Wc = new WordCount();

        //mendeklarasikan kalimat yang akan diuji
        $TestSentence = "My Name is Greta";

        //Method countWords dalam objek $Wc dipanggil dengan menggunakan kalimat uji sebagai argumen. Hasil dari method tersebut disimpan dalam variabel $WordCount.
        $WordCount = $Wc->countWords($TestSentence);

        //digunakan memabandingkan hasil return dengan nilai yang diharapkan yaitu 4 dari method countWords
        //jika tidak sesuai akan muncul failures
        $this->assertEquals(4, $WordCount);
    }
}
?>
