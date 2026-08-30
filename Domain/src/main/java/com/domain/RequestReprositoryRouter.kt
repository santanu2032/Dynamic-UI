package com.domain

interface RequestReprositoryRouter {
    suspend fun processRequest(): String
}