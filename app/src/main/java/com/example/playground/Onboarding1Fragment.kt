package com.example.playground

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.playground.databinding.LoginFragmentBinding
import com.example.playground.databinding.Onboarding1FragmentBinding

class Onboarding1Fragment : Fragment() {

    companion object {
        fun newInstance() = Onboarding1Fragment()
    }

    private val binding by viewBinding(Onboarding1FragmentBinding::bind)

    private lateinit var viewModel: Onboarding1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.onboarding1_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Onboarding1ViewModel::class.java)
        // TODO: Use the ViewModel
        binding.loginButton.setOnClickListener {
            view?.findNavController()?.navigate(Onboarding1FragmentDirections.actionOnboarding1FragmentToFinishFragment())
        }
    }

}