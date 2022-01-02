package com.example.portfolian.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class Response (val response: String)

// 2 프로젝트 모두 보기
data class ReadProjectResponse(
    @SerializedName("code")
    var code: Int,

    @SerializedName("articleList")
    var articleList: ArrayList<Project>
)
@Parcelize
data class Project(
    @SerializedName("projectId")
    var projectId: String,

    @SerializedName("title")
    var title: String,

    @SerializedName("stackList")
    var stackList: List<String>,

    @SerializedName("description")
    var description: String,

    @SerializedName("capacity")
    var capacity: Int,

    @SerializedName("view")
    var view: Int,

    @SerializedName("bookMark")
    var bookMark: Boolean,

    @SerializedName("status")
    var status: Int,

    @SerializedName("leader")
    var leader: Leader
) : Parcelable

@Parcelize
data class Leader(
    var userId: String,
    var photo: String
) : Parcelable
//------------------------------------

// 3 프로젝트 모집글 보기
@Parcelize
data class DetailProjectResponse (
    @SerializedName("code")
    var code: Int,
    @SerializedName("projectId")
    var projectId: String,
    @SerializedName("title")
    var title: String,
    @SerializedName("stackList")
    var stackList: List<String>,
    @SerializedName("contents")
    var contents: DetailContent,
    @SerializedName("capacity")
    var capacity: Int,
    @SerializedName("view")
    var view: Int,
    @SerializedName("bookMark")
    var bookMark: Boolean,
    @SerializedName("status")
    var status: Int,
    @SerializedName("leader")
    var leader: LeaderContent
): Parcelable

@Parcelize
data class DetailContent(
    //주제설명
    @SerializedName("subjectDescription")
    var subjectDescription: String,
    //프로젝트 기간
    @SerializedName("projectTime")
    var projectTime: String,
    //모집조건
    @SerializedName("recruitmentCondition")
    var recruitmentCondition: String,
    //진행방식
    @SerializedName("progress")
    var progress: String,
    //프로젝트 상세
    @SerializedName("description")
    var description: String
) : Parcelable

@Parcelize
data class LeaderContent(
    @SerializedName("userId")
    var userId: String,
    @SerializedName("nickName")
    var nickName: String,
    @SerializedName("description")
    var description: String,
    @SerializedName("stack")
    var stack: String,
    @SerializedName("photo")
    var photo: String
) : Parcelable
//------------------------------------

// 29 모집글 생성
data class WriteProjectResponse(
    @SerializedName("code")
    var code: Int,

    @SerializedName("message")
    var message: String,

    @SerializedName("newProjectID")
    var newProjectID: String
)
//------------------------------------

// 36 카카오 토큰 보내줄 때
data class OAuthResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("isNew")
    val isNew: Boolean,
    @SerializedName("refreshToken")
    val refreshToken: String,
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("userId")
    val userId: String
)
//------------------------------------

// 37 첫 로그인 시 닉네임 설정
class NickNameResponse (
    @SerializedName("code")
    val code: Int,
    @SerializedName("message")
    val message: String
)
//------------------------------------

// 38 accessToken 갱신
data class TokenResponse (
    @SerializedName("code")
    val code: Int,
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("message")
    val message: String
)
//------------------------------------