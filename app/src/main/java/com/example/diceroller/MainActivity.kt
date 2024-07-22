package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var resultText:TextView
    lateinit var diceImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        resultText=findViewById(R.id.resultText)
        diceImage=findViewById(R.id.diceImage)

        val rollButton:Button=findViewById(R.id.rollBtn)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice()  {

        val randomInteger= java.util.Random().nextInt(6)+1
        resultText.text=randomInteger.toString()
        when(randomInteger){
            1->diceImage.setImageResource(R.drawable.dice_1)
            2->diceImage.setImageResource(R.drawable.dice_2)
            3->diceImage.setImageResource(R.drawable.dice_3)
            4->diceImage.setImageResource(R.drawable.dice_4)
            5->diceImage.setImageResource(R.drawable.dice_5)
            6->diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}