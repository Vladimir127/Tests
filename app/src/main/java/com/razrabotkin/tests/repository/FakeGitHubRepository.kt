package com.razrabotkin.tests.repository

import com.razrabotkin.tests.model.SearchResponse
import com.razrabotkin.tests.presenter.RepositoryContract
import retrofit2.Response

internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}
