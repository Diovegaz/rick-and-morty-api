package org.mathieu.cleanrmapi.data.local.objects

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.mathieu.cleanrmapi.data.extensions.extractIdsFromUrls
import org.mathieu.cleanrmapi.data.validators.annotations.MustBeCommaSeparatedIds
import org.mathieu.cleanrmapi.data.local.RMDatabase
import org.mathieu.cleanrmapi.data.remote.responses.LocationResponse
import org.mathieu.cleanrmapi.domain.location.models.LocationPreview
import org.mathieu.cleanrmapi.domain.location.models.Location


/** Represents a location entity stored in the SQLite database. This object provides fields
 * necessary to represent all the attributes of a location from the data source.
 * The object is specifically tailored for SQLite storage using Realm.
 *
 *
 */
@Entity(tableName = RMDatabase.LOCATION_TABLE)
class LocationObject(
    @PrimaryKey
    val id: Int,
    val name: String,
    val type: String,
    val dimension: String,
    @MustBeCommaSeparatedIds
    val residentsIds: String,
    val created: String
)

/** Represents detailed information
 * about a location, received from an API call
 */
internal fun LocationResponse.toDBObject() = LocationObject(
    id = id,
    name = name,
    type = type,
    dimension = dimension,
    residentsIds = residents.extractIdsFromUrls(),
    created = created

)

/**
 *
 */
internal fun LocationObject.toModel() = Location(
    id = id,
    name = name,
    type = type,
    dimension = dimension,
    residents = emptyList()
)

/**
 *
 */
internal fun LocationObject.toPreview() = LocationPreview(
    id = id,
    name = name,
)