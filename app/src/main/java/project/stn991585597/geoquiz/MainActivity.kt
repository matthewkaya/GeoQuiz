package project.stn991585597.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view: View ->

            val minitost = Toast.makeText(
                        this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT)
            minitost.setText("Correct!")
            minitost.setGravity(Gravity.TOP,0,0)
            minitost.show()


        }
        falseButton.setOnClickListener { view: View ->
            val minitost = Toast.makeText(
                this,
                R.string.correct_toast,
                Toast.LENGTH_SHORT)
            minitost.setText("Incorrect!")
            minitost.setGravity(Gravity.TOP,0,0)
            minitost.show()
        }
    }
}