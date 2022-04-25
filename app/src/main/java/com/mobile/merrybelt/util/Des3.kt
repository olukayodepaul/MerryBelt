package com.mobile.merrybelt.util

import android.util.Base64
import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.DESedeKeySpec

class Des3 {

    val DES_FLAG = "DESede"
    val ENCODE_MODE = Cipher.ENCRYPT_MODE
    val DECODE_MODE = Cipher.DECRYPT_MODE
    val PASSWORD = "6C4E60E55552386C759569836DC0F83869836DC0F838C0F7"

    private fun desEncypt(mode: Int, password: String, content: ByteArray): ByteArray {
        val cipher = Cipher.getInstance(DES_FLAG)
        val factory = SecretKeyFactory.getInstance(DES_FLAG)
        val spec = DESedeKeySpec(password.toByteArray())
        val key = factory.generateSecret(spec)
        cipher.init(mode, key, SecureRandom())
        return cipher.doFinal()
    }

    fun enCode(password: String, message: String): String {
        val bytes = message.toByteArray()
        val desEncypt = desEncypt(ENCODE_MODE, password, bytes)
        val encode = Base64.encode(desEncypt, Base64.DEFAULT)
        return String(encode)
    }

    fun deCode(password: String,message: String):String{
        val bytes = message.toByteArray()
        val desEncypt = desEncypt(DECODE_MODE, password, bytes)
        val decode = Base64.decode(bytes, Base64.DEFAULT)
        return String(decode)
    }



}