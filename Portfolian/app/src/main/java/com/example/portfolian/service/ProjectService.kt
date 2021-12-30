package com.example.portfolian.service

import com.example.portfolian.data.DetailProjectResponse
import com.example.portfolian.data.ReadProjectResponse
import com.example.portfolian.data.WriteProjectResponse
import com.example.portfolian.data.WriteProject
import retrofit2.Call
import retrofit2.http.*

interface ProjectService {
    @Headers("content-type: application/json")
    @POST("projects")
    fun writeProject(
        @Body write: WriteProject
    )
    : Call<WriteProjectResponse>

    @GET("projects")
    fun readAllProject(
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
}