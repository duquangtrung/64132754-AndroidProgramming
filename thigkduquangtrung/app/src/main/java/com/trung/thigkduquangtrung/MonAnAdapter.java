package com.trung.thigkduquangtrung;

import android.content.*;
import android.view.*;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MonAnAdapter extends RecyclerView.Adapter<MonAnAdapter.ViewHolder> {

    List<MonAn> list;
    Context context;

    public MonAnAdapter(Context context, List<MonAn> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_monan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MonAn monAn = list.get(position);
        holder.txtTen.setText(monAn.getTen());

        // click item
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ChiTietMonActivity.class);
            intent.putExtra("data", monAn);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTen;

        public ViewHolder(View itemView) {
            super(itemView);
            txtTen = itemView.findViewById(R.id.txtTen);
        }
    }
}