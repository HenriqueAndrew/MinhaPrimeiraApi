package br.edu.utfpr.minhaprimeiraapi

import android.app.Application
import br.edu.utfpr.minhaprimeiraapi.database.DatabaseBuilder

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        init()
    }
    /**
     * fun para inicializar nossas depêndencias através do nosso context
     */
    private fun init() {
        DatabaseBuilder.getInstance(this)
    }
}