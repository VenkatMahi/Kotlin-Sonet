package com.example.ngit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.ngit.databinding.FragmentDashboardBinding


class dashboard : Fragment() {

    lateinit var binding:FragmentDashboardBinding

    lateinit var oc:TextView
    lateinit var p:TextView
    lateinit var lu:TextView
    lateinit var abc:TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDashboardBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        oc = binding.oc
        p = binding.p
        lu = binding.lu
        abc = binding.abc

        oc.setOnClickListener(View.OnClickListener {
            var fm = activity?.supportFragmentManager
            var ft = fm?.beginTransaction()
            ft?.replace(R.id.fragmentContainerView,classes())
            ft?.commit()

        })
        p.setOnClickListener(View.OnClickListener {
            var uri = Uri.parse("http://www.ngit.ac.in/placementsrecord.php")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)


        })
        lu.setOnClickListener(View.OnClickListener {
            var uri = Uri.parse("https://www.google.com/maps/place/Neil+Gogte+Institute+of+Technology/@17.3955293,78.6219629,15z/data=!4m5!3m4!1s0x0:0x805544efd4bd55f!8m2!3d17.3955293!4d78.6219629")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        })
        abc.setOnClickListener(View.OnClickListener {
            var uri = Uri.parse("http://www.ngit.ac.in/index.php")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)

        })

    }



}