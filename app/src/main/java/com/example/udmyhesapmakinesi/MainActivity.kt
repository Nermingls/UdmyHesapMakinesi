package com.example.udmyhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.udmyhesapmakinesi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var sayi1 : Double? = null
    var sayi2 : Double? = null
    var result : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }



    fun plus(view: View){
        sayi1 = binding.sayi1.text.toString().toDoubleOrNull()
        sayi2 = binding.sayi2.text.toString().toDoubleOrNull()

        if (sayi1 !=null && sayi2 !=null){
            result = sayi1!! + sayi2!!
           binding.sonucText.text = result.toString()
        }else{
            binding.sonucText.text = "Lutfen deger giriniz"
        }

    }
    fun minus(view: View){
        sayi1 = binding.sayi1.text.toString().toDoubleOrNull()
        sayi2 = binding.sayi2.text.toString().toDoubleOrNull()

        if (sayi1 !=null && sayi2 !=null){
            result = sayi1!! - sayi2!!
            binding.sonucText.text = result.toString()
        }else{
            binding.sonucText.text = "Lutfen deger giriniz"
        }
    }
    fun multipliedBy(view: View){
        sayi1 = binding.sayi1.text.toString().toDoubleOrNull()
        sayi2 = binding.sayi2.text.toString().toDoubleOrNull()

        if (sayi1 !=null && sayi2 !=null){
            result = sayi1!! * sayi2!!
            binding.sonucText.text = result.toString()
        }else{
            binding.sonucText.text = "Lutfen deger giriniz"
        }
    }
    fun divide(view: View){
        sayi1 = binding.sayi1.text.toString().toDoubleOrNull()
        sayi2 = binding.sayi2.text.toString().toDoubleOrNull()

        if (sayi1 !=null && sayi2 !=null){
            result = sayi1!! / sayi2!!
            binding.sonucText.text = result .toString()
        }else{
            binding.sonucText.text = "Lutfen deger giriniz"
        }
    }
}