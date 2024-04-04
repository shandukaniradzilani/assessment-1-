package com.example.thehistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val ageInput = findViewById<EditText>(R.id.age_input)
        val submitButton = findViewById<Button>(R.id.submit_button)
        val clearButton = findViewById<Button>(R.id.clear_button)
        val resultss = findViewById<TextView>(R.id.resultss)

        submitButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()
            if (age != null && age <=10) {
                submitButton.text = " please enter a valid age"}

            if (age != null && age ==20){
                resultss.text = "XXXtentation was shot at the age of 20 in Broward county"}

            if (age != null && age ==25){
                resultss.text = "The rapper Tupac shakur passed on at the age of 25 due to being shot in las vegas"
            }


            if (age !=null && age ==95){
                resultss.text ="Nelson Mandela, the first black president to be elected in south africa and passed away at the age of 95"
            }

            if (age != null && age ==26){
                resultss.text ="Melcome James McCormick AKA Mac Miller passed at the age of 26 due to a drug overdose"
            }

            if (age != null && age ==30){
                resultss.text= "Sylvia Plath, an American poet and novelist, best known for her novel The Bell Jar and her poetry collections The Colossus and Ariel. she committed suicide at the age of 30."
            }

            if (age != null && age ==17){
                resultss.text= "Lady Jane Grey, also known as the “Nine-Day Queen,”, ruled England and Ireland from July 10 to July 19, 1553.her life was cut short when she was executed at the age of 17"
            }

            if (age != null && age ==19){
                resultss.text= "Joan of Arc, a French heroine and military leader during the Hundred Year's War. Captured by the English, she was burned at the stake at the age of 19"
            }

            if (age != null && age ==99){
                resultss.text= "Charlie Munger, an American businessman, investor, Charlie Munger played a crucial role as the vice chairman of Berkshire Hathaway and was well known for his investments. He passed away at the age of 99"
            }

            if (age != null && age >=100){
                submitButton.text ="please enter a valid age"
            }



        }



        clearButton.setOnClickListener {
            ageInput.text.clear()
            Toast.makeText(this, "Age input cleared", Toast.LENGTH_SHORT).show()
        }

    }
}