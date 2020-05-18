package br.com.silverio.kotlincourse03_thdpjt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
        "Que o vento leve o necessário e me traga o suficiente.",
        "Algumas vezes coisas ruins acontecem em nossas vidas para nos colocar na direção das melhores coisas que poderíamos viver.",
        "Ser feliz não é viver apenas momentos de alegria. É ter coragem de enfrentar os momentos de tristeza e sabedoria para transformar os problemas em aprendizado.",
        "Se a caminhada está difícil, é porque você está no caminho certo.",
        "Ame seus pais, sua vida e seus amigos. Seus pais, porque são únicos. Sua vida, porque é curta demais. Seus amigos, porque são raros."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textoFrase) as TextView

    }

    fun gerarFrase(view: View){
        val totalItensArray = frases.size
        val numeroAleatorio = Random().nextInt( totalItensArray )

        texto.setText(frases[numeroAleatorio])

    }


}
