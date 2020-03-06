package th.ac.kku.cis.testtoquit.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import th.ac.kku.cis.testtoquit.R
import th.ac.kku.cis.testtoquit.model.Flower

public class FlowerAdapter(val mCtx: Context,
                            var resource:Int,
                            var items:List<Flower>)
    : ArrayAdapter<Flower>(mCtx,resource,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        val layout: LayoutInflater = LayoutInflater.from(mCtx)

        val v: View = layout.inflate(resource,null)
        val icon : ImageView = v.findViewById(R.id.imageView3)
        val name : TextView = v.findViewById(R.id.textView)
        val id: TextView = v.findViewById(R.id.textView3)

        val student:Flower = items[position]

        name.text = student.name
        id.text = student.id
        try {
            icon.setImageDrawable(mCtx.getDrawable(student.icon))
        }
        catch (ex:Exception){

        }

        return v
    }
}