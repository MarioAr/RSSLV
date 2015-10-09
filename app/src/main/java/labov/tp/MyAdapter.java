package labov.tp;

import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by alumno on 08/10/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    public List<RSS> lista;

    public MyAdapter(List<RSS> myList)
    {
        this.lista = myList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(viewGroup.getContext());
        View v = li.inflate(R.layout.item, null);

        MyViewHolder mvh = new MyViewHolder(v);

        return mvh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        RSS rss = lista.get(i);
        myViewHolder.txtHora.setText(rss.hora);
        myViewHolder.txtTitulo.setText(rss.titulo);
        myViewHolder.txtNota.setText(rss.nota);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
