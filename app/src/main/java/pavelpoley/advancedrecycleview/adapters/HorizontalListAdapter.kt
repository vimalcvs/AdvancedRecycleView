package pavelpoley.advancedrecycleview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pavelpoley.advancedrecycleview.R
import pavelpoley.advancedrecycleview.model.FeedModel

class HorizontalListAdapter(list: ArrayList<FeedModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var mList = ArrayList<FeedModel>()

    init {
        mList.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horizontal_feed, parent, false)
        return ViewHolder(view)

    }
    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }
    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

    }
}