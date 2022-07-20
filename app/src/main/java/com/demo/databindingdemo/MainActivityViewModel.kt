package com.demo.databindingdemo

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityViewModel : ViewModel(){
    var recyclerListData: MutableLiveData<RecyclerList> = MutableLiveData()
    var recyclerViewAdapter : RecyclerViewAdapter = RecyclerViewAdapter()

    fun getAdapter():  RecyclerViewAdapter{
        return recyclerViewAdapter
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setAdapterData(data: ArrayList<RecyclerData>) {
        recyclerViewAdapter.setDataList(data)
        recyclerViewAdapter.notifyDataSetChanged()
    }

    fun getRecyclerListDataObserver(): MutableLiveData<RecyclerList> {
        return recyclerListData
    }

    fun makeAPICall(input : String) {
        val retroInstance = RetroInstance.getRetroInstance().create(RetroService::class.java)
        val call = retroInstance.getDataFromAPI(input)
        call.enqueue(object : Callback<RecyclerList>{
            override fun onFailure(call: Call<RecyclerList>, t: Throwable) {
                recyclerListData.postValue(null)
            }

            override fun onResponse(call: Call<RecyclerList>, response: Response<RecyclerList>) {
                if(response.isSuccessful){
                    recyclerListData.postValue(response.body())
                } else {
                    recyclerListData.postValue(null)
                }
            }
        })
    }

}