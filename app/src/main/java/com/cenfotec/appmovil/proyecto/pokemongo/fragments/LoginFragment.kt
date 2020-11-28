package com.cenfotec.appmovil.proyecto.pokemongo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.cenfotec.appmovil.proyecto.pokemongo.R
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            loginButton.setOnClickListener{
                findNavController().navigate(R.id.action_loginFragment_to_recent)
                //LoginFragmentDirections.actionLoginFragmentToRecent().arguments.get()

        }

    }

}
