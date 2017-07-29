package grewal.example.ajayk.factofun;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ajayk on 2017-07-17.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<ItemsInRows> rowItems;

    public CustomAdapter(Context context, List<ItemsInRows> rowItems) {
        this.context = context;
        this.rowItems = rowItems;
    }

    @Override
    public int getCount() {
        return rowItems.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowItems.indexOf(getItem(position));
    }

    private class ViewHolder {
        ImageView pics;
        TextView titles;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        holder = new ViewHolder();
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.custom, null);

            holder.titles = (TextView) convertView.findViewById(R.id.member_name);
            holder.pics = (ImageView) convertView.findViewById(R.id.profile_pic);

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        ItemsInRows row_pos = rowItems.get(position);

        //holder.pics.setImageResource(row_pos.getImageid());
        holder.pics.setImageBitmap(ExceptionImageHandling.decodeSampledBitmapFromResource(context.getResources(), row_pos.getImageid(), 100,100));
        holder.titles.setText(row_pos.getTitles());

        return convertView;
    }
}
