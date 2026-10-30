package com.example.parcialnavegacion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CelularAdaptador extends RecyclerView.Adapter<CelularAdaptador.ViewHolder> {

    private List<Celular> listaCelulares;

    public CelularAdaptador(List<Celular> listaCelulares) {
        this.listaCelulares = listaCelulares;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_celular, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Celular celular = listaCelulares.get(position);
        holder.tvNombre.setText(celular.getNombre());
        holder.tvDescripcion.setText(celular.getDescripcion());
        holder.tvColores.setText(celular.getColores());
        holder.tvPrecio.setText(celular.getPrecio());
        holder.tvStock.setText(celular.getStock());
        holder.ivCelular.setImageResource(celular.getImagenResId());
    }

    @Override
    public int getItemCount() {
        return listaCelulares.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivCelular;
        TextView tvNombre, tvDescripcion, tvColores, tvPrecio, tvStock;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivCelular = itemView.findViewById(R.id.iv_celular);
            tvNombre = itemView.findViewById(R.id.tv_nombre_celular);
            tvDescripcion = itemView.findViewById(R.id.tv_descripcion_celular);
            tvColores = itemView.findViewById(R.id.tv_colores_celular);
            tvPrecio = itemView.findViewById(R.id.tv_precio_celular);
            tvStock = itemView.findViewById(R.id.tv_stock_celular);
        }
    }
}