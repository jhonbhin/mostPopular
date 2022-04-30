package com.example.mostpopular

import com.google.gson.annotations.SerializedName

data class Respuesta(@SerializedName("results") val results:List<Resultado>)
