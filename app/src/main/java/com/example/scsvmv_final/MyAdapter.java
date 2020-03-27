package com.example.scsvmv_final;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHandler>
{
    private Context c_context;
    private String[] s1_string;
    private int[] Images_list;

    public MyAdapter(Context context, String[] string_list,int[] Images)
    {
        c_context=context;
        s1_string=string_list;
        Images_list=Images;
    }
    @NonNull
    @Override
    public ViewHandler onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recycleview_deptlayout,parent,false);
        return new ViewHandler(view, c_context, s1_string, Images_list);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHandler holder, int position)
    {
        int Images_id=Images_list[position];
        holder.Album.setImageResource(Images_id);
        holder.Album_title.setText(s1_string[position]);
    }

    @Override
    public int getItemCount()
    {
        return Images_list.length;
    }

    public static class ViewHandler extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        TextView Album_title;
        ImageView Album;
        Context context_this;
        String[] string_listthis;
        int[] ImagesList;
        public ViewHandler(@NonNull View itemView, Context context, String[] string_list, int[] Images)
        {
            super(itemView);
            Album_title=itemView.findViewById(R.id.Text_View);
            Album=itemView.findViewById(R.id.Image_view);
            itemView.setOnClickListener(this);
            context_this=context;
            string_listthis=string_list;
            ImagesList=Images;
        }

        @Override
        public void onClick(View v)
        {
            Intent intent=new Intent(context_this,Main3Activity.class);
            intent.putExtra("string_array",string_listthis[getAdapterPosition()]);
            context_this.startActivity(intent);
        }
    }


}

