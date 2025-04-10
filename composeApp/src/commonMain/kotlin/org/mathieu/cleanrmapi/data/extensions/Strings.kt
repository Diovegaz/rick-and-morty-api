package org.mathieu.cleanrmapi.data.extensions

fun List<String>.extractIdsFromUrls(): String {
    return this.joinToString(",") { url ->
        url.substringAfterLast("/")
    }
}

fun String.toIdList(): List<Int> =
    split(",").mapNotNull { it.trim().toIntOrNull() }
