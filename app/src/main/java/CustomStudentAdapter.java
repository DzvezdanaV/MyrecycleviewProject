import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.velkovska89.myrecycleviewproject.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Velkovska89 on 12/7/2017.
 */

public class CustomStudentAdapter extends
RecyclerView.Adapter<CustomStudentAdapter.ViewHolder> {

    List<Student> studentList = new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater infilater = LayoutInflater.from(context);

        View view = infilater.inflate(R.layout.recycleview_row, parent, false);


        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txtView)
        TextView txtView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        }
    }

