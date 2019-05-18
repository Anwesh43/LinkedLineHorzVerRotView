package com.anwesh.uiprojects.linkedlinehorzverrotview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.linehorzverrotview.LineHorzVerRotView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LineHorzVerRotView.create(this)
    }
}
