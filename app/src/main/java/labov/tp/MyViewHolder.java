package labov.tp;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 08/10/2015.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView txtHora;
    public TextView txtTitulo;
    public TextView txtNota;

    public MyViewHolder(View itemView) {
        super(itemView);
        this.txtHora = (TextView) itemView.findViewById(R.id.txtHora);
        this.txtTitulo = (TextView) itemView.findViewById(R.id.txtTitulo);
        this.txtNota = (TextView) itemView.findViewById(R.id.txtNota);
    }

}
