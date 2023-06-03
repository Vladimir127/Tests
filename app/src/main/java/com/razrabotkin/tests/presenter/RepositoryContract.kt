package com.razrabotkin.tests.presenter

import com.razrabotkin.tests.repository.RepositoryCallback

internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}
