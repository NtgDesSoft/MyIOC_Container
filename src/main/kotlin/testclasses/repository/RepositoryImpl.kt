package testclasses.repository

import testclasses.GuidStore
import testclasses.network.UuidApiService

class RepositoryImpl(val uuidApiService: UuidApiService, val guidStore: GuidStore) : Repository {

    override fun printUuidUsingUuidApiService() {
        println(uuidApiService.getUuid())
    }

    override fun printUuidUsingGuidStore() {
        println(guidStore.getUuid())
    }
}