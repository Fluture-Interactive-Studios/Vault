package com.flutureis.vault.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.flutureis.vault.R


class VaultActivity : AppCompatActivity() {

    private var _binding: ViewDataBinding? = null

    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.vault_activity)
        _binding?.lifecycleOwner = this
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}