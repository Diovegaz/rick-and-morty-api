package org.mathieu.cleanrmapi.domain.location.models

/** Classe qui permet de récupérer le nom des locations
 * sans avoir à récupérer tout l'objet location
 */
data class LocationPreview(
    val id: Int,
    val name: String
)