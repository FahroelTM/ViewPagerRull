package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_myfirend.*

class MyFriend_Fragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Jupri Sulistio", "jupri123@gmail.com", "Laki-Laki", "083894940897")
        )
        listTeman.add(
            MyFriend("Spderman","spiderman@yahoo.com","Waria","00000010")
        )
        listTeman.add(
            MyFriend("Markocop","markocop@stimata.ac.id","Laki-Laki","08382727819")
        )
        listTeman.add(
            MyFriend("Aldous", "aldous@gmail.com", "Laki-Laki","08389292893")
        )
        listTeman.add(
            MyFriend("Kadita","kadita@yahoo.com", "Perempuan", "0876544331")
        )
        listTeman.add(
            MyFriend("Miya", "miyapascol@gmail.com", "Perempuan", "0987654321")
        )
        listTeman.add(
            MyFriend("Valentina","vale@gmail.com","Perempuan", "09878876542")
        )
    }
    private fun tampilTeman(){
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_myfirend, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun  initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}