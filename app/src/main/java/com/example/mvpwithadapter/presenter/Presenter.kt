package com.example.mvpwithadapter.presenter

import android.util.Log
import com.example.mvpwithadapter.PresenterInterface
import com.example.mvpwithadapter.ViewInterface
import com.example.mvpwithadapter.model.NumberGenerator

class Presenter(_view:ViewInterface):PresenterInterface {

    var view:ViewInterface = _view
    var model = NumberGenerator()

    override fun getNumbers() {
        var num = model.getNumbers()
        Log.d("num1",num.toString())
        view.displayNum(num)

    }
}