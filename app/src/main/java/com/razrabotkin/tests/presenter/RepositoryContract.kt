package com.razrabotkin.tests.presenter

import com.razrabotkin.tests.model.SearchResponse
import com.razrabotkin.tests.repository.RepositoryCallback
import io.reactivex.Observable

interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )

    fun searchGithub(
        query: String
    ): Observable<SearchResponse>
}
