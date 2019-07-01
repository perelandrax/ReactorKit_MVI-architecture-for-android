package com.perelandra.reactorkit.aac

import androidx.lifecycle.ViewModel
import com.perelandra.reactorkit.Reactor

abstract class ReactorViewModel<Action, Mutation, State> : Reactor<Action, Mutation, State>, ViewModel() {

  override fun onCleared() {
    super.onCleared()
    clear()
  }
}