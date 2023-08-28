package com.example.hard75tracker.ui.home

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hard75tracker.R
import com.example.hard75tracker.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    var btncount=0


    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var mw=binding.wk1
        var mwc=false
        mw.setOnClickListener{
            if(!mwc){

            anim(mw,mwc)
                mwc=true
                btncount++
                if(btncount==6){
                    val handler=Handler(Looper.getMainLooper())
                    handler.postDelayed({
                        btnvis()
                    },200)

                }else{
                    btnunvis()
                }
        }
        else{
            anim(mw,mwc)
            btncount--
            mwc=false
                btnunvis()

            }}
        var wk2=binding.wk2
        var wk2c=false
        wk2.setOnClickListener{
            if(!wk2c){
                anim(wk2,wk2c)
                wk2c=true
                btncount++
                if(btncount==6){
                    val handler=Handler(Looper.getMainLooper())
                    handler.postDelayed({
                        btnvis()
                    },200)

                }else{
                    btnunvis()
                }
            }
            else{
                anim(wk2,wk2c)
                btncount--
                wk2c=false
                btnunvis()

            }}
        var jk=binding.junk
        var jkc=false
        jk.setOnClickListener{
            if(!jkc){
                anim(jk,jkc)
                jkc=true
                btncount++
                if(btncount==6){
                    val handler=Handler(Looper.getMainLooper())
                    handler.postDelayed({
                        btnvis()
                    },200)

                }else{
                    btnunvis()
                }
            }
            else{
                anim(jk,jkc)
                jkc=false
                btncount--
                btnunvis()

            }}
        var water=binding.water
        var wtrc=false
        water.setOnClickListener{
            if(wtrc==false){
                anim(water,wtrc)
                btncount++
                wtrc=true
                if(btncount==6){
                    val handler=Handler(Looper.getMainLooper())
                    handler.postDelayed({
                        btnvis()
                    },200)

                }else{
                    btnunvis()
                }
            }
            else{
                anim(water,wtrc)
                wtrc=false

                btncount--
                btnunvis()

            }}
        var progress=binding.pic
        var picc=false
        progress.setOnClickListener{
            if(picc==false){
                anim(progress,picc)
                btncount++
                picc=true
                if(btncount==6){
                    val handler=Handler(Looper.getMainLooper())
                    handler.postDelayed({
                        btnvis()
                    },200)

                }else{
                    btnunvis()
                }
            }
            else{
                anim(progress,picc)
                btncount--
                picc=false
                btnunvis()

            }}
        var book=binding.book
        var bookc=false
        book.setOnClickListener{
            if(bookc==false){
                anim(book,bookc)
                btncount++
                bookc=true
                if(btncount==6){
                    val handler=Handler(Looper.getMainLooper())
                    handler.postDelayed({
                        btnvis()
                    },200)

                }else{
                    btnunvis()
                }
            }
            else{
                book.setBackgroundResource(R.drawable.white_button)
                btncount--
                bookc=false
                btnunvis()
            }}



    }
    fun anim(btn:Button,bl:Boolean){
        val animn=AnimationUtils.loadAnimation(context,R.anim.fade)
        animn.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                if(!bl){
                    btn.setBackgroundResource(R.drawable.shape_button_rounded)
                }
                else{
                    btn.setBackgroundResource(R.drawable.white_button)
                }
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
        btn.startAnimation(animn)
    }
    fun btnvis(){
        binding.confirmButton.visibility=View.VISIBLE
    }
    fun btnunvis(){
        binding.confirmButton.visibility=View.GONE
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}