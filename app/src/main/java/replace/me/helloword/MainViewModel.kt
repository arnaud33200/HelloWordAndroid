package replace.me.helloword

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import replace.me.helloword.model.ScreenModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    private val _screenModel = MutableStateFlow(ScreenModel(title = "Hello!"))
    val screenModel: StateFlow<ScreenModel> = _screenModel
}