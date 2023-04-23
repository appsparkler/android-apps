package com.example.apps.data

data class DeveloperInfo(
    val name: String,
    val label: String,
    val punchline: String,
    val email: String,
    val mobileNumber: String,
    val socialMediaHandle: String
)

object devInfo {
    val data = DeveloperInfo(
        name = "Aakash Shah",
        label = "android",
        email = "appsparkler@gmail.com",
        mobileNumber = "+91 733 8080 855",
        punchline = "Android Developer Extraordinaire",
        socialMediaHandle = "@appsparkler"
    )
}
