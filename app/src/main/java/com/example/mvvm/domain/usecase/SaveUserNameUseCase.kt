package com.example.mvvm.domain.usecase

import com.example.mvvm.domain.models.SaveUserNameParam
import com.example.mvvm.domain.repository.UserRepository


class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param : SaveUserNameParam) : Boolean{
        val oldUserName = userRepository.getName()

        if(oldUserName.firstName == param.name){
            return true
        }
       val result: Boolean = userRepository.saveName(saveparam = param)
        return result
    }


}