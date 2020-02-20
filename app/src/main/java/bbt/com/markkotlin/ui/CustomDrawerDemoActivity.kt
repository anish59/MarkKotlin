package bbt.com.markkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import bbt.com.markkotlin.R
import kotlinx.android.synthetic.main.activity_custom_drawer_demo.*
import kotlinx.android.synthetic.main.main_drawer_screen.*

class CustomDrawerDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_drawer_demo)

        btnOpenCloseDrawer.setOnClickListener {
            if (drawer_layout.isDrawerOpen(Gravity.RIGHT)) {
                drawer_layout.closeDrawer(Gravity.RIGHT)
            } else {
                drawer_layout.openDrawer(Gravity.RIGHT)
            }
        }
    }
}
