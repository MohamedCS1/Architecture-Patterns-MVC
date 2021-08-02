package com.example.mvc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.mvc.R
import com.example.mvc.pojo.BooksModel

class MainActivity : AppCompatActivity(),View.OnClickListener {

    var Tv_Title:TextView? = null
    var Tv_Date_Publication:TextView? = null
    var Tv_Print_Lenght:TextView? = null
    var Tv_Language:TextView? = null
    var bu_Display_Data:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         Tv_Title =  findViewById<TextView>(R.id.Tv_Title)
         Tv_Date_Publication = findViewById<TextView>(R.id.Tv_Date_Publication)
         Tv_Print_Lenght = findViewById<TextView>(R.id.Tv_Print_Lenght)
         Tv_Language = findViewById<TextView>(R.id.Tv_Language)
         bu_Display_Data = findViewById<Button>(R.id.bu_Display_Data)
         bu_Display_Data!!.setOnClickListener(this)

    }

  // Note that the controller is get_the_data_from_Modal and onclick
  // Where you process everything inside the activity


    fun get_Data_From_Model(): BooksModel {
       return BooksModel("Straus and Giroux", "June 1,1999", 256, "English")
    }

    override fun onClick(v: View?) {
       if(v!!.id == bu_Display_Data!!.id)
       {
           Tv_Title!!.text = get_Data_From_Model().Title.toString()
           Tv_Date_Publication!!.text = get_Data_From_Model().Date_Publication.toString()
           Tv_Print_Lenght!!.text = get_Data_From_Model().Print_Lenght.toString()
           Tv_Language!!.text = get_Data_From_Model().Language.toString()
       }
    }
}