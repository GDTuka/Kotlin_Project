package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),AdapterCallBack {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter = Adapter(this)

        recycler_view.adapter = adapter
        var someTxtFromEditTxt = "1234"
        val blackWidow = Data("Чёрная вдова","Фильм от марвел","2",someTxtFromEditTxt)
        val deadPool = Data("Дэд пул","Фильм о мутанте")

        // сделать так чтобы выводилось ещё 2 фильмов
        // в плашке item должно отображаться название, рэйтинг от 1 до 10, и идёт ли показ в кино
        //

        adapter.items = listOf(blackWidow,deadPool)

    }

    override fun onClick(data:Data){
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("data",data)
        startActivity(intent)
    }

}