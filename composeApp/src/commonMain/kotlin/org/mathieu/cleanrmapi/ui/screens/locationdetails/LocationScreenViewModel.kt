package org.mathieu.cleanrmapi.ui.screens.locationdetails

import org.mathieu.cleanrmapi.domain.character.models.Character
import org.mathieu.cleanrmapi.ui.core.Destination
import org.mathieu.cleanrmapi.ui.core.ViewModel
/*
sealed interface EpisodeDetailsAction {
    data class SelectedCharacter(val character: Character): LocationDetailsAction
}

class LocationDetailsViewModel :
    ViewModel<LocationDetailsState>(LocationDetailsState.Loading) {

    fun init(locationId: Int) {

        fetchData(
            source = { GetLocation(Id = locationId) }
        ) {
            onSuccess { details ->
                updateState {
                    LocationDetailsState.Loaded(
                        name = details.name,
                        residents = details.residents
                    )
                }
            }

            onFailure {
                updateState {
                    LocationDetailsState.Error(message = it.message ?: it.toString())
                }
            }

        }

    }


    fun handleAction(action: LocationDetailsAction) {
        when(action) {
            is LocationDetailsAction.SelectedCharacter -> selectedCharacter(action.character)
        }
    }


    private fun selectedCharacter(character: Character) =
        sendEvent(Destination.CharacterDetails(character.id.toString()))



}

sealed interface LocationDetailsState {
    data object Loading : LocationDetailsState

    data class Error(val message: String) : LocationDetailsState

    data class Loaded(
        val id: Int,
        val name: String,
        val type: String,
        val dimension: String,
        val residents: List<Character>
    ) : LocationDetailsState

}*/