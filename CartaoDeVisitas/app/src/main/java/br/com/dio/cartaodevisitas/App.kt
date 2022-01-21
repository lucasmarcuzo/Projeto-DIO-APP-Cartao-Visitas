package br.com.dio.cartaodevisitas

import android.app.Application
import br.com.dio.cartaodevisitas.data.AppDatabase
import br.com.dio.cartaodevisitas.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}