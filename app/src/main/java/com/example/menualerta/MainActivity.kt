package com.example.menualerta

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun chamaAlerta () {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("Caixa de Opcoes")
        builder.setMessage("Escolha uma das opcoes")
        builder.setPositiveButton("SIM", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Clicou em SIM", Toast.LENGTH_LONG).show()
        })
        builder.setNegativeButton("NAO", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Clicou em NAO", Toast.LENGTH_LONG).show()
        })

        var caixa: AlertDialog? = null
        caixa = builder.create()
        caixa?.show()
    }

    override fun onOptionsItemSelected (item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.add -> {
                println("ADICIONAR CLICADO")
                chamaAlerta()
                true
            }

            R.id.del -> {
                println("ADICIONAR CLICADO")
                chamaAlerta()
                true
            }

            R.id.up -> {
                println("ADICIONAR CLICADO")
                chamaAlerta()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}