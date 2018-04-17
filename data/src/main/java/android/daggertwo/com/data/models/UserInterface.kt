package android.daggertwo.com.data.models


/**
 * Created by Dilip Maharjan on 04/17/2018
 */
interface UserInterface {
    fun create(user: User): Int
    fun read(): List<User>
    fun read(id: Int): User
}