package lucas.labendzs.flagquiz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val flags = listOf(
            R.drawable.albania,
            R.drawable.argelia,
            R.drawable.cabo_verde,
            R.drawable.croacia,
            R.drawable.cuba,
            R.drawable.dinamarca,
            R.drawable.gra_bretania,
            R.drawable.holanda,
            R.drawable.indonesia,
            R.drawable.panama,
            R.drawable.portugal,
            R.drawable.qatar,
            R.drawable.srilanka,
            R.drawable.suecia,
            R.drawable.usa

        )
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val imgFlag: ImageView = findViewById(R.id.imgFlag)
        val randomFlag = flags.random()
        imgFlag.setImageResource(randomFlag)
    }
}