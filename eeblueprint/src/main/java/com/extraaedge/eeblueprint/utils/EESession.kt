package com.extraaedge.eeblueprint.utils

data class EESession(
    var token: String,
    var refreshToken: String,
    var expiresIn: Long,
    var createdOnMillis: Long,
    var clientId: String
)