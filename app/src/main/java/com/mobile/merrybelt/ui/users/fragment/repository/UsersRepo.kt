package com.mobile.merrybelt.ui.users.fragment.repository

import com.mobile.merrybelt.dao.IsNetworkMSG
import com.mobile.merrybelt.dao.IsNetworkMSGCallBack

interface UsersRepo {
    suspend fun getANetworkMsgDetails(account: IsNetworkMSG): IsNetworkMSGCallBack
}