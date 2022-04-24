package com.mobile.merrybelt.ui.users.fragment.repository

import com.mobile.merrybelt.dao.IsNetworkMSG
import com.mobile.merrybelt.dao.IsNetworkMSGCallBack
import com.mobile.merrybelt.datasource.RetrofitServices

class UsersRepoImpl(
    private val retrofitClient: RetrofitServices
): UsersRepo {

    override suspend fun getANetworkMsgDetails(account: IsNetworkMSG): IsNetworkMSGCallBack {
        return retrofitClient.account(account)
    }

}