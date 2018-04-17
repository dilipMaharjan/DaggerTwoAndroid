package android.daggertwo.com.data.models


/**
 * Created by Dilip Maharjan on 04/17/2018
 */
data class User(var username: String, var password: String) {
    fun username(): String {
        return "$username"
    }
}