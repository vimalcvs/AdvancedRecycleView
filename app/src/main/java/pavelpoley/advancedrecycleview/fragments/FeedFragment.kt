package pavelpoley.advancedrecycleview.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_feed.view.*
import pavelpoley.advancedrecycleview.R
import pavelpoley.advancedrecycleview.adapters.FeedAdapter
import pavelpoley.advancedrecycleview.model.FeedModel


class FeedFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_feed, container, false)

        val list = getDummyList()



        view.rv_main.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)

        view.rv_main.adapter = FeedAdapter(context as FragmentActivity,list)



        return view
    }

    private fun getDummyList(): ArrayList<FeedModel> {
        val list = ArrayList<FeedModel>()

        for (i in 1..50) {
            list.add(FeedModel("Dummy item " + i))
        }

        return list
    }


}
