package com.example.viagem

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Calcular.setOnClickListener {
            val preco_combustivel = 5.85
            val preco_pedagio = 10.50

            val distancia = binding.distancia.text.toString().toDouble()
            val qtd_pedagio = binding.pedagios.text.toString().toDouble()
            val qtd_tempo = binding.tempoGasto.text.toString().toDouble()


            val custo_combustivel = distancia * preco_combustivel
            val preco_total = qtd_pedagio * preco_pedagio + custo_combustivel

            val velocidade_media = distancia / qtd_tempo

            binding.tempoTot.text = "O tempo total foi de: ${qtd_tempo}"
            binding.distanciaUsuario.text = "A distancia é: ${distancia}KM"
            binding.litros.text = "Custo do combustivel: R$${custo_combustivel}"
            binding.precoTotal.text = "O preço total de sua viagem será: ${preco_total}"
            binding.mediaVelocidade.text = String.format("A média de velocidade é: %.2f KM/H", velocidade_media)

        }
        }
    }
