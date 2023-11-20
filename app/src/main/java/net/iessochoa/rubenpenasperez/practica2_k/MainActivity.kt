package net.iessochoa.rubenpenasperez.practica2_k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)  // Asegúrate de reemplazar "tu_layout" con el nombre real de tu archivo de diseño XML
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellidos = findViewById<EditText>(R.id.etApellidos)
        val tvTitulo = findViewById<TextView>(R.id.tvTitulo)
        val btAceptar = findViewById<Button>(R.id.btAceptar)

        btAceptar.setOnClickListener(View.OnClickListener {
            // Obtén el contenido de los campos de texto
            val nombre = etNombre.text.toString().trim()
            val apellidos = etApellidos.text.toString().trim()

            // Verifica que ambos campos tengan contenido
            if (nombre.isNotEmpty() && apellidos.isNotEmpty()) {
                // Actualiza el título con el Nombre y Apellido
                val titulo = "$nombre $apellidos"
                tvTitulo.text = titulo
            } else {
                // Muestra un mensaje en pantalla si algún campo está vacío
                Toast.makeText(this, "Por favor, completa los campos Nombre y Apellidos", Toast.LENGTH_SHORT).show()
            }
        })
    }
}