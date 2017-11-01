package org.mightyfrog.android.scrollbehavioroverlaptopsample

import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.graphics.Palette
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Shigehiro Soejima
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val p = Palette.from(BitmapFactory.decodeResource(resources, R.drawable.pizza)).generate()
        p.dominantSwatch?.apply {
            findViewById<View>(android.R.id.content).setBackgroundColor(rgb)
        }
    }
}
