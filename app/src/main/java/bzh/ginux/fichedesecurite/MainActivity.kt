package bzh.ginux.fichedesecurite

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(Message("fucccccck"));
//        setContentView(R.layout.activity_main)
    }

    @Composable
    fun Message(name : String){
        Text(text = "Hello $name!")
    }
}