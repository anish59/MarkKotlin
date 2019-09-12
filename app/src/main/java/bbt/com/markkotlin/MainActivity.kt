package bbt.com.markkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerListener()

    }

    private fun registerListener() {
        btnDemo.setOnClickListener {
            coRoutineDemo()
        }
    }

    private fun coRoutineDemo() {
        // scope can be of three types IO, Main, Default
        // IO - for internet , database functions
        // Main- for main thread
        // Default - for other computation work

        CoroutineScope(IO).launch {
            getDummyResultFromApi()
        }
    }

    private suspend fun getDummyResultFromApi() {
        delay(2000)
        setText()
    }

    private suspend fun setText() {
        withContext(Main) {
            txt.text = "${txt.text} \n hello"
        }

    }
}
