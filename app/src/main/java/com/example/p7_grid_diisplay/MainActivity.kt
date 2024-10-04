package com.example.p7_grid_diisplay

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var RecyclerOpcionesAdapter : RecyclerOpciones
    private var list = mutableListOf<Opciones>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        list.add(Opciones(R.drawable.baseline_backup_24, "Subiendo archivos"))
        list.add(Opciones(R.drawable.baseline_archive_24, "Bajando archivos"))
        list.add(Opciones(R.drawable.baseline_camera_24, "Camara"))
        list.add(Opciones(R.drawable.baseline_cancel_24, "Funcion no disponible"))
        list.add(Opciones(R.drawable.baseline_bluetooth_24, "Bluetooth encendido"))
        list.add(Opciones(R.drawable.baseline_assistant_navigation_24, "Asistente de navegacion"))
        list.add(Opciones(R.drawable.baseline_brightness_2_24, "No molestar"))
        list.add(Opciones(R.drawable.baseline_brightness_high_24, "Ajustes"))
        list.add(Opciones(R.drawable.baseline_check_circle_outline_24, "Revisado"))
        list.add(Opciones(R.drawable.ic_android_black_24dp, "Modo root"))

        //
        recyclerView = findViewById(R.id.rcv)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        RecyclerOpcionesAdapter = RecyclerOpciones(this, list)

        recyclerView.adapter = RecyclerOpcionesAdapter
    }
}