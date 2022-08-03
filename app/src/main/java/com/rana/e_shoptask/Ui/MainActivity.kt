package com.rana.e_shoptask.Ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.rana.e_shoptask.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
     private val viewModel:MainViewModel by viewModel()
    //TODO
    //supposed to be lazy T

    private val adapter = ProductAdapter (::onItemClicked)

    private fun onItemClicked(product: Product) {
        // Action to be done onclick of the item



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        viewModel.stateLiveData.observe(viewLifecycleOwner, { state ->
            renderState(state)
        })
    }

    private fun initViews() {
        binding.jobsRv.adapter = adapter
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

