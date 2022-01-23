package com.example.portfolian.service

import com.example.portfolian.data.*
import retrofit2.Call
import retrofit2.http.*

interface ProjectService {
    @Headers("content-type: application/json")
    @POST("projects")
    fun writeProject(
        @Header("Authorization") Authorization: String,
        @Body write: WriteProjectRequest
    )
    : Call<WriteProjectResponse>

    @GET("projects")
    fun readAllProject(
        @Header("Authorization") Authorization: String,
        @Query("stack") stack: List<String>,
        @Query("keyword") keyword: String,
        @Query("sort") sort: String
    )
    : Call<ReadProjectResponse>

    @GET("projects/{projectId}")
    fun readDetailProject(
        @Path("projectId") projectId: String
    )
    : Call<DetailProjectResponse>

    @GET("users/{userId}/bookMark")
    fun readAllBookmark(
    )
    : Call<ReadProjectResponse>

    @Headers("content-type: application/json")
    @POST("users/{userId}/bookMark")
    fun setBookmark(
        @Header ("Authorization") Authorization: String,
        @Path("userId") userId: String,
        @Body set: SetBookmarkRequest
    )
    : Call<SetBookmarkResponse>
}