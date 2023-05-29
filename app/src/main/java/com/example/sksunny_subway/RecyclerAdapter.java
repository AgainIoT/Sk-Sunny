package com.example.sksunny_subway;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> implements ItemTouchHelperListener
{

    // 생성자에서 데이터 리스트 객체를 전달받음.
    // RecyclerAdapter(ArrayList<String> list) {items = list;}
    private ArrayList<ListItem> items = new ArrayList<>();
    public RecyclerAdapter(){}

    @Override
    public boolean onItemMove(int form_position, int to_position) {
        ListItem item = items.get(form_position);
        items.remove(form_position);
        items.add(to_position,item);
        item.setNumber(to_position);
        notifyItemMoved(form_position, to_position);
        return true;
    }

    @Override
    public void onItemSwipe(int position) {
        items.remove(position);
        notifyItemRemoved(position);
    }

    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView pathname;

        ViewHolder(View itemView) {
            super(itemView);

            // 뷰 객체에 대한 참조. (hold strong reference)
            pathname = itemView.findViewById(R.id.pathname);
        }
        public void onBind(@NonNull ListItem item, int position){
            pathname.setText(item.getName());
            item.setNumber(position);
        }
    }

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_list, parent, false);
        RecyclerAdapter.ViewHolder vh = new RecyclerAdapter.ViewHolder(view);

        return vh;
    }

    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        holder.onBind(items.get(position),position);
    }

    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(ArrayList<ListItem> itemList){
        items = itemList;
        notifyDataSetChanged();
    }

}