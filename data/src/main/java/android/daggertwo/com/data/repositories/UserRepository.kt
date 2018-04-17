package android.daggertwo.com.data.repositories

import android.daggertwo.com.data.models.User
import android.daggertwo.com.data.models.UserInterface


/**
 * Created by Dilip Maharjan on 04/17/2018
 */
class UserRepository:UserInterface {
    override fun create(user: User): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun read(): List<User> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun read(id: Int): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}