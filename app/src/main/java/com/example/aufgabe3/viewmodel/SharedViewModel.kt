package com.example.aufgabe3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.aufgabe3.model.BookingEntry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import java.time.LocalDate

class SharedViewModel: ViewModel() {
    private val _bookingsEntries = MutableStateFlow<List<BookingEntry>>(emptyList())
    val bookingsEntries: StateFlow<List<BookingEntry>> = _bookingsEntries

    fun addBookingEntry(bookingEntry: BookingEntry){
        _bookingsEntries.update { currentList -> currentList + bookingEntry }
    }

    fun deleteBookingEntry(bookingEntry: BookingEntry){
        _bookingsEntries.update { currentList -> currentList.filter { it != bookingEntry } }
    }
}