package com.example.aufgabe3.model

import java.time.LocalDate

data class BookingEntry(val name: String, val arrivalDate: LocalDate? = null, val departureDate: LocalDate? = null, val isCompleted: Boolean)
