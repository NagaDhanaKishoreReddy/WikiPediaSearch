package com.crp.wikisearcher.datamodel

data class Response(
    val batchcomplete: Boolean?,
    val `continue`: Continue?,
    val query: Query?
)