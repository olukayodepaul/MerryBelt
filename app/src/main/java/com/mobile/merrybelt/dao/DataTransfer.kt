package com.mobile.merrybelt.dao

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class IsNetworkMSG(
    @SerializedName("clat")
    @Expose
    var clat: String? = null,
)

data class IsNetworkMSGCallBack(
    @SerializedName("clat")
    @Expose
    var clat: String? = null,
)


