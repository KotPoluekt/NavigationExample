package com.tomato.navigationexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnToast).setOnClickListener { view ->
//            Toast.makeText(applicationContext, "Toasty", Toast.LENGTH_SHORT).apply {
//                //setGravity(Gravity.TOP or Gravity.START, view.x.toInt(), view.y.toInt())
//                //setMargin(0f, 0.15f)
//                show()
//            }

            Toast.makeText(applicationContext, "Toasty", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnSnackBar).setOnClickListener { view ->
            Snackbar.make(view, "Hello snackbar", Snackbar.LENGTH_SHORT)
                .setAnimationMode(Snackbar.ANIMATION_MODE_SLIDE)
                .setAnchorView(view)
                .show()
        }

        findViewById<Button>(R.id.btnSnackBarBottom).setOnClickListener { view ->
            Snackbar.make(view, "Hello snackbar bottom", Snackbar.LENGTH_SHORT)
                .setAnimationMode(Snackbar.ANIMATION_MODE_FADE)
                .setAction("Action") {}
                .show()
        }

        findViewById<Button>(R.id.btnBottomNavigate).setOnClickListener { view ->
            startActivity(Intent(this, NavigationActivity::class.java))
        }



    }
}