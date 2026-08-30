package com.domain

class RequestRepository: RequestReprositoryRouter {
  override  suspend fun processRequest(): String{

        return "\n Access Granted"
    }
}