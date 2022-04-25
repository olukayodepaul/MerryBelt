package com.mobile.merrybelt.datasource


import com.mobile.merrybelt.dao.IsNetworkMSG
import com.mobile.merrybelt.dao.IsNetworkMSGCallBack
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST


interface RetrofitServices {

  @POST("/resd/network-mgt")
    suspend fun account(
      @Header("terminalId") terminalId: String,
      //@Header("Authorization") auth: String,
      @Body data: IsNetworkMSG
  ): IsNetworkMSGCallBack

    //passing the data. this is for specific endpoint
    //account("terminalId", "Bearer "+token, bodyData);

}