package matteocrippa.it.basetypeadapter

/**
 * Created by matteocrippa on 19/11/2017.
 */
import android.widget.BaseAdapter
import kotlin.properties.Delegates

abstract class BaseTypeAdapter<T> : BaseAdapter() {
    var data: List<T> by Delegates.observable(listOf()) { _, _, _ ->
        this.notifyDataSetChanged()
    }

    override fun getCount(): Int {
        return data.count()
    }

    override fun getItem(p0: Int): Any {
        return data[p0] as Any
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }
}