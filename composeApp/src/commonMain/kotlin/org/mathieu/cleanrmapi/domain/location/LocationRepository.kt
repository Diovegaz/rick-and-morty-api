package org.mathieu.cleanrmapi.domain.location

import org.mathieu.cleanrmapi.domain.character.models.Character
import org.mathieu.cleanrmapi.domain.location.models.Location

interface LocationRepository {

    suspend fun getLocation(id : Int): Location

    /**
     * Fetches the characters of a specific location.
     *
     * @param locationId The unique identifier of the location.
     * @return Characters that are location.
     */
    suspend fun getCharactersIn(locationId: Int): List<Character>

}